package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
	"fmt"
)

type Case struct {
	Lin   int
	Col   int
	
	exp 			interfaces.Expression
	sentence []interface{}
	sentence_deafult []interface{}
}

func NewCase(lin int, col int,  exp interfaces.Expression,senten []interface{}, senten_deafult []interface{}) Case {
	return Case{Lin: lin, Col: col,  exp: exp,sentence: senten, sentence_deafult: senten_deafult}
}

func (p Case) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
		
		var conditional environment.Symbol
		var expr environment.Value
		gen.AddComment("CASE")
		conditional = env.(environment.Environment).GetVariableSwitch("switch")
		expr = p.exp.Ejecutar(ast, env, gen)
		gen.AddComment("-------------"+fmt.Sprintf("%v", conditional.Tipo))
		newlabel := gen.NewLabel()
		secondLabel := gen.NewLabel()
		gen.AddIf(conditional.Valor.(string), expr.Value, "==", newlabel)
		gen.AddGoto(secondLabel)
		gen.AddLabel(newlabel)

	
		gen.AddComment("INSTRUCCIONES SENTENCE")
		for _, inst := range p.sentence {
			inst.(interfaces.Instruction).Ejecutar(ast, env, gen)
		}
		gen.AddGoto(conditional.Label)
		gen.AddComment("INSTRUCCIONES DEFAULT")
		gen.AddLabel(secondLabel)
		for _, inst := range p.sentence_deafult {
			inst.(interfaces.Instruction).Ejecutar(ast, env, gen)
		}
	
		
	/*
		var value environment.Symbol
		value  = p.exp.(interfaces.Expression).Ejecutar(ast, env)
		conditional := env.(environment.Environment).GetVariableSwitch("switch")
		//fmt.Println(conditional.Valor)
		if(conditional.Tipo != value.Tipo){
			fmt.Println("El tipo de variable es incorrecto para comparar")
			return nil
		}
		if (value.Valor==conditional.Valor){
			var SwitchEnv environment.Environment
			SwitchEnv = environment.NewEnvironment(env, "Case environment")
			for _, inst := range p.sentence {
				inst.(interfaces.Instruction).Ejecutar(ast, SwitchEnv)
			}
		}else {
			var deafultEnv environment.Environment
			deafultEnv = environment.NewEnvironment(env, "Case environment")
			for _, inst := range p.sentence_deafult {
			inst.(interfaces.Instruction).Ejecutar(ast, deafultEnv)
			}
		}
*/
	return nil
}