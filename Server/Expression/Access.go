package expressions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	"strconv"
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
	gen.AddComment("Llamando una variable")
	var result environment.Value
	retSym := env.(environment.Environment).GetVariable(p.id)
	newTemp := gen.NewTemp()
	newTemp2 := gen.NewTemp()
	if gen.MainCode {
		gen.AddGetStack(newTemp2, strconv.Itoa(retSym.Posicion))
	} else {
		gen.AddExpression(newTemp, "P", strconv.Itoa(retSym.Posicion), "+")
		gen.AddGetStack(newTemp2, "(int)"+newTemp)
	}

	if retSym.Tipo == environment.BOOLEAN {
		trueLabel := gen.NewLabel()
		falseLabel := gen.NewLabel()
		gen.AddIf(newTemp2, "1", "==", trueLabel)
		gen.AddGoto(falseLabel)
		result = environment.NewValue("", false, environment.BOOLEAN)
		result.TrueLabel = append(result.TrueLabel, trueLabel)
		result.FalseLabel = append(result.FalseLabel, falseLabel)
	} else {
		result = environment.NewValue(newTemp2, true, retSym.Tipo)
		
	}

	result.Type = retSym.Tipo
	result.Transfer = retSym.Transfer
	result.IsTemp = retSym.Mutable
	return result
}