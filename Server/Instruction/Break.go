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
	
		//return sin expresion
	return environment.Symbol{Lin: p.Lin, Col: p.Col, Id: "",Tipo: environment.NULL, Valor: nil, Mutable: true, Transfer: environment.BREAK}
	
}