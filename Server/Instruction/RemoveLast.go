package instructions

import (
	environment "Server/Environment"
	expressions "Server/Expression"
	generator "Server/Generator"

	"fmt"
	"strconv"
)

type RemoveLast struct {
	Lin   int
	Col   int
	id_var string
	
}
//lin int, col int, id_var string, type_var environment.TipoExpresion, valor interfaces.Expression, constant bool
func NewRemoveLast(lin int, col int, id_var string) RemoveLast {
	return RemoveLast{lin, col, id_var}
}

func (p RemoveLast) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	
	gen.AddComment("Remove Last instruccion")
	//numero

	access := expressions.NewAccessVector(p.Lin, p.Col, p.id_var)
	valor := access.Ejecutar(ast, env, gen)
	retSym := env.(environment.Environment).GetVariable(p.id_var)
	fmt.Print(valor)
	fmt.Print("\n")
	fmt.Print(retSym)
	gen.AddExpression(valor.Value, strconv.Itoa(retSym.ArrSize), valor.Value, "+")
	gen.AddSetStack("int("+valor.Value+")", "0")
	
	env.(environment.Environment).SaveArrayVariable(p.id_var, retSym.Tipo, retSym.ArrSize-1)
	/*
	
	vector := env.(environment.Environment).GetVector(p.id_var)
	if(len(vector.Valor)!=0){
	
	//value:=environment.Symbol{Lin: valor.Lin, Col: valor.Col, Id: valor.Id, Tipo: valor.Tipo, Valor: valor.Valor, Transfer: environment.NULL}
	newVector := vector.Valor[:len(vector.Valor)-1]
	vector.Valor = newVector
	env.(environment.Environment).SetVector(p.id_var, vector)
	
	}else{
		ast.SetError("ERRRO: No es posible utilizar removeLast con un vector vacio")

		fmt.Print("ERRRO: No es posible utilizar removeLast con un vector vacio")
	}
	*/
	return nil
}