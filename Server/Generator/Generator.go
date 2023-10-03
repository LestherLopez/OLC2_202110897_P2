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
}

func NewGenerator() Generator {
	generator := Generator{
		Temporal:      0,
		Label:         0,
		BreakLabel:    "",
		ContinueLabel: "",
		MainCode:      true,
	}
	return generator
}

func (g Generator) GetCode() []interface{} {
	return g.Code
}

func (g Generator) GetFinalCode() []interface{} {
	return g.FinalCode
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
	tmpDec := fmt.Sprintf("%v", g.TempList[0])
	g.TempList =  append(g.TempList[:0], g.TempList[0+1:]... )
	for _, s := range g.TempList {
		tmpDec += ", "
		tmpDec += fmt.Sprintf("%v", s)
	}
	tmpDec += ";\n\n"
	g.FinalCode = append(g.FinalCode, tmpDec)
	//****************** add natives functions
	if len(g.Natives) > 0 {
	//	g.FinalCode.Add("/*------NATIVES------*/\n")
		for _, s := range g.Natives {
			g.FinalCode = append(g.FinalCode, s)
		}
	}
	//****************** add functions
	if len(g.FuncCode) > 0 {
	//	g.FinalCode.Add("/*------FUNCTIONS------*/\n")
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