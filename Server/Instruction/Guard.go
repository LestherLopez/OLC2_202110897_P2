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

}

func NewGuard(lin int, col int, expc interfaces.Expression, senten []interface{}) Guard {
	return Guard{Lin: lin, Col: col, exp_conditional: expc, sentence: senten}
}

func (p Guard) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	var  conditional, result environment.Value
	conditional = p.exp_conditional.(interfaces.Expression).Ejecutar(ast, env, gen)
	newLabel := gen.NewLabel()
	gen.AddComment("INSTRUCCION IF")
	for _, inst := range conditional.TrueLabel {
		gen.AddLabel(inst.(string))
	}
	gen.AddGoto(newLabel)
	for _, inst := range conditional.FalseLabel {

		
		gen.AddLabel(inst.(string))

	}
	if len(p.sentence)>0{


		for _, inst := range p.sentence {
			element := inst.(interfaces.Instruction).Ejecutar(ast, env, gen)
			if element != nil{
				result  = element.(environment.Value)
				if result.Transfer == environment.CONTINUE{
					gen.AddGoto(gen.ContinueLabel)
					result.Transfer = environment.NULL
				}
				if result.Transfer == environment.BREAK{
					gen.AddGoto(gen.BreakLabel)
					result.Transfer = environment.NULL
				}
				for _, lvl := range result.OutLabel {
						gen.AddComment(lvl.(string))
				}
			}
		}
		
		gen.AddLabel(newLabel)
	}
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