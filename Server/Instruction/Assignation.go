package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
	"fmt"
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
	fmt.Print("entrmaos a la asignacion")
	var result environment.Value
	fmt.Print("entrmaos a la asignacion2")
	gen.AddComment("Generando asignacion")
	//buscando variable en entorno
	variable := env.(environment.Environment).GetVariable(p.id_var)
	fmt.Print("entrmaos a la asignacion3")
	//ejecutando valor
	result = p.valor.Ejecutar(ast, env, gen)
	//realizando asignacion
	fmt.Print("entrmaos a la asignacion4")
	gen.AddSetStack(strconv.Itoa(variable.Posicion), result.Value)
	fmt.Print("entrmaos a la asignacion5")
	gen.AddBr()

	
	return nil
}