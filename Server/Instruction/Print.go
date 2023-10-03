package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
	"fmt"
	"strconv"
)

type Print struct {
	Lin   int
	Col   int
	Value []interface{}
}

func NewPrint(lin int, col int, val []interface{}) Print {
	return Print{lin, col, val}
}

func (p Print) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	var consoleOut string
	for _, inst := range p.Value {
		valueToPrint := inst.(interfaces.Expression).Ejecutar(ast, env, gen)
		consoleOut = consoleOut+ fmt.Sprintf("%v", valueToPrint.Value)
		consoleOut = consoleOut + " "
		if valueToPrint.Type == environment.INTEGER || valueToPrint.Type == environment.ARRAY {
			gen.AddPrintf("d", "(int)"+fmt.Sprintf("%v", valueToPrint.Value))
			gen.AddPrintf("c", "10")
			gen.AddBr()

		}else if valueToPrint.Type == environment.STRING{
			//recorrer cadena y colocar cada uno de sus asciis
			gen.AddPrintf("c", "10")
			gen.AddBr()
		}else if valueToPrint.Type == environment.FLOAT {
			val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", valueToPrint.Value), 64)
			gen.AddPrintf("f", "(int)"+fmt.Sprintf("%v", val2))
			gen.AddPrintf("c", "10")
			gen.AddBr()
		}
		
	}
	ast.SetPrint(consoleOut + "\n")
	return nil
}