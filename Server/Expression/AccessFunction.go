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
	size := env.(environment.Environment).Size["size"]
	gen.AddComment("Inicio de llamada")
	if len(p.parameter) > 0 {
		tmp1 := gen.NewTemp()
		gen.AddExpression(tmp1, "P", strconv.Itoa(size+1), "+")
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

		gen.AddExpression("P", "P", strconv.Itoa(size), "+")
		gen.AddCall(p.id)
		gen.AddGetStack(tmp1, "(int)P")
		gen.AddExpression("P", "P", strconv.Itoa(size), "-")

	} else {
		tmp1 := gen.NewTemp()

		gen.AddExpression("P", "P", strconv.Itoa(size), "+")
		gen.AddCall(p.id)
		gen.AddGetStack(tmp1, "(int)P")
		gen.AddExpression("P", "P", strconv.Itoa(size), "-")

	}
	gen.AddComment("Final de llamada")
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