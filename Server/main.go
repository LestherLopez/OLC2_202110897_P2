package main

import (
	environment "Server/Environment"
	generator "Server/Generator"
	interfaces "Server/Interfaces"
	"Server/parser"
	"errors"
	"fmt"
	"strings"

	"github.com/antlr4-go/antlr/v4"
	"github.com/gofiber/fiber/v2"
	"github.com/gofiber/fiber/v2/middleware/cors"
)

type TreeShapeListener struct {
	*parser.BaseGrammarListener
	Code []interface{}
}
type ErrorListener struct {
	*antlr.DefaultErrorListener
	Errors []error
}

func main() {
	
	app := fiber.New()
	app.Use(cors.New())
	//Entrada
	app.Post("/interpreter", func(c *fiber.Ctx) error {
		var request struct {
			Code string `json:"code"`
		}

		if err := c.BodyParser(&request); err != nil {
			return err
		}
	
		//Leyendo entrada
		input := antlr.NewInputStream(request.Code)
		lexer := parser.NewLex(input)
		tokens := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
		//creacion de parser
		p := parser.NewGrammarParser(tokens)
		errorlisterner := NewErrorListener()
		p.RemoveErrorListeners()
		p.AddErrorListener(errorlisterner)
		p.BuildParseTrees = true
		tree := p.S()
		//listener
		var listener *TreeShapeListener = NewTreeShapeListener()
		antlr.ParseTreeWalkerDefault.Walk(listener, tree)
		Code := listener.Code
		//create ast
		var Ast environment.AST
		env := environment.NewEnvironment(nil, "Entorno Global")

		var Generator generator.Generator
		Generator = generator.NewGenerator()
		Generator.MainCode = true
		
		//ejecución
		for _, inst := range Code {
			if strings.Contains(fmt.Sprintf("%T", inst), "instructions") {
				err := inst.(interfaces.Instruction).Ejecutar(&Ast, env, &Generator)
				if err != nil {
					for _, lvl := range inst.(environment.Value).OutLabel {
						Generator.AddComment("Outlvl agregado")
						Generator.AddLabel(lvl.(string))
					}
					return c.Status(fiber.StatusInternalServerError).JSON(fiber.Map{
						"error": "Error executing code",
				})
		}
	}
		}
		
		Generator.GenerateFinalCode()
		var ConsoleOut = ""
		if Ast.GetErrors() == "" {
			for _, item := range Generator.GetFinalCode() {
				
		
				ConsoleOut += item.(string)
			}
		} else {
			ConsoleOut = Ast.GetErrors()
		}
		fmt.Println(ConsoleOut)
		return c.JSON(ConsoleOut)
		})
		app.Listen(":5000")
}

func NewTreeShapeListener() *TreeShapeListener {
	return new(TreeShapeListener)
}

func (this *TreeShapeListener) ExitS(ctx *parser.SContext) {
	this.Code = ctx.GetCode()
}
func NewErrorListener() *ErrorListener {
	return &ErrorListener{
		DefaultErrorListener: antlr.NewDefaultErrorListener(),
		Errors:               make([]error, 0),
	}
}

func (e *ErrorListener) SyntaxError(_ antlr.Recognizer, _ interface{}, line, column int, msg string, _ antlr.RecognitionException) {
	errorMsg := fmt.Sprintf("Syntax error at line %d, column %d: %s", line, column, msg)
	e.Errors = append(e.Errors, errors.New(errorMsg))
}