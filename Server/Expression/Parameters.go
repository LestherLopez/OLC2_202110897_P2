package expressions

import (
	environment "Server/Environment"
	generator "Server/Generator"
)

type Parameters struct {
	Lin   int
	Col   int
	Type  environment.TipoExpresion
	firs_Id	  string
	second_Id string
	number   int
}

func NewParameters(lin int, col int, tipo environment.TipoExpresion, first_id string, second_id string, number int) Parameters {
	
	exp := Parameters{lin, col, tipo, first_id, second_id, number}
	return exp
}

func (p Parameters) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	//fmt.Print(p.firs_Id)
	/*
	switch p.number{
	case 1:
		if(p.firs_Id=="_"){

		//	fmt.Print("parametro guardado con exito")
			return environment.Symbol{
				Lin:   p.Lin,
				Col:   p.Col,
				Tipo:  p.Type,
				Id:	   p.second_Id,
				Mutable: true,
				Valor:  nil,
				IsList: false,
			
			}
	
		}else{
		//	fmt.Print("parametro con referencia externa")
			return environment.Symbol{
				Lin:   p.Lin,
				Col:   p.Col,
				Tipo:  p.Type,
				Id:	   p.firs_Id,
				Mutable: true,
				IsList: false,
			}
		}
	case 2:
		if(p.firs_Id=="_"){

			//fmt.Print("parametro guardado con exito list")
			return environment.Symbol{
				Lin:   p.Lin,
				Col:   p.Col,
				Tipo:  p.Type,
				Id:	   p.second_Id,
				Mutable: true,
				Valor:  nil,
				IsList: true,
			}
	
		}else{
		//	fmt.Print("parametro con referencia externa")
			return environment.Symbol{
				Lin:   p.Lin,
				Col:   p.Col,
				Tipo:  p.Type,
				Id:	   p.firs_Id,
				Mutable: true,
				IsList: true,
			}
		}
	
		
	
	}*/
	var result environment.Value
	result = environment.NewValue(p.second_Id, false, p.Type)
	return result
	}