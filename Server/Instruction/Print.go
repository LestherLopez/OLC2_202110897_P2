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
		if valueToPrint.Type == environment.INTEGER || valueToPrint.Type == environment.FLOAT {
			gen.AddPrintf("d", "(int)"+fmt.Sprintf("%v", valueToPrint.Value))
			gen.AddPrintf("c", "10")
			gen.AddBr()

		}else if valueToPrint.Type == environment.STRING || valueToPrint.Type == environment.CHARACTER {
			//llamar a generar printstring
			gen.GeneratePrintString()
			//agregar codigo en el main
			newTemp1 := gen.NewTemp()
			newTemp2 := gen.NewTemp()
			size := strconv.Itoa(env.(environment.Environment).Size["size"])
			gen.AddExpression(newTemp1, "P", size, "+")     //nuevo temporal en pos vacia
			gen.AddExpression(newTemp1, newTemp1, "1", "+") //se deja espacio de retorno
			gen.AddSetStack("(int)"+newTemp1, valueToPrint.Value) //se coloca string en parametro que se manda
			gen.AddExpression("P", "P", size, "+")          // cambio de entorno
			gen.AddCall("dbrust_printString")               //Llamada
			gen.AddGetStack(newTemp2, "(int)P")             //obtencion retorno
			gen.AddExpression("P", "P", size, "-")          //regreso del entorno
			gen.AddPrintf("c", "10")                        //salto de linea
			gen.AddBr()
			

		}else if valueToPrint.Type == environment.BOOLEAN {
			if valueToPrint.IsTemp {

			}
			newLabel := gen.NewLabel()
			for _, label := range valueToPrint.TrueLabel {
				gen.AddLabel(label.(string))
			}
			gen.AddPrintf("c", "(char)116")
			gen.AddPrintf("c", "(char)114")
			gen.AddPrintf("c", "(char)117")
			gen.AddPrintf("c", "(char)101")
			gen.AddGoto(newLabel)

			for _, label := range valueToPrint.FalseLabel {
				gen.AddLabel(label.(string))
			}
			gen.AddPrintf("c", "(char)102")
			gen.AddPrintf("c", "(char)97")
			gen.AddPrintf("c", "(char)108")
			gen.AddPrintf("c", "(char)115")
			gen.AddPrintf("c", "(char)101")
			gen.AddLabel(newLabel)
			gen.AddPrintf("c", "10")
			gen.AddBr()

		}
		
	}
	ast.SetPrint(consoleOut + "\n")
	return nil
}