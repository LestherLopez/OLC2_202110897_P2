package expressions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	"strconv"
)

type AccessVector struct {
	Lin   int
	Col   int
	id 	  string
	
}

func NewAccessVector(lin int, col int, id string) AccessVector {
	accessvec := AccessVector{lin, col, id}
	return accessvec
}

func (p AccessVector) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {

	gen.AddComment("Llamando una variable "+p.id)
	var result environment.Value
	retSym := env.(environment.Environment).GetVariable(p.id)
	newTemp := gen.NewTemp()
	newTemp2 := gen.NewTemp()
	if gen.MainCode {
		
		gen.AddExpression(newTemp2, newTemp2, strconv.Itoa(retSym.Posicion), "+")
	} else {
		
		gen.AddGetStack(newTemp2, "(int)"+newTemp)
	}
	result = environment.NewValue(newTemp2, true, retSym.Tipo)
	result.ArrSize = retSym.ArrSize
	result.Type = environment.ARRAY
	return result
	
}