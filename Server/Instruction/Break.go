package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
)

type Break struct {
	Lin   int
	Col   int
	
}

func NewBreak(lin int, col int) Break {
	expresion := Break{lin, col}
	return expresion
}

func (p Break) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	var res environment.Value
	res = environment.NewValue("", false, environment.NULL)
	res.Transfer = environment.BREAK
	//return sin expresion
	return res
}