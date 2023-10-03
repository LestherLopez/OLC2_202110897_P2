package expressions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
)

type FunctionInt struct {
	Lin   int
	Col   int
	valor interfaces.Expression
}

func NewFunctionInt(lin int, col int, valor interfaces.Expression) FunctionInt {
	exp := FunctionInt{lin, col, valor}
	return exp
}

func (p FunctionInt) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	//float & string
	/*
	elemento := p.valor.(interfaces.Expression).Ejecutar(ast, env)
	if(elemento.Tipo==environment.STRING){

		r1 := fmt.Sprintf("%v", elemento.Valor)
		numberInt, _ := strconv.Atoi(r1)
		
		return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.INTEGER, Valor: numberInt}
	}else if(elemento.Tipo== environment.FLOAT){
		val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", elemento.Valor), 64)
		numberInt := int(val1)
		return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.INTEGER, Valor: numberInt}
	}else{
		ast.SetError("ERROR: No es posible usar la funcion Int, puesto que el tipo no es apto")
		return environment.Symbol{Valor: nil, Mutable: true, Tipo: environment.NULL}
	}*/
	return environment.Value{}
	
}