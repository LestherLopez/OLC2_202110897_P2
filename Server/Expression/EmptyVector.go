package expressions

import (
	environment "Server/Environment"
	generator "Server/Generator"
)

type EmptyVector struct {
	Lin   int
	Col   int
	id 	  string
}

func NewEmptyVector(lin int, col int, id string) EmptyVector {
	exp := EmptyVector{lin, col, id}
	return exp
}

func (p EmptyVector) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	/*
	result := env.(environment.Environment).GetVector(p.id)
	if(len(result.Valor)!=0){	//vector con elementos return false
	
		return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.BOOLEAN, Valor: false}
	}else{  //vector vacio return true
		
		return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.BOOLEAN, Valor: true}
	}
	*/
	return environment.Value{}
}