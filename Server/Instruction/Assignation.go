package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
	"strconv"
)

type Assignation struct {
	Lin   int
	Col   int
	id_var string
	valor interfaces.Expression
}

func NewAssignation(lin int, col int, id_var string, valor interfaces.Expression) Assignation {
	return Assignation{lin, col, id_var, valor}
}

func (p Assignation) Ejecutar(ast *environment.AST, env interface{},  gen *generator.Generator) interface{} {
	var result environment.Value
	gen.AddComment("Generando asignacion")
	//buscando variable en entorno
	variable := env.(environment.Environment).GetVariable(p.id_var)
	//ejecutando valor
	result = p.valor.Ejecutar(ast, env, gen)
	//realizando asignacion
	gen.AddSetStack(strconv.Itoa(variable.Posicion), result.Value)
	gen.AddBr()
	return result
}