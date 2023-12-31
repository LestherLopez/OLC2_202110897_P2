package environment

type Value struct {
	Value      string
	IsTemp     bool
	Type       TipoExpresion
	TrueLabel  []interface{}
	FalseLabel []interface{}
	OutLabel   []interface{}
	ArrValue   []interface{}
	ArrSize    int
	IntValue   int
	Transfer   TipoExpresion
	Mutable    bool
}

func NewValue(Val string, tmp bool, typ TipoExpresion) Value {
	result := Value{
		Value:    Val,
		IsTemp:   tmp,
		Type:     typ,
		IntValue: 0,
		ArrValue: []interface{}{},
		ArrSize:  0,
	}
	return result
}