package instructions

import (
	environment "Server/Environment"
	generator "Server/Generator"
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