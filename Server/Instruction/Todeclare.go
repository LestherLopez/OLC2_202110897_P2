package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
	"strconv"
)

type Todeclare struct {
	Lin   int
	Col   int
	id_var string
	type_var environment.TipoExpresion
	valor interfaces.Expression
	constant bool
}
//lin int, col int, id_var string, type_var environment.TipoExpresion, valor interfaces.Expression, constant bool
func NewTodeclare(lin int, col int, id_var string, type_var environment.TipoExpresion, valor interfaces.Expression, constant bool) Todeclare {
	return Todeclare{lin, col, id_var, type_var, valor, constant}
}

func (p Todeclare) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	var result environment.Value
	var newVar environment.Symbol
	result = p.valor.Ejecutar(ast, env, gen)
	gen.AddComment("Agregando una declaracion")
	newVar = env.(environment.Environment).KeepVariable(p.id_var, p.type_var)

	if result.Type == environment.BOOLEAN {
		//si no es temp (boolean)
		newLabel := gen.NewLabel()
		//add labels
		for _, lvl := range result.TrueLabel {
			gen.AddLabel(lvl.(string))
		}
		gen.AddSetStack(strconv.Itoa(newVar.Posicion), "1")
		gen.AddGoto(newLabel)
		//add labels
		for _, lvl := range result.FalseLabel {
			gen.AddLabel(lvl.(string))
		}
		gen.AddSetStack(strconv.Itoa(newVar.Posicion), "0")
		gen.AddGoto(newLabel)
		gen.AddLabel(newLabel)
		gen.AddBr()
	} else {
		//si es temp (num,string,etc)
		gen.AddSetStack(strconv.Itoa(newVar.Posicion), result.Value)
		gen.AddBr()
	}

	return result
	

	//ast.SetPrint(consoleOut + "\n")
	//return valor_asignar
}