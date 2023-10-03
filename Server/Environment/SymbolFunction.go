package environment

type SymbolFunction struct {
	Lin               int
	Col               int
	Id                string
	TipoReturn        TipoExpresion
	Bloque_parametros []interface{}
	Bloque_sentencias []interface{}
	Isreturn          bool
	Return            Symbol
}