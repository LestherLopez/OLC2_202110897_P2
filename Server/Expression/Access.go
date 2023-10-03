package expressions

import (
	environment "Server/Environment"
	generator "Server/Generator"
)
type Access struct {
	Lin   int
	Col   int
	id 	  string
}

func NewAccess(lin int, col int, id string) Access {
	exp := Access{lin, col, id}
	return exp
}

func (p Access) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
/*	result := env.(environment.Environment).GetVariable(p.id)
	if(result.Tipo == environment.NULL && result.Mutable==false && result.Lin==0 && result.Col==0){
		return environment.Symbol{Id: p.id}
	}else{
	return result}*/
	var result environment.Value
	return result
}