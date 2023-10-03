package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
)

type While struct {
	Lin   int
	Col   int
	exp_conditional interfaces.Expression
	sentences []interface{}
}

func NewWhile(lin int, col int, exp_conditional interfaces.Expression, sentences []interface{}) While {
	return While{lin, col, exp_conditional, sentences}
}

func (p While) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
/*
	var conditional environment.Symbol
	conditional = p.exp_conditional.(interfaces.Expression).Ejecutar(ast, env)
	whileEnv := environment.NewEnvironment(env, "While environment")
	//while in go
	if(conditional.Tipo != environment.BOOLEAN){
		fmt.Println("El tipo de variable es incorrecto para un while, tiene que ser boolean")
		ast.SetError("ERROR: El tipo de variable es incorrecto para un while, tiene que ser boolean")
		return conditional
	}
	for conditional.Valor.(bool) {
		for _, inst := range p.sentences {
			element := inst.(interfaces.Instruction).Ejecutar(ast, whileEnv)
			if(element!= nil){
				symbolret := element.(environment.Symbol)
				if(symbolret.Transfer == environment.RETURN){
					return symbolret
				}else if(symbolret.Transfer==environment.BREAK){
				//fmt.Print("VIENE BREAAAK")
					return nil
				}else if(symbolret.Transfer==environment.CONTINUE){
					
					break
				}
				
			}
			
		}
		conditional =p.exp_conditional.(interfaces.Expression).Ejecutar(ast, whileEnv)
	}*/
	//print("while")
	//ast.SetPrint(consoleOut + "\n")
	return nil
}