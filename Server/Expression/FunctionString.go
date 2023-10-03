package expressions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
)

type FunctionString struct {
	Lin   int
	Col   int
	valor interfaces.Expression
}

func NewFunctionString(lin int, col int, valor interfaces.Expression) FunctionString {
	exp := FunctionString{lin, col, valor}
	return exp
}

func (p FunctionString) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	//bool, float e int
	/*
	elemento := p.valor.(interfaces.Expression).Ejecutar(ast, env)
	if(elemento.Tipo==environment.INTEGER){
		r1 := elemento.Valor.(int)
		numbertoString := fmt.Sprintf("%v", r1)
		return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.STRING, Valor: numbertoString}
	}else if(elemento.Tipo== environment.FLOAT){
		val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", elemento.Valor), 64)
		floatString := strconv.FormatFloat(val1, 'f', 2, 64)
		return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.STRING, Valor: floatString}
	}else if(elemento.Tipo == environment.BOOLEAN){
		boolString := strconv.FormatBool(elemento.Valor.(bool))
		return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.STRING, Valor: boolString}
	}else{
		ast.SetError("ERROR: No es posible usar la funcion Int, puesto que el tipo no es apto")
		return environment.Symbol{Valor: nil, Mutable: true, Tipo: environment.NULL}
	}*/

	return environment.Value{}
}