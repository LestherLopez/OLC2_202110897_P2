package environment

type Symbol struct {
	Lin      int
	Col      int
	Id       string
	Tipo     TipoExpresion
	Valor    interface{}
	Mutable  bool
	Transfer TipoExpresion
	IsList   bool
	Posicion int
	Label    string
}