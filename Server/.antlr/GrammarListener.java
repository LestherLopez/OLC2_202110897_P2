// Generated from c:/Users/50246/Desktop/Ingeniería-Sexto Semestre/Compiladores 2/Proyecto 2/Server/Grammar.g4 by ANTLR 4.13.1

    import "Server/Interfaces"
    import "Server/Environment"
    import "Server/Expression"
    import "Server/Instruction"
    import "strings"

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(GrammarParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(GrammarParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(GrammarParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(GrammarParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintstmt(GrammarParser.PrintstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintstmt(GrammarParser.PrintstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declarestmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclarestmt(GrammarParser.DeclarestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declarestmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclarestmt(GrammarParser.DeclarestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#constantstmt}.
	 * @param ctx the parse tree
	 */
	void enterConstantstmt(GrammarParser.ConstantstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#constantstmt}.
	 * @param ctx the parse tree
	 */
	void exitConstantstmt(GrammarParser.ConstantstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#blockelifs}.
	 * @param ctx the parse tree
	 */
	void enterBlockelifs(GrammarParser.BlockelifsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#blockelifs}.
	 * @param ctx the parse tree
	 */
	void exitBlockelifs(GrammarParser.BlockelifsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(GrammarParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(GrammarParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#switchstmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchstmt(GrammarParser.SwitchstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#switchstmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchstmt(GrammarParser.SwitchstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#casestmt}.
	 * @param ctx the parse tree
	 */
	void enterCasestmt(GrammarParser.CasestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#casestmt}.
	 * @param ctx the parse tree
	 */
	void exitCasestmt(GrammarParser.CasestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#blockcases}.
	 * @param ctx the parse tree
	 */
	void enterBlockcases(GrammarParser.BlockcasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#blockcases}.
	 * @param ctx the parse tree
	 */
	void exitBlockcases(GrammarParser.BlockcasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignationstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignationstmt(GrammarParser.AssignationstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignationstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignationstmt(GrammarParser.AssignationstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignationstructstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignationstructstmt(GrammarParser.AssignationstructstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignationstructstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignationstructstmt(GrammarParser.AssignationstructstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(GrammarParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(GrammarParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(GrammarParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(GrammarParser.ForstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#guardstmt}.
	 * @param ctx the parse tree
	 */
	void enterGuardstmt(GrammarParser.GuardstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#guardstmt}.
	 * @param ctx the parse tree
	 */
	void exitGuardstmt(GrammarParser.GuardstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#transferstmt}.
	 * @param ctx the parse tree
	 */
	void enterTransferstmt(GrammarParser.TransferstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#transferstmt}.
	 * @param ctx the parse tree
	 */
	void exitTransferstmt(GrammarParser.TransferstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declarevectorstmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclarevectorstmt(GrammarParser.DeclarevectorstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declarevectorstmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclarevectorstmt(GrammarParser.DeclarevectorstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#accessfuncinstruction}.
	 * @param ctx the parse tree
	 */
	void enterAccessfuncinstruction(GrammarParser.AccessfuncinstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#accessfuncinstruction}.
	 * @param ctx the parse tree
	 */
	void exitAccessfuncinstruction(GrammarParser.AccessfuncinstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#appendstmt}.
	 * @param ctx the parse tree
	 */
	void enterAppendstmt(GrammarParser.AppendstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#appendstmt}.
	 * @param ctx the parse tree
	 */
	void exitAppendstmt(GrammarParser.AppendstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#removelaststmt}.
	 * @param ctx the parse tree
	 */
	void enterRemovelaststmt(GrammarParser.RemovelaststmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#removelaststmt}.
	 * @param ctx the parse tree
	 */
	void exitRemovelaststmt(GrammarParser.RemovelaststmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#removestmt}.
	 * @param ctx the parse tree
	 */
	void enterRemovestmt(GrammarParser.RemovestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#removestmt}.
	 * @param ctx the parse tree
	 */
	void exitRemovestmt(GrammarParser.RemovestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#emptvecstmt}.
	 * @param ctx the parse tree
	 */
	void enterEmptvecstmt(GrammarParser.EmptvecstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#emptvecstmt}.
	 * @param ctx the parse tree
	 */
	void exitEmptvecstmt(GrammarParser.EmptvecstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#countvecstmt}.
	 * @param ctx the parse tree
	 */
	void enterCountvecstmt(GrammarParser.CountvecstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#countvecstmt}.
	 * @param ctx the parse tree
	 */
	void exitCountvecstmt(GrammarParser.CountvecstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#accessvecstmt}.
	 * @param ctx the parse tree
	 */
	void enterAccessvecstmt(GrammarParser.AccessvecstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#accessvecstmt}.
	 * @param ctx the parse tree
	 */
	void exitAccessvecstmt(GrammarParser.AccessvecstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignationvecstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignationvecstmt(GrammarParser.AssignationvecstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignationvecstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignationvecstmt(GrammarParser.AssignationvecstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declarematrixstmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclarematrixstmt(GrammarParser.DeclarematrixstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declarematrixstmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclarematrixstmt(GrammarParser.DeclarematrixstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declarefuncstmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclarefuncstmt(GrammarParser.DeclarefuncstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declarefuncstmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclarefuncstmt(GrammarParser.DeclarefuncstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#listParamsFunc}.
	 * @param ctx the parse tree
	 */
	void enterListParamsFunc(GrammarParser.ListParamsFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#listParamsFunc}.
	 * @param ctx the parse tree
	 */
	void exitListParamsFunc(GrammarParser.ListParamsFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parameterfuncstmt}.
	 * @param ctx the parse tree
	 */
	void enterParameterfuncstmt(GrammarParser.ParameterfuncstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parameterfuncstmt}.
	 * @param ctx the parse tree
	 */
	void exitParameterfuncstmt(GrammarParser.ParameterfuncstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declarestructstmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclarestructstmt(GrammarParser.DeclarestructstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declarestructstmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclarestructstmt(GrammarParser.DeclarestructstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#listStruct}.
	 * @param ctx the parse tree
	 */
	void enterListStruct(GrammarParser.ListStructContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#listStruct}.
	 * @param ctx the parse tree
	 */
	void exitListStruct(GrammarParser.ListStructContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#accessstructstmt}.
	 * @param ctx the parse tree
	 */
	void enterAccessstructstmt(GrammarParser.AccessstructstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#accessstructstmt}.
	 * @param ctx the parse tree
	 */
	void exitAccessstructstmt(GrammarParser.AccessstructstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#accessfuncstmt}.
	 * @param ctx the parse tree
	 */
	void enterAccessfuncstmt(GrammarParser.AccessfuncstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#accessfuncstmt}.
	 * @param ctx the parse tree
	 */
	void exitAccessfuncstmt(GrammarParser.AccessfuncstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#intfunctionstmt}.
	 * @param ctx the parse tree
	 */
	void enterIntfunctionstmt(GrammarParser.IntfunctionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#intfunctionstmt}.
	 * @param ctx the parse tree
	 */
	void exitIntfunctionstmt(GrammarParser.IntfunctionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#floatfunctionstmt}.
	 * @param ctx the parse tree
	 */
	void enterFloatfunctionstmt(GrammarParser.FloatfunctionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#floatfunctionstmt}.
	 * @param ctx the parse tree
	 */
	void exitFloatfunctionstmt(GrammarParser.FloatfunctionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stringfunctionstmt}.
	 * @param ctx the parse tree
	 */
	void enterStringfunctionstmt(GrammarParser.StringfunctionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stringfunctionstmt}.
	 * @param ctx the parse tree
	 */
	void exitStringfunctionstmt(GrammarParser.StringfunctionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#accessstmt}.
	 * @param ctx the parse tree
	 */
	void enterAccessstmt(GrammarParser.AccessstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#accessstmt}.
	 * @param ctx the parse tree
	 */
	void exitAccessstmt(GrammarParser.AccessstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#increaseanddecreasestmt}.
	 * @param ctx the parse tree
	 */
	void enterIncreaseanddecreasestmt(GrammarParser.IncreaseanddecreasestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#increaseanddecreasestmt}.
	 * @param ctx the parse tree
	 */
	void exitIncreaseanddecreasestmt(GrammarParser.IncreaseanddecreasestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#listParams}.
	 * @param ctx the parse tree
	 */
	void enterListParams(GrammarParser.ListParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#listParams}.
	 * @param ctx the parse tree
	 */
	void exitListParams(GrammarParser.ListParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#listStructExp}.
	 * @param ctx the parse tree
	 */
	void enterListStructExp(GrammarParser.ListStructExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#listStructExp}.
	 * @param ctx the parse tree
	 */
	void exitListStructExp(GrammarParser.ListStructExpContext ctx);
}