package interfaces

import (
	environment "Server/Environment"
	generator "Server/Generator"
)

type Expression interface {
	Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value
}