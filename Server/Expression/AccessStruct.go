package expressions

import (
	environment "Server/Environment"
	generator "Server/Generator"
)

type AccessStruct struct {
	Lin    int
	Col    int
	Struct string
	Id     string
	SecondId string
}

func NewAccessStruct(lin int, col int, str string, id string, secondid string) AccessStruct {
	exp := AccessStruct{lin, col, str, id, secondid}
	return exp
}

func (p AccessStruct) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
/*
	var result, tempStruct environment.Symbol
	tempStruct = env.(environment.Environment).GetVariable(p.Struct)
	//tempStruct = p.Struct.Ejecutar(ast, env) //sym{[1,2,3,4]}

	if tempStruct.Tipo == environment.STRUCT {

		if variable, ok := tempStruct.Valor.(map[string]environment.Symbol)[p.Id]; ok {
		//	fmt.Print("encontramos struct")
			if p.SecondId=="nil"{
				return variable
			}else{
				
				
				if variable.Tipo==environment.STRUCT{
					if variable2, ok := variable.Valor.(map[string]environment.Symbol)[p.SecondId]; ok {
						return variable2
					}
				}
			}
		}
		ast.SetError("No existe el elemento " + p.Id)
		return result
	}
	ast.SetError("La expresión no es un struct")
	return result*/
	return environment.Value{}
}