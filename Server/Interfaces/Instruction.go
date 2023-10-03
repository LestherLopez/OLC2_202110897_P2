package interfaces

import (
	environment "Server/Environment"
	generator "Server/Generator"
)

type Instruction interface {
	Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{}
}