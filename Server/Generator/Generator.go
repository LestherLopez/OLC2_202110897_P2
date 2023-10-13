package generator

import (
	"fmt"
)

type Generator struct {
	Temporal      int
	Label         int
	Code          []interface{}
	FinalCode     []interface{}
	Natives       []interface{}
	FuncCode      []interface{}
	TempList      []interface{}
	BreakLabel    string
	ContinueLabel string
	MainCode      bool
	PrintStringFlag bool
	ConcatStringFlag bool
}

func NewGenerator() Generator {
	generator := Generator{
		Temporal:      0,
		Label:         0,
		BreakLabel:    "",
		ContinueLabel: "",
		PrintStringFlag: true,
		MainCode:      true,
		ConcatStringFlag: true,
	}
	return generator
}

func (g Generator) GetCode() []interface{} {
	return g.Code
}

func (g Generator) GetFinalCode() []interface{} {
	return g.FinalCode
}

func (g Generator) GetTemps() []interface{} {
	return g.TempList
}

// add break lvl
func (g *Generator) AddBreak(lvl string) {
	g.BreakLabel = lvl
}

// add continue lvl
func (g *Generator) AddContinue(lvl string) {
	g.ContinueLabel = lvl
}



// Generar un nuevo temporal
func (g *Generator) NewTemp() string {
	temp := "t" + fmt.Sprintf("%v", g.Temporal)
	g.Temporal = g.Temporal + 1
	//Lo guardamos para declararlo
	g.TempList = append(g.TempList, temp)
	return temp
}

// Generador de Label
func (g *Generator) NewLabel() string {
	temp := g.Label
	g.Label = g.Label + 1
	return "L" + fmt.Sprintf("%v", temp)
}

// Añade Label al codigo
func (g *Generator) AddLabel(Label string) {
	if g.MainCode {
		g.Code = append(g.Code, Label+":\n")
	} else {
		g.FuncCode = append(g.FuncCode, Label+":\n")
	}
}
// add funcion header
func (g *Generator) AddHeaderFunc(lvl string){
	if g.MainCode {
		g.Code = append(g.Code, "void " + lvl + "() {\n")
	} else {
		g.FuncCode= append(g.FuncCode, "void " + lvl + "() {\n")
	}
}
func (g *Generator) AddFuncEnd() {
	if g.MainCode {
		g.Code = append(g.Code, "\treturn;\n")
		g.Code = append(g.Code, "}\n\n")
	} else {
		g.FuncCode = append(g.FuncCode, "\treturn;\n")
		g.FuncCode = append(g.FuncCode, "}\n\n")
	}
}


func (g *Generator) AddIf(left string, right string, operator string, Label string) {
	if g.MainCode {
		g.Code = append(g.Code, "if("+left+" "+operator+" "+right+") goto "+Label+";\n")
	} else {
		g.FuncCode = append(g.FuncCode, "if("+left+" "+operator+" "+right+") goto "+Label+";\n")
	}
}

func (g *Generator) AddGoto(Label string) {
	if g.MainCode {
		g.Code = append(g.Code, "goto "+Label+";\n")
	} else {
		g.FuncCode = append(g.FuncCode, "goto "+Label+";\n")
	}
}

func (g *Generator) AddExpression(target string, left string, right string, operator string) {
	if g.MainCode {
		g.Code = append(g.Code, target+" = "+left+" "+operator+" "+right+";\n")
	} else {
		g.FuncCode = append(g.FuncCode, target+" = "+left+" "+operator+" "+right+";\n")
	}
}

func (g *Generator) AddAssign(target, val string) {
	if g.MainCode {
		g.Code = append(g.Code, target+" = "+val+";\n")
	} else {
		g.FuncCode = append(g.FuncCode, target+" = "+val+";\n")
	}
}

func (g *Generator) AddPrintf(typePrint string, value string) {
	if g.MainCode {
		g.Code = append(g.Code, "printf(\"%"+typePrint+"\", "+value+");\n")
	} else {
		g.FuncCode = append(g.FuncCode, "printf(\"%"+typePrint+"\", "+value+");\n")
	}
}

