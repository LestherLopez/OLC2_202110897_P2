package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
)

type For struct {
	Lin   int
	Col   int
	id_var string 
	first_exp interfaces.Expression
	second_exp interfaces.Expression
	sentences []interface{}
}

func NewFor(lin int, col int, id_var string, first_exp interfaces.Expression,  second_exp interfaces.Expression, sentences []interface{}) For {
	return For{lin, col, id_var, first_exp, second_exp, sentences}
}

func (p For) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	/*
	if(p.second_exp==nil){

	}else if(p.second_exp!=nil){
		var expresion1, expresion2 environment.Symbol
		expresion1 = p.first_exp.Ejecutar(ast, env)
		expresion2 = p.second_exp.Ejecutar(ast, env)
		
		if(expresion1.Tipo==environment.INTEGER && expresion2.Tipo==environment.INTEGER){
			
			if(expresion2.Valor.(int)>=expresion1.Valor.(int)){
				//guardar variable que inicia el rango
				id := NewTodeclare(p.Lin, p.Col, p.id_var, environment.INTEGER, p.first_exp, false)
				id.Ejecutar(ast, env)
				valint1 := expresion1.Valor.(int)
				valint2 := expresion2.Valor.(int)
				//bucle que se ejecuta mientras el valor 1 y valor dos sean diferentes
				for valint1 != (valint2+1) {
					//ejecutar bloque
					forEnv := environment.NewEnvironment(env, "For environment"+fmt.Sprintf("%v", valint1))
					for _, inst := range p.sentences {
						//fmt.Println("bloque")
						element := inst.(interfaces.Instruction).Ejecutar(ast, forEnv)
						if(element!= nil){
							symbolret := element.(environment.Symbol)
							if(symbolret.Transfer == environment.RETURN){
								
								return symbolret
							}else if(symbolret.Transfer==environment.BREAK){
							
								return nil
							}else if(symbolret.Transfer==environment.CONTINUE){
							
								break
							}
							
						}
					}
				
					
									
					//actualizar valor y sumarle uno 
					valint1 = valint1 + 1
					exp := expressions.NewPrimitive(p.Lin,p.Col,1,environment.INTEGER)
					exp.Ejecutar(ast, forEnv)
					aumento := NewIncreaseDecrease(p.Lin, p.Col, p.id_var, "+=", exp)
					aumento.Ejecutar(ast, forEnv)
				}
				
			}else{
				ast.SetError("ERROR: El segundo valor tiene que ser mayor o igual que el primero")
			}
		}else{
			ast.SetError("ERROR: Los tipos del rango deben de ser Int los dos")
		}
	}
	*/
	return nil
}