package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
)

type If struct {
	Lin   int
	Col   int
	exp_conditional interfaces.Expression
	sentence []interface{}
	sentence_else []interface{}
}

func NewIf(lin int, col int, expc interfaces.Expression, senten []interface{}, senten_else []interface{}) If {
	return If{Lin: lin, Col: col, exp_conditional: expc, sentence: senten, sentence_else: senten_else}
}

func (p If) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	//fmt.Println("entre a if")
/*	var conditional environment.Symbol
	conditional = p.exp_conditional.(interfaces.Expression).Ejecutar(ast, env)
	
	if(conditional.Tipo != environment.BOOLEAN){
		fmt.Println("El tipo de variable es incorrecto para un If")
		return nil
	}
	if(conditional.Valor.(bool)){
		//hacer nuevo environment
		var ifEnv environment.Environment
		ifEnv = environment.NewEnvironment(env, "If environment")
		
			//ejecutar sentencias
		for _, inst := range p.sentence {
				element := inst.(interfaces.Instruction).Ejecutar(ast, ifEnv)
				if(element!= nil){
					symbolret := element.(environment.Symbol)
					if(symbolret.Transfer == environment.RETURN){
					//	fmt.Println("a")
						return symbolret
					}else if(symbolret.Transfer==environment.BREAK){
					//	fmt.Println("b")
						return environment.Symbol{Transfer: environment.BREAK}
						
					}else if(symbolret.Transfer==environment.CONTINUE){
					//	fmt.Println("c")
						break
					}
					
				}
		}

		//return nil
		
		
			//condicional por si viene return
		
	}else{
		var elseEnv environment.Environment
		elseEnv = environment.NewEnvironment(env, "Else environment")
		for _, inst := range p.sentence_else {
			element := inst.(interfaces.Instruction).Ejecutar(ast, elseEnv)
			if(element!= nil){
				symbolret := element.(environment.Symbol)
				if(symbolret.Transfer == environment.RETURN){
					
					return symbolret
				}else if(symbolret.Transfer==environment.BREAK){

					return environment.Symbol{Transfer: environment.BREAK}
				}else if(symbolret.Transfer==environment.CONTINUE){
					
					break
				}
				
			}
		}

	}*/
	return nil
}