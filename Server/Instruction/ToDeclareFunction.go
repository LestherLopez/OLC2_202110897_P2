package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
	"fmt"
	"strings"
)

type ToDeclareFunction struct {
	Lin   int
	Col   int
	id_func string
	parametros []interface{}
	type_var environment.TipoExpresion
	sentences   []interface{}
	number      int
}
//lin int, col int, id_func string, type_var environment.TipoExpresion, valor interfaces.Expression, constant bool
func NewToDeclareFunction(lin int, col int, id_func string, parametros []interface{}, type_var environment.TipoExpresion, sentences []interface{}, number int) ToDeclareFunction {

	return ToDeclareFunction{lin, col, id_func, parametros, type_var, sentences, number}
}

func (p ToDeclareFunction) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {

	var result environment.Value
	gen.MainCode = false
	gen.AddComment("******** Funcion " + p.id_func)
	gen.AddHeaderFunc(p.id_func)
	//entorno
	var envFunc environment.Environment
	envFunc = environment.NewEnvironment(env.(environment.Environment), p.id_func)
	envFunc.Size["size"] = envFunc.Size["size"] + 1
	//variables
	for _, s := range p.parametros {
		res := s.(interfaces.Expression).Ejecutar(ast, env, gen)
		envFunc.KeepVariable(res.Value, res.Type, res.Mutable, p.Lin, p.Col)
	}
	//instrucciones func
	for _, s := range p.sentences {
		if strings.Contains(fmt.Sprintf("%T", s), "instructions") {
			resInst := s.(interfaces.Instruction).Ejecutar(ast, envFunc, gen)
			if resInst != nil {
				//agregando etiquetas de salida
				for _, lvl := range resInst.(environment.Value).OutLabel {
					gen.AddLabel(lvl.(string))
				}
			}
		} else if strings.Contains(fmt.Sprintf("%T", s), "expressions") {
			result = s.(interfaces.Expression).Ejecutar(ast, envFunc, gen)
			//agregando etiquetas de salida
			for _, lvl := range result.OutLabel {
				gen.AddLabel(lvl.(string))
			}
		} else {
			fmt.Println("Error en bloque")
		}
	}
	gen.AddFuncEnd()
	gen.MainCode = true


	
	/*
	switch p.number {
    case 1:
		//funcion con return y con parametros
		
	
        function := environment.SymbolFunction{Lin: p.Lin, Col: p.Col, Id: p.id_func, TipoReturn: p.type_var,  Bloque_parametros: p.parametros, Bloque_sentencias: p.sentences, Isreturn: true}
	   env.(environment.Environment).KeepFunction(p.id_func, function)
    case 2:
        //funcion sin return y con parametros
		
		function := environment.SymbolFunction{Lin: p.Lin, Col: p.Col, Id: p.id_func, TipoReturn: environment.NULL,  Bloque_parametros: p.parametros, Bloque_sentencias: p.sentences, Isreturn: false}
	   	env.(environment.Environment).KeepFunction(p.id_func, function)
		fmt.Print(function.Id)
    case 3:
        //funcion con return y sin parametros
		function := environment.SymbolFunction{Lin: p.Lin, Col: p.Col, Id: p.id_func, TipoReturn: p.type_var,  Bloque_parametros: nil, Bloque_sentencias: p.sentences, Isreturn: true}
	   env.(environment.Environment).KeepFunction(p.id_func, function)
    case 4:
       //funcion sin return y sin parametros
	   function := environment.SymbolFunction{Lin: p.Lin, Col: p.Col, Id: p.id_func, TipoReturn: environment.NULL,  Bloque_parametros: nil, Bloque_sentencias: p.sentences, Isreturn: false}
	   env.(environment.Environment).KeepFunction(p.id_func, function)
    default:
        fmt.Println("No es posible declarar la funcion "+p.id_func)
    }*/
	
	return nil

}