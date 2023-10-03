// Code generated from Grammar.g4 by ANTLR 4.13.0. DO NOT EDIT.

package parser // Grammar
import "github.com/antlr4-go/antlr/v4"

// BaseGrammarListener is a complete listener for a parse tree produced by GrammarParser.
type BaseGrammarListener struct{}

var _ GrammarListener = &BaseGrammarListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseGrammarListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseGrammarListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseGrammarListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseGrammarListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterS is called when production s is entered.
func (s *BaseGrammarListener) EnterS(ctx *SContext) {}

// ExitS is called when production s is exited.
func (s *BaseGrammarListener) ExitS(ctx *SContext) {}

// EnterBlock is called when production block is entered.
func (s *BaseGrammarListener) EnterBlock(ctx *BlockContext) {}

// ExitBlock is called when production block is exited.
func (s *BaseGrammarListener) ExitBlock(ctx *BlockContext) {}

// EnterInstruction is called when production instruction is entered.
func (s *BaseGrammarListener) EnterInstruction(ctx *InstructionContext) {}

// ExitInstruction is called when production instruction is exited.
func (s *BaseGrammarListener) ExitInstruction(ctx *InstructionContext) {}

// EnterPrintstmt is called when production printstmt is entered.
func (s *BaseGrammarListener) EnterPrintstmt(ctx *PrintstmtContext) {}

// ExitPrintstmt is called when production printstmt is exited.
func (s *BaseGrammarListener) ExitPrintstmt(ctx *PrintstmtContext) {}

// EnterDeclarestmt is called when production declarestmt is entered.
func (s *BaseGrammarListener) EnterDeclarestmt(ctx *DeclarestmtContext) {}

// ExitDeclarestmt is called when production declarestmt is exited.
func (s *BaseGrammarListener) ExitDeclarestmt(ctx *DeclarestmtContext) {}

// EnterConstantstmt is called when production constantstmt is entered.
func (s *BaseGrammarListener) EnterConstantstmt(ctx *ConstantstmtContext) {}

// ExitConstantstmt is called when production constantstmt is exited.
func (s *BaseGrammarListener) ExitConstantstmt(ctx *ConstantstmtContext) {}

// EnterBlockelifs is called when production blockelifs is entered.
func (s *BaseGrammarListener) EnterBlockelifs(ctx *BlockelifsContext) {}

// ExitBlockelifs is called when production blockelifs is exited.
func (s *BaseGrammarListener) ExitBlockelifs(ctx *BlockelifsContext) {}

// EnterIfstmt is called when production ifstmt is entered.
func (s *BaseGrammarListener) EnterIfstmt(ctx *IfstmtContext) {}

// ExitIfstmt is called when production ifstmt is exited.
func (s *BaseGrammarListener) ExitIfstmt(ctx *IfstmtContext) {}

// EnterSwitchstmt is called when production switchstmt is entered.
func (s *BaseGrammarListener) EnterSwitchstmt(ctx *SwitchstmtContext) {}

// ExitSwitchstmt is called when production switchstmt is exited.
func (s *BaseGrammarListener) ExitSwitchstmt(ctx *SwitchstmtContext) {}

// EnterCasestmt is called when production casestmt is entered.
func (s *BaseGrammarListener) EnterCasestmt(ctx *CasestmtContext) {}

// ExitCasestmt is called when production casestmt is exited.
func (s *BaseGrammarListener) ExitCasestmt(ctx *CasestmtContext) {}

// EnterBlockcases is called when production blockcases is entered.
func (s *BaseGrammarListener) EnterBlockcases(ctx *BlockcasesContext) {}

// ExitBlockcases is called when production blockcases is exited.
func (s *BaseGrammarListener) ExitBlockcases(ctx *BlockcasesContext) {}

// EnterAssignationstmt is called when production assignationstmt is entered.
func (s *BaseGrammarListener) EnterAssignationstmt(ctx *AssignationstmtContext) {}

// ExitAssignationstmt is called when production assignationstmt is exited.
func (s *BaseGrammarListener) ExitAssignationstmt(ctx *AssignationstmtContext) {}

// EnterAssignationstructstmt is called when production assignationstructstmt is entered.
func (s *BaseGrammarListener) EnterAssignationstructstmt(ctx *AssignationstructstmtContext) {}

// ExitAssignationstructstmt is called when production assignationstructstmt is exited.
func (s *BaseGrammarListener) ExitAssignationstructstmt(ctx *AssignationstructstmtContext) {}

// EnterWhilestmt is called when production whilestmt is entered.
func (s *BaseGrammarListener) EnterWhilestmt(ctx *WhilestmtContext) {}

// ExitWhilestmt is called when production whilestmt is exited.
func (s *BaseGrammarListener) ExitWhilestmt(ctx *WhilestmtContext) {}

// EnterForstmt is called when production forstmt is entered.
func (s *BaseGrammarListener) EnterForstmt(ctx *ForstmtContext) {}

