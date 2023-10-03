package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
)

type Guard struct {
	Lin   int
	Col   int
	exp_conditional interfaces.Expression
	sentence []interface{}
	value string 
}

func NewGuard(lin int, col int, expc interfaces.Expression, senten []interface{}, value string) Guard {
	return Guard{Lin: lin, Col: col, exp_conditional: expc, sentence: senten, value: value}
}

func (p Guard) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
/*
	var conditional environment.Symbol
	conditional = p.exp_conditional.(interfaces.Expression).Ejecutar(ast, env)
	if(conditional.Tipo != environment.BOOLEAN){
		fmt.Println("El tipo de variable es incorrecto para un Guard")
		return nil
	}
	if(!conditional.Valor.(bool)){
		//hacer nuevo environment
		var GuardEnv environment.Environment
		GuardEnv = environment.NewEnvironment(env, "Guard environment")
	
			//ejecutar sentencias
		for _, inst := range p.sentence {
				inst.(interfaces.Instruction).Ejecutar(ast, GuardEnv)
		}


		
	}else{
		
		return nil

	}*/
	return nil
}