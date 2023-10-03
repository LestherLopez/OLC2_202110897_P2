package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
)

type ToDeclareStruct struct {
	Lin     int
	Col     int
	Id      string
	ListAtr []interface{}
}

func NewToDeclareStruct(lin int, col int, id string, list []interface{}) ToDeclareStruct {
	instr := ToDeclareStruct{lin, col, id, list}
	return instr
}

func (p ToDeclareStruct) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
//	env.(environment.Environment).SaveStruct(p.Id, p.ListAtr)
	return nil
}