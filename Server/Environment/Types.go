package environment

type TipoExpresion int

const (
	INTEGER   TipoExpresion = iota //0
	FLOAT                          //1
	STRING                         //2
	BOOLEAN                        //3
	NULL                           //4
	CHARACTER                      //5
	RETURN                         //6
	BREAK                          //7
	CONTINUE                       //8
	STRUCT                         //9
	ARRAY                          //10
)