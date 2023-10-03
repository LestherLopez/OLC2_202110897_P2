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
	/*
	if(p.exp!=nil){
		result := p.exp.(interfaces.Expression).Ejecutar(ast, env)
	
		//return con exoresion
		return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: result.Tipo, Valor: result.Valor, Id: "", Mutable: true,Transfer: environment.RETURN}
	}else{
	
		//return sin expresion
		return environment.Symbol{Lin: p.Lin, Col: p.Col, Id: "",Tipo: environment.NULL, Valor: nil, Mutable: true, Transfer: environment.RETURN}
	}*/
	return nil
}