// ExitForstmt is called when production forstmt is exited.
func (s *BaseGrammarListener) ExitForstmt(ctx *ForstmtContext) {}

// EnterGuardstmt is called when production guardstmt is entered.
func (s *BaseGrammarListener) EnterGuardstmt(ctx *GuardstmtContext) {}

// ExitGuardstmt is called when production guardstmt is exited.
func (s *BaseGrammarListener) ExitGuardstmt(ctx *GuardstmtContext) {}

// EnterTransferstmt is called when production transferstmt is entered.
func (s *BaseGrammarListener) EnterTransferstmt(ctx *TransferstmtContext) {}

// ExitTransferstmt is called when production transferstmt is exited.
func (s *BaseGrammarListener) ExitTransferstmt(ctx *TransferstmtContext) {}

// EnterDeclarevectorstmt is called when production declarevectorstmt is entered.
func (s *BaseGrammarListener) EnterDeclarevectorstmt(ctx *DeclarevectorstmtContext) {}

// ExitDeclarevectorstmt is called when production declarevectorstmt is exited.
func (s *BaseGrammarListener) ExitDeclarevectorstmt(ctx *DeclarevectorstmtContext) {}

// EnterAccessfuncinstruction is called when production accessfuncinstruction is entered.
func (s *BaseGrammarListener) EnterAccessfuncinstruction(ctx *AccessfuncinstructionContext) {}

// ExitAccessfuncinstruction is called when production accessfuncinstruction is exited.
func (s *BaseGrammarListener) ExitAccessfuncinstruction(ctx *AccessfuncinstructionContext) {}

// EnterAppendstmt is called when production appendstmt is entered.
func (s *BaseGrammarListener) EnterAppendstmt(ctx *AppendstmtContext) {}

// ExitAppendstmt is called when production appendstmt is exited.
func (s *BaseGrammarListener) ExitAppendstmt(ctx *AppendstmtContext) {}

// EnterRemovelaststmt is called when production removelaststmt is entered.
func (s *BaseGrammarListener) EnterRemovelaststmt(ctx *RemovelaststmtContext) {}

// ExitRemovelaststmt is called when production removelaststmt is exited.
func (s *BaseGrammarListener) ExitRemovelaststmt(ctx *RemovelaststmtContext) {}

// EnterRemovestmt is called when production removestmt is entered.
func (s *BaseGrammarListener) EnterRemovestmt(ctx *RemovestmtContext) {}

// ExitRemovestmt is called when production removestmt is exited.
func (s *BaseGrammarListener) ExitRemovestmt(ctx *RemovestmtContext) {}

// EnterEmptvecstmt is called when production emptvecstmt is entered.
func (s *BaseGrammarListener) EnterEmptvecstmt(ctx *EmptvecstmtContext) {}

// ExitEmptvecstmt is called when production emptvecstmt is exited.
func (s *BaseGrammarListener) ExitEmptvecstmt(ctx *EmptvecstmtContext) {}

// EnterCountvecstmt is called when production countvecstmt is entered.
func (s *BaseGrammarListener) EnterCountvecstmt(ctx *CountvecstmtContext) {}

// ExitCountvecstmt is called when production countvecstmt is exited.
func (s *BaseGrammarListener) ExitCountvecstmt(ctx *CountvecstmtContext) {}

// EnterAccessvecstmt is called when production accessvecstmt is entered.
func (s *BaseGrammarListener) EnterAccessvecstmt(ctx *AccessvecstmtContext) {}

// ExitAccessvecstmt is called when production accessvecstmt is exited.
func (s *BaseGrammarListener) ExitAccessvecstmt(ctx *AccessvecstmtContext) {}

// EnterAssignationvecstmt is called when production assignationvecstmt is entered.
func (s *BaseGrammarListener) EnterAssignationvecstmt(ctx *AssignationvecstmtContext) {}

// ExitAssignationvecstmt is called when production assignationvecstmt is exited.
func (s *BaseGrammarListener) ExitAssignationvecstmt(ctx *AssignationvecstmtContext) {}

// EnterDeclarematrixstmt is called when production declarematrixstmt is entered.
func (s *BaseGrammarListener) EnterDeclarematrixstmt(ctx *DeclarematrixstmtContext) {}

// ExitDeclarematrixstmt is called when production declarematrixstmt is exited.
func (s *BaseGrammarListener) ExitDeclarematrixstmt(ctx *DeclarematrixstmtContext) {}

// EnterDeclarefuncstmt is called when production declarefuncstmt is entered.
func (s *BaseGrammarListener) EnterDeclarefuncstmt(ctx *DeclarefuncstmtContext) {}

// ExitDeclarefuncstmt is called when production declarefuncstmt is exited.
func (s *BaseGrammarListener) ExitDeclarefuncstmt(ctx *DeclarefuncstmtContext) {}

// EnterListParamsFunc is called when production listParamsFunc is entered.
func (s *BaseGrammarListener) EnterListParamsFunc(ctx *ListParamsFuncContext) {}

