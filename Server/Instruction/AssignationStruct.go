package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
)

type AssignationStruct struct {
	Lin   int
	Col   int
	Struct string
	Id     string
	valor interfaces.Expression
}

func NewAssignationStruct(lin int, col int, id_var string, secondid string,valor interfaces.Expression) AssignationStruct {
	return AssignationStruct{lin, col, id_var, secondid, valor}
}

func (p AssignationStruct) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	/*
	var valor_asignar environment.Symbol
	valor_asignar = p.valor.(interfaces.Expression).Ejecutar(ast, env)

	tempStruct := env.(environment.Environment).GetVariable(p.Struct)
	if tempStruct.Tipo == environment.STRUCT{
		if variable, ok := tempStruct.Valor.(map[string]environment.Symbol)[p.Id]; ok {
			variable = valor_asignar
			env.(environment.Environment).SetVariable(p.Struct, tempStruct)
			return variable
	}
	

	
	}*/
	return nil
}