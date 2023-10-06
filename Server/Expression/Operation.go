package expressions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
	"fmt"
)

type Operation struct {
	Lin      int
	Col      int
	Op_izq   interfaces.Expression
	Operador string
	Op_der   interfaces.Expression
}

func NewOperation(lin int, col int, Op1 interfaces.Expression, Operador string, Op2 interfaces.Expression) Operation {
	exp := Operation{Lin: lin, Col: col, Op_izq: Op1, Operador: Operador, Op_der: Op2}
	return exp
}

func (o Operation) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var dominante environment.TipoExpresion

	tabla_dominante := [5][5]environment.TipoExpresion{
		//		INTEGER			FLOAT				STRING				BOOLEAN				NULL
		{environment.INTEGER, environment.FLOAT, environment.STRING, environment.BOOLEAN, environment.NULL},
		//FLOAT
		{environment.FLOAT, environment.FLOAT, environment.STRING, environment.NULL, environment.NULL},
		//STRING
		{environment.STRING, environment.STRING, environment.STRING, environment.STRING, environment.NULL},
		//BOOLEAN
		{environment.BOOLEAN, environment.NULL, environment.STRING, environment.BOOLEAN, environment.NULL},
		//NULL
		{environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
	}

	if o.Op_der == nil {
		var op1 environment.Value
		op1 = o.Op_izq.Ejecutar(ast, env, gen)
		if o.Operador=="-"{
			if op1.Type == 0 {
				
			} else if op1.Type==1{

			}
		}
	}

	var op1, op2, result environment.Value
	
	newTemp := gen.NewTemp()

	switch o.Operador {
	case "+":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			//validar tipo dominante
			dominante = tabla_dominante[op1.Type][op2.Type]
			//valida el tipo
			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				// agregar expresion a generador
				gen.AddExpression(newTemp, op1.Value, op2.Value, "+")
				//crear nuevo valor en el environment
				result = environment.NewValue(newTemp, true, dominante)
				//cambiar el valor del nuevo valor por la suma
				result.IntValue = op1.IntValue + op2.IntValue
				return result
			} else {
				ast.SetError("ERROR: No es posible sumar")
			}
		}
	case "-":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]

			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				gen.AddExpression(newTemp, op1.Value, op2.Value, "-")
				result = environment.NewValue(newTemp, true, dominante)
				result.IntValue = op1.IntValue - op2.IntValue
				return result
			} else {
				ast.SetError("ERROR: No es posible restar")
			}
		}
	case "*":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				gen.AddExpression(newTemp, op1.Value, op2.Value, "*")
				result = environment.NewValue(newTemp, true, dominante)
				result.IntValue = op1.IntValue * op2.IntValue
				return result
			} else {
				ast.SetError("ERROR: No es posible Multiplicar")
			}
		}
	case "/":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				lvl1 := gen.NewLabel()
				lvl2 := gen.NewLabel()

				gen.AddIf(op2.Value, "0", "!=", lvl1)
				gen.AddPrintf("c", "77")
				gen.AddPrintf("c", "97")
				gen.AddPrintf("c", "116")
				gen.AddPrintf("c", "104")
				gen.AddPrintf("c", "69")
				gen.AddPrintf("c", "114")
				gen.AddPrintf("c", "114")
				gen.AddPrintf("c", "111")
				gen.AddPrintf("c", "114")
				gen.AddExpression(newTemp, "0", "", "")
				gen.AddGoto(lvl2)
				gen.AddLabel(lvl1)
				gen.AddExpression(newTemp, op1.Value, op2.Value, "/")
				gen.AddLabel(lvl2)
				result = environment.NewValue(newTemp, true, dominante)
				return result
			} else {
				ast.SetError("ERROR: No es posible Dividir")
			}

		}
	case "%":
		{
			/*
			if(op1.Tipo==0 && op2.Tipo==0){
				if(op2.Valor.(int)!=0){
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: op1.Valor.(int) % op2.Valor.(int)}
				}else if(op2.Valor.(int)==0){
					ast.SetError("ERROR: MATH ERROR")
				}
				
			} else{
				ast.SetError("ERROR: No es posible obtener el modulo")
			}*/
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]
			if op1.Type == 0 && op2.Type == 0  {
				lvl1 := gen.NewLabel()
				lvl2 := gen.NewLabel()
				gen.AddIf(op2.Value, "0", "!=", lvl1)
				gen.AddPrintf("c", "77")
				gen.AddPrintf("c", "97")
				gen.AddPrintf("c", "116")
				gen.AddPrintf("c", "104")
				gen.AddPrintf("c", "69")
				gen.AddPrintf("c", "114")
				gen.AddPrintf("c", "114")
				gen.AddPrintf("c", "111")
				gen.AddPrintf("c", "114")
				gen.AddExpression(newTemp, "0", "", "")
				gen.AddGoto(lvl2)
				gen.AddLabel(lvl1)
				gen.AddExpression(newTemp, op1.Value, op2.Value, "%")
				gen.AddLabel(lvl2)
				result = environment.NewValue(newTemp, true, dominante)
				return result

			}else{
				ast.SetError("ERROR: No es posible realizar la operacion módulo")
			}
		}
	case "<":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				trueL := gen.NewLabel()
				falseL := gen.NewLabel()
				gen.AddIf(op1.Value, op2.Value, "<", trueL)
				gen.AddGoto(falseL)
				result = environment.NewValue("", false, environment.BOOLEAN)
				result.TrueLabel = append(result.TrueLabel, trueL)
				result.FalseLabel = append(result.FalseLabel, falseL)
				return result
			} else{
				fmt.Print("ERROR: No es posible usar < con las variables proporcionadas")
			}
		}
	case ">":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				trueL := gen.NewLabel()
				falseL := gen.NewLabel()
				gen.AddIf(op1.Value, op2.Value, ">", trueL)
				gen.AddGoto(falseL)
				result = environment.NewValue("", false, environment.BOOLEAN)
				result.TrueLabel = append(result.TrueLabel, trueL)
				result.FalseLabel = append(result.FalseLabel, falseL)
				return result
			} else{
				fmt.Print("ERROR: No es posible usar > con las variables proporcionadas")
			}
		}
	case "<=":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				trueL := gen.NewLabel()
				falseL := gen.NewLabel()
				gen.AddIf(op1.Value, op2.Value, "<=", trueL)
				gen.AddGoto(falseL)
				result = environment.NewValue("", false, environment.BOOLEAN)
				result.TrueLabel = append(result.TrueLabel, trueL)
				result.FalseLabel = append(result.FalseLabel, falseL)
				return result
			} else{
				fmt.Print("ERROR: No es posible usar <= con las variables proporcionadas")
			}
		}
	case ">=":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				trueL := gen.NewLabel()
				falseL := gen.NewLabel()
				gen.AddIf(op1.Value, op2.Value, ">=", trueL)
				gen.AddGoto(falseL)
				result = environment.NewValue("", false, environment.BOOLEAN)
				result.TrueLabel = append(result.TrueLabel, trueL)
				result.FalseLabel = append(result.FalseLabel, falseL)
				return result
			} else{
				fmt.Print("ERROR: No es posible usar >= con las variables proporcionadas")
			}
		}
	case "==":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				trueL := gen.NewLabel()
				falseL := gen.NewLabel()
				gen.AddIf(op1.Value, op2.Value, "==", trueL)
				gen.AddGoto(falseL)
				result = environment.NewValue("", false, environment.BOOLEAN)
				result.TrueLabel = append(result.TrueLabel, trueL)
				result.FalseLabel = append(result.FalseLabel, falseL)
				return result
			} else{
				fmt.Print("ERROR: No es posible usar == con las variables proporcionadas")
			}
		}
	case "!=":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				trueL := gen.NewLabel()
				falseL := gen.NewLabel()
				gen.AddIf(op1.Value, op2.Value, "!=", trueL)
				gen.AddGoto(falseL)
				result = environment.NewValue("", false, environment.BOOLEAN)
				result.TrueLabel = append(result.TrueLabel, trueL)
				result.FalseLabel = append(result.FalseLabel, falseL)
				return result
			} else{
				fmt.Print("ERROR: No es posible usar != con las variables proporcionadas")
			}

		}
	case "&&":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			//add op1 labels
			for _, lvl := range op1.TrueLabel {
				gen.AddLabel(lvl.(string))
			}

			op2 = o.Op_der.Ejecutar(ast, env, gen)

			result = environment.NewValue("", false, environment.BOOLEAN)
			result.TrueLabel = append(op2.TrueLabel, result.TrueLabel...)
			result.FalseLabel = append(op1.FalseLabel, result.FalseLabel...)
			result.FalseLabel = append(op2.FalseLabel, result.FalseLabel...)
			return result
		}
	case "||":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)

			for _, lvl := range op1.FalseLabel {
				gen.AddLabel(lvl.(string))
			}
			op2 = o.Op_der.Ejecutar(ast, env, gen)

			result = environment.NewValue("", false, environment.BOOLEAN)

			result.TrueLabel = append(op1.TrueLabel, result.TrueLabel...)
			result.TrueLabel = append(op2.TrueLabel, result.TrueLabel...)
			result.FalseLabel = append(op2.FalseLabel, result.FalseLabel...)
			return result
		}
	case "!":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			if op1.Type == environment.BOOLEAN {
				result = environment.NewValue("", false, environment.BOOLEAN)
				result.TrueLabel = append(op1.FalseLabel, result.TrueLabel)
				result.FalseLabel = append(op1.TrueLabel, result.FalseLabel)
				return result
			}else{
				fmt.Println("ERROR: La expresion tiene que ser de tipo boolean para usar !")
			}
		}

	}


	gen.AddBr()
	return environment.Value{}
}
//falta agregar ultimas operaciones y suma de cadenas