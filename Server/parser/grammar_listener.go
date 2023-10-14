// Code generated from Grammar.g4 by ANTLR 4.13.0. DO NOT EDIT.

package parser // Grammar
import "github.com/antlr4-go/antlr/v4"

// GrammarListener is a complete listener for a parse tree produced by GrammarParser.
type GrammarListener interface {
	antlr.ParseTreeListener

	// EnterS is called when entering the s production.
	EnterS(c *SContext)

	// EnterBlock is called when entering the block production.
	EnterBlock(c *BlockContext)

	// EnterInstruction is called when entering the instruction production.
	EnterInstruction(c *InstructionContext)

	// EnterPrintstmt is called when entering the printstmt production.
	EnterPrintstmt(c *PrintstmtContext)

	// EnterDeclarestmt is called when entering the declarestmt production.
	EnterDeclarestmt(c *DeclarestmtContext)

	// EnterConstantstmt is called when entering the constantstmt production.
	EnterConstantstmt(c *ConstantstmtContext)

	// EnterBlockelifs is called when entering the blockelifs production.
	EnterBlockelifs(c *BlockelifsContext)

	// EnterIfstmt is called when entering the ifstmt production.
	EnterIfstmt(c *IfstmtContext)

	// EnterSwitchstmt is called when entering the switchstmt production.
	EnterSwitchstmt(c *SwitchstmtContext)

	// EnterCasestmt is called when entering the casestmt production.
	EnterCasestmt(c *CasestmtContext)

	// EnterBlockcases is called when entering the blockcases production.
	EnterBlockcases(c *BlockcasesContext)

	// EnterAssignationstmt is called when entering the assignationstmt production.
	EnterAssignationstmt(c *AssignationstmtContext)

	// EnterAssignationstructstmt is called when entering the assignationstructstmt production.
	EnterAssignationstructstmt(c *AssignationstructstmtContext)

	// EnterWhilestmt is called when entering the whilestmt production.
	EnterWhilestmt(c *WhilestmtContext)

	// EnterForstmt is called when entering the forstmt production.
	EnterForstmt(c *ForstmtContext)

	// EnterGuardstmt is called when entering the guardstmt production.
	EnterGuardstmt(c *GuardstmtContext)

	// EnterTransferstmt is called when entering the transferstmt production.
	EnterTransferstmt(c *TransferstmtContext)

	// EnterDeclarevectorstmt is called when entering the declarevectorstmt production.
	EnterDeclarevectorstmt(c *DeclarevectorstmtContext)

	// EnterAccessfuncinstruction is called when entering the accessfuncinstruction production.
	EnterAccessfuncinstruction(c *AccessfuncinstructionContext)

	// EnterAppendstmt is called when entering the appendstmt production.
	EnterAppendstmt(c *AppendstmtContext)

	// EnterRemovelaststmt is called when entering the removelaststmt production.
	EnterRemovelaststmt(c *RemovelaststmtContext)

	// EnterRemovestmt is called when entering the removestmt production.
	EnterRemovestmt(c *RemovestmtContext)

	// EnterEmptvecstmt is called when entering the emptvecstmt production.
	EnterEmptvecstmt(c *EmptvecstmtContext)

	// EnterCountvecstmt is called when entering the countvecstmt production.
	EnterCountvecstmt(c *CountvecstmtContext)

	// EnterAccessvecstmt is called when entering the accessvecstmt production.
	EnterAccessvecstmt(c *AccessvecstmtContext)

	// EnterAssignationvecstmt is called when entering the assignationvecstmt production.
	EnterAssignationvecstmt(c *AssignationvecstmtContext)

	// EnterDeclarematrixstmt is called when entering the declarematrixstmt production.
	EnterDeclarematrixstmt(c *DeclarematrixstmtContext)

	// EnterDeclarefuncstmt is called when entering the declarefuncstmt production.
	EnterDeclarefuncstmt(c *DeclarefuncstmtContext)

	// EnterListParamsFunc is called when entering the listParamsFunc production.
	EnterListParamsFunc(c *ListParamsFuncContext)

	// EnterParameterfuncstmt is called when entering the parameterfuncstmt production.
	EnterParameterfuncstmt(c *ParameterfuncstmtContext)

	// EnterDeclarestructstmt is called when entering the declarestructstmt production.
	EnterDeclarestructstmt(c *DeclarestructstmtContext)

	// EnterListStruct is called when entering the listStruct production.
	EnterListStruct(c *ListStructContext)

	// EnterExpr is called when entering the expr production.
	EnterExpr(c *ExprContext)

	// EnterAccessstructstmt is called when entering the accessstructstmt production.
	EnterAccessstructstmt(c *AccessstructstmtContext)

	// EnterAccessfuncstmt is called when entering the accessfuncstmt production.
	EnterAccessfuncstmt(c *AccessfuncstmtContext)

	// EnterIntfunctionstmt is called when entering the intfunctionstmt production.
	EnterIntfunctionstmt(c *IntfunctionstmtContext)

	// EnterFloatfunctionstmt is called when entering the floatfunctionstmt production.
	EnterFloatfunctionstmt(c *FloatfunctionstmtContext)

	// EnterStringfunctionstmt is called when entering the stringfunctionstmt production.
	EnterStringfunctionstmt(c *StringfunctionstmtContext)

	// EnterAccessstmt is called when entering the accessstmt production.
	EnterAccessstmt(c *AccessstmtContext)

	// EnterIncreaseanddecreasestmt is called when entering the increaseanddecreasestmt production.
	EnterIncreaseanddecreasestmt(c *IncreaseanddecreasestmtContext)

	// EnterType is called when entering the type production.
	EnterType(c *TypeContext)

	// EnterListParams is called when entering the listParams production.
	EnterListParams(c *ListParamsContext)

	// EnterListStructExp is called when entering the listStructExp production.
	EnterListStructExp(c *ListStructExpContext)

	// ExitS is called when exiting the s production.
	ExitS(c *SContext)

	// ExitBlock is called when exiting the block production.
	ExitBlock(c *BlockContext)

	// ExitInstruction is called when exiting the instruction production.
	ExitInstruction(c *InstructionContext)

	// ExitPrintstmt is called when exiting the printstmt production.
	ExitPrintstmt(c *PrintstmtContext)

	// ExitDeclarestmt is called when exiting the declarestmt production.
	ExitDeclarestmt(c *DeclarestmtContext)

	// ExitConstantstmt is called when exiting the constantstmt production.
	ExitConstantstmt(c *ConstantstmtContext)

	// ExitBlockelifs is called when exiting the blockelifs production.
	ExitBlockelifs(c *BlockelifsContext)

	// ExitIfstmt is called when exiting the ifstmt production.
	ExitIfstmt(c *IfstmtContext)

	// ExitSwitchstmt is called when exiting the switchstmt production.
	ExitSwitchstmt(c *SwitchstmtContext)

	// ExitCasestmt is called when exiting the casestmt production.
	ExitCasestmt(c *CasestmtContext)

	// ExitBlockcases is called when exiting the blockcases production.
	ExitBlockcases(c *BlockcasesContext)

	// ExitAssignationstmt is called when exiting the assignationstmt production.
	ExitAssignationstmt(c *AssignationstmtContext)

	// ExitAssignationstructstmt is called when exiting the assignationstructstmt production.
	ExitAssignationstructstmt(c *AssignationstructstmtContext)

	// ExitWhilestmt is called when exiting the whilestmt production.
	ExitWhilestmt(c *WhilestmtContext)

	// ExitForstmt is called when exiting the forstmt production.
	ExitForstmt(c *ForstmtContext)

	// ExitGuardstmt is called when exiting the guardstmt production.
	ExitGuardstmt(c *GuardstmtContext)

	// ExitTransferstmt is called when exiting the transferstmt production.
	ExitTransferstmt(c *TransferstmtContext)

	// ExitDeclarevectorstmt is called when exiting the declarevectorstmt production.
	ExitDeclarevectorstmt(c *DeclarevectorstmtContext)

	// ExitAccessfuncinstruction is called when exiting the accessfuncinstruction production.
	ExitAccessfuncinstruction(c *AccessfuncinstructionContext)

	// ExitAppendstmt is called when exiting the appendstmt production.
	ExitAppendstmt(c *AppendstmtContext)

	// ExitRemovelaststmt is called when exiting the removelaststmt production.
	ExitRemovelaststmt(c *RemovelaststmtContext)

	// ExitRemovestmt is called when exiting the removestmt production.
	ExitRemovestmt(c *RemovestmtContext)

	// ExitEmptvecstmt is called when exiting the emptvecstmt production.
	ExitEmptvecstmt(c *EmptvecstmtContext)

	// ExitCountvecstmt is called when exiting the countvecstmt production.
	ExitCountvecstmt(c *CountvecstmtContext)

	// ExitAccessvecstmt is called when exiting the accessvecstmt production.
	ExitAccessvecstmt(c *AccessvecstmtContext)

	// ExitAssignationvecstmt is called when exiting the assignationvecstmt production.
	ExitAssignationvecstmt(c *AssignationvecstmtContext)

	// ExitDeclarematrixstmt is called when exiting the declarematrixstmt production.
	ExitDeclarematrixstmt(c *DeclarematrixstmtContext)

	// ExitDeclarefuncstmt is called when exiting the declarefuncstmt production.
	ExitDeclarefuncstmt(c *DeclarefuncstmtContext)

	// ExitListParamsFunc is called when exiting the listParamsFunc production.
	ExitListParamsFunc(c *ListParamsFuncContext)

	// ExitParameterfuncstmt is called when exiting the parameterfuncstmt production.
	ExitParameterfuncstmt(c *ParameterfuncstmtContext)

	// ExitDeclarestructstmt is called when exiting the declarestructstmt production.
	ExitDeclarestructstmt(c *DeclarestructstmtContext)

	// ExitListStruct is called when exiting the listStruct production.
	ExitListStruct(c *ListStructContext)

	// ExitExpr is called when exiting the expr production.
	ExitExpr(c *ExprContext)

	// ExitAccessstructstmt is called when exiting the accessstructstmt production.
	ExitAccessstructstmt(c *AccessstructstmtContext)

	// ExitAccessfuncstmt is called when exiting the accessfuncstmt production.
	ExitAccessfuncstmt(c *AccessfuncstmtContext)

	// ExitIntfunctionstmt is called when exiting the intfunctionstmt production.
	ExitIntfunctionstmt(c *IntfunctionstmtContext)

	// ExitFloatfunctionstmt is called when exiting the floatfunctionstmt production.
	ExitFloatfunctionstmt(c *FloatfunctionstmtContext)

	// ExitStringfunctionstmt is called when exiting the stringfunctionstmt production.
	ExitStringfunctionstmt(c *StringfunctionstmtContext)

	// ExitAccessstmt is called when exiting the accessstmt production.
	ExitAccessstmt(c *AccessstmtContext)

	// ExitIncreaseanddecreasestmt is called when exiting the increaseanddecreasestmt production.
	ExitIncreaseanddecreasestmt(c *IncreaseanddecreasestmtContext)

	// ExitType is called when exiting the type production.
	ExitType(c *TypeContext)

	// ExitListParams is called when exiting the listParams production.
	ExitListParams(c *ListParamsContext)

	// ExitListStructExp is called when exiting the listStructExp production.
	ExitListStructExp(c *ListStructExpContext)
}
