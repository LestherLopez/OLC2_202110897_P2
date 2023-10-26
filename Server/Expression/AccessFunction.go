package expressions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
	"fmt"
	"strconv"
	"strings"
)

type AccessFunction struct {
	Lin   int
	Col   int
	id 	  string
	parameter []interface{}
	numero int
}

func NewAccessFunction(lin int, col int, id string, parameter []interface{}, numero int) AccessFunction {
	exp := AccessFunction{lin, col, id, parameter,numero}
	return exp
}

func (p AccessFunction) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	
	var result environment.Value
	var symbolFunc environment.SymbolFunction
	symbolFunc = env.(environment.Environment).GetFunction(p.id)
	var tmp1 string
	size := env.(environment.Environment).Size["size"]
	gen.AddComment("Inicio llamada de funcion")
	
	if len(p.parameter) > 0 {
		
		tmp1 = gen.NewTemp()
		gen.AddExpression(tmp1, "P", strconv.Itoa(size+1), "+")
		gen.AddComment("Acceso a parametros en llamada de func")
		for i := 0; i < len(p.parameter); i++ {
			
			//ejecutando parametros
			if strings.Contains(fmt.Sprintf("%T", p.parameter[i]), "expressions") {
				result = p.parameter[i].(interfaces.Expression).Ejecutar(ast, env, gen)
			} else {
				fmt.Println("Error en bloque")
			}
			//guardando
			gen.AddSetStack("(int)"+tmp1, result.Value)
			if (len(p.parameter) - 1) != i {
				gen.AddExpression(tmp1, tmp1, "1", "+")
			}
		}
		gen.AddComment("Final Acceso a parametros en llamada de func")
		gen.AddExpression("P", "P", strconv.Itoa(size), "+")
		gen.AddCall(p.id)
		gen.AddGetStack(tmp1, "(int)P")
		gen.AddExpression("P", "P", strconv.Itoa(size), "-")
		result = environment.Value{IsTemp: true, Value: tmp1, Type: symbolFunc.TipoReturn}
	} else {
		tmp1 := gen.NewTemp()
		
		gen.AddExpression("P", "P", strconv.Itoa(size), "+")
		gen.AddCall(p.id)
		gen.AddGetStack(tmp1, "(int)P")
		gen.AddExpression("P", "P", strconv.Itoa(size), "-")
		result = environment.Value{IsTemp: true, Value: tmp1, Type: symbolFunc.TipoReturn}
	}
	/*if gen.MainCode == false{
		savevartemp := gen.NewTemp()
		gen.AddExpression(savevartemp, "P", "1", "+")
		gen.AddAssign(savevartemp,)
	}*/
	if gen.MainCode == false && gen.SaveTmp == "" {
		gen.AddComment("resguardar variable")
		newTemp := gen.NewTemp()
		gen.AddExpression(newTemp, "P", "0", "+")
		gen.AddSetStack("(int)"+newTemp, result.Value)
		gen.SaveTmp = result.Value
	}else if gen.MainCode == false && gen.SaveTmp != "" {
		gen.AddComment("Obtener variable resguardada")
		newTemp := gen.NewTemp()
		gen.AddExpression(newTemp, "P", "0", "+")
		gen.AddGetStack(gen.SaveTmp, "(int)"+newTemp)
		gen.SaveTmp = ""
	}
	gen.AddComment("Final de llamada funcion")
	return result
}

func (p AccessFunction) GetGlobal(env interface{}) environment.Environment {
	//obteniendo entorno global
	var tmpEnvGbl environment.Environment
	tmpEnvGbl = env.(environment.Environment)
	for {
		if tmpEnvGbl.NameEnv == "Entorno Global" {
			return tmpEnvGbl
		}
		if tmpEnvGbl.Anterior == nil {
			break
		} else {
			tmpEnvGbl = tmpEnvGbl.Anterior.(environment.Environment)
		}
	}
	return tmpEnvGbl
}
