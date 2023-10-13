package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
)

type CallFunction struct {
	Lin   int
	Col   int
	id 	  string
	parameter []interface{}
	numero int
}

func NewCallFunction(lin int, col int, id string, parameter []interface{}, numero int) CallFunction {
	exp := CallFunction{lin, col, id, parameter, numero}
	return exp
}

func (p CallFunction) Ejecutar(ast *environment.AST, env interface{} , gen *generator.Generator) interface{} {
	
	gen.AddCall(p.id)
	//var updatevector bool
	/*
	var vector_copiar environment.SymbolVector
	funcion := env.(environment.Environment).GetFunction(p.id)
	FunctionEnv := environment.NewEnvironment(env, "Function "+p.id+ " environment")
	switch p.numero{
	case 1: //funcion con parametros normales
		if(len(p.parameter) == len(funcion.Bloque_parametros)){
			for i := 0; i < len(funcion.Bloque_parametros); i++ {
				parametro:=funcion.Bloque_parametros[i].(interfaces.Expression).Ejecutar(ast, env)
				valor:=p.parameter[i].(interfaces.Expression).Ejecutar(ast, env)
				
				if(valor.Tipo==parametro.Tipo){
					if(parametro.IsList){
						//obtener la variable global y meterla en el environment func
						vector_copiar=env.(environment.Environment).GetVector(valor.Id)
						valuenewvector := environment.SymbolVector{Lin: vector_copiar.Lin, Col:vector_copiar.Col, Id: parametro.Id, Tipo: vector_copiar.Tipo, Valor: nil, Transfer: environment.NULL }
						FunctionEnv.KeepVector(parametro.Id, valuenewvector)
						newVector := FunctionEnv.GetVector(parametro.Id)
						for _, inst := range vector_copiar.Valor {
							
							newVector.Valor = append(newVector.Valor, inst)
						}
						FunctionEnv.SetVector(newVector.Id, newVector)
					//	updatevector = true
					}else{
					FunctionEnv.KeepVariable(parametro.Id, environment.Symbol{Valor: valor.Valor, Lin: parametro.Lin, Col: parametro.Col, Id: parametro.Id, Tipo: parametro.Tipo, Mutable: true})
					}
				
				
				}else{
					ast.SetError("ERROR: El tipo del parametro ingresado es incorrecto")
					fmt.Print("ERROR: El tipo del parametro ingresado es incorrecto")
				}
			
			}

			//ejecutar sentencias
			for _, inst := range funcion.Bloque_sentencias {
				inst.(interfaces.Instruction).Ejecutar(ast, FunctionEnv)
				
			}
			

			//actualizar inout
			
		}
	case 2:
		
		for _, inst := range funcion.Bloque_sentencias {
			inst.(interfaces.Instruction).Ejecutar(ast, FunctionEnv)

		}
	}*/
	return nil
}