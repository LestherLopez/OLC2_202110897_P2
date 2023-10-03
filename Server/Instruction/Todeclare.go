package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
)

type Todeclare struct {
	Lin   int
	Col   int
	id_var string
	type_var environment.TipoExpresion
	valor interfaces.Expression
	constant bool
}
//lin int, col int, id_var string, type_var environment.TipoExpresion, valor interfaces.Expression, constant bool
func NewTodeclare(lin int, col int, id_var string, type_var environment.TipoExpresion, valor interfaces.Expression, constant bool) Todeclare {
	return Todeclare{lin, col, id_var, type_var, valor, constant}
}

func (p Todeclare) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	//se definen las no constantes
	/*
	if(!p.constant){
		
		if(p.type_var != environment.NULL && p.valor != nil){
				valueTodeclare := p.valor.(interfaces.Expression).Ejecutar(ast, env)
				if(valueTodeclare.Tipo==p.type_var){
						valueTodeclare.Mutable = true
						env.(environment.Environment).KeepVariable(p.id_var, valueTodeclare)
						//fmt.Println(valueTodeclare.Mutable)
						
				} else{
					
				}
		//variable con valor pero sin tipo
		}else if(p.type_var==environment.NULL && p.valor != nil){
				valueTodeclare := p.valor.(interfaces.Expression).Ejecutar(ast, env)
				valueTodeclare.Mutable = true
				
				env.(environment.Environment).KeepVariable(p.id_var, valueTodeclare)
				
		//variable con tipo pero sin valor
		}else if(p.type_var!=environment.NULL && p.valor == nil){
			//asignar nil por defecto si no tiene valor
			val := primitive.NewPrimitive(p.Lin, p.Col, nil, environment.NULL) 
			//ejecutar el valor, colocarlo mutable y guardarlo
			valueTodeclare := val.Ejecutar(ast, env)
			valueTodeclare.Mutable = true
			env.(environment.Environment).KeepVariable(p.id_var, valueTodeclare)
		}
	//se definen las constantes
	}else if(p.constant){
	//	fmt.Println("Es constante")
		if(p.type_var != environment.NULL && p.valor != nil){
				valueTodeclare := p.valor.(interfaces.Expression).Ejecutar(ast, env)
				if(valueTodeclare.Tipo==p.type_var){
				
						env.(environment.Environment).KeepVariable(p.id_var, valueTodeclare)
						//fmt.Println(valueTodeclare.Mutable)
						
				} else{
				
				}
		//variable con valor pero sin tipo
		}else if(p.type_var==environment.NULL && p.valor != nil){
				valueTodeclare := p.valor.(interfaces.Expression).Ejecutar(ast, env)
				
				env.(environment.Environment).KeepVariable(p.id_var, valueTodeclare)
				//fmt.Println(valueTodeclare.Mutable)
			
		//variable con tipo pero sin valor
		}
	}*/
	return nil
	

	//ast.SetPrint(consoleOut + "\n")
	//return valor_asignar
}