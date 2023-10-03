package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
)

type ToDeclareVector struct {
	Lin   int
	Col   int
	id_var string
	type_var environment.TipoExpresion
	valores []interface{}
	second_id string
}
//lin int, col int, id_var string, type_var environment.TipoExpresion, valor interfaces.Expression, constant bool
func NewToDeclareVector(lin int, col int, id_var string, type_var environment.TipoExpresion, valores []interface{}, second_id string) ToDeclareVector {
	return ToDeclareVector{lin, col, id_var, type_var, valores, second_id}
}

func (p ToDeclareVector) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	/*
	var isType bool  
	isType = true
	//se definen las no constantes
	
	if(p.second_id==""){
		if(p.type_var != environment.NULL && p.valores != nil){
				for _, inst := range p.valores {
					valor := inst.(interfaces.Expression).Ejecutar(ast, env)
					
					if p.type_var==valor.Tipo {
						isType = true
					}else{
						
						ast.SetError("ERROR: el valor "+fmt.Sprintf("%v", valor.Valor)+" no corresponde al tipo ingresado")
						fmt.Print("ERROR: el valor "+fmt.Sprintf("%v", valor.Valor)+" no corresponde al tipo ingresado")
						isType = false
					}
					
				}
		}else if(p.valores==nil){
				isType = true
		}
		if(isType){
			value:=environment.SymbolVector{Lin: p.Lin, Col: p.Col, Id: p.id_var, Tipo: p.type_var, Valor: p.valores, Transfer: environment.NULL}
			env.(environment.Environment).KeepVector(p.id_var,  value)
		}else if(isType && p.valores==nil){
			value:=environment.SymbolVector{Lin: p.Lin, Col: p.Col, Id: p.id_var, Tipo: p.type_var, Valor: nil, Transfer: environment.NULL}
			env.(environment.Environment).KeepVector(p.id_var,  value)
		}
	}else if(p.second_id!=""){
		vector_copiar := env.(environment.Environment).GetVector(p.second_id)
		if(vector_copiar.Tipo==p.type_var){
	
			
			value := environment.SymbolVector{Lin: p.Lin, Col:p.Col, Id: p.id_var, Tipo: p.type_var, Valor: nil, Transfer: environment.NULL }
			env.(environment.Environment).KeepVector(p.id_var, value)
			newvector := env.(environment.Environment).GetVector(p.id_var)
			
			for _, inst := range vector_copiar.Valor {
				
				newvector.Valor = append(newvector.Valor, inst)
			}
			 env.(environment.Environment).SetVector(newvector.Id, newvector)
			return nil
		}else{
			ast.SetError("ERROR: El tipo del vector no corresponde al tipo del vector a declarar")
			fmt.Print("ERROR: El tipo del vector no corresponde al tipo del vector a declarar")
		}
	}*/
	return nil

}