func (g *Generator) AddSetHeap(index string, value string) {
	if g.MainCode {
		g.Code = append(g.Code, "heap["+index+"] = "+value+";\n")
	} else {
		g.FuncCode = append(g.FuncCode, "heap["+index+"] = "+value+";\n")
	}
}

func (g *Generator) AddGetHeap(target string, index string) {
	if g.MainCode {
		g.Code = append(g.Code, target+" = heap["+index+"];\n")
	} else {
		g.FuncCode = append(g.FuncCode, target+" = heap["+index+"];\n")
	}
}

func (g *Generator) AddSetStack(index string, value string) {
	if g.MainCode {
		g.Code = append(g.Code, "stack["+index+"] = "+value+";\n")
	} else {
		g.FuncCode = append(g.FuncCode, "stack["+index+"] = "+value+";\n")
	}
}

func (g *Generator) AddGetStack(target string, index string) {
	if g.MainCode {
		g.Code = append(g.Code, target+" = stack["+index+"];\n")
	} else {
		g.FuncCode = append(g.FuncCode, target+" = stack["+index+"];\n")
	}
}

func (g *Generator) AddCall(target string) {
	if g.MainCode {
		g.Code = append(g.Code, target+"();\n")
	} else {
		g.FuncCode = append(g.FuncCode, target+"();\n")
	}
}

func (g *Generator) AddBr() {
	if g.MainCode {
		g.Code = append(g.Code, "\n")
	} else {
		g.FuncCode = append(g.FuncCode, "\n")
	}
}

func (g *Generator) AddComment(target string) {
	if g.MainCode {
		g.Code = append(g.Code, "//"+target+"\n")
	} else {
		g.FuncCode = append(g.FuncCode, "//"+target+"\n")
	}
}


func (g *Generator) GenerateFinalCode() {
	//****************** add head
	
	g.FinalCode = append(g.FinalCode, "# include <stdio.h>"+"\n"+"float stack[10000];"+"\n"+"float heap[10000];"+"\n"+"float P;"+"\n"+"float H;"+"\n"+"float ")
	//****************** add temporal declaration
	fmt.Print("a3")
	tmpDec := fmt.Sprintf("%v", g.GetTemps()[0])
	fmt.Print("a2")
	g.TempList =  append(g.TempList[:0], g.TempList[0+1:]... )
	fmt.Print("a1")
	for _, s := range g.TempList {
		tmpDec += ", "
		tmpDec += fmt.Sprintf("%v", s)
	}
	tmpDec += ";\n\n"
	g.FinalCode = append(g.FinalCode, tmpDec)
	//****************** add natives functions
	if len(g.Natives) > 0 {
	//	g.FinalCode = append(g.FinalCode, "/*------NATIVES------*/\n")
		for _, s := range g.Natives {
			g.FinalCode = append(g.FinalCode, s)
		}
	}
	//****************** add functions
	if len(g.FuncCode) > 0 {
		g.FinalCode = append(g.FinalCode, "/*------FUNCTIONS------*/\n")
		for _, s := range g.FuncCode {
			g.FinalCode = append(g.FinalCode, s)
		}
	}
	//****************** add main
	g.FinalCode = append(g.FinalCode, "int main() {\n")
	g.FinalCode = append(g.FinalCode, "\tP = 0; H = 0;\n\n")

	for _, s := range g.Code {
		g.FinalCode = append(g.FinalCode, "\t" + s.(string))
	}
	g.FinalCode = append(g.FinalCode, "\n\treturn 0;\n}\n")
}

