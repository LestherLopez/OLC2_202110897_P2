package expressions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
)

type FunctionFloat struct {
	Lin   int
	Col   int
	valor interfaces.Expression
}

func NewFunctionFloat(lin int, col int, valor interfaces.Expression) FunctionFloat {
	exp := FunctionFloat{lin, col, valor}
	return exp
}

func (p FunctionFloat) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	/*
	//float & string
	elemento := p.valor.(interfaces.Expression).Ejecutar(ast, env)
	if(elemento.Tipo==environment.STRING){

		r1 := fmt.Sprintf("%v", elemento.Valor)
		val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", r1), 64)
		
		return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.FLOAT, Valor: val1}
	}else{
		ast.SetError("ERROR: No es posible usar la funcion Int, puesto que el tipo no es apto")
		return environment.Symbol{Valor: nil, Mutable: true, Tipo: environment.NULL}
	}*/
	return environment.Value{}
}