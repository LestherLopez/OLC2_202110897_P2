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
	sentence_elif []interface{}
	sentence_else []interface{}
}

func NewIf(lin int, col int, expc interfaces.Expression, senten []interface{}, senten_else []interface{}, sentence_else []interface{}) If {
	return If{Lin: lin, Col: col, exp_conditional: expc, sentence: senten, sentence_elif: senten_else, sentence_else: sentence_else}
}

func (p If) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	//fmt.Println("entre a if")
	gen.AddComment("Generacion de if")
	var  result, conditional environment.Value
	
	conditional = p.exp_conditional.(interfaces.Expression).Ejecutar(ast, env, gen)
	newLabel := gen.NewLabel()
	for _, inst := range conditional.TrueLabel {
		gen.AddComment("AddLabel")
		gen.AddLabel(inst.(string))
		gen.AddComment(" terminar AddLabel")
	}

	//agregar codigo c3d de if
	for _, inst := range p.sentence {
	//	if strings.Contains(fmt.Sprintf("%T", inst), "instructions"){
			gen.AddComment("sentencia")
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
			gen.AddComment("Final sentencia")
	//	}
	}
	gen.AddComment("Termina generacion de if")
	if len(p.sentence_elif)>0{

	gen.AddGoto(newLabel)	

	gen.AddComment("Generacion de else"+newLabel)
	
	for _, lvl := range conditional.FalseLabel {
		gen.AddLabel(lvl.(string))
	}
	
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
		
		gen.AddLabel(newLabel)
		
	}
	 
	//hace falta agregar goto del final
	//result.OutLabel = OutLabels 
	/*
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
		for _, inst := range p.sentence_elif {
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

	}
*/

	return nil
}