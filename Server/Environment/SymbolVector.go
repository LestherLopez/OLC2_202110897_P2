package environment

type SymbolVector struct {
	Lin      int
	Col      int
	Id       string
	Tipo     TipoExpresion
	Valor    []interface{}
	Transfer TipoExpresion
}