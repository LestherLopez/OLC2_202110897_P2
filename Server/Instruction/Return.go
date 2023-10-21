package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
)

type ReturnIn struct {
	Lin   int
	Col   int
	exp   interfaces.Expression
}

func NewReturnIn(lin int, col int, exp interfaces.Expression) ReturnIn {
	expresion := ReturnIn{lin, col, exp}
	return expresion
}

func (p ReturnIn) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	
	if(p.exp!=nil){
		result := p.exp.(interfaces.Expression).Ejecutar(ast, env, gen)
		result.Transfer = environment.RETURN
		gen.AddComment("INSTRUCCION RETURN")
		gen.AddSetStack("(int)P", result.Value)
		label := gen.NewLabel()
		gen.AddGoto(label)
		gen.AddLabel(label)
		//return con exoresion	
		return result
	}else{
	
		//return sin expresion
		
		return environment.Value{ Mutable: true, Transfer: environment.RETURN}
	}
	return nil
}