package environment

import (
	"fmt"
	"strings"
)

type Environment struct {
	
	Anterior  interface{}
	Variables map[string]Symbol
	SwitchVar Symbol
	Structs   map[string]Symbol
	NameEnv   string
	Vectors   map[string]SymbolVector
	Functions map[string]SymbolFunction
	Size     map[string]int
}

func NewEnvironment(ant interface{}, ide string) Environment {
	env := Environment{
		Anterior:  ant,
		Variables: make(map[string]Symbol),
		Vectors: make(map[string]SymbolVector),
		Functions: make(map[string]SymbolFunction),
		NameEnv:   ide,
		Structs:   make(map[string]Symbol),
		Size:     make(map[string]int),
	}
	env.Size["size"] = 0
	return env
}

func (env Environment) KeepVariable(id string, tipo TipoExpresion, mutable bool, lin int, col int) Symbol {
	if variable, ok := env.Variables[id]; ok {
		fmt.Println("La variable "+id+" ya existe ", variable)
		return env.Variables[id]
	}
	env.Variables[id] = Symbol{Lin: lin, Col: col, Tipo: tipo, Posicion: env.Size["size"], Mutable: mutable}
	
	env.Size["size"] = env.Size["size"] + 1
	return env.Variables[id]
}


func (env Environment) GetVariable(id string) Symbol {
	var tmpEnv Environment
	tmpEnv = env
	for {
		if variable, ok := tmpEnv.Variables[id]; ok {
			return variable
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("La variable ", id, " no existe en este environment")
	return Symbol{Lin: 0, Col: 0, Id: "", Tipo: NULL, Valor: 0, Mutable: false, Posicion: 0}
}

func (env Environment) SetVariable(id string, value Symbol) Symbol {
	//value.Id = id
	var tmpEnv Environment
	tmpEnv = env
	for {
		if variable, ok := tmpEnv.Variables[id]; ok {
			if tmpEnv.Variables[id].Mutable {
				if tmpEnv.Variables[id].Tipo == value.Tipo {
				
					tmpEnv.Variables[id] = value
					return variable
				} else {
					fmt.Println("El tipo es incorrecto")
					return Symbol{Lin: 0, Col: 0, Id: "", Tipo: NULL, Valor: 0, Mutable: false, Posicion: 0}
				}
			} else {
				fmt.Println("La variable", id, " no es mutable")
				return Symbol{Lin: 0, Col: 0, Id: "", Tipo: NULL, Valor: 0, Mutable: false, Posicion: 0}
			}
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("La variable ", id, " no existe")
	return Symbol{Lin: 0, Col: 0, Id: "", Tipo: NULL, Valor: 0, Mutable: false, Posicion: 0}
}

func (env Environment) KeepVector(id string, value SymbolVector) {
	
	if variable, ok := env.Vectors[id]; ok {
		fmt.Println("El vector "+id+" ya existe", variable)
		return
	}
	env.Vectors[id] = value
	
}

func (env Environment) SetVector(id string, value SymbolVector) SymbolVector {
	//value.Id = id
	var tmpEnv Environment
	tmpEnv = env
	for {
		
		if variable, ok := tmpEnv.Vectors[id]; ok {
					
					tmpEnv.Vectors[id] = value
					return variable
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("La variable ", id, " no existe")
	return SymbolVector{Lin: 0, Col: 0, Id: "", Tipo: NULL, Valor: nil}
}



func (env Environment) GetVector(id string) SymbolVector {
	var tmpEnv Environment
	tmpEnv = env
	for {
		if variable, ok := tmpEnv.Vectors[id]; ok {
			
			return variable
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("La variable ", id, " no existe en este environment")
	return SymbolVector{Lin: 0, Col: 0, Id: "", Tipo: NULL, Valor: nil, Transfer: NULL}
}

 
func (env Environment) KeepFunction(id string, value SymbolFunction) {
	if variable, ok := env.Functions[id]; ok {
		fmt.Println("La funcion " + variable.Id + " ya existe")
		return
	}
	env.Functions[id] = value
}

func (env Environment) GetFunction(id string) SymbolFunction {
	var tmpEnv Environment
	tmpEnv = env
	for {
		if variable, ok := tmpEnv.Functions[id]; ok {
			return variable
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("La funcion ", id, " no existe o es una funcion privada..")
	return SymbolFunction{TipoReturn: NULL}
}

func (env Environment) VerifyFunc() bool {
	var tmpEnv Environment
	tmpEnv = env
	for {
		if strings.Contains(tmpEnv.NameEnv, "FUNCTION") {
			return true
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("la sentencia tiene que estar dentro de un ciclo")
	return false
}


func (env Environment) SaveStruct(id string, list []interface{}) {
	if _, ok := env.Structs[id]; ok {
		fmt.Println("El struct " + id + " ya existe")
		return
	}
	env.Structs[id] = Symbol{Lin: 0, Col: 0, Tipo: STRUCT, Valor: list}
}

func (env Environment) GetStruct(id string) Symbol {

	var tmpEnv Environment
	tmpEnv = env

	for {
		if tmpStruct, ok := tmpEnv.Structs[id]; ok {
			return tmpStruct
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}

	fmt.Println("El struct ", id, " no existe")
	return Symbol{Lin: 0, Col: 0, Tipo: NULL, Valor: 0}
}

func (env Environment) GetGlobal() Environment{
	var tmpEnv Environment
	tmpEnv = env
	//longitud := len("Funcion")
	for {
		
		if 1==len(tmpEnv.Vectors){

			return tmpEnv
		} 
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}

	return Environment{}
}