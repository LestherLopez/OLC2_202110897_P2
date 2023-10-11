package expressions

import (
	environment "Server/Environment"
	generator "Server/Generator"
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
	
	
	/*
	funcion := env.(environment.Environment).GetFunction(p.id)
	FunctionEnv := environment.NewEnvironment(env, "Function "+p.id+" environment")
	switch p.numero{
	case 1: //funcion con parametros normales
		if(len(p.parameter) == len(funcion.Bloque_parametros)){
			for i := 0; i < len(funcion.Bloque_parametros); i++ {
				parametro:=funcion.Bloque_parametros[i].(interfaces.Expression).Ejecutar(ast, env)
				valor:=p.parameter[i].(interfaces.Expression).Ejecutar(ast, env)
				if(valor.Tipo==parametro.Tipo){
					FunctionEnv.KeepVariable(parametro.Id, environment.Symbol{Valor: valor.Valor, Lin: parametro.Lin, Col: parametro.Col, Id: parametro.Id, Tipo: parametro.Tipo, Mutable: true})
				}else{
					ast.SetError("ERROR: El tipo del parametro ingresado es incorrecto")
					fmt.Print("ERROR: El tipo del parametro ingresado es incorrecto")
				}
			
			}

			//ejecutar sentencias
			for _, inst := range funcion.Bloque_sentencias {
				element:=inst.(interfaces.Instruction).Ejecutar(ast, FunctionEnv)
				if(element!=nil){
					symboltransfer := element.(environment.Symbol)
					
					if(symboltransfer.Transfer== environment.RETURN && symboltransfer.Tipo==funcion.TipoReturn){
						return symboltransfer
						//	return environment.Symbol{Valor: "Holaaa", Col: p.Col, Lin: p.Lin}
					}else if(symboltransfer.Transfer==environment.RETURN){
						fmt.Print(symboltransfer)
						return symboltransfer
					}else{
						ast.SetError("ERROR: No fue posible hacer el retorno de la variable")
						fmt.Print("ERROR: No fue posible hacer el retorno de la variable")
					}
				}

			}

			return environment.Symbol{Valor: "Holaaa", Col: p.Col, Lin: p.Lin}
		}
	case 2:
		fmt.Print("VAMOS A IMPRIMIR ENVIRONMENT ID")
		fmt.Print(FunctionEnv.NameEnv)
		for _, inst := range funcion.Bloque_sentencias {
			inst.(interfaces.Instruction).Ejecutar(ast, FunctionEnv)

		}
	}
	
	
*/
	
	return environment.Value{}
}