// ExitListParamsFunc is called when production listParamsFunc is exited.
func (s *BaseGrammarListener) ExitListParamsFunc(ctx *ListParamsFuncContext) {}

// EnterParameterfuncstmt is called when production parameterfuncstmt is entered.
func (s *BaseGrammarListener) EnterParameterfuncstmt(ctx *ParameterfuncstmtContext) {}

// ExitParameterfuncstmt is called when production parameterfuncstmt is exited.
func (s *BaseGrammarListener) ExitParameterfuncstmt(ctx *ParameterfuncstmtContext) {}

// EnterDeclarestructstmt is called when production declarestructstmt is entered.
func (s *BaseGrammarListener) EnterDeclarestructstmt(ctx *DeclarestructstmtContext) {}

// ExitDeclarestructstmt is called when production declarestructstmt is exited.
func (s *BaseGrammarListener) ExitDeclarestructstmt(ctx *DeclarestructstmtContext) {}

// EnterListStruct is called when production listStruct is entered.
func (s *BaseGrammarListener) EnterListStruct(ctx *ListStructContext) {}

// ExitListStruct is called when production listStruct is exited.
func (s *BaseGrammarListener) ExitListStruct(ctx *ListStructContext) {}

// EnterExpr is called when production expr is entered.
func (s *BaseGrammarListener) EnterExpr(ctx *ExprContext) {}

// ExitExpr is called when production expr is exited.
func (s *BaseGrammarListener) ExitExpr(ctx *ExprContext) {}

// EnterAccessstructstmt is called when production accessstructstmt is entered.
func (s *BaseGrammarListener) EnterAccessstructstmt(ctx *AccessstructstmtContext) {}

// ExitAccessstructstmt is called when production accessstructstmt is exited.
func (s *BaseGrammarListener) ExitAccessstructstmt(ctx *AccessstructstmtContext) {}

// EnterAccessfuncstmt is called when production accessfuncstmt is entered.
func (s *BaseGrammarListener) EnterAccessfuncstmt(ctx *AccessfuncstmtContext) {}

// ExitAccessfuncstmt is called when production accessfuncstmt is exited.
func (s *BaseGrammarListener) ExitAccessfuncstmt(ctx *AccessfuncstmtContext) {}

// EnterIntfunctionstmt is called when production intfunctionstmt is entered.
func (s *BaseGrammarListener) EnterIntfunctionstmt(ctx *IntfunctionstmtContext) {}

// ExitIntfunctionstmt is called when production intfunctionstmt is exited.
func (s *BaseGrammarListener) ExitIntfunctionstmt(ctx *IntfunctionstmtContext) {}

// EnterFloatfunctionstmt is called when production floatfunctionstmt is entered.
func (s *BaseGrammarListener) EnterFloatfunctionstmt(ctx *FloatfunctionstmtContext) {}

// ExitFloatfunctionstmt is called when production floatfunctionstmt is exited.
func (s *BaseGrammarListener) ExitFloatfunctionstmt(ctx *FloatfunctionstmtContext) {}

// EnterStringfunctionstmt is called when production stringfunctionstmt is entered.
func (s *BaseGrammarListener) EnterStringfunctionstmt(ctx *StringfunctionstmtContext) {}

// ExitStringfunctionstmt is called when production stringfunctionstmt is exited.
func (s *BaseGrammarListener) ExitStringfunctionstmt(ctx *StringfunctionstmtContext) {}

// EnterAccessstmt is called when production accessstmt is entered.
func (s *BaseGrammarListener) EnterAccessstmt(ctx *AccessstmtContext) {}

// ExitAccessstmt is called when production accessstmt is exited.
func (s *BaseGrammarListener) ExitAccessstmt(ctx *AccessstmtContext) {}

// EnterIncreaseanddecreasestmt is called when production increaseanddecreasestmt is entered.
func (s *BaseGrammarListener) EnterIncreaseanddecreasestmt(ctx *IncreaseanddecreasestmtContext) {}

// ExitIncreaseanddecreasestmt is called when production increaseanddecreasestmt is exited.
func (s *BaseGrammarListener) ExitIncreaseanddecreasestmt(ctx *IncreaseanddecreasestmtContext) {}

// EnterType is called when production type is entered.
func (s *BaseGrammarListener) EnterType(ctx *TypeContext) {}

// ExitType is called when production type is exited.
func (s *BaseGrammarListener) ExitType(ctx *TypeContext) {}

// EnterListParams is called when production listParams is entered.
func (s *BaseGrammarListener) EnterListParams(ctx *ListParamsContext) {}

// ExitListParams is called when production listParams is exited.
func (s *BaseGrammarListener) ExitListParams(ctx *ListParamsContext) {}

// EnterListStructExp is called when production listStructExp is entered.
func (s *BaseGrammarListener) EnterListStructExp(ctx *ListStructExpContext) {}

// ExitListStructExp is called when production listStructExp is exited.
func (s *BaseGrammarListener) ExitListStructExp(ctx *ListStructExpContext) {}