func (g *Generator) GeneratePrintString() {
	if g.PrintStringFlag {
		//generando temporales y etiquetas
		newTemp1 := g.NewTemp()
		newTemp2 := g.NewTemp()
		newTemp3 := g.NewTemp()
		newLvl1 := g.NewLabel()
		newLvl2 := g.NewLabel()
		//se genera la funcion printstring
		g.Natives = append(g.Natives, "void dbrust_printString() {\n")
		g.Natives = append(g.Natives, "\t"+newTemp1+" = P + 1;\n")
		g.Natives = append(g.Natives, "\t"+newTemp2+" = stack[(int)"+newTemp1+"];\n")
		g.Natives = append(g.Natives, "\t"+newLvl2+":\n")
		g.Natives = append(g.Natives, "\t"+newTemp3+" = heap[(int)"+newTemp2+"];\n")
		g.Natives = append(g.Natives, "\tif("+newTemp3+" == -1) goto "+newLvl1+";\n")
		g.Natives = append(g.Natives, "\tprintf(\"%c\", (char)"+newTemp3+");\n")
		g.Natives = append(g.Natives, "\t"+newTemp2+" = "+newTemp2+" + 1;\n")
		g.Natives = append(g.Natives, "\tgoto "+newLvl2+";\n")
		g.Natives = append(g.Natives, "\t"+newLvl1+":\n")
		g.Natives = append(g.Natives, "\treturn;\n")
		g.Natives = append(g.Natives, "}\n\n")
		g.PrintStringFlag = false
	}
}

func (g *Generator) GenerateConcatString() {
	if g.ConcatStringFlag {
		//generando temporales y etiquetas
		tmp1 := g.NewTemp()
		tmp2 := g.NewTemp()
		tmp3 := g.NewTemp()
		tmp4 := g.NewTemp()
		tmp5 := g.NewTemp()
		lvl1 := g.NewLabel()
		lvl2 := g.NewLabel()
		lvl3 := g.NewLabel()
		lvl4 := g.NewLabel()
		//se genera la funcion printstring
		g.Natives=append(g.Natives,"void dbrust_concatString() {\n")
		g.Natives=append(g.Natives,"\t" + tmp1 + " = H;" + "\n")
		g.Natives=append(g.Natives,"\t" + tmp2 + " = P + 1;" + "\n")
		g.Natives=append(g.Natives,"\t" + tmp4 + " = stack[(int)" + tmp2 + "];" + "\n")
		g.Natives=append(g.Natives,"\t" + tmp3 + " = P + 2;" + "\n")
		g.Natives=append(g.Natives,"\t" + lvl2 + ":" + "\n")
		g.Natives=append(g.Natives,"\t" + tmp5 + " = heap[(int)" + tmp4 + "];" + "\n")
		g.Natives=append(g.Natives,"\t" + "if(" + tmp5 + " == -1) goto " + lvl3 + ";" + "\n")
		g.Natives=append(g.Natives,"\t" + "heap[(int)H] = " + tmp5 + ";" + "\n")
		g.Natives=append(g.Natives,"\t" + "H = H + 1;" + "\n")
		g.Natives=append(g.Natives,"\t" + tmp4 + " = " + tmp4 + " + 1;" + "\n")
		g.Natives=append(g.Natives,"\t" + "goto " + lvl2 + ";" + "\n")
		g.Natives=append(g.Natives,"\t" + lvl3 + ":" + "\n")
		g.Natives=append(g.Natives,"\t" + tmp4 + " = stack[(int)" + tmp3 + "];" + "\n")
		g.Natives=append(g.Natives,"\t" + lvl4 + ":" + "\n")
		g.Natives=append(g.Natives,"\t" + tmp5 + " = heap[(int)" + tmp4 + "];" + "\n")
		g.Natives=append(g.Natives,"\t" + "if(" + tmp5 + " == -1) goto " + lvl1 + ";" + "\n")
		g.Natives=append(g.Natives,"\t" + "heap[(int)H] = " + tmp5 + ";" + "\n")
		g.Natives=append(g.Natives,"\t" + "H = H + 1;" + "\n")
		g.Natives=append(g.Natives,"\t" + tmp4 + " = " + tmp4 + " + 1;" + "\n")
		g.Natives=append(g.Natives,"\t" + "goto " + lvl4 + ";" + "\n")
		g.Natives=append(g.Natives,"\t" + lvl1 + ":" + "\n")
		g.Natives=append(g.Natives,"\t" + "heap[(int)H] = -1;" + "\n")
		g.Natives=append(g.Natives,"\t" + "H = H + 1;" + "\n")
		g.Natives=append(g.Natives,"\t" + "stack[(int)P] = " + tmp1 + ";" + "\n")
		g.Natives=append(g.Natives,"\treturn;\n")
		g.Natives=append(g.Natives,"}\n\n")
		g.ConcatStringFlag = false
	}
}