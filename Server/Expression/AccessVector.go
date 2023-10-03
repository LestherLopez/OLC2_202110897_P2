package expressions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
)

type AccessVector struct {
	Lin   int
	Col   int
	id 	  string
	exp   interfaces.Expression
}

func NewAccessVector(lin int, col int, id string, exp interfaces.Expression) AccessVector {
	accessvec := AccessVector{lin, col, id, exp}
	return accessvec
}

func (p AccessVector) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	/*vector := env.(environment.Environment).GetVector(p.id)
	var valor environment.Symbol
	valor = p.exp.Ejecutar(ast,env)
	if(valor.Tipo==environment.INTEGER){
		if(valor.Valor.(int)>=0 && valor.Valor.(int)<len(vector.Valor)){
			element := vector.Valor[valor.Valor.(int)].(interfaces.Expression).Ejecutar(ast, env)
		
			return element
		}else{
			ast.SetError("ERROR: El indice esta fuera del rango del vector")
			fmt.Print("ERROR: El indice esta fuera del rango del vector")
			//error numero fuera de rango
		}
		
	}else{
		ast.SetError("ERROR: El indice ingresado no es un entero")
		fmt.Print("ERROR: El indice ingresado no es un entero")
		//la exp no es un numero

	}
	var result interface{}
	return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.NULL, Valor: result}*/
	return environment.Value{}
}