package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
	"fmt"
	"strings"
)

type If struct {
	Lin   int
	Col   int
	exp_conditional interfaces.Expression
	sentence []interface{}

	sentence_else []interface{}
}

func NewIf(lin int, col int, expc interfaces.Expression, senten []interface{},  sentence_else []interface{}) If {
	return If{Lin: lin, Col: col, exp_conditional: expc, sentence: senten,  sentence_else: sentence_else}
}

func (p If) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	var  result, conditional environment.Value
	conditional = p.exp_conditional.(interfaces.Expression).Ejecutar(ast, env, gen)
	newLabel := gen.NewLabel()
	gen.AddComment("INSTRUCCION IF")
	for _, inst := range conditional.TrueLabel {
		gen.AddLabel(inst.(string))
	}
	
	//agregar codigo c3d de if
	for _, inst := range p.sentence {

		if strings.Contains(fmt.Sprintf("%T", inst), "instructions") {
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
			

			}
		
		}
	}

	gen.AddGoto(newLabel)
	
	for _, inst := range conditional.FalseLabel {

		
		gen.AddLabel(inst.(string))

	}

		if len(p.sentence_else)>0{


		for _, inst := range p.sentence_else {
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
		
		
	}
	gen.AddLabel(newLabel)
	gen.AddComment("FINAL DE INSTRUCCION IF")
	return nil
/*	var  result, conditional environment.Value	
	
	conditional = p.exp_conditional.(interfaces.Expression).Ejecutar(ast, env, gen)
	newLabel := gen.NewLabel()
	gen.AddComment("AGREGAR PRIMER LABEL")
	for _, inst := range conditional.TrueLabel {
		gen.AddLabel(inst.(string))
	}

	gen.AddComment("INICIA INS IF")
	//agregar codigo c3d de if
	for _, inst := range p.sentence {
	//	if strings.Contains(fmt.Sprintf("%T", inst), "instructions"){
			
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
			

			}
		
	//	}
	}
	gen.AddComment("TERMINA INS IF Y SE AGREGA GOTO")

	gen.AddGoto(newLabel)
	gen.AddComment("SE TERMINA GOTO Y SE AGREGA OTRO LABEL")
	for _, inst := range conditional.FalseLabel {

		
		gen.AddLabel(inst.(string))

	}
	gen.AddComment("SE TERMINA LABEL")


	if len(p.sentence_elif)>0{
	
	
	
		gen.AddComment("INICIA ELSE IF")
	
		for _, inst := range p.sentence_elif {
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
		gen.AddComment("TERMINA ELSE IF")
		gen.AddGoto(newLabel)
	}
	 
	if len(p.sentence_else)>0{

		gen.AddComment("INICIA ELSE")
		for _, inst := range p.sentence_else {
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
		gen.AddComment("TERMINA ELSE")
		gen.AddLabel(newLabel)
	}
	
	return nil*/
}