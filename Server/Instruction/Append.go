package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
)

type Append struct {
	Lin   int
	Col   int
	id_var string
	exp interfaces.Expression
}
//lin int, col int, id_var string, type_var environment.TipoExpresion, valor interfaces.Expression, constant bool
func NewAppend(lin int, col int, id_var string, exp interfaces.Expression) Append {
	return Append{lin, col, id_var, exp}
}

func (p Append) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	/*
	var valor environment.Symbol
	valor = p.exp.(interfaces.Expression).Ejecutar(ast, env)
	vector := env.(environment.Environment).GetVector(p.id_var)
	if(vector.Tipo==valor.Tipo){
		//value:=environment.Symbol{Lin: valor.Lin, Col: valor.Col, Id: valor.Id, Tipo: valor.Tipo, Valor: valor.Valor, Transfer: environment.NULL}
		vector.Valor = append(vector.Valor, p.exp)
		env.(environment.Environment).SetVector(p.id_var, vector)
		
	}else{
		ast.SetError("ERROR: El tipo a ingresar en el vector no corresponde a su tipo")
		fmt.Print("ERROR: El tipo a ingresar en el vector no corresponde a su tipo")
	}*/
	return nil
}