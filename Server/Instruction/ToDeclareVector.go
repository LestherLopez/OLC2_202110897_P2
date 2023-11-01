package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
	"strconv"
)

type ToDeclareVector struct {
	Lin   int
	Col   int
	id_var string
	type_var environment.TipoExpresion
	valores interfaces.Expression
	second_id string
}
//lin int, col int, id_var string, type_var environment.TipoExpresion, valor interfaces.Expression, constant bool
func NewToDeclareVector(lin int, col int, id_var string, type_var environment.TipoExpresion, valores interfaces.Expression, second_id string) ToDeclareVector {
	return ToDeclareVector{lin, col, id_var, type_var, valores, second_id}
}

func (p ToDeclareVector) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	var result environment.Value
	
	

	result = p.valores.Ejecutar(ast, env, gen)

		 env.(environment.Environment).SaveArrayVariable(p.id_var, p.type_var, len(result.ArrValue))
		gen.AddComment("Iniciando la declaración de un ARRAY")
		p.ArrayValidation(ast, env, gen, result.ArrValue)
		gen.AddComment("Se finalizó la declaración de un ARRAY")
	
	

	return nil

}
func (p ToDeclareVector) ArrayValidation(ast *environment.AST, env interface{}, gen *generator.Generator, arr []interface{}) {
	for _, val := range arr {
		if val.(environment.Value).Type == environment.ARRAY {
			p.ArrayValidation(ast, env, gen, val.(environment.Value).ArrValue)
		} else {
			envSize := env.(environment.Environment).NewVariable()
			gen.AddSetStack(strconv.Itoa(envSize.Posicion), val.(environment.Value).Value)
			gen.AddBr()
		}
	}
}