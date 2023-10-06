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
	var conditional, result environment.Value
	LabelReturn := gen.NewLabel()
	gen.AddLabel(LabelReturn)

	conditional = p.exp_conditional.Ejecutar(ast, env, gen)
	gen.AddContinue(LabelReturn)
	gen.AddBreak(conditional.FalseLabel[0].(string))
	for _, label := range conditional.TrueLabel{
		gen.AddLabel(label.(string))
	}
	for _, inst := range p.sentences {
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
						gen.AddLabel(lvl.(string))
				}

			}
	}

	gen.AddGoto(LabelReturn)

	for _, label := range conditional.FalseLabel{
		gen.AddLabel(label.(string))
	}

	return nil
}