package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
)

type Continue struct {
	Lin   int
	Col   int
	
}

func NewContinue(lin int, col int) Continue {
	expresion := Continue{lin, col}
	return expresion
}

func (p Continue) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	
	var res environment.Value
	res = environment.NewValue("", false, environment.NULL)
	res.Transfer = environment.CONTINUE
	//return sin expresion
	return res
	
}