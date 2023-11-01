// Generated from c:/Users/50246/Desktop/Ingeniería-Sexto Semestre/Compiladores 2/Proyecto 2/Server/Grammar.g4 by ANTLR 4.13.1

    import "Server/Interfaces"
    import "Server/Environment"
    import "Server/Expression"
    import "Server/Instruction"
    import "strings"

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRINGS=1, INTS=2, FLOATS=3, BOOLS=4, CHARACTERS=5, VAR=6, NIL=7, TRUE=8, 
		FALSE=9, PRINT=10, IF=11, ELSE=12, WHILE=13, LET=14, FOR=15, IN=16, SWITCH=17, 
		CASE=18, DEFAULT=19, GUARD=20, CONTINUE=21, RETURN=22, BREAK=23, APPEND=24, 
		REMOVELAST=25, REMOVE=26, AT=27, ISEMPTY=28, COUNT=29, FUNC=30, INOUT=31, 
		STRUCT=32, NUMBER=33, STRING=34, ID=35, DIF=36, IG_IG=37, NOT=38, OR=39, 
		AND=40, IG=41, IG_ADD=42, IG_SUB=43, MAY_IG=44, MEN_IG=45, MAYOR=46, MENOR=47, 
		MUL=48, DIV=49, ADD=50, SUB=51, PERCENT=52, PARIZQ=53, PARDER=54, LLAVEIZQ=55, 
		LLAVEDER=56, DOUBLEPTS=57, QUESTION=58, POINT=59, COMA=60, PTCOMA=61, 
		CORCHETEIZQ=62, CORCHETEDER=63, GUION_BAJO=64, AND_SIMPLE=65, WHITESPACE=66, 
		COMMENT=67, LINE_COMMENT=68;
	public static final int
		RULE_s = 0, RULE_block = 1, RULE_instruction = 2, RULE_printstmt = 3, 
		RULE_declarestmt = 4, RULE_constantstmt = 5, RULE_blockelifs = 6, RULE_ifstmt = 7, 
		RULE_switchstmt = 8, RULE_casestmt = 9, RULE_blockcases = 10, RULE_assignationstmt = 11, 
		RULE_assignationstructstmt = 12, RULE_whilestmt = 13, RULE_forstmt = 14, 
		RULE_guardstmt = 15, RULE_transferstmt = 16, RULE_declarevectorstmt = 17, 
		RULE_accessfuncinstruction = 18, RULE_appendstmt = 19, RULE_removelaststmt = 20, 
		RULE_removestmt = 21, RULE_emptvecstmt = 22, RULE_countvecstmt = 23, RULE_listArray = 24, 
		RULE_listAccessArray = 25, RULE_declarematrixstmt = 26, RULE_declarefuncstmt = 27, 
		RULE_listParamsFunc = 28, RULE_parameterfuncstmt = 29, RULE_declarestructstmt = 30, 
		RULE_listStruct = 31, RULE_expr = 32, RULE_accessstructstmt = 33, RULE_accessfuncstmt = 34, 
		RULE_intfunctionstmt = 35, RULE_floatfunctionstmt = 36, RULE_stringfunctionstmt = 37, 
		RULE_accessstmt = 38, RULE_increaseanddecreasestmt = 39, RULE_type = 40, 
		RULE_listParams = 41, RULE_listStructExp = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "printstmt", "declarestmt", "constantstmt", 
			"blockelifs", "ifstmt", "switchstmt", "casestmt", "blockcases", "assignationstmt", 
			"assignationstructstmt", "whilestmt", "forstmt", "guardstmt", "transferstmt", 
			"declarevectorstmt", "accessfuncinstruction", "appendstmt", "removelaststmt", 
			"removestmt", "emptvecstmt", "countvecstmt", "listArray", "listAccessArray", 
			"declarematrixstmt", "declarefuncstmt", "listParamsFunc", "parameterfuncstmt", 
			"declarestructstmt", "listStruct", "expr", "accessstructstmt", "accessfuncstmt", 
			"intfunctionstmt", "floatfunctionstmt", "stringfunctionstmt", "accessstmt", 
			"increaseanddecreasestmt", "type", "listParams", "listStructExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'String'", "'Int'", "'Float'", "'Bool'", "'Character'", "'var'", 
			"'nil'", "'true'", "'false'", "'print'", "'if'", "'else'", "'while'", 
			"'let'", "'for'", "'in'", "'switch'", "'case'", "'default'", "'guard'", 
			"'continue'", "'return'", "'break'", "'append'", "'removeLast'", "'remove'", 
			"'at'", "'isEmpty'", "'count'", "'func'", "'inout'", "'struct'", null, 
			null, null, "'!='", "'=='", "'!'", "'||'", "'&&'", "'='", "'+='", "'-='", 
			"'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'('", 
			"')'", "'{'", "'}'", "':'", "'?'", "'.'", "','", "';'", "'['", "']'", 
			"'_'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRINGS", "INTS", "FLOATS", "BOOLS", "CHARACTERS", "VAR", "NIL", 
			"TRUE", "FALSE", "PRINT", "IF", "ELSE", "WHILE", "LET", "FOR", "IN", 
			"SWITCH", "CASE", "DEFAULT", "GUARD", "CONTINUE", "RETURN", "BREAK", 
			"APPEND", "REMOVELAST", "REMOVE", "AT", "ISEMPTY", "COUNT", "FUNC", "INOUT", 
			"STRUCT", "NUMBER", "STRING", "ID", "DIF", "IG_IG", "NOT", "OR", "AND", 
			"IG", "IG_ADD", "IG_SUB", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MUL", 
			"DIV", "ADD", "SUB", "PERCENT", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", 
			"DOUBLEPTS", "QUESTION", "POINT", "COMA", "PTCOMA", "CORCHETEIZQ", "CORCHETEDER", 
			"GUION_BAJO", "AND_SIMPLE", "WHITESPACE", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public []interface{} code;
		public BlockContext block;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			((SContext)_localctx).block = block();
			setState(87);
			match(EOF);
			_localctx.code = ((SContext)_localctx).block.blk
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public []interface{} blk;
		public InstructionContext instruction;
		public List<InstructionContext> ins = new ArrayList<InstructionContext>();
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);

		_localctx.blk = []interface{}{}
		    var listInt []IInstructionContext
		  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				((BlockContext)_localctx).instruction = instruction();
				((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 39744367680L) != 0) );

			        listInt = localctx.(*BlockContext).GetIns()
			        for _, e := range listInt {
			            _localctx.blk = append(_localctx.blk, e.GetInst())
			            
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public interfaces.Instruction inst;
		public PrintstmtContext printstmt;
		public DeclarestmtContext declarestmt;
		public ConstantstmtContext constantstmt;
		public AssignationstmtContext assignationstmt;
		public IncreaseanddecreasestmtContext increaseanddecreasestmt;
		public IfstmtContext ifstmt;
		public WhilestmtContext whilestmt;
		public ForstmtContext forstmt;
		public SwitchstmtContext switchstmt;
		public GuardstmtContext guardstmt;
		public TransferstmtContext transferstmt;
		public DeclarevectorstmtContext declarevectorstmt;
		public AppendstmtContext appendstmt;
		public RemovelaststmtContext removelaststmt;
		public RemovestmtContext removestmt;
		public DeclarefuncstmtContext declarefuncstmt;
		public AccessfuncinstructionContext accessfuncinstruction;
		public DeclarestructstmtContext declarestructstmt;
		public AssignationstructstmtContext assignationstructstmt;
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public DeclarestmtContext declarestmt() {
			return getRuleContext(DeclarestmtContext.class,0);
		}
		public ConstantstmtContext constantstmt() {
			return getRuleContext(ConstantstmtContext.class,0);
		}
		public AssignationstmtContext assignationstmt() {
			return getRuleContext(AssignationstmtContext.class,0);
		}
		public IncreaseanddecreasestmtContext increaseanddecreasestmt() {
			return getRuleContext(IncreaseanddecreasestmtContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public SwitchstmtContext switchstmt() {
			return getRuleContext(SwitchstmtContext.class,0);
		}
		public GuardstmtContext guardstmt() {
			return getRuleContext(GuardstmtContext.class,0);
		}
		public TransferstmtContext transferstmt() {
			return getRuleContext(TransferstmtContext.class,0);
		}
		public DeclarevectorstmtContext declarevectorstmt() {
			return getRuleContext(DeclarevectorstmtContext.class,0);
		}
		public AppendstmtContext appendstmt() {
			return getRuleContext(AppendstmtContext.class,0);
		}
		public RemovelaststmtContext removelaststmt() {
			return getRuleContext(RemovelaststmtContext.class,0);
		}
		public RemovestmtContext removestmt() {
			return getRuleContext(RemovestmtContext.class,0);
		}
		public DeclarefuncstmtContext declarefuncstmt() {
			return getRuleContext(DeclarefuncstmtContext.class,0);
		}
		public AccessfuncinstructionContext accessfuncinstruction() {
			return getRuleContext(AccessfuncinstructionContext.class,0);
		}
		public DeclarestructstmtContext declarestructstmt() {
			return getRuleContext(DeclarestructstmtContext.class,0);
		}
		public AssignationstructstmtContext assignationstructstmt() {
			return getRuleContext(AssignationstructstmtContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				((InstructionContext)_localctx).printstmt = printstmt();
				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				((InstructionContext)_localctx).declarestmt = declarestmt();
				_localctx.inst = ((InstructionContext)_localctx).declarestmt.dec
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				((InstructionContext)_localctx).constantstmt = constantstmt();
				_localctx.inst = ((InstructionContext)_localctx).constantstmt.const_
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				((InstructionContext)_localctx).assignationstmt = assignationstmt();
				_localctx.inst = ((InstructionContext)_localctx).assignationstmt.assign
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				((InstructionContext)_localctx).increaseanddecreasestmt = increaseanddecreasestmt();
				_localctx.inst = ((InstructionContext)_localctx).increaseanddecreasestmt.increasedecrease
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				((InstructionContext)_localctx).ifstmt = ifstmt();
				 _localctx.inst = ((InstructionContext)_localctx).ifstmt.ift 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				((InstructionContext)_localctx).whilestmt = whilestmt();
				_localctx.inst = ((InstructionContext)_localctx).whilestmt.while_
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				((InstructionContext)_localctx).forstmt = forstmt();
				_localctx.inst = ((InstructionContext)_localctx).forstmt.for_
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(121);
				((InstructionContext)_localctx).switchstmt = switchstmt();
				_localctx.inst = ((InstructionContext)_localctx).switchstmt.switch_
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(124);
				((InstructionContext)_localctx).guardstmt = guardstmt();
				_localctx.inst = ((InstructionContext)_localctx).guardstmt.gua
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(127);
				((InstructionContext)_localctx).transferstmt = transferstmt();
				_localctx.inst = ((InstructionContext)_localctx).transferstmt.tran
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(130);
				((InstructionContext)_localctx).declarevectorstmt = declarevectorstmt();
				_localctx.inst = ((InstructionContext)_localctx).declarevectorstmt.decvec
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(133);
				((InstructionContext)_localctx).appendstmt = appendstmt();
				_localctx.inst = ((InstructionContext)_localctx).appendstmt.app
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(136);
				((InstructionContext)_localctx).removelaststmt = removelaststmt();
				_localctx.inst = ((InstructionContext)_localctx).removelaststmt.removl
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(139);
				((InstructionContext)_localctx).removestmt = removestmt();
				_localctx.inst = ((InstructionContext)_localctx).removestmt.remov
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(142);
				((InstructionContext)_localctx).declarefuncstmt = declarefuncstmt();
				_localctx.inst = ((InstructionContext)_localctx).declarefuncstmt.decfunc
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(145);
				((InstructionContext)_localctx).accessfuncinstruction = accessfuncinstruction();
				_localctx.inst = ((InstructionContext)_localctx).accessfuncinstruction.accessfuncin
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(148);
				((InstructionContext)_localctx).declarestructstmt = declarestructstmt();
				_localctx.inst = ((InstructionContext)_localctx).declarestructstmt.decstruct 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(151);
				((InstructionContext)_localctx).assignationstructstmt = assignationstructstmt();
				_localctx.inst = ((InstructionContext)_localctx).assignationstructstmt.assignstruct
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintstmtContext extends ParserRuleContext {
		public interfaces.Instruction prnt;
		public Token PRINT;
		public ListParamsContext listParams;
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
		public TerminalNode PARIZQ() { return getToken(GrammarParser.PARIZQ, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(GrammarParser.PARDER, 0); }
		public TerminalNode PTCOMA() { return getToken(GrammarParser.PTCOMA, 0); }
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(157);
			match(PARIZQ);
			setState(158);
			((PrintstmtContext)_localctx).listParams = listParams(0);
			setState(159);
			match(PARDER);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTCOMA) {
				{
				setState(160);
				match(PTCOMA);
				}
			}

			 _localctx.prnt = instructions.NewPrint((((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getLine():0), (((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getCharPositionInLine():0), ((PrintstmtContext)_localctx).listParams.l)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarestmtContext extends ParserRuleContext {
		public interfaces.Instruction dec;
		public Token VAR;
		public Token ID;
		public TypeContext type;
		public ExprContext expr;
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode DOUBLEPTS() { return getToken(GrammarParser.DOUBLEPTS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IG() { return getToken(GrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTCOMA() { return getToken(GrammarParser.PTCOMA, 0); }
		public TerminalNode QUESTION() { return getToken(GrammarParser.QUESTION, 0); }
		public DeclarestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarestmt; }
	}

	public final DeclarestmtContext declarestmt() throws RecognitionException {
		DeclarestmtContext _localctx = new DeclarestmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarestmt);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				((DeclarestmtContext)_localctx).VAR = match(VAR);
				setState(166);
				((DeclarestmtContext)_localctx).ID = match(ID);
				setState(167);
				match(DOUBLEPTS);
				setState(168);
				((DeclarestmtContext)_localctx).type = type();
				setState(169);
				match(IG);
				setState(170);
				((DeclarestmtContext)_localctx).expr = expr(0);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(171);
					match(PTCOMA);
					}
				}

				_localctx.dec = instructions.NewTodeclare((((DeclarestmtContext)_localctx).VAR!=null?((DeclarestmtContext)_localctx).VAR.getLine():0), (((DeclarestmtContext)_localctx).VAR!=null?((DeclarestmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarestmtContext)_localctx).ID!=null?((DeclarestmtContext)_localctx).ID.getText():null), ((DeclarestmtContext)_localctx).type.t, ((DeclarestmtContext)_localctx).expr.e, false)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				((DeclarestmtContext)_localctx).VAR = match(VAR);
				setState(177);
				((DeclarestmtContext)_localctx).ID = match(ID);
				setState(178);
				match(IG);
				setState(179);
				((DeclarestmtContext)_localctx).expr = expr(0);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(180);
					match(PTCOMA);
					}
				}

				_localctx.dec = instructions.NewTodeclare((((DeclarestmtContext)_localctx).VAR!=null?((DeclarestmtContext)_localctx).VAR.getLine():0), (((DeclarestmtContext)_localctx).VAR!=null?((DeclarestmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarestmtContext)_localctx).ID!=null?((DeclarestmtContext)_localctx).ID.getText():null), environment.NULL, ((DeclarestmtContext)_localctx).expr.e, false)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				((DeclarestmtContext)_localctx).VAR = match(VAR);
				setState(186);
				((DeclarestmtContext)_localctx).ID = match(ID);
				setState(187);
				match(DOUBLEPTS);
				setState(188);
				((DeclarestmtContext)_localctx).type = type();
				setState(189);
				match(QUESTION);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(190);
					match(PTCOMA);
					}
				}

				_localctx.dec = instructions.NewTodeclare((((DeclarestmtContext)_localctx).VAR!=null?((DeclarestmtContext)_localctx).VAR.getLine():0), (((DeclarestmtContext)_localctx).VAR!=null?((DeclarestmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarestmtContext)_localctx).ID!=null?((DeclarestmtContext)_localctx).ID.getText():null), ((DeclarestmtContext)_localctx).type.t, nil, false)
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantstmtContext extends ParserRuleContext {
		public interfaces.Instruction const_;
		public Token LET;
		public Token ID;
		public TypeContext type;
		public ExprContext expr;
		public TerminalNode LET() { return getToken(GrammarParser.LET, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode DOUBLEPTS() { return getToken(GrammarParser.DOUBLEPTS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IG() { return getToken(GrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTCOMA() { return getToken(GrammarParser.PTCOMA, 0); }
		public ConstantstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantstmt; }
	}

	public final ConstantstmtContext constantstmt() throws RecognitionException {
		ConstantstmtContext _localctx = new ConstantstmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constantstmt);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				((ConstantstmtContext)_localctx).LET = match(LET);
				setState(198);
				((ConstantstmtContext)_localctx).ID = match(ID);
				setState(199);
				match(DOUBLEPTS);
				setState(200);
				((ConstantstmtContext)_localctx).type = type();
				setState(201);
				match(IG);
				setState(202);
				((ConstantstmtContext)_localctx).expr = expr(0);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(203);
					match(PTCOMA);
					}
				}

				_localctx.const_ = instructions.NewTodeclare((((ConstantstmtContext)_localctx).LET!=null?((ConstantstmtContext)_localctx).LET.getLine():0), (((ConstantstmtContext)_localctx).LET!=null?((ConstantstmtContext)_localctx).LET.getCharPositionInLine():0), (((ConstantstmtContext)_localctx).ID!=null?((ConstantstmtContext)_localctx).ID.getText():null), ((ConstantstmtContext)_localctx).type.t, ((ConstantstmtContext)_localctx).expr.e, true)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				((ConstantstmtContext)_localctx).LET = match(LET);
				setState(209);
				((ConstantstmtContext)_localctx).ID = match(ID);
				setState(210);
				match(IG);
				setState(211);
				((ConstantstmtContext)_localctx).expr = expr(0);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(212);
					match(PTCOMA);
					}
				}

				_localctx.const_ = instructions.NewTodeclare((((ConstantstmtContext)_localctx).LET!=null?((ConstantstmtContext)_localctx).LET.getLine():0), (((ConstantstmtContext)_localctx).LET!=null?((ConstantstmtContext)_localctx).LET.getCharPositionInLine():0), (((ConstantstmtContext)_localctx).ID!=null?((ConstantstmtContext)_localctx).ID.getText():null), environment.NULL, ((ConstantstmtContext)_localctx).expr.e, true)
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockelifsContext extends ParserRuleContext {
		public []interface{} blkef;
		public IfstmtContext ifstmt;
		public List<IfstmtContext> elif = new ArrayList<IfstmtContext>();
		public List<IfstmtContext> ifstmt() {
			return getRuleContexts(IfstmtContext.class);
		}
		public IfstmtContext ifstmt(int i) {
			return getRuleContext(IfstmtContext.class,i);
		}
		public BlockelifsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockelifs; }
	}

	public final BlockelifsContext blockelifs() throws RecognitionException {
		BlockelifsContext _localctx = new BlockelifsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blockelifs);

		_localctx.blkef = []interface{}{}
		    var listifs []IIfstmtContext
		    
		  
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(219);
					((BlockelifsContext)_localctx).ifstmt = ifstmt();
					((BlockelifsContext)_localctx).elif.add(((BlockelifsContext)_localctx).ifstmt);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(222); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			   
			        listifs = localctx.(*BlockelifsContext).GetElif()
			        for _, a := range listifs {
			            _localctx.blkef = append(_localctx.blkef, a.GetIft())
			            
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfstmtContext extends ParserRuleContext {
		public interfaces.Instruction ift;
		public []interface{} el;
		public interfaces.Instruction else_;
		public Token IF;
		public ExprContext expr;
		public BlockContext ifb;
		public BlockContext ifelseblck;
		public BlockContext elseifblck;
		public BlockContext elif;
		public BlockelifsContext blockelifs;
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> LLAVEIZQ() { return getTokens(GrammarParser.LLAVEIZQ); }
		public TerminalNode LLAVEIZQ(int i) {
			return getToken(GrammarParser.LLAVEIZQ, i);
		}
		public List<TerminalNode> LLAVEDER() { return getTokens(GrammarParser.LLAVEDER); }
		public TerminalNode LLAVEDER(int i) {
			return getToken(GrammarParser.LLAVEDER, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public BlockelifsContext blockelifs() {
			return getRuleContext(BlockelifsContext.class,0);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifstmt);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(227);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(228);
				match(LLAVEIZQ);
				setState(229);
				((IfstmtContext)_localctx).ifb = block();
				setState(230);
				match(LLAVEDER);
				 ((IfstmtContext)_localctx).ift =  instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).ifb.blk, nil); 
				                                        _localctx.el = ((IfstmtContext)_localctx).ifb.blk
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(234);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(235);
				match(LLAVEIZQ);
				setState(236);
				((IfstmtContext)_localctx).ifelseblck = block();
				setState(237);
				match(LLAVEDER);
				setState(238);
				match(ELSE);
				setState(239);
				match(LLAVEIZQ);
				setState(240);
				((IfstmtContext)_localctx).elseifblck = block();
				setState(241);
				match(LLAVEDER);
				 ((IfstmtContext)_localctx).ift =  instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).ifelseblck.blk, ((IfstmtContext)_localctx).elseifblck.blk); 
				                                                                                        ((IfstmtContext)_localctx).el =  ((IfstmtContext)_localctx).ifelseblck.blk;
				                                                                                        
				                                                                                        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(245);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(246);
				match(LLAVEIZQ);
				setState(247);
				((IfstmtContext)_localctx).elif = block();
				setState(248);
				match(LLAVEDER);
				setState(249);
				match(ELSE);
				setState(250);
				((IfstmtContext)_localctx).blockelifs = blockelifs();
				 ((IfstmtContext)_localctx).ift =  instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).elif.blk, ((IfstmtContext)_localctx).blockelifs.blkef); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchstmtContext extends ParserRuleContext {
		public interfaces.Instruction switch_;
		public Token SWITCH;
		public ExprContext expr;
		public BlockContext block;
		public CasestmtContext casestmt;
		public TerminalNode SWITCH() { return getToken(GrammarParser.SWITCH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(GrammarParser.LLAVEIZQ, 0); }
		public TerminalNode DEFAULT() { return getToken(GrammarParser.DEFAULT, 0); }
		public TerminalNode DOUBLEPTS() { return getToken(GrammarParser.DOUBLEPTS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(GrammarParser.LLAVEDER, 0); }
		public CasestmtContext casestmt() {
			return getRuleContext(CasestmtContext.class,0);
		}
		public SwitchstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchstmt; }
	}

	public final SwitchstmtContext switchstmt() throws RecognitionException {
		SwitchstmtContext _localctx = new SwitchstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_switchstmt);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				((SwitchstmtContext)_localctx).SWITCH = match(SWITCH);
				setState(256);
				((SwitchstmtContext)_localctx).expr = expr(0);
				setState(257);
				match(LLAVEIZQ);
				setState(258);
				match(DEFAULT);
				setState(259);
				match(DOUBLEPTS);
				setState(260);
				((SwitchstmtContext)_localctx).block = block();
				setState(261);
				match(LLAVEDER);
				 ((SwitchstmtContext)_localctx).switch_ =  instructions.NewSwitch((((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getLine():0), (((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getCharPositionInLine():0), ((SwitchstmtContext)_localctx).expr.e, nil,  nil, ((SwitchstmtContext)_localctx).block.blk);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				((SwitchstmtContext)_localctx).SWITCH = match(SWITCH);
				setState(265);
				((SwitchstmtContext)_localctx).expr = expr(0);
				setState(266);
				match(LLAVEIZQ);
				setState(267);
				((SwitchstmtContext)_localctx).casestmt = casestmt();
				setState(268);
				match(LLAVEDER);
				((SwitchstmtContext)_localctx).switch_ =  instructions.NewSwitch((((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getLine():0), (((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getCharPositionInLine():0), ((SwitchstmtContext)_localctx).expr.e, nil, ((SwitchstmtContext)_localctx).casestmt.cas, nil);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasestmtContext extends ParserRuleContext {
		public interfaces.Instruction cas;
		public Token CASE;
		public ExprContext expr;
		public BlockContext block;
		public BlockcasesContext blockcases;
		public BlockContext sen;
		public BlockContext def;
		public TerminalNode CASE() { return getToken(GrammarParser.CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> DOUBLEPTS() { return getTokens(GrammarParser.DOUBLEPTS); }
		public TerminalNode DOUBLEPTS(int i) {
			return getToken(GrammarParser.DOUBLEPTS, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public BlockcasesContext blockcases() {
			return getRuleContext(BlockcasesContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(GrammarParser.DEFAULT, 0); }
		public CasestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casestmt; }
	}

	public final CasestmtContext casestmt() throws RecognitionException {
		CasestmtContext _localctx = new CasestmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_casestmt);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				((CasestmtContext)_localctx).CASE = match(CASE);
				setState(274);
				((CasestmtContext)_localctx).expr = expr(0);
				setState(275);
				match(DOUBLEPTS);
				setState(276);
				((CasestmtContext)_localctx).block = block();
				setState(277);
				((CasestmtContext)_localctx).blockcases = blockcases();
				 _localctx.cas = instructions.NewCase((((CasestmtContext)_localctx).CASE!=null?((CasestmtContext)_localctx).CASE.getLine():0),(((CasestmtContext)_localctx).CASE!=null?((CasestmtContext)_localctx).CASE.getCharPositionInLine():0), ((CasestmtContext)_localctx).expr.e,((CasestmtContext)_localctx).block.blk, ((CasestmtContext)_localctx).blockcases.blkcase)
				                                
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				((CasestmtContext)_localctx).CASE = match(CASE);
				setState(281);
				((CasestmtContext)_localctx).expr = expr(0);
				setState(282);
				match(DOUBLEPTS);
				setState(283);
				((CasestmtContext)_localctx).sen = block();
				setState(284);
				match(DEFAULT);
				setState(285);
				match(DOUBLEPTS);
				setState(286);
				((CasestmtContext)_localctx).def = block();
				 _localctx.cas = instructions.NewCase((((CasestmtContext)_localctx).CASE!=null?((CasestmtContext)_localctx).CASE.getLine():0),(((CasestmtContext)_localctx).CASE!=null?((CasestmtContext)_localctx).CASE.getCharPositionInLine():0), ((CasestmtContext)_localctx).expr.e,((CasestmtContext)_localctx).sen.blk, ((CasestmtContext)_localctx).def.blk)
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockcasesContext extends ParserRuleContext {
		public []interface{} blkcase;
		public CasestmtContext casestmt;
		public List<CasestmtContext> casedef = new ArrayList<CasestmtContext>();
		public List<CasestmtContext> casestmt() {
			return getRuleContexts(CasestmtContext.class);
		}
		public CasestmtContext casestmt(int i) {
			return getRuleContext(CasestmtContext.class,i);
		}
		public BlockcasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockcases; }
	}

	public final BlockcasesContext blockcases() throws RecognitionException {
		BlockcasesContext _localctx = new BlockcasesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockcases);

		    _localctx.blkcase = []interface{}{}
		    var listcases []ICasestmtContext
		  
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(291);
					((BlockcasesContext)_localctx).casestmt = casestmt();
					((BlockcasesContext)_localctx).casedef.add(((BlockcasesContext)_localctx).casestmt);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(294); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

			        listcases = localctx.(*BlockcasesContext).GetCasedef()
			        for _, a := range listcases {
			            _localctx.blkcase = append(_localctx.blkcase, a.GetCas())
			      
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignationstmtContext extends ParserRuleContext {
		public interfaces.Instruction assign;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode IG() { return getToken(GrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTCOMA() { return getToken(GrammarParser.PTCOMA, 0); }
		public AssignationstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignationstmt; }
	}

	public final AssignationstmtContext assignationstmt() throws RecognitionException {
		AssignationstmtContext _localctx = new AssignationstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignationstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			((AssignationstmtContext)_localctx).ID = match(ID);
			setState(299);
			match(IG);
			setState(300);
			((AssignationstmtContext)_localctx).expr = expr(0);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTCOMA) {
				{
				setState(301);
				match(PTCOMA);
				}
			}

			_localctx.assign = instructions.NewAssignation((((AssignationstmtContext)_localctx).ID!=null?((AssignationstmtContext)_localctx).ID.getLine():0), (((AssignationstmtContext)_localctx).ID!=null?((AssignationstmtContext)_localctx).ID.getCharPositionInLine():0),  (((AssignationstmtContext)_localctx).ID!=null?((AssignationstmtContext)_localctx).ID.getText():null), ((AssignationstmtContext)_localctx).expr.e)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignationstructstmtContext extends ParserRuleContext {
		public interfaces.Instruction assignstruct;
		public Token ID;
		public Token second;
		public ExprContext expr;
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode POINT() { return getToken(GrammarParser.POINT, 0); }
		public TerminalNode IG() { return getToken(GrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTCOMA() { return getToken(GrammarParser.PTCOMA, 0); }
		public AssignationstructstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignationstructstmt; }
	}

	public final AssignationstructstmtContext assignationstructstmt() throws RecognitionException {
		AssignationstructstmtContext _localctx = new AssignationstructstmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignationstructstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			((AssignationstructstmtContext)_localctx).ID = match(ID);
			setState(307);
			match(POINT);
			setState(308);
			((AssignationstructstmtContext)_localctx).second = match(ID);
			setState(309);
			match(IG);
			setState(310);
			((AssignationstructstmtContext)_localctx).expr = expr(0);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTCOMA) {
				{
				setState(311);
				match(PTCOMA);
				}
			}

			_localctx.assignstruct = instructions.NewAssignationStruct((((AssignationstructstmtContext)_localctx).ID!=null?((AssignationstructstmtContext)_localctx).ID.getLine():0), (((AssignationstructstmtContext)_localctx).ID!=null?((AssignationstructstmtContext)_localctx).ID.getCharPositionInLine():0), (((AssignationstructstmtContext)_localctx).ID!=null?((AssignationstructstmtContext)_localctx).ID.getText():null), (((AssignationstructstmtContext)_localctx).second!=null?((AssignationstructstmtContext)_localctx).second.getText():null), ((AssignationstructstmtContext)_localctx).expr.e)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhilestmtContext extends ParserRuleContext {
		public interfaces.Instruction while_;
		public Token WHILE;
		public ExprContext expr;
		public BlockContext block;
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(GrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(GrammarParser.LLAVEDER, 0); }
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			((WhilestmtContext)_localctx).WHILE = match(WHILE);
			setState(317);
			((WhilestmtContext)_localctx).expr = expr(0);
			setState(318);
			match(LLAVEIZQ);
			setState(319);
			((WhilestmtContext)_localctx).block = block();
			setState(320);
			match(LLAVEDER);
			_localctx.while_ = instructions.NewWhile((((WhilestmtContext)_localctx).WHILE!=null?((WhilestmtContext)_localctx).WHILE.getLine():0), (((WhilestmtContext)_localctx).WHILE!=null?((WhilestmtContext)_localctx).WHILE.getCharPositionInLine():0),  ((WhilestmtContext)_localctx).expr.e, ((WhilestmtContext)_localctx).block.blk)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForstmtContext extends ParserRuleContext {
		public interfaces.Instruction for_;
		public Token FOR;
		public Token ID;
		public ExprContext expr;
		public BlockContext block;
		public ExprContext first;
		public ExprContext second;
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode IN() { return getToken(GrammarParser.IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LLAVEIZQ() { return getToken(GrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(GrammarParser.LLAVEDER, 0); }
		public List<TerminalNode> POINT() { return getTokens(GrammarParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(GrammarParser.POINT, i);
		}
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forstmt);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				((ForstmtContext)_localctx).FOR = match(FOR);
				setState(324);
				((ForstmtContext)_localctx).ID = match(ID);
				setState(325);
				match(IN);
				setState(326);
				((ForstmtContext)_localctx).expr = expr(0);
				setState(327);
				match(LLAVEIZQ);
				setState(328);
				((ForstmtContext)_localctx).block = block();
				setState(329);
				match(LLAVEDER);
				_localctx.for_ = instructions.NewFor((((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getLine():0), (((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getCharPositionInLine():0), (((ForstmtContext)_localctx).ID!=null?((ForstmtContext)_localctx).ID.getText():null), ((ForstmtContext)_localctx).expr.e, nil, ((ForstmtContext)_localctx).block.blk)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				((ForstmtContext)_localctx).FOR = match(FOR);
				setState(333);
				((ForstmtContext)_localctx).ID = match(ID);
				setState(334);
				match(IN);
				setState(335);
				((ForstmtContext)_localctx).first = expr(0);
				setState(336);
				match(POINT);
				setState(337);
				match(POINT);
				setState(338);
				((ForstmtContext)_localctx).second = expr(0);
				setState(339);
				match(LLAVEIZQ);
				setState(340);
				((ForstmtContext)_localctx).block = block();
				setState(341);
				match(LLAVEDER);
				_localctx.for_ = instructions.NewFor((((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getLine():0), (((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getCharPositionInLine():0), (((ForstmtContext)_localctx).ID!=null?((ForstmtContext)_localctx).ID.getText():null), ((ForstmtContext)_localctx).first.e, ((ForstmtContext)_localctx).second.e, ((ForstmtContext)_localctx).block.blk)
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GuardstmtContext extends ParserRuleContext {
		public interfaces.Instruction gua;
		public Token GUARD;
		public ExprContext expr;
		public BlockContext block;
		public TerminalNode GUARD() { return getToken(GrammarParser.GUARD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(GrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(GrammarParser.LLAVEDER, 0); }
		public GuardstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardstmt; }
	}

	public final GuardstmtContext guardstmt() throws RecognitionException {
		GuardstmtContext _localctx = new GuardstmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_guardstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			((GuardstmtContext)_localctx).GUARD = match(GUARD);
			setState(347);
			((GuardstmtContext)_localctx).expr = expr(0);
			setState(348);
			match(ELSE);
			setState(349);
			match(LLAVEIZQ);
			setState(350);
			((GuardstmtContext)_localctx).block = block();
			setState(351);
			match(LLAVEDER);
			_localctx.gua = instructions.NewGuard((((GuardstmtContext)_localctx).GUARD!=null?((GuardstmtContext)_localctx).GUARD.getLine():0), (((GuardstmtContext)_localctx).GUARD!=null?((GuardstmtContext)_localctx).GUARD.getCharPositionInLine():0), ((GuardstmtContext)_localctx).expr.e, ((GuardstmtContext)_localctx).block.blk)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransferstmtContext extends ParserRuleContext {
		public interfaces.Instruction tran;
		public Token RETURN;
		public ExprContext expr;
		public Token CONTINUE;
		public Token BREAK;
		public TerminalNode RETURN() { return getToken(GrammarParser.RETURN, 0); }
		public TerminalNode PTCOMA() { return getToken(GrammarParser.PTCOMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(GrammarParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(GrammarParser.BREAK, 0); }
		public TransferstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transferstmt; }
	}

	public final TransferstmtContext transferstmt() throws RecognitionException {
		TransferstmtContext _localctx = new TransferstmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_transferstmt);
		int _la;
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				((TransferstmtContext)_localctx).RETURN = match(RETURN);
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(355);
					match(PTCOMA);
					}
				}

				_localctx.tran = instructions.NewReturnIn((((TransferstmtContext)_localctx).RETURN!=null?((TransferstmtContext)_localctx).RETURN.getLine():0), (((TransferstmtContext)_localctx).RETURN!=null?((TransferstmtContext)_localctx).RETURN.getCharPositionInLine():0), nil)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				((TransferstmtContext)_localctx).RETURN = match(RETURN);
				setState(360);
				((TransferstmtContext)_localctx).expr = expr(0);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(361);
					match(PTCOMA);
					}
				}

				_localctx.tran = instructions.NewReturnIn((((TransferstmtContext)_localctx).RETURN!=null?((TransferstmtContext)_localctx).RETURN.getLine():0), (((TransferstmtContext)_localctx).RETURN!=null?((TransferstmtContext)_localctx).RETURN.getCharPositionInLine():0), ((TransferstmtContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				((TransferstmtContext)_localctx).CONTINUE = match(CONTINUE);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(367);
					match(PTCOMA);
					}
				}

				_localctx.tran = instructions.NewContinue((((TransferstmtContext)_localctx).CONTINUE!=null?((TransferstmtContext)_localctx).CONTINUE.getLine():0), (((TransferstmtContext)_localctx).CONTINUE!=null?((TransferstmtContext)_localctx).CONTINUE.getCharPositionInLine():0))
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				((TransferstmtContext)_localctx).BREAK = match(BREAK);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(372);
					match(PTCOMA);
					}
				}

				_localctx.tran = instructions.NewBreak((((TransferstmtContext)_localctx).BREAK!=null?((TransferstmtContext)_localctx).BREAK.getLine():0), (((TransferstmtContext)_localctx).BREAK!=null?((TransferstmtContext)_localctx).BREAK.getCharPositionInLine():0))
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarevectorstmtContext extends ParserRuleContext {
		public interfaces.Instruction decvec;
		public Token VAR;
		public Token ID;
		public TypeContext type;
		public ExprContext expr;
		public Token F;
		public Token S;
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode DOUBLEPTS() { return getToken(GrammarParser.DOUBLEPTS, 0); }
		public TerminalNode CORCHETEIZQ() { return getToken(GrammarParser.CORCHETEIZQ, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CORCHETEDER() { return getToken(GrammarParser.CORCHETEDER, 0); }
		public TerminalNode IG() { return getToken(GrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTCOMA() { return getToken(GrammarParser.PTCOMA, 0); }
		public TerminalNode PARIZQ() { return getToken(GrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(GrammarParser.PARDER, 0); }
		public DeclarevectorstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarevectorstmt; }
	}

	public final DeclarevectorstmtContext declarevectorstmt() throws RecognitionException {
		DeclarevectorstmtContext _localctx = new DeclarevectorstmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declarevectorstmt);
		int _la;
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				((DeclarevectorstmtContext)_localctx).VAR = match(VAR);
				setState(379);
				((DeclarevectorstmtContext)_localctx).ID = match(ID);
				setState(380);
				match(DOUBLEPTS);
				setState(381);
				match(CORCHETEIZQ);
				setState(382);
				((DeclarevectorstmtContext)_localctx).type = type();
				setState(383);
				match(CORCHETEDER);
				setState(384);
				match(IG);
				setState(385);
				((DeclarevectorstmtContext)_localctx).expr = expr(0);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(386);
					match(PTCOMA);
					}
				}

				_localctx.decvec = instructions.NewToDeclareVector((((DeclarevectorstmtContext)_localctx).VAR!=null?((DeclarevectorstmtContext)_localctx).VAR.getLine():0), (((DeclarevectorstmtContext)_localctx).VAR!=null?((DeclarevectorstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarevectorstmtContext)_localctx).ID!=null?((DeclarevectorstmtContext)_localctx).ID.getText():null), ((DeclarevectorstmtContext)_localctx).type.t, ((DeclarevectorstmtContext)_localctx).expr.e, "")
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				((DeclarevectorstmtContext)_localctx).VAR = match(VAR);
				setState(392);
				((DeclarevectorstmtContext)_localctx).ID = match(ID);
				setState(393);
				match(DOUBLEPTS);
				setState(394);
				match(CORCHETEIZQ);
				setState(395);
				((DeclarevectorstmtContext)_localctx).type = type();
				setState(396);
				match(CORCHETEDER);
				setState(397);
				match(IG);
				setState(398);
				expr(0);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(399);
					match(PTCOMA);
					}
				}

				_localctx.decvec = instructions.NewToDeclareVector((((DeclarevectorstmtContext)_localctx).VAR!=null?((DeclarevectorstmtContext)_localctx).VAR.getLine():0), (((DeclarevectorstmtContext)_localctx).VAR!=null?((DeclarevectorstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarevectorstmtContext)_localctx).ID!=null?((DeclarevectorstmtContext)_localctx).ID.getText():null), ((DeclarevectorstmtContext)_localctx).type.t, nil, "")
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				match(VAR);
				setState(405);
				match(ID);
				setState(406);
				match(IG);
				setState(407);
				match(CORCHETEIZQ);
				setState(408);
				type();
				setState(409);
				match(CORCHETEDER);
				setState(410);
				match(PARIZQ);
				setState(411);
				match(PARDER);
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(412);
					match(PTCOMA);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				((DeclarevectorstmtContext)_localctx).VAR = match(VAR);
				setState(416);
				((DeclarevectorstmtContext)_localctx).F = match(ID);
				setState(417);
				match(DOUBLEPTS);
				setState(418);
				match(CORCHETEIZQ);
				setState(419);
				((DeclarevectorstmtContext)_localctx).type = type();
				setState(420);
				match(CORCHETEDER);
				setState(421);
				match(IG);
				setState(422);
				((DeclarevectorstmtContext)_localctx).S = match(ID);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(423);
					match(PTCOMA);
					}
				}

				_localctx.decvec = instructions.NewToDeclareVector((((DeclarevectorstmtContext)_localctx).VAR!=null?((DeclarevectorstmtContext)_localctx).VAR.getLine():0), (((DeclarevectorstmtContext)_localctx).VAR!=null?((DeclarevectorstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarevectorstmtContext)_localctx).F!=null?((DeclarevectorstmtContext)_localctx).F.getText():null), ((DeclarevectorstmtContext)_localctx).type.t, nil, (((DeclarevectorstmtContext)_localctx).S!=null?((DeclarevectorstmtContext)_localctx).S.getText():null))
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessfuncinstructionContext extends ParserRuleContext {
		public interfaces.Instruction accessfuncin;
		public Token ID;
		public ListParamsContext listParams;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(GrammarParser.PARIZQ, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(GrammarParser.PARDER, 0); }
		public TerminalNode PTCOMA() { return getToken(GrammarParser.PTCOMA, 0); }
		public AccessfuncinstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessfuncinstruction; }
	}

	public final AccessfuncinstructionContext accessfuncinstruction() throws RecognitionException {
		AccessfuncinstructionContext _localctx = new AccessfuncinstructionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_accessfuncinstruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			((AccessfuncinstructionContext)_localctx).ID = match(ID);
			setState(431);
			match(PARIZQ);
			setState(432);
			((AccessfuncinstructionContext)_localctx).listParams = listParams(0);
			setState(433);
			match(PARDER);
			setState(434);
			match(PTCOMA);
			_localctx.accessfuncin = instructions.NewCallFunction((((AccessfuncinstructionContext)_localctx).ID!=null?((AccessfuncinstructionContext)_localctx).ID.getLine():0), (((AccessfuncinstructionContext)_localctx).ID!=null?((AccessfuncinstructionContext)_localctx).ID.getCharPositionInLine():0), (((AccessfuncinstructionContext)_localctx).ID!=null?((AccessfuncinstructionContext)_localctx).ID.getText():null), ((AccessfuncinstructionContext)_localctx).listParams.l, 1)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppendstmtContext extends ParserRuleContext {
		public interfaces.Instruction app;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode POINT() { return getToken(GrammarParser.POINT, 0); }
		public TerminalNode APPEND() { return getToken(GrammarParser.APPEND, 0); }
		public TerminalNode PARIZQ() { return getToken(GrammarParser.PARIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(GrammarParser.PARDER, 0); }
		public TerminalNode PTCOMA() { return getToken(GrammarParser.PTCOMA, 0); }
		public AppendstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendstmt; }
	}

	public final AppendstmtContext appendstmt() throws RecognitionException {
		AppendstmtContext _localctx = new AppendstmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_appendstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			((AppendstmtContext)_localctx).ID = match(ID);
			setState(438);
			match(POINT);
			setState(439);
			match(APPEND);
			setState(440);
			match(PARIZQ);
			setState(441);
			((AppendstmtContext)_localctx).expr = expr(0);
			setState(442);
			match(PARDER);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTCOMA) {
				{
				setState(443);
				match(PTCOMA);
				}
			}

			_localctx.app = instructions.NewAppend((((AppendstmtContext)_localctx).ID!=null?((AppendstmtContext)_localctx).ID.getLine():0), (((AppendstmtContext)_localctx).ID!=null?((AppendstmtContext)_localctx).ID.getCharPositionInLine():0), (((AppendstmtContext)_localctx).ID!=null?((AppendstmtContext)_localctx).ID.getText():null), ((AppendstmtContext)_localctx).expr.e)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RemovelaststmtContext extends ParserRuleContext {
		public interfaces.Instruction removl;
		public Token ID;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode POINT() { return getToken(GrammarParser.POINT, 0); }
		public TerminalNode REMOVELAST() { return getToken(GrammarParser.REMOVELAST, 0); }
		public TerminalNode PARIZQ() { return getToken(GrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(GrammarParser.PARDER, 0); }
		public TerminalNode PTCOMA() { return getToken(GrammarParser.PTCOMA, 0); }
		public RemovelaststmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removelaststmt; }
	}

	public final RemovelaststmtContext removelaststmt() throws RecognitionException {
		RemovelaststmtContext _localctx = new RemovelaststmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_removelaststmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			((RemovelaststmtContext)_localctx).ID = match(ID);
			setState(449);
			match(POINT);
			setState(450);
			match(REMOVELAST);
			setState(451);
			match(PARIZQ);
			setState(452);
			match(PARDER);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTCOMA) {
				{
				setState(453);
				match(PTCOMA);
				}
			}

			_localctx.removl = instructions.NewRemoveLast((((RemovelaststmtContext)_localctx).ID!=null?((RemovelaststmtContext)_localctx).ID.getLine():0), (((RemovelaststmtContext)_localctx).ID!=null?((RemovelaststmtContext)_localctx).ID.getCharPositionInLine():0), (((RemovelaststmtContext)_localctx).ID!=null?((RemovelaststmtContext)_localctx).ID.getText():null))
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RemovestmtContext extends ParserRuleContext {
		public interfaces.Instruction remov;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode POINT() { return getToken(GrammarParser.POINT, 0); }
		public TerminalNode REMOVE() { return getToken(GrammarParser.REMOVE, 0); }
		public TerminalNode PARIZQ() { return getToken(GrammarParser.PARIZQ, 0); }
		public TerminalNode AT() { return getToken(GrammarParser.AT, 0); }
		public TerminalNode DOUBLEPTS() { return getToken(GrammarParser.DOUBLEPTS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(GrammarParser.PARDER, 0); }
		public TerminalNode PTCOMA() { return getToken(GrammarParser.PTCOMA, 0); }
		public RemovestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removestmt; }
	}

	public final RemovestmtContext removestmt() throws RecognitionException {
		RemovestmtContext _localctx = new RemovestmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_removestmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			((RemovestmtContext)_localctx).ID = match(ID);
			setState(459);
			match(POINT);
			setState(460);
			match(REMOVE);
			setState(461);
			match(PARIZQ);
			setState(462);
			match(AT);
			setState(463);
			match(DOUBLEPTS);
			setState(464);
			((RemovestmtContext)_localctx).expr = expr(0);
			setState(465);
			match(PARDER);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTCOMA) {
				{
				setState(466);
				match(PTCOMA);
				}
			}

			_localctx.remov = instructions.NewRemove((((RemovestmtContext)_localctx).ID!=null?((RemovestmtContext)_localctx).ID.getLine():0), (((RemovestmtContext)_localctx).ID!=null?((RemovestmtContext)_localctx).ID.getCharPositionInLine():0), (((RemovestmtContext)_localctx).ID!=null?((RemovestmtContext)_localctx).ID.getText():null), ((RemovestmtContext)_localctx).expr.e)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptvecstmtContext extends ParserRuleContext {
		public interfaces.Expression emptyvec;
		public Token ID;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode POINT() { return getToken(GrammarParser.POINT, 0); }
		public TerminalNode ISEMPTY() { return getToken(GrammarParser.ISEMPTY, 0); }
		public EmptvecstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptvecstmt; }
	}

	public final EmptvecstmtContext emptvecstmt() throws RecognitionException {
		EmptvecstmtContext _localctx = new EmptvecstmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_emptvecstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			((EmptvecstmtContext)_localctx).ID = match(ID);
			setState(472);
			match(POINT);
			setState(473);
			match(ISEMPTY);
			_localctx.emptyvec = expressions.NewEmptyVector((((EmptvecstmtContext)_localctx).ID!=null?((EmptvecstmtContext)_localctx).ID.getLine():0), (((EmptvecstmtContext)_localctx).ID!=null?((EmptvecstmtContext)_localctx).ID.getCharPositionInLine():0), (((EmptvecstmtContext)_localctx).ID!=null?((EmptvecstmtContext)_localctx).ID.getText():null))
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CountvecstmtContext extends ParserRuleContext {
		public interfaces.Expression count;
		public Token ID;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode POINT() { return getToken(GrammarParser.POINT, 0); }
		public TerminalNode COUNT() { return getToken(GrammarParser.COUNT, 0); }
		public CountvecstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countvecstmt; }
	}

	public final CountvecstmtContext countvecstmt() throws RecognitionException {
		CountvecstmtContext _localctx = new CountvecstmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_countvecstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			((CountvecstmtContext)_localctx).ID = match(ID);
			setState(477);
			match(POINT);
			setState(478);
			match(COUNT);
			_localctx.count = expressions.NewCount((((CountvecstmtContext)_localctx).ID!=null?((CountvecstmtContext)_localctx).ID.getLine():0), (((CountvecstmtContext)_localctx).ID!=null?((CountvecstmtContext)_localctx).ID.getCharPositionInLine():0), (((CountvecstmtContext)_localctx).ID!=null?((CountvecstmtContext)_localctx).ID.getText():null))
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListArrayContext extends ParserRuleContext {
		public interfaces.Expression p;
		public ListArrayContext list;
		public Token ID;
		public ListAccessArrayContext arr;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public ListAccessArrayContext listAccessArray() {
			return getRuleContext(ListAccessArrayContext.class,0);
		}
		public ListArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listArray; }
	}

	public final ListArrayContext listArray() throws RecognitionException {
		return listArray(0);
	}

	private ListArrayContext listArray(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListArrayContext _localctx = new ListArrayContext(_ctx, _parentState);
		ListArrayContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(482);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expressions.NewAccessVector((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getCharPositionInLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(491);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListArrayContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listArray);
					setState(485);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(486);
					((ListArrayContext)_localctx).arr = listAccessArray(0);
					 _localctx.p = expressions.NewArrayAccess((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getCharPositionInLine():0), ((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).arr.l) 
					}
					} 
				}
				setState(493);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListAccessArrayContext extends ParserRuleContext {
		public []interface{} l;
		public ListAccessArrayContext list;
		public ExprContext expr;
		public TerminalNode CORCHETEIZQ() { return getToken(GrammarParser.CORCHETEIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CORCHETEDER() { return getToken(GrammarParser.CORCHETEDER, 0); }
		public ListAccessArrayContext listAccessArray() {
			return getRuleContext(ListAccessArrayContext.class,0);
		}
		public ListAccessArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAccessArray; }
	}

	public final ListAccessArrayContext listAccessArray() throws RecognitionException {
		return listAccessArray(0);
	}

	private ListAccessArrayContext listAccessArray(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListAccessArrayContext _localctx = new ListAccessArrayContext(_ctx, _parentState);
		ListAccessArrayContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_listAccessArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(495);
			match(CORCHETEIZQ);
			setState(496);
			((ListAccessArrayContext)_localctx).expr = expr(0);
			setState(497);
			match(CORCHETEDER);

			                            _localctx.l = []interface{}{}
			                            _localctx.l = append(_localctx.l, ((ListAccessArrayContext)_localctx).expr.e)
			                        
			}
			_ctx.stop = _input.LT(-1);
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListAccessArrayContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listAccessArray);
					setState(500);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(501);
					match(CORCHETEIZQ);
					setState(502);
					((ListAccessArrayContext)_localctx).expr = expr(0);
					setState(503);
					match(CORCHETEDER);

					                                                          var arr []interface{}
					                                                          arr = append(((ListAccessArrayContext)_localctx).list.l, ((ListAccessArrayContext)_localctx).expr.e)
					                                                          _localctx.l = arr
					                                                      
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarematrixstmtContext extends ParserRuleContext {
		public interfaces.Instruction decmatrix;
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(GrammarParser.PARIZQ, 0); }
		public TerminalNode DOUBLEPTS() { return getToken(GrammarParser.DOUBLEPTS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(GrammarParser.PARDER, 0); }
		public TerminalNode IG() { return getToken(GrammarParser.IG, 0); }
		public TerminalNode PTCOMA() { return getToken(GrammarParser.PTCOMA, 0); }
		public DeclarematrixstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarematrixstmt; }
	}

	public final DeclarematrixstmtContext declarematrixstmt() throws RecognitionException {
		DeclarematrixstmtContext _localctx = new DeclarematrixstmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declarematrixstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(VAR);
			setState(512);
			match(ID);
			setState(513);
			match(PARIZQ);
			setState(514);
			match(DOUBLEPTS);
			setState(515);
			type();
			setState(516);
			match(PARDER);
			setState(517);
			match(IG);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTCOMA) {
				{
				setState(518);
				match(PTCOMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarefuncstmtContext extends ParserRuleContext {
		public interfaces.Instruction decfunc;
		public Token ID;
		public ListParamsFuncContext listParamsFunc;
		public TypeContext type;
		public BlockContext block;
		public TerminalNode FUNC() { return getToken(GrammarParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(GrammarParser.PARIZQ, 0); }
		public ListParamsFuncContext listParamsFunc() {
			return getRuleContext(ListParamsFuncContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(GrammarParser.PARDER, 0); }
		public TerminalNode SUB() { return getToken(GrammarParser.SUB, 0); }
		public TerminalNode MAYOR() { return getToken(GrammarParser.MAYOR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(GrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(GrammarParser.LLAVEDER, 0); }
		public DeclarefuncstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarefuncstmt; }
	}

	public final DeclarefuncstmtContext declarefuncstmt() throws RecognitionException {
		DeclarefuncstmtContext _localctx = new DeclarefuncstmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declarefuncstmt);
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				match(FUNC);
				setState(522);
				((DeclarefuncstmtContext)_localctx).ID = match(ID);
				setState(523);
				match(PARIZQ);
				setState(524);
				((DeclarefuncstmtContext)_localctx).listParamsFunc = listParamsFunc(0);
				setState(525);
				match(PARDER);
				setState(526);
				match(SUB);
				setState(527);
				match(MAYOR);
				setState(528);
				((DeclarefuncstmtContext)_localctx).type = type();
				setState(529);
				match(LLAVEIZQ);
				setState(530);
				((DeclarefuncstmtContext)_localctx).block = block();
				setState(531);
				match(LLAVEDER);
				_localctx.decfunc = instructions.NewToDeclareFunction((((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getLine():0), (((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getCharPositionInLine():0), (((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getText():null), ((DeclarefuncstmtContext)_localctx).listParamsFunc.lf, ((DeclarefuncstmtContext)_localctx).type.t, ((DeclarefuncstmtContext)_localctx).block.blk, 1)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				match(FUNC);
				setState(535);
				((DeclarefuncstmtContext)_localctx).ID = match(ID);
				setState(536);
				match(PARIZQ);
				setState(537);
				((DeclarefuncstmtContext)_localctx).listParamsFunc = listParamsFunc(0);
				setState(538);
				match(PARDER);
				setState(539);
				match(LLAVEIZQ);
				setState(540);
				((DeclarefuncstmtContext)_localctx).block = block();
				setState(541);
				match(LLAVEDER);

				    
				    ((DeclarefuncstmtContext)_localctx).decfunc =  instructions.NewToDeclareFunction((((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getLine():0), (((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getCharPositionInLine():0), (((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getText():null), ((DeclarefuncstmtContext)_localctx).listParamsFunc.lf, environment.NULL, ((DeclarefuncstmtContext)_localctx).block.blk, 2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				match(FUNC);
				setState(545);
				((DeclarefuncstmtContext)_localctx).ID = match(ID);
				setState(546);
				match(PARIZQ);
				setState(547);
				match(PARDER);
				setState(548);
				match(SUB);
				setState(549);
				match(MAYOR);
				setState(550);
				((DeclarefuncstmtContext)_localctx).type = type();
				setState(551);
				match(LLAVEIZQ);
				setState(552);
				((DeclarefuncstmtContext)_localctx).block = block();
				setState(553);
				match(LLAVEDER);
				_localctx.decfunc = instructions.NewToDeclareFunction((((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getLine():0), (((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getCharPositionInLine():0), (((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getText():null), nil, ((DeclarefuncstmtContext)_localctx).type.t, ((DeclarefuncstmtContext)_localctx).block.blk, 3)
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(556);
				match(FUNC);
				setState(557);
				((DeclarefuncstmtContext)_localctx).ID = match(ID);
				setState(558);
				match(PARIZQ);
				setState(559);
				match(PARDER);
				setState(560);
				match(LLAVEIZQ);
				setState(561);
				((DeclarefuncstmtContext)_localctx).block = block();
				setState(562);
				match(LLAVEDER);

				    if(((DeclarefuncstmtContext)_localctx).block.blk!=nil){ 
				         _localctx.decfunc = instructions.NewToDeclareFunction((((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getLine():0), (((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getCharPositionInLine():0), (((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getText():null), nil, environment.NULL, ((DeclarefuncstmtContext)_localctx).block.blk, 4)
				    }

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListParamsFuncContext extends ParserRuleContext {
		public []interface{} lf;
		public ListParamsFuncContext listf;
		public ParameterfuncstmtContext parameterfuncstmt;
		public ParameterfuncstmtContext parameterfuncstmt() {
			return getRuleContext(ParameterfuncstmtContext.class,0);
		}
		public TerminalNode COMA() { return getToken(GrammarParser.COMA, 0); }
		public ListParamsFuncContext listParamsFunc() {
			return getRuleContext(ListParamsFuncContext.class,0);
		}
		public ListParamsFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParamsFunc; }
	}

	public final ListParamsFuncContext listParamsFunc() throws RecognitionException {
		return listParamsFunc(0);
	}

	private ListParamsFuncContext listParamsFunc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsFuncContext _localctx = new ListParamsFuncContext(_ctx, _parentState);
		ListParamsFuncContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_listParamsFunc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(568);
			((ListParamsFuncContext)_localctx).parameterfuncstmt = parameterfuncstmt();

			    
			            _localctx.lf = []interface{}{}
			            _localctx.lf = append(_localctx.lf, ((ListParamsFuncContext)_localctx).parameterfuncstmt.parameterfunc)
			        
			}
			_ctx.stop = _input.LT(-1);
			setState(578);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsFuncContext(_parentctx, _parentState);
					_localctx.listf = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParamsFunc);
					setState(571);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(572);
					match(COMA);
					setState(573);
					((ListParamsFuncContext)_localctx).parameterfuncstmt = parameterfuncstmt();

					                              
					                                          var arrf []interface{}
					                                          arrf = append(((ListParamsFuncContext)_localctx).listf.lf, ((ListParamsFuncContext)_localctx).parameterfuncstmt.parameterfunc)
					                                          _localctx.lf = arrf
					                                      
					}
					} 
				}
				setState(580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterfuncstmtContext extends ParserRuleContext {
		public interfaces.Expression parameterfunc;
		public Token exte;
		public Token ID;
		public TypeContext type;
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode DOUBLEPTS() { return getToken(GrammarParser.DOUBLEPTS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode GUION_BAJO() { return getToken(GrammarParser.GUION_BAJO, 0); }
		public TerminalNode INOUT() { return getToken(GrammarParser.INOUT, 0); }
		public TerminalNode CORCHETEIZQ() { return getToken(GrammarParser.CORCHETEIZQ, 0); }
		public TerminalNode CORCHETEDER() { return getToken(GrammarParser.CORCHETEDER, 0); }
		public ParameterfuncstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterfuncstmt; }
	}

	public final ParameterfuncstmtContext parameterfuncstmt() throws RecognitionException {
		ParameterfuncstmtContext _localctx = new ParameterfuncstmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parameterfuncstmt);
		int _la;
		try {
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				((ParameterfuncstmtContext)_localctx).exte = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==GUION_BAJO) ) {
					((ParameterfuncstmtContext)_localctx).exte = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(582);
				((ParameterfuncstmtContext)_localctx).ID = match(ID);
				setState(583);
				match(DOUBLEPTS);
				setState(584);
				((ParameterfuncstmtContext)_localctx).type = type();
				_localctx.parameterfunc = expressions.NewParameters((((ParameterfuncstmtContext)_localctx).exte!=null?((ParameterfuncstmtContext)_localctx).exte.getLine():0), (((ParameterfuncstmtContext)_localctx).exte!=null?((ParameterfuncstmtContext)_localctx).exte.getCharPositionInLine():0), ((ParameterfuncstmtContext)_localctx).type.t, (((ParameterfuncstmtContext)_localctx).exte!=null?((ParameterfuncstmtContext)_localctx).exte.getText():null),  (((ParameterfuncstmtContext)_localctx).ID!=null?((ParameterfuncstmtContext)_localctx).ID.getText():null), 1)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				((ParameterfuncstmtContext)_localctx).exte = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==GUION_BAJO) ) {
					((ParameterfuncstmtContext)_localctx).exte = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(588);
				((ParameterfuncstmtContext)_localctx).ID = match(ID);
				setState(589);
				match(DOUBLEPTS);
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(590);
					match(INOUT);
					}
				}

				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CORCHETEIZQ) {
					{
					setState(593);
					match(CORCHETEIZQ);
					}
				}

				setState(596);
				((ParameterfuncstmtContext)_localctx).type = type();
				setState(598);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(597);
					match(CORCHETEDER);
					}
					break;
				}
				((ParameterfuncstmtContext)_localctx).parameterfunc =  expressions.NewParameters((((ParameterfuncstmtContext)_localctx).exte!=null?((ParameterfuncstmtContext)_localctx).exte.getLine():0), (((ParameterfuncstmtContext)_localctx).exte!=null?((ParameterfuncstmtContext)_localctx).exte.getCharPositionInLine():0), ((ParameterfuncstmtContext)_localctx).type.t, (((ParameterfuncstmtContext)_localctx).exte!=null?((ParameterfuncstmtContext)_localctx).exte.getText():null),  (((ParameterfuncstmtContext)_localctx).ID!=null?((ParameterfuncstmtContext)_localctx).ID.getText():null),2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(602);
				((ParameterfuncstmtContext)_localctx).ID = match(ID);
				setState(603);
				match(DOUBLEPTS);
				setState(604);
				((ParameterfuncstmtContext)_localctx).type = type();
				_localctx.parameterfunc = expressions.NewParameters((((ParameterfuncstmtContext)_localctx).ID!=null?((ParameterfuncstmtContext)_localctx).ID.getLine():0), (((ParameterfuncstmtContext)_localctx).ID!=null?((ParameterfuncstmtContext)_localctx).ID.getCharPositionInLine():0), ((ParameterfuncstmtContext)_localctx).type.t, "_",  (((ParameterfuncstmtContext)_localctx).ID!=null?((ParameterfuncstmtContext)_localctx).ID.getText():null), 1)
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarestructstmtContext extends ParserRuleContext {
		public interfaces.Instruction decstruct;
		public Token STRUCT;
		public Token ID;
		public ListStructContext listStruct;
		public TerminalNode STRUCT() { return getToken(GrammarParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(GrammarParser.LLAVEIZQ, 0); }
		public ListStructContext listStruct() {
			return getRuleContext(ListStructContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(GrammarParser.LLAVEDER, 0); }
		public DeclarestructstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarestructstmt; }
	}

	public final DeclarestructstmtContext declarestructstmt() throws RecognitionException {
		DeclarestructstmtContext _localctx = new DeclarestructstmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_declarestructstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			((DeclarestructstmtContext)_localctx).STRUCT = match(STRUCT);
			setState(610);
			((DeclarestructstmtContext)_localctx).ID = match(ID);
			setState(611);
			match(LLAVEIZQ);
			setState(612);
			((DeclarestructstmtContext)_localctx).listStruct = listStruct(0);
			setState(613);
			match(LLAVEDER);
			 _localctx.decstruct = instructions.NewToDeclareStruct((((DeclarestructstmtContext)_localctx).STRUCT!=null?((DeclarestructstmtContext)_localctx).STRUCT.getLine():0), (((DeclarestructstmtContext)_localctx).STRUCT!=null?((DeclarestructstmtContext)_localctx).STRUCT.getCharPositionInLine():0), (((DeclarestructstmtContext)_localctx).ID!=null?((DeclarestructstmtContext)_localctx).ID.getText():null), ((DeclarestructstmtContext)_localctx).listStruct.l) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListStructContext extends ParserRuleContext {
		public []interface{} l;
		public ListStructContext list;
		public Token ID;
		public TypeContext type;
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode DOUBLEPTS() { return getToken(GrammarParser.DOUBLEPTS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListStructContext listStruct() {
			return getRuleContext(ListStructContext.class,0);
		}
		public ListStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStruct; }
	}

	public final ListStructContext listStruct() throws RecognitionException {
		return listStruct(0);
	}

	private ListStructContext listStruct(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListStructContext _localctx = new ListStructContext(_ctx, _parentState);
		ListStructContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_listStruct, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(617);
				match(VAR);
				setState(618);
				((ListStructContext)_localctx).ID = match(ID);
				setState(619);
				match(DOUBLEPTS);
				setState(620);
				((ListStructContext)_localctx).type = type();

				                        var arr []interface{}
				                        newParams := environment.NewStructType((((ListStructContext)_localctx).ID!=null?((ListStructContext)_localctx).ID.getText():null), ((ListStructContext)_localctx).type.t)
				                        arr = append(arr, newParams)
				                        _localctx.l = arr

				}
				break;
			case 2:
				{
				 _localctx.l = []interface{}{} 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListStructContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listStruct);
					setState(626);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(627);
					match(VAR);
					setState(628);
					((ListStructContext)_localctx).ID = match(ID);
					setState(629);
					match(DOUBLEPTS);
					setState(630);
					((ListStructContext)_localctx).type = type();

					                                      var arr []interface{}
					                                      newParams := environment.NewStructType((((ListStructContext)_localctx).ID!=null?((ListStructContext)_localctx).ID.getText():null), ((ListStructContext)_localctx).type.t)
					                                      arr = append(((ListStructContext)_localctx).list.l, newParams)
					                                      _localctx.l = arr

					          
					}
					} 
				}
				setState(637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public interfaces.Expression e;
		public ExprContext left;
		public Token op;
		public ExprContext expr;
		public Token NUMBER;
		public Token STRING;
		public Token TRUE;
		public Token FALSE;
		public Token NIL;
		public AccessstmtContext accessstmt;
		public EmptvecstmtContext emptvecstmt;
		public CountvecstmtContext countvecstmt;
		public IntfunctionstmtContext intfunctionstmt;
		public FloatfunctionstmtContext floatfunctionstmt;
		public StringfunctionstmtContext stringfunctionstmt;
		public AccessfuncstmtContext accessfuncstmt;
		public Token ID;
		public ListStructExpContext listStructExp;
		public AccessstructstmtContext accessstructstmt;
		public ListArrayContext list;
		public Token CORCHETEIZQ;
		public ListParamsContext listParams;
		public Token CORCHETEDER;
		public ExprContext right;
		public TerminalNode NOT() { return getToken(GrammarParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(GrammarParser.SUB, 0); }
		public TerminalNode PARIZQ() { return getToken(GrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(GrammarParser.PARDER, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(GrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GrammarParser.FALSE, 0); }
		public TerminalNode NIL() { return getToken(GrammarParser.NIL, 0); }
		public AccessstmtContext accessstmt() {
			return getRuleContext(AccessstmtContext.class,0);
		}
		public EmptvecstmtContext emptvecstmt() {
			return getRuleContext(EmptvecstmtContext.class,0);
		}
		public CountvecstmtContext countvecstmt() {
			return getRuleContext(CountvecstmtContext.class,0);
		}
		public IntfunctionstmtContext intfunctionstmt() {
			return getRuleContext(IntfunctionstmtContext.class,0);
		}
		public FloatfunctionstmtContext floatfunctionstmt() {
			return getRuleContext(FloatfunctionstmtContext.class,0);
		}
		public StringfunctionstmtContext stringfunctionstmt() {
			return getRuleContext(StringfunctionstmtContext.class,0);
		}
		public AccessfuncstmtContext accessfuncstmt() {
			return getRuleContext(AccessfuncstmtContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ListStructExpContext listStructExp() {
			return getRuleContext(ListStructExpContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(GrammarParser.LLAVEIZQ, 0); }
		public TerminalNode LLAVEDER() { return getToken(GrammarParser.LLAVEDER, 0); }
		public AccessstructstmtContext accessstructstmt() {
			return getRuleContext(AccessstructstmtContext.class,0);
		}
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public TerminalNode CORCHETEIZQ() { return getToken(GrammarParser.CORCHETEIZQ, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode CORCHETEDER() { return getToken(GrammarParser.CORCHETEDER, 0); }
		public TerminalNode MUL() { return getToken(GrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(GrammarParser.ADD, 0); }
		public TerminalNode PERCENT() { return getToken(GrammarParser.PERCENT, 0); }
		public TerminalNode MAY_IG() { return getToken(GrammarParser.MAY_IG, 0); }
		public TerminalNode MAYOR() { return getToken(GrammarParser.MAYOR, 0); }
		public TerminalNode MEN_IG() { return getToken(GrammarParser.MEN_IG, 0); }
		public TerminalNode MENOR() { return getToken(GrammarParser.MENOR, 0); }
		public TerminalNode IG_IG() { return getToken(GrammarParser.IG_IG, 0); }
		public TerminalNode DIF() { return getToken(GrammarParser.DIF, 0); }
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(639);
				((ExprContext)_localctx).op = match(NOT);
				setState(640);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(19);
				 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).left.e) 
				}
				break;
			case 2:
				{
				setState(643);
				((ExprContext)_localctx).op = match(SUB);
				setState(644);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(18);
				 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e,  (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), nil)
				}
				break;
			case 3:
				{
				setState(647);
				match(PARIZQ);
				setState(648);
				((ExprContext)_localctx).expr = expr(0);
				setState(649);
				match(PARDER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case 4:
				{
				setState(652);
				((ExprContext)_localctx).NUMBER = match(NUMBER);
				   
				        
				        if (strings.Contains((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null),".")){
				           
				            _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getLine():0),(((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getCharPositionInLine():0),(((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null),environment.FLOAT)
				        }else{
				            num,err := strconv.Atoi((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null))
				            if err!= nil{
				                fmt.Println(err)
				            }
				            _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getLine():0),(((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getCharPositionInLine():0),num,environment.INTEGER)
				        }
				    
				}
				break;
			case 5:
				{
				setState(654);
				((ExprContext)_localctx).STRING = match(STRING);

				        str := (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getLine():0), (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case 6:
				{
				setState(656);
				((ExprContext)_localctx).TRUE = match(TRUE);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).TRUE!=null?((ExprContext)_localctx).TRUE.getLine():0), (((ExprContext)_localctx).TRUE!=null?((ExprContext)_localctx).TRUE.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case 7:
				{
				setState(658);
				((ExprContext)_localctx).FALSE = match(FALSE);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).FALSE!=null?((ExprContext)_localctx).FALSE.getLine():0), (((ExprContext)_localctx).FALSE!=null?((ExprContext)_localctx).FALSE.getCharPositionInLine():0), false, environment.BOOLEAN) 
				}
				break;
			case 8:
				{
				setState(660);
				((ExprContext)_localctx).NIL = match(NIL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NIL!=null?((ExprContext)_localctx).NIL.getLine():0), (((ExprContext)_localctx).NIL!=null?((ExprContext)_localctx).NIL.getCharPositionInLine():0), nil, environment.NULL) 
				}
				break;
			case 9:
				{
				setState(662);
				((ExprContext)_localctx).accessstmt = accessstmt();
				_localctx.e = ((ExprContext)_localctx).accessstmt.access
				}
				break;
			case 10:
				{
				setState(665);
				((ExprContext)_localctx).emptvecstmt = emptvecstmt();
				_localctx.e = ((ExprContext)_localctx).emptvecstmt.emptyvec
				}
				break;
			case 11:
				{
				setState(668);
				((ExprContext)_localctx).countvecstmt = countvecstmt();
				_localctx.e = ((ExprContext)_localctx).countvecstmt.count
				}
				break;
			case 12:
				{
				setState(671);
				((ExprContext)_localctx).intfunctionstmt = intfunctionstmt();
				_localctx.e = ((ExprContext)_localctx).intfunctionstmt.intfunc
				}
				break;
			case 13:
				{
				setState(674);
				((ExprContext)_localctx).floatfunctionstmt = floatfunctionstmt();
				_localctx.e = ((ExprContext)_localctx).floatfunctionstmt.floatfunc
				}
				break;
			case 14:
				{
				setState(677);
				((ExprContext)_localctx).stringfunctionstmt = stringfunctionstmt();
				_localctx.e = ((ExprContext)_localctx).stringfunctionstmt.stringfunc
				}
				break;
			case 15:
				{
				setState(680);
				((ExprContext)_localctx).accessfuncstmt = accessfuncstmt();
				_localctx.e = ((ExprContext)_localctx).accessfuncstmt.funcexp
				}
				break;
			case 16:
				{
				setState(683);
				((ExprContext)_localctx).ID = match(ID);
				setState(684);
				_la = _input.LA(1);
				if ( !(_la==PARIZQ || _la==LLAVEIZQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(685);
				((ExprContext)_localctx).listStructExp = listStructExp(0);
				setState(686);
				_la = _input.LA(1);
				if ( !(_la==PARDER || _la==LLAVEDER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 _localctx.e = expressions.NewStructExp((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), ((ExprContext)_localctx).listStructExp.l ) 
				}
				break;
			case 17:
				{
				setState(689);
				((ExprContext)_localctx).accessstructstmt = accessstructstmt();
				_localctx.e = ((ExprContext)_localctx).accessstructstmt.accessstruct
				}
				break;
			case 18:
				{
				setState(692);
				((ExprContext)_localctx).list = listArray(0);
				 _localctx.e = ((ExprContext)_localctx).list.p
				}
				break;
			case 19:
				{
				setState(695);
				((ExprContext)_localctx).CORCHETEIZQ = match(CORCHETEIZQ);
				setState(696);
				((ExprContext)_localctx).listParams = listParams(0);
				setState(697);
				((ExprContext)_localctx).CORCHETEDER = match(CORCHETEDER);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).CORCHETEIZQ!=null?((ExprContext)_localctx).CORCHETEIZQ.getLine():0), (((ExprContext)_localctx).CORCHETEDER!=null?((ExprContext)_localctx).CORCHETEDER.getCharPositionInLine():0), ((ExprContext)_localctx).listParams.l) 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(739);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(737);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(702);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(703);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(704);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(27);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(707);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(708);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898368L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(709);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(26);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(712);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(713);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAY_IG || _la==MAYOR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(714);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(25);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(717);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(718);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MEN_IG || _la==MENOR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(719);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(24);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(722);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(723);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIF || _la==IG_IG) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(724);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(23);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(727);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(728);
						((ExprContext)_localctx).op = match(AND);
						setState(729);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(22);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(732);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(733);
						((ExprContext)_localctx).op = match(OR);
						setState(734);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(21);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessstructstmtContext extends ParserRuleContext {
		public interfaces.Expression accessstruct;
		public Token list;
		public Token ID;
		public Token sec;
		public List<TerminalNode> POINT() { return getTokens(GrammarParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(GrammarParser.POINT, i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public AccessstructstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessstructstmt; }
	}

	public final AccessstructstmtContext accessstructstmt() throws RecognitionException {
		AccessstructstmtContext _localctx = new AccessstructstmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_accessstructstmt);
		try {
			setState(752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				((AccessstructstmtContext)_localctx).list = match(ID);
				setState(743);
				match(POINT);
				setState(744);
				((AccessstructstmtContext)_localctx).ID = match(ID);
				 _localctx.accessstruct = expressions.NewAccessStruct((((AccessstructstmtContext)_localctx).list!=null?((AccessstructstmtContext)_localctx).list.getLine():0), (((AccessstructstmtContext)_localctx).list!=null?((AccessstructstmtContext)_localctx).list.getCharPositionInLine():0), (((AccessstructstmtContext)_localctx).list!=null?((AccessstructstmtContext)_localctx).list.getText():null), (((AccessstructstmtContext)_localctx).ID!=null?((AccessstructstmtContext)_localctx).ID.getText():null), "nil")  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				((AccessstructstmtContext)_localctx).list = match(ID);
				setState(747);
				match(POINT);
				setState(748);
				((AccessstructstmtContext)_localctx).ID = match(ID);
				setState(749);
				match(POINT);
				setState(750);
				((AccessstructstmtContext)_localctx).sec = match(ID);
				 _localctx.accessstruct = expressions.NewAccessStruct((((AccessstructstmtContext)_localctx).list!=null?((AccessstructstmtContext)_localctx).list.getLine():0), (((AccessstructstmtContext)_localctx).list!=null?((AccessstructstmtContext)_localctx).list.getCharPositionInLine():0), (((AccessstructstmtContext)_localctx).list!=null?((AccessstructstmtContext)_localctx).list.getText():null), (((AccessstructstmtContext)_localctx).ID!=null?((AccessstructstmtContext)_localctx).ID.getText():null), (((AccessstructstmtContext)_localctx).sec!=null?((AccessstructstmtContext)_localctx).sec.getText():null))  
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessfuncstmtContext extends ParserRuleContext {
		public interfaces.Expression funcexp;
		public Token ID;
		public ListParamsContext listParams;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(GrammarParser.PARIZQ, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(GrammarParser.PARDER, 0); }
		public AccessfuncstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessfuncstmt; }
	}

	public final AccessfuncstmtContext accessfuncstmt() throws RecognitionException {
		AccessfuncstmtContext _localctx = new AccessfuncstmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_accessfuncstmt);
		try {
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				((AccessfuncstmtContext)_localctx).ID = match(ID);
				setState(755);
				match(PARIZQ);
				setState(756);
				((AccessfuncstmtContext)_localctx).listParams = listParams(0);
				setState(757);
				match(PARDER);
				_localctx.funcexp = expressions.NewAccessFunction((((AccessfuncstmtContext)_localctx).ID!=null?((AccessfuncstmtContext)_localctx).ID.getLine():0), (((AccessfuncstmtContext)_localctx).ID!=null?((AccessfuncstmtContext)_localctx).ID.getCharPositionInLine():0), (((AccessfuncstmtContext)_localctx).ID!=null?((AccessfuncstmtContext)_localctx).ID.getText():null), ((AccessfuncstmtContext)_localctx).listParams.l, 1)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				match(ID);
				setState(761);
				match(PARIZQ);
				setState(762);
				match(PARDER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntfunctionstmtContext extends ParserRuleContext {
		public interfaces.Expression intfunc;
		public Token INTS;
		public ExprContext expr;
		public TerminalNode INTS() { return getToken(GrammarParser.INTS, 0); }
		public TerminalNode PARIZQ() { return getToken(GrammarParser.PARIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(GrammarParser.PARDER, 0); }
		public IntfunctionstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intfunctionstmt; }
	}

	public final IntfunctionstmtContext intfunctionstmt() throws RecognitionException {
		IntfunctionstmtContext _localctx = new IntfunctionstmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_intfunctionstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			((IntfunctionstmtContext)_localctx).INTS = match(INTS);
			setState(766);
			match(PARIZQ);
			setState(767);
			((IntfunctionstmtContext)_localctx).expr = expr(0);
			setState(768);
			match(PARDER);
			_localctx.intfunc = expressions.NewFunctionInt((((IntfunctionstmtContext)_localctx).INTS!=null?((IntfunctionstmtContext)_localctx).INTS.getLine():0), (((IntfunctionstmtContext)_localctx).INTS!=null?((IntfunctionstmtContext)_localctx).INTS.getCharPositionInLine():0), ((IntfunctionstmtContext)_localctx).expr.e)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FloatfunctionstmtContext extends ParserRuleContext {
		public interfaces.Expression floatfunc;
		public Token FLOATS;
		public ExprContext expr;
		public TerminalNode FLOATS() { return getToken(GrammarParser.FLOATS, 0); }
		public TerminalNode PARIZQ() { return getToken(GrammarParser.PARIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(GrammarParser.PARDER, 0); }
		public FloatfunctionstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatfunctionstmt; }
	}

	public final FloatfunctionstmtContext floatfunctionstmt() throws RecognitionException {
		FloatfunctionstmtContext _localctx = new FloatfunctionstmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_floatfunctionstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			((FloatfunctionstmtContext)_localctx).FLOATS = match(FLOATS);
			setState(772);
			match(PARIZQ);
			setState(773);
			((FloatfunctionstmtContext)_localctx).expr = expr(0);
			setState(774);
			match(PARDER);
			_localctx.floatfunc = expressions.NewFunctionFloat((((FloatfunctionstmtContext)_localctx).FLOATS!=null?((FloatfunctionstmtContext)_localctx).FLOATS.getLine():0), (((FloatfunctionstmtContext)_localctx).FLOATS!=null?((FloatfunctionstmtContext)_localctx).FLOATS.getCharPositionInLine():0), ((FloatfunctionstmtContext)_localctx).expr.e)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringfunctionstmtContext extends ParserRuleContext {
		public interfaces.Expression stringfunc;
		public Token STRINGS;
		public ExprContext expr;
		public TerminalNode STRINGS() { return getToken(GrammarParser.STRINGS, 0); }
		public TerminalNode PARIZQ() { return getToken(GrammarParser.PARIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(GrammarParser.PARDER, 0); }
		public StringfunctionstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringfunctionstmt; }
	}

	public final StringfunctionstmtContext stringfunctionstmt() throws RecognitionException {
		StringfunctionstmtContext _localctx = new StringfunctionstmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_stringfunctionstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			((StringfunctionstmtContext)_localctx).STRINGS = match(STRINGS);
			setState(778);
			match(PARIZQ);
			setState(779);
			((StringfunctionstmtContext)_localctx).expr = expr(0);
			setState(780);
			match(PARDER);
			_localctx.stringfunc = expressions.NewFunctionString((((StringfunctionstmtContext)_localctx).STRINGS!=null?((StringfunctionstmtContext)_localctx).STRINGS.getLine():0), (((StringfunctionstmtContext)_localctx).STRINGS!=null?((StringfunctionstmtContext)_localctx).STRINGS.getCharPositionInLine():0), ((StringfunctionstmtContext)_localctx).expr.e)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessstmtContext extends ParserRuleContext {
		public interfaces.Expression access;
		public Token op;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public AccessstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessstmt; }
	}

	public final AccessstmtContext accessstmt() throws RecognitionException {
		AccessstmtContext _localctx = new AccessstmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_accessstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			((AccessstmtContext)_localctx).op = match(ID);
			_localctx.access = expressions.NewAccess((((AccessstmtContext)_localctx).op!=null?((AccessstmtContext)_localctx).op.getLine():0), (((AccessstmtContext)_localctx).op!=null?((AccessstmtContext)_localctx).op.getCharPositionInLine():0), (((AccessstmtContext)_localctx).op!=null?((AccessstmtContext)_localctx).op.getText():null))
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncreaseanddecreasestmtContext extends ParserRuleContext {
		public interfaces.Instruction increasedecrease;
		public Token ID;
		public Token IG_ADD;
		public ExprContext expr;
		public Token IG_SUB;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode IG_ADD() { return getToken(GrammarParser.IG_ADD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTCOMA() { return getToken(GrammarParser.PTCOMA, 0); }
		public TerminalNode IG_SUB() { return getToken(GrammarParser.IG_SUB, 0); }
		public IncreaseanddecreasestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increaseanddecreasestmt; }
	}

	public final IncreaseanddecreasestmtContext increaseanddecreasestmt() throws RecognitionException {
		IncreaseanddecreasestmtContext _localctx = new IncreaseanddecreasestmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_increaseanddecreasestmt);
		int _la;
		try {
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				((IncreaseanddecreasestmtContext)_localctx).ID = match(ID);
				setState(787);
				((IncreaseanddecreasestmtContext)_localctx).IG_ADD = match(IG_ADD);
				setState(788);
				((IncreaseanddecreasestmtContext)_localctx).expr = expr(0);
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(789);
					match(PTCOMA);
					}
				}

				_localctx.increasedecrease = instructions.NewIncreaseDecrease((((IncreaseanddecreasestmtContext)_localctx).ID!=null?((IncreaseanddecreasestmtContext)_localctx).ID.getLine():0), (((IncreaseanddecreasestmtContext)_localctx).ID!=null?((IncreaseanddecreasestmtContext)_localctx).ID.getCharPositionInLine():0), (((IncreaseanddecreasestmtContext)_localctx).ID!=null?((IncreaseanddecreasestmtContext)_localctx).ID.getText():null), (((IncreaseanddecreasestmtContext)_localctx).IG_ADD!=null?((IncreaseanddecreasestmtContext)_localctx).IG_ADD.getText():null), ((IncreaseanddecreasestmtContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				((IncreaseanddecreasestmtContext)_localctx).ID = match(ID);
				setState(795);
				((IncreaseanddecreasestmtContext)_localctx).IG_SUB = match(IG_SUB);
				setState(796);
				((IncreaseanddecreasestmtContext)_localctx).expr = expr(0);
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(797);
					match(PTCOMA);
					}
				}

				_localctx.increasedecrease = instructions.NewIncreaseDecrease((((IncreaseanddecreasestmtContext)_localctx).ID!=null?((IncreaseanddecreasestmtContext)_localctx).ID.getLine():0), (((IncreaseanddecreasestmtContext)_localctx).ID!=null?((IncreaseanddecreasestmtContext)_localctx).ID.getCharPositionInLine():0), (((IncreaseanddecreasestmtContext)_localctx).ID!=null?((IncreaseanddecreasestmtContext)_localctx).ID.getText():null), (((IncreaseanddecreasestmtContext)_localctx).IG_SUB!=null?((IncreaseanddecreasestmtContext)_localctx).IG_SUB.getText():null), ((IncreaseanddecreasestmtContext)_localctx).expr.e)
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public environment.TipoExpresion t;
		public TerminalNode STRINGS() { return getToken(GrammarParser.STRINGS, 0); }
		public TerminalNode INTS() { return getToken(GrammarParser.INTS, 0); }
		public TerminalNode FLOATS() { return getToken(GrammarParser.FLOATS, 0); }
		public TerminalNode BOOLS() { return getToken(GrammarParser.BOOLS, 0); }
		public TerminalNode CHARACTERS() { return getToken(GrammarParser.CHARACTERS, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_type);
		try {
			setState(816);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGS:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(STRINGS);
				_localctx.t = environment.STRING
				}
				break;
			case INTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				match(INTS);
				_localctx.t = environment.INTEGER
				}
				break;
			case FLOATS:
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				match(FLOATS);
				_localctx.t = environment.FLOAT
				}
				break;
			case BOOLS:
				enterOuterAlt(_localctx, 4);
				{
				setState(810);
				match(BOOLS);
				_localctx.t = environment.BOOLEAN 
				}
				break;
			case CHARACTERS:
				enterOuterAlt(_localctx, 5);
				{
				setState(812);
				match(CHARACTERS);
				_localctx.t = environment.CHARACTER
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(814);
				match(ID);
				 _localctx.t = environment.STRUCT  
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListParamsContext extends ParserRuleContext {
		public []interface{} l;
		public ListParamsContext list;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AND_SIMPLE() { return getToken(GrammarParser.AND_SIMPLE, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode DOUBLEPTS() { return getToken(GrammarParser.DOUBLEPTS, 0); }
		public TerminalNode COMA() { return getToken(GrammarParser.COMA, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public ListParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParams; }
	}

	public final ListParamsContext listParams() throws RecognitionException {
		return listParams(0);
	}

	private ListParamsContext listParams(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsContext _localctx = new ListParamsContext(_ctx, _parentState);
		ListParamsContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_listParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(819);
				match(AND_SIMPLE);
				}
				break;
			case 2:
				{
				setState(820);
				match(ID);
				setState(821);
				match(DOUBLEPTS);
				}
				break;
			}
			setState(824);
			((ListParamsContext)_localctx).expr = expr(0);

			            _localctx.l = []interface{}{}
			            _localctx.l = append(_localctx.l, ((ListParamsContext)_localctx).expr.e)
			        
			}
			_ctx.stop = _input.LT(-1);
			setState(839);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParams);
					setState(827);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(828);
					match(COMA);
					setState(832);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(829);
						match(AND_SIMPLE);
						}
						break;
					case 2:
						{
						setState(830);
						match(ID);
						setState(831);
						match(DOUBLEPTS);
						}
						break;
					}
					setState(834);
					((ListParamsContext)_localctx).expr = expr(0);

					                                          var arr []interface{}
					                                          arr = append(((ListParamsContext)_localctx).list.l, ((ListParamsContext)_localctx).expr.e)
					                                          _localctx.l = arr
					                                      
					}
					} 
				}
				setState(841);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListStructExpContext extends ParserRuleContext {
		public []interface{} l;
		public ListStructExpContext list;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode DOUBLEPTS() { return getToken(GrammarParser.DOUBLEPTS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListStructExpContext listStructExp() {
			return getRuleContext(ListStructExpContext.class,0);
		}
		public TerminalNode COMA() { return getToken(GrammarParser.COMA, 0); }
		public ListStructExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStructExp; }
	}

	public final ListStructExpContext listStructExp() throws RecognitionException {
		return listStructExp(0);
	}

	private ListStructExpContext listStructExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListStructExpContext _localctx = new ListStructExpContext(_ctx, _parentState);
		ListStructExpContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_listStructExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(843);
				((ListStructExpContext)_localctx).ID = match(ID);
				setState(844);
				match(DOUBLEPTS);
				setState(845);
				((ListStructExpContext)_localctx).expr = expr(0);

				                    var arr []interface{}
				                    StrExp := environment.NewStructContent((((ListStructExpContext)_localctx).ID!=null?((ListStructExpContext)_localctx).ID.getText():null), ((ListStructExpContext)_localctx).expr.e)
				                    arr = append(arr, StrExp)
				                    _localctx.l = arr
				                
				}
				break;
			case 2:
				{

				        _localctx.l = []interface{}{}
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(862);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListStructExpContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listStructExp);
					setState(851);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(853);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMA) {
						{
						setState(852);
						match(COMA);
						}
					}

					setState(855);
					((ListStructExpContext)_localctx).ID = match(ID);
					setState(856);
					match(DOUBLEPTS);
					setState(857);
					((ListStructExpContext)_localctx).expr = expr(0);

					                                                      var arr []interface{}
					                                                      StrExp := environment.NewStructContent((((ListStructExpContext)_localctx).ID!=null?((ListStructExpContext)_localctx).ID.getText():null), ((ListStructExpContext)_localctx).expr.e)
					                                                      arr = append(((ListStructExpContext)_localctx).list.l, StrExp)
					                                                      _localctx.l = arr
					                                                  
					}
					} 
				}
				setState(864);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return listArray_sempred((ListArrayContext)_localctx, predIndex);
		case 25:
			return listAccessArray_sempred((ListAccessArrayContext)_localctx, predIndex);
		case 28:
			return listParamsFunc_sempred((ListParamsFuncContext)_localctx, predIndex);
		case 31:
			return listStruct_sempred((ListStructContext)_localctx, predIndex);
		case 32:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 41:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 42:
			return listStructExp_sempred((ListStructExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listArray_sempred(ListArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listAccessArray_sempred(ListAccessArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listParamsFunc_sempred(ListParamsFuncContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listStruct_sempred(ListStructContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 26);
		case 5:
			return precpred(_ctx, 25);
		case 6:
			return precpred(_ctx, 24);
		case 7:
			return precpred(_ctx, 23);
		case 8:
			return precpred(_ctx, 22);
		case 9:
			return precpred(_ctx, 21);
		case 10:
			return precpred(_ctx, 20);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listStructExp_sempred(ListStructExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001D\u0362\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0004\u0001\\\b\u0001\u000b\u0001\f\u0001]\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u009b"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00a2\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ad"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00b6\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00c0\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00c4\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00cd\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d6\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00da\b\u0005\u0001\u0006\u0004\u0006"+
		"\u00dd\b\u0006\u000b\u0006\f\u0006\u00de\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00fe\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0110\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0122\b\t\u0001\n\u0004"+
		"\n\u0125\b\n\u000b\n\f\n\u0126\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u012f\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0139\b\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0159\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u0165\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u016b\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0171\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0176\b\u0010\u0001\u0010\u0003\u0010\u0179"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0184\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0191"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u019e\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01a9"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01ad\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u01bd\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u01c7\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u01d4\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01ea\b\u0018"+
		"\n\u0018\f\u0018\u01ed\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01fb\b\u0019\n\u0019\f\u0019"+
		"\u01fe\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0208\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0236\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u0241\b\u001c\n\u001c\f\u001c\u0244\t\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0250\b\u001d\u0001\u001d\u0003"+
		"\u001d\u0253\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0257\b\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0260\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u0271\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u027a\b\u001f\n\u001f"+
		"\f\u001f\u027d\t\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u02bd\b \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0005 \u02e2\b \n \f \u02e5\t \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u02f1\b!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02fc"+
		"\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0317\b\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u031f\b\'\u0001\'\u0001\'\u0003"+
		"\'\u0323\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0003(\u0331\b(\u0001)\u0001)\u0001)\u0001)\u0003"+
		")\u0337\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003"+
		")\u0341\b)\u0001)\u0001)\u0001)\u0005)\u0346\b)\n)\f)\u0349\t)\u0001*"+
		"\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0352\b*\u0001*\u0001"+
		"*\u0003*\u0356\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u035d\b*\n"+
		"*\f*\u0360\t*\u0001*\u0000\u0007028>@RT+\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:"+
		"<>@BDFHJLNPRT\u0000\b\u0002\u0000##@@\u0002\u00005577\u0002\u00006688"+
		"\u0001\u000001\u0001\u000024\u0002\u0000,,..\u0002\u0000--//\u0001\u0000"+
		"$%\u03a5\u0000V\u0001\u0000\u0000\u0000\u0002[\u0001\u0000\u0000\u0000"+
		"\u0004\u009a\u0001\u0000\u0000\u0000\u0006\u009c\u0001\u0000\u0000\u0000"+
		"\b\u00c3\u0001\u0000\u0000\u0000\n\u00d9\u0001\u0000\u0000\u0000\f\u00dc"+
		"\u0001\u0000\u0000\u0000\u000e\u00fd\u0001\u0000\u0000\u0000\u0010\u010f"+
		"\u0001\u0000\u0000\u0000\u0012\u0121\u0001\u0000\u0000\u0000\u0014\u0124"+
		"\u0001\u0000\u0000\u0000\u0016\u012a\u0001\u0000\u0000\u0000\u0018\u0132"+
		"\u0001\u0000\u0000\u0000\u001a\u013c\u0001\u0000\u0000\u0000\u001c\u0158"+
		"\u0001\u0000\u0000\u0000\u001e\u015a\u0001\u0000\u0000\u0000 \u0178\u0001"+
		"\u0000\u0000\u0000\"\u01ac\u0001\u0000\u0000\u0000$\u01ae\u0001\u0000"+
		"\u0000\u0000&\u01b5\u0001\u0000\u0000\u0000(\u01c0\u0001\u0000\u0000\u0000"+
		"*\u01ca\u0001\u0000\u0000\u0000,\u01d7\u0001\u0000\u0000\u0000.\u01dc"+
		"\u0001\u0000\u0000\u00000\u01e1\u0001\u0000\u0000\u00002\u01ee\u0001\u0000"+
		"\u0000\u00004\u01ff\u0001\u0000\u0000\u00006\u0235\u0001\u0000\u0000\u0000"+
		"8\u0237\u0001\u0000\u0000\u0000:\u025f\u0001\u0000\u0000\u0000<\u0261"+
		"\u0001\u0000\u0000\u0000>\u0270\u0001\u0000\u0000\u0000@\u02bc\u0001\u0000"+
		"\u0000\u0000B\u02f0\u0001\u0000\u0000\u0000D\u02fb\u0001\u0000\u0000\u0000"+
		"F\u02fd\u0001\u0000\u0000\u0000H\u0303\u0001\u0000\u0000\u0000J\u0309"+
		"\u0001\u0000\u0000\u0000L\u030f\u0001\u0000\u0000\u0000N\u0322\u0001\u0000"+
		"\u0000\u0000P\u0330\u0001\u0000\u0000\u0000R\u0332\u0001\u0000\u0000\u0000"+
		"T\u0351\u0001\u0000\u0000\u0000VW\u0003\u0002\u0001\u0000WX\u0005\u0000"+
		"\u0000\u0001XY\u0006\u0000\uffff\uffff\u0000Y\u0001\u0001\u0000\u0000"+
		"\u0000Z\\\u0003\u0004\u0002\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_`\u0006\u0001\uffff\uffff\u0000`\u0003\u0001\u0000"+
		"\u0000\u0000ab\u0003\u0006\u0003\u0000bc\u0006\u0002\uffff\uffff\u0000"+
		"c\u009b\u0001\u0000\u0000\u0000de\u0003\b\u0004\u0000ef\u0006\u0002\uffff"+
		"\uffff\u0000f\u009b\u0001\u0000\u0000\u0000gh\u0003\n\u0005\u0000hi\u0006"+
		"\u0002\uffff\uffff\u0000i\u009b\u0001\u0000\u0000\u0000jk\u0003\u0016"+
		"\u000b\u0000kl\u0006\u0002\uffff\uffff\u0000l\u009b\u0001\u0000\u0000"+
		"\u0000mn\u0003N\'\u0000no\u0006\u0002\uffff\uffff\u0000o\u009b\u0001\u0000"+
		"\u0000\u0000pq\u0003\u000e\u0007\u0000qr\u0006\u0002\uffff\uffff\u0000"+
		"r\u009b\u0001\u0000\u0000\u0000st\u0003\u001a\r\u0000tu\u0006\u0002\uffff"+
		"\uffff\u0000u\u009b\u0001\u0000\u0000\u0000vw\u0003\u001c\u000e\u0000"+
		"wx\u0006\u0002\uffff\uffff\u0000x\u009b\u0001\u0000\u0000\u0000yz\u0003"+
		"\u0010\b\u0000z{\u0006\u0002\uffff\uffff\u0000{\u009b\u0001\u0000\u0000"+
		"\u0000|}\u0003\u001e\u000f\u0000}~\u0006\u0002\uffff\uffff\u0000~\u009b"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0003 \u0010\u0000\u0080\u0081\u0006"+
		"\u0002\uffff\uffff\u0000\u0081\u009b\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0003\"\u0011\u0000\u0083\u0084\u0006\u0002\uffff\uffff\u0000\u0084\u009b"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0003&\u0013\u0000\u0086\u0087\u0006"+
		"\u0002\uffff\uffff\u0000\u0087\u009b\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0003(\u0014\u0000\u0089\u008a\u0006\u0002\uffff\uffff\u0000\u008a\u009b"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0003*\u0015\u0000\u008c\u008d\u0006"+
		"\u0002\uffff\uffff\u0000\u008d\u009b\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u00036\u001b\u0000\u008f\u0090\u0006\u0002\uffff\uffff\u0000\u0090\u009b"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0003$\u0012\u0000\u0092\u0093\u0006"+
		"\u0002\uffff\uffff\u0000\u0093\u009b\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0003<\u001e\u0000\u0095\u0096\u0006\u0002\uffff\uffff\u0000\u0096\u009b"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0003\u0018\f\u0000\u0098\u0099\u0006"+
		"\u0002\uffff\uffff\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009aa\u0001"+
		"\u0000\u0000\u0000\u009ad\u0001\u0000\u0000\u0000\u009ag\u0001\u0000\u0000"+
		"\u0000\u009aj\u0001\u0000\u0000\u0000\u009am\u0001\u0000\u0000\u0000\u009a"+
		"p\u0001\u0000\u0000\u0000\u009as\u0001\u0000\u0000\u0000\u009av\u0001"+
		"\u0000\u0000\u0000\u009ay\u0001\u0000\u0000\u0000\u009a|\u0001\u0000\u0000"+
		"\u0000\u009a\u007f\u0001\u0000\u0000\u0000\u009a\u0082\u0001\u0000\u0000"+
		"\u0000\u009a\u0085\u0001\u0000\u0000\u0000\u009a\u0088\u0001\u0000\u0000"+
		"\u0000\u009a\u008b\u0001\u0000\u0000\u0000\u009a\u008e\u0001\u0000\u0000"+
		"\u0000\u009a\u0091\u0001\u0000\u0000\u0000\u009a\u0094\u0001\u0000\u0000"+
		"\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009b\u0005\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005\n\u0000\u0000\u009d\u009e\u00055\u0000\u0000"+
		"\u009e\u009f\u0003R)\u0000\u009f\u00a1\u00056\u0000\u0000\u00a0\u00a2"+
		"\u0005=\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0006"+
		"\u0003\uffff\uffff\u0000\u00a4\u0007\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0005\u0006\u0000\u0000\u00a6\u00a7\u0005#\u0000\u0000\u00a7\u00a8\u0005"+
		"9\u0000\u0000\u00a8\u00a9\u0003P(\u0000\u00a9\u00aa\u0005)\u0000\u0000"+
		"\u00aa\u00ac\u0003@ \u0000\u00ab\u00ad\u0005=\u0000\u0000\u00ac\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0006\u0004\uffff\uffff\u0000\u00af"+
		"\u00c4\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0006\u0000\u0000\u00b1"+
		"\u00b2\u0005#\u0000\u0000\u00b2\u00b3\u0005)\u0000\u0000\u00b3\u00b5\u0003"+
		"@ \u0000\u00b4\u00b6\u0005=\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0006\u0004\uffff\uffff\u0000\u00b8\u00c4\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0005\u0006\u0000\u0000\u00ba\u00bb\u0005#\u0000"+
		"\u0000\u00bb\u00bc\u00059\u0000\u0000\u00bc\u00bd\u0003P(\u0000\u00bd"+
		"\u00bf\u0005:\u0000\u0000\u00be\u00c0\u0005=\u0000\u0000\u00bf\u00be\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0006\u0004\uffff\uffff\u0000\u00c2\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c3\u00a5\u0001\u0000\u0000\u0000\u00c3\u00b0"+
		"\u0001\u0000\u0000\u0000\u00c3\u00b9\u0001\u0000\u0000\u0000\u00c4\t\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0005\u000e\u0000\u0000\u00c6\u00c7\u0005"+
		"#\u0000\u0000\u00c7\u00c8\u00059\u0000\u0000\u00c8\u00c9\u0003P(\u0000"+
		"\u00c9\u00ca\u0005)\u0000\u0000\u00ca\u00cc\u0003@ \u0000\u00cb\u00cd"+
		"\u0005=\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0006"+
		"\u0005\uffff\uffff\u0000\u00cf\u00da\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0005\u000e\u0000\u0000\u00d1\u00d2\u0005#\u0000\u0000\u00d2\u00d3\u0005"+
		")\u0000\u0000\u00d3\u00d5\u0003@ \u0000\u00d4\u00d6\u0005=\u0000\u0000"+
		"\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0006\u0005\uffff\uffff"+
		"\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00c5\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d0\u0001\u0000\u0000\u0000\u00da\u000b\u0001\u0000\u0000"+
		"\u0000\u00db\u00dd\u0003\u000e\u0007\u0000\u00dc\u00db\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0006\u0006\uffff\uffff\u0000\u00e1\r\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0005\u000b\u0000\u0000\u00e3\u00e4\u0003@ \u0000\u00e4"+
		"\u00e5\u00057\u0000\u0000\u00e5\u00e6\u0003\u0002\u0001\u0000\u00e6\u00e7"+
		"\u00058\u0000\u0000\u00e7\u00e8\u0006\u0007\uffff\uffff\u0000\u00e8\u00fe"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u000b\u0000\u0000\u00ea\u00eb"+
		"\u0003@ \u0000\u00eb\u00ec\u00057\u0000\u0000\u00ec\u00ed\u0003\u0002"+
		"\u0001\u0000\u00ed\u00ee\u00058\u0000\u0000\u00ee\u00ef\u0005\f\u0000"+
		"\u0000\u00ef\u00f0\u00057\u0000\u0000\u00f0\u00f1\u0003\u0002\u0001\u0000"+
		"\u00f1\u00f2\u00058\u0000\u0000\u00f2\u00f3\u0006\u0007\uffff\uffff\u0000"+
		"\u00f3\u00fe\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u000b\u0000\u0000"+
		"\u00f5\u00f6\u0003@ \u0000\u00f6\u00f7\u00057\u0000\u0000\u00f7\u00f8"+
		"\u0003\u0002\u0001\u0000\u00f8\u00f9\u00058\u0000\u0000\u00f9\u00fa\u0005"+
		"\f\u0000\u0000\u00fa\u00fb\u0003\f\u0006\u0000\u00fb\u00fc\u0006\u0007"+
		"\uffff\uffff\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00e2\u0001"+
		"\u0000\u0000\u0000\u00fd\u00e9\u0001\u0000\u0000\u0000\u00fd\u00f4\u0001"+
		"\u0000\u0000\u0000\u00fe\u000f\u0001\u0000\u0000\u0000\u00ff\u0100\u0005"+
		"\u0011\u0000\u0000\u0100\u0101\u0003@ \u0000\u0101\u0102\u00057\u0000"+
		"\u0000\u0102\u0103\u0005\u0013\u0000\u0000\u0103\u0104\u00059\u0000\u0000"+
		"\u0104\u0105\u0003\u0002\u0001\u0000\u0105\u0106\u00058\u0000\u0000\u0106"+
		"\u0107\u0006\b\uffff\uffff\u0000\u0107\u0110\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0005\u0011\u0000\u0000\u0109\u010a\u0003@ \u0000\u010a\u010b\u0005"+
		"7\u0000\u0000\u010b\u010c\u0003\u0012\t\u0000\u010c\u010d\u00058\u0000"+
		"\u0000\u010d\u010e\u0006\b\uffff\uffff\u0000\u010e\u0110\u0001\u0000\u0000"+
		"\u0000\u010f\u00ff\u0001\u0000\u0000\u0000\u010f\u0108\u0001\u0000\u0000"+
		"\u0000\u0110\u0011\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0012\u0000"+
		"\u0000\u0112\u0113\u0003@ \u0000\u0113\u0114\u00059\u0000\u0000\u0114"+
		"\u0115\u0003\u0002\u0001\u0000\u0115\u0116\u0003\u0014\n\u0000\u0116\u0117"+
		"\u0006\t\uffff\uffff\u0000\u0117\u0122\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0005\u0012\u0000\u0000\u0119\u011a\u0003@ \u0000\u011a\u011b\u00059"+
		"\u0000\u0000\u011b\u011c\u0003\u0002\u0001\u0000\u011c\u011d\u0005\u0013"+
		"\u0000\u0000\u011d\u011e\u00059\u0000\u0000\u011e\u011f\u0003\u0002\u0001"+
		"\u0000\u011f\u0120\u0006\t\uffff\uffff\u0000\u0120\u0122\u0001\u0000\u0000"+
		"\u0000\u0121\u0111\u0001\u0000\u0000\u0000\u0121\u0118\u0001\u0000\u0000"+
		"\u0000\u0122\u0013\u0001\u0000\u0000\u0000\u0123\u0125\u0003\u0012\t\u0000"+
		"\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000"+
		"\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0006\n\uffff\uffff\u0000"+
		"\u0129\u0015\u0001\u0000\u0000\u0000\u012a\u012b\u0005#\u0000\u0000\u012b"+
		"\u012c\u0005)\u0000\u0000\u012c\u012e\u0003@ \u0000\u012d\u012f\u0005"+
		"=\u0000\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0006\u000b"+
		"\uffff\uffff\u0000\u0131\u0017\u0001\u0000\u0000\u0000\u0132\u0133\u0005"+
		"#\u0000\u0000\u0133\u0134\u0005;\u0000\u0000\u0134\u0135\u0005#\u0000"+
		"\u0000\u0135\u0136\u0005)\u0000\u0000\u0136\u0138\u0003@ \u0000\u0137"+
		"\u0139\u0005=\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0006\f\uffff\uffff\u0000\u013b\u0019\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u0005\r\u0000\u0000\u013d\u013e\u0003@ \u0000\u013e\u013f\u00057\u0000"+
		"\u0000\u013f\u0140\u0003\u0002\u0001\u0000\u0140\u0141\u00058\u0000\u0000"+
		"\u0141\u0142\u0006\r\uffff\uffff\u0000\u0142\u001b\u0001\u0000\u0000\u0000"+
		"\u0143\u0144\u0005\u000f\u0000\u0000\u0144\u0145\u0005#\u0000\u0000\u0145"+
		"\u0146\u0005\u0010\u0000\u0000\u0146\u0147\u0003@ \u0000\u0147\u0148\u0005"+
		"7\u0000\u0000\u0148\u0149\u0003\u0002\u0001\u0000\u0149\u014a\u00058\u0000"+
		"\u0000\u014a\u014b\u0006\u000e\uffff\uffff\u0000\u014b\u0159\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0005\u000f\u0000\u0000\u014d\u014e\u0005#\u0000"+
		"\u0000\u014e\u014f\u0005\u0010\u0000\u0000\u014f\u0150\u0003@ \u0000\u0150"+
		"\u0151\u0005;\u0000\u0000\u0151\u0152\u0005;\u0000\u0000\u0152\u0153\u0003"+
		"@ \u0000\u0153\u0154\u00057\u0000\u0000\u0154\u0155\u0003\u0002\u0001"+
		"\u0000\u0155\u0156\u00058\u0000\u0000\u0156\u0157\u0006\u000e\uffff\uffff"+
		"\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0143\u0001\u0000\u0000"+
		"\u0000\u0158\u014c\u0001\u0000\u0000\u0000\u0159\u001d\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0005\u0014\u0000\u0000\u015b\u015c\u0003@ \u0000\u015c"+
		"\u015d\u0005\f\u0000\u0000\u015d\u015e\u00057\u0000\u0000\u015e\u015f"+
		"\u0003\u0002\u0001\u0000\u015f\u0160\u00058\u0000\u0000\u0160\u0161\u0006"+
		"\u000f\uffff\uffff\u0000\u0161\u001f\u0001\u0000\u0000\u0000\u0162\u0164"+
		"\u0005\u0016\u0000\u0000\u0163\u0165\u0005=\u0000\u0000\u0164\u0163\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0001"+
		"\u0000\u0000\u0000\u0166\u0179\u0006\u0010\uffff\uffff\u0000\u0167\u0168"+
		"\u0005\u0016\u0000\u0000\u0168\u016a\u0003@ \u0000\u0169\u016b\u0005="+
		"\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u0006\u0010"+
		"\uffff\uffff\u0000\u016d\u0179\u0001\u0000\u0000\u0000\u016e\u0170\u0005"+
		"\u0015\u0000\u0000\u016f\u0171\u0005=\u0000\u0000\u0170\u016f\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000"+
		"\u0000\u0000\u0172\u0179\u0006\u0010\uffff\uffff\u0000\u0173\u0175\u0005"+
		"\u0017\u0000\u0000\u0174\u0176\u0005=\u0000\u0000\u0175\u0174\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000"+
		"\u0000\u0000\u0177\u0179\u0006\u0010\uffff\uffff\u0000\u0178\u0162\u0001"+
		"\u0000\u0000\u0000\u0178\u0167\u0001\u0000\u0000\u0000\u0178\u016e\u0001"+
		"\u0000\u0000\u0000\u0178\u0173\u0001\u0000\u0000\u0000\u0179!\u0001\u0000"+
		"\u0000\u0000\u017a\u017b\u0005\u0006\u0000\u0000\u017b\u017c\u0005#\u0000"+
		"\u0000\u017c\u017d\u00059\u0000\u0000\u017d\u017e\u0005>\u0000\u0000\u017e"+
		"\u017f\u0003P(\u0000\u017f\u0180\u0005?\u0000\u0000\u0180\u0181\u0005"+
		")\u0000\u0000\u0181\u0183\u0003@ \u0000\u0182\u0184\u0005=\u0000\u0000"+
		"\u0183\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000"+
		"\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0006\u0011\uffff\uffff"+
		"\u0000\u0186\u01ad\u0001\u0000\u0000\u0000\u0187\u0188\u0005\u0006\u0000"+
		"\u0000\u0188\u0189\u0005#\u0000\u0000\u0189\u018a\u00059\u0000\u0000\u018a"+
		"\u018b\u0005>\u0000\u0000\u018b\u018c\u0003P(\u0000\u018c\u018d\u0005"+
		"?\u0000\u0000\u018d\u018e\u0005)\u0000\u0000\u018e\u0190\u0003@ \u0000"+
		"\u018f\u0191\u0005=\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0006\u0011\uffff\uffff\u0000\u0193\u01ad\u0001\u0000\u0000\u0000"+
		"\u0194\u0195\u0005\u0006\u0000\u0000\u0195\u0196\u0005#\u0000\u0000\u0196"+
		"\u0197\u0005)\u0000\u0000\u0197\u0198\u0005>\u0000\u0000\u0198\u0199\u0003"+
		"P(\u0000\u0199\u019a\u0005?\u0000\u0000\u019a\u019b\u00055\u0000\u0000"+
		"\u019b\u019d\u00056\u0000\u0000\u019c\u019e\u0005=\u0000\u0000\u019d\u019c"+
		"\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01ad"+
		"\u0001\u0000\u0000\u0000\u019f\u01a0\u0005\u0006\u0000\u0000\u01a0\u01a1"+
		"\u0005#\u0000\u0000\u01a1\u01a2\u00059\u0000\u0000\u01a2\u01a3\u0005>"+
		"\u0000\u0000\u01a3\u01a4\u0003P(\u0000\u01a4\u01a5\u0005?\u0000\u0000"+
		"\u01a5\u01a6\u0005)\u0000\u0000\u01a6\u01a8\u0005#\u0000\u0000\u01a7\u01a9"+
		"\u0005=\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab\u0006"+
		"\u0011\uffff\uffff\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac\u017a"+
		"\u0001\u0000\u0000\u0000\u01ac\u0187\u0001\u0000\u0000\u0000\u01ac\u0194"+
		"\u0001\u0000\u0000\u0000\u01ac\u019f\u0001\u0000\u0000\u0000\u01ad#\u0001"+
		"\u0000\u0000\u0000\u01ae\u01af\u0005#\u0000\u0000\u01af\u01b0\u00055\u0000"+
		"\u0000\u01b0\u01b1\u0003R)\u0000\u01b1\u01b2\u00056\u0000\u0000\u01b2"+
		"\u01b3\u0005=\u0000\u0000\u01b3\u01b4\u0006\u0012\uffff\uffff\u0000\u01b4"+
		"%\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005#\u0000\u0000\u01b6\u01b7\u0005"+
		";\u0000\u0000\u01b7\u01b8\u0005\u0018\u0000\u0000\u01b8\u01b9\u00055\u0000"+
		"\u0000\u01b9\u01ba\u0003@ \u0000\u01ba\u01bc\u00056\u0000\u0000\u01bb"+
		"\u01bd\u0005=\u0000\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bc\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01bf"+
		"\u0006\u0013\uffff\uffff\u0000\u01bf\'\u0001\u0000\u0000\u0000\u01c0\u01c1"+
		"\u0005#\u0000\u0000\u01c1\u01c2\u0005;\u0000\u0000\u01c2\u01c3\u0005\u0019"+
		"\u0000\u0000\u01c3\u01c4\u00055\u0000\u0000\u01c4\u01c6\u00056\u0000\u0000"+
		"\u01c5\u01c7\u0005=\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c9\u0006\u0014\uffff\uffff\u0000\u01c9)\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cb\u0005#\u0000\u0000\u01cb\u01cc\u0005;\u0000\u0000\u01cc\u01cd\u0005"+
		"\u001a\u0000\u0000\u01cd\u01ce\u00055\u0000\u0000\u01ce\u01cf\u0005\u001b"+
		"\u0000\u0000\u01cf\u01d0\u00059\u0000\u0000\u01d0\u01d1\u0003@ \u0000"+
		"\u01d1\u01d3\u00056\u0000\u0000\u01d2\u01d4\u0005=\u0000\u0000\u01d3\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d6\u0006\u0015\uffff\uffff\u0000\u01d6"+
		"+\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005#\u0000\u0000\u01d8\u01d9\u0005"+
		";\u0000\u0000\u01d9\u01da\u0005\u001c\u0000\u0000\u01da\u01db\u0006\u0016"+
		"\uffff\uffff\u0000\u01db-\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005#\u0000"+
		"\u0000\u01dd\u01de\u0005;\u0000\u0000\u01de\u01df\u0005\u001d\u0000\u0000"+
		"\u01df\u01e0\u0006\u0017\uffff\uffff\u0000\u01e0/\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e2\u0006\u0018\uffff\uffff\u0000\u01e2\u01e3\u0005#\u0000\u0000"+
		"\u01e3\u01e4\u0006\u0018\uffff\uffff\u0000\u01e4\u01eb\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e6\n\u0002\u0000\u0000\u01e6\u01e7\u00032\u0019\u0000"+
		"\u01e7\u01e8\u0006\u0018\uffff\uffff\u0000\u01e8\u01ea\u0001\u0000\u0000"+
		"\u0000\u01e9\u01e5\u0001\u0000\u0000\u0000\u01ea\u01ed\u0001\u0000\u0000"+
		"\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000"+
		"\u0000\u01ec1\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ef\u0006\u0019\uffff\uffff\u0000\u01ef\u01f0\u0005>\u0000\u0000"+
		"\u01f0\u01f1\u0003@ \u0000\u01f1\u01f2\u0005?\u0000\u0000\u01f2\u01f3"+
		"\u0006\u0019\uffff\uffff\u0000\u01f3\u01fc\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f5\n\u0002\u0000\u0000\u01f5\u01f6\u0005>\u0000\u0000\u01f6\u01f7"+
		"\u0003@ \u0000\u01f7\u01f8\u0005?\u0000\u0000\u01f8\u01f9\u0006\u0019"+
		"\uffff\uffff\u0000\u01f9\u01fb\u0001\u0000\u0000\u0000\u01fa\u01f4\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd3\u0001\u0000"+
		"\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01ff\u0200\u0005\u0006"+
		"\u0000\u0000\u0200\u0201\u0005#\u0000\u0000\u0201\u0202\u00055\u0000\u0000"+
		"\u0202\u0203\u00059\u0000\u0000\u0203\u0204\u0003P(\u0000\u0204\u0205"+
		"\u00056\u0000\u0000\u0205\u0207\u0005)\u0000\u0000\u0206\u0208\u0005="+
		"\u0000\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000"+
		"\u0000\u0000\u02085\u0001\u0000\u0000\u0000\u0209\u020a\u0005\u001e\u0000"+
		"\u0000\u020a\u020b\u0005#\u0000\u0000\u020b\u020c\u00055\u0000\u0000\u020c"+
		"\u020d\u00038\u001c\u0000\u020d\u020e\u00056\u0000\u0000\u020e\u020f\u0005"+
		"3\u0000\u0000\u020f\u0210\u0005.\u0000\u0000\u0210\u0211\u0003P(\u0000"+
		"\u0211\u0212\u00057\u0000\u0000\u0212\u0213\u0003\u0002\u0001\u0000\u0213"+
		"\u0214\u00058\u0000\u0000\u0214\u0215\u0006\u001b\uffff\uffff\u0000\u0215"+
		"\u0236\u0001\u0000\u0000\u0000\u0216\u0217\u0005\u001e\u0000\u0000\u0217"+
		"\u0218\u0005#\u0000\u0000\u0218\u0219\u00055\u0000\u0000\u0219\u021a\u0003"+
		"8\u001c\u0000\u021a\u021b\u00056\u0000\u0000\u021b\u021c\u00057\u0000"+
		"\u0000\u021c\u021d\u0003\u0002\u0001\u0000\u021d\u021e\u00058\u0000\u0000"+
		"\u021e\u021f\u0006\u001b\uffff\uffff\u0000\u021f\u0236\u0001\u0000\u0000"+
		"\u0000\u0220\u0221\u0005\u001e\u0000\u0000\u0221\u0222\u0005#\u0000\u0000"+
		"\u0222\u0223\u00055\u0000\u0000\u0223\u0224\u00056\u0000\u0000\u0224\u0225"+
		"\u00053\u0000\u0000\u0225\u0226\u0005.\u0000\u0000\u0226\u0227\u0003P"+
		"(\u0000\u0227\u0228\u00057\u0000\u0000\u0228\u0229\u0003\u0002\u0001\u0000"+
		"\u0229\u022a\u00058\u0000\u0000\u022a\u022b\u0006\u001b\uffff\uffff\u0000"+
		"\u022b\u0236\u0001\u0000\u0000\u0000\u022c\u022d\u0005\u001e\u0000\u0000"+
		"\u022d\u022e\u0005#\u0000\u0000\u022e\u022f\u00055\u0000\u0000\u022f\u0230"+
		"\u00056\u0000\u0000\u0230\u0231\u00057\u0000\u0000\u0231\u0232\u0003\u0002"+
		"\u0001\u0000\u0232\u0233\u00058\u0000\u0000\u0233\u0234\u0006\u001b\uffff"+
		"\uffff\u0000\u0234\u0236\u0001\u0000\u0000\u0000\u0235\u0209\u0001\u0000"+
		"\u0000\u0000\u0235\u0216\u0001\u0000\u0000\u0000\u0235\u0220\u0001\u0000"+
		"\u0000\u0000\u0235\u022c\u0001\u0000\u0000\u0000\u02367\u0001\u0000\u0000"+
		"\u0000\u0237\u0238\u0006\u001c\uffff\uffff\u0000\u0238\u0239\u0003:\u001d"+
		"\u0000\u0239\u023a\u0006\u001c\uffff\uffff\u0000\u023a\u0242\u0001\u0000"+
		"\u0000\u0000\u023b\u023c\n\u0002\u0000\u0000\u023c\u023d\u0005<\u0000"+
		"\u0000\u023d\u023e\u0003:\u001d\u0000\u023e\u023f\u0006\u001c\uffff\uffff"+
		"\u0000\u023f\u0241\u0001\u0000\u0000\u0000\u0240\u023b\u0001\u0000\u0000"+
		"\u0000\u0241\u0244\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000"+
		"\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u02439\u0001\u0000\u0000\u0000"+
		"\u0244\u0242\u0001\u0000\u0000\u0000\u0245\u0246\u0007\u0000\u0000\u0000"+
		"\u0246\u0247\u0005#\u0000\u0000\u0247\u0248\u00059\u0000\u0000\u0248\u0249"+
		"\u0003P(\u0000\u0249\u024a\u0006\u001d\uffff\uffff\u0000\u024a\u0260\u0001"+
		"\u0000\u0000\u0000\u024b\u024c\u0007\u0000\u0000\u0000\u024c\u024d\u0005"+
		"#\u0000\u0000\u024d\u024f\u00059\u0000\u0000\u024e\u0250\u0005\u001f\u0000"+
		"\u0000\u024f\u024e\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000"+
		"\u0000\u0250\u0252\u0001\u0000\u0000\u0000\u0251\u0253\u0005>\u0000\u0000"+
		"\u0252\u0251\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000"+
		"\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0256\u0003P(\u0000\u0255\u0257"+
		"\u0005?\u0000\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0256\u0257\u0001"+
		"\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u0259\u0006"+
		"\u001d\uffff\uffff\u0000\u0259\u0260\u0001\u0000\u0000\u0000\u025a\u025b"+
		"\u0005#\u0000\u0000\u025b\u025c\u00059\u0000\u0000\u025c\u025d\u0003P"+
		"(\u0000\u025d\u025e\u0006\u001d\uffff\uffff\u0000\u025e\u0260\u0001\u0000"+
		"\u0000\u0000\u025f\u0245\u0001\u0000\u0000\u0000\u025f\u024b\u0001\u0000"+
		"\u0000\u0000\u025f\u025a\u0001\u0000\u0000\u0000\u0260;\u0001\u0000\u0000"+
		"\u0000\u0261\u0262\u0005 \u0000\u0000\u0262\u0263\u0005#\u0000\u0000\u0263"+
		"\u0264\u00057\u0000\u0000\u0264\u0265\u0003>\u001f\u0000\u0265\u0266\u0005"+
		"8\u0000\u0000\u0266\u0267\u0006\u001e\uffff\uffff\u0000\u0267=\u0001\u0000"+
		"\u0000\u0000\u0268\u0269\u0006\u001f\uffff\uffff\u0000\u0269\u026a\u0005"+
		"\u0006\u0000\u0000\u026a\u026b\u0005#\u0000\u0000\u026b\u026c\u00059\u0000"+
		"\u0000\u026c\u026d\u0003P(\u0000\u026d\u026e\u0006\u001f\uffff\uffff\u0000"+
		"\u026e\u0271\u0001\u0000\u0000\u0000\u026f\u0271\u0006\u001f\uffff\uffff"+
		"\u0000\u0270\u0268\u0001\u0000\u0000\u0000\u0270\u026f\u0001\u0000\u0000"+
		"\u0000\u0271\u027b\u0001\u0000\u0000\u0000\u0272\u0273\n\u0003\u0000\u0000"+
		"\u0273\u0274\u0005\u0006\u0000\u0000\u0274\u0275\u0005#\u0000\u0000\u0275"+
		"\u0276\u00059\u0000\u0000\u0276\u0277\u0003P(\u0000\u0277\u0278\u0006"+
		"\u001f\uffff\uffff\u0000\u0278\u027a\u0001\u0000\u0000\u0000\u0279\u0272"+
		"\u0001\u0000\u0000\u0000\u027a\u027d\u0001\u0000\u0000\u0000\u027b\u0279"+
		"\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c?\u0001"+
		"\u0000\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027e\u027f\u0006"+
		" \uffff\uffff\u0000\u027f\u0280\u0005&\u0000\u0000\u0280\u0281\u0003@"+
		" \u0013\u0281\u0282\u0006 \uffff\uffff\u0000\u0282\u02bd\u0001\u0000\u0000"+
		"\u0000\u0283\u0284\u00053\u0000\u0000\u0284\u0285\u0003@ \u0012\u0285"+
		"\u0286\u0006 \uffff\uffff\u0000\u0286\u02bd\u0001\u0000\u0000\u0000\u0287"+
		"\u0288\u00055\u0000\u0000\u0288\u0289\u0003@ \u0000\u0289\u028a\u0005"+
		"6\u0000\u0000\u028a\u028b\u0006 \uffff\uffff\u0000\u028b\u02bd\u0001\u0000"+
		"\u0000\u0000\u028c\u028d\u0005!\u0000\u0000\u028d\u02bd\u0006 \uffff\uffff"+
		"\u0000\u028e\u028f\u0005\"\u0000\u0000\u028f\u02bd\u0006 \uffff\uffff"+
		"\u0000\u0290\u0291\u0005\b\u0000\u0000\u0291\u02bd\u0006 \uffff\uffff"+
		"\u0000\u0292\u0293\u0005\t\u0000\u0000\u0293\u02bd\u0006 \uffff\uffff"+
		"\u0000\u0294\u0295\u0005\u0007\u0000\u0000\u0295\u02bd\u0006 \uffff\uffff"+
		"\u0000\u0296\u0297\u0003L&\u0000\u0297\u0298\u0006 \uffff\uffff\u0000"+
		"\u0298\u02bd\u0001\u0000\u0000\u0000\u0299\u029a\u0003,\u0016\u0000\u029a"+
		"\u029b\u0006 \uffff\uffff\u0000\u029b\u02bd\u0001\u0000\u0000\u0000\u029c"+
		"\u029d\u0003.\u0017\u0000\u029d\u029e\u0006 \uffff\uffff\u0000\u029e\u02bd"+
		"\u0001\u0000\u0000\u0000\u029f\u02a0\u0003F#\u0000\u02a0\u02a1\u0006 "+
		"\uffff\uffff\u0000\u02a1\u02bd\u0001\u0000\u0000\u0000\u02a2\u02a3\u0003"+
		"H$\u0000\u02a3\u02a4\u0006 \uffff\uffff\u0000\u02a4\u02bd\u0001\u0000"+
		"\u0000\u0000\u02a5\u02a6\u0003J%\u0000\u02a6\u02a7\u0006 \uffff\uffff"+
		"\u0000\u02a7\u02bd\u0001\u0000\u0000\u0000\u02a8\u02a9\u0003D\"\u0000"+
		"\u02a9\u02aa\u0006 \uffff\uffff\u0000\u02aa\u02bd\u0001\u0000\u0000\u0000"+
		"\u02ab\u02ac\u0005#\u0000\u0000\u02ac\u02ad\u0007\u0001\u0000\u0000\u02ad"+
		"\u02ae\u0003T*\u0000\u02ae\u02af\u0007\u0002\u0000\u0000\u02af\u02b0\u0006"+
		" \uffff\uffff\u0000\u02b0\u02bd\u0001\u0000\u0000\u0000\u02b1\u02b2\u0003"+
		"B!\u0000\u02b2\u02b3\u0006 \uffff\uffff\u0000\u02b3\u02bd\u0001\u0000"+
		"\u0000\u0000\u02b4\u02b5\u00030\u0018\u0000\u02b5\u02b6\u0006 \uffff\uffff"+
		"\u0000\u02b6\u02bd\u0001\u0000\u0000\u0000\u02b7\u02b8\u0005>\u0000\u0000"+
		"\u02b8\u02b9\u0003R)\u0000\u02b9\u02ba\u0005?\u0000\u0000\u02ba\u02bb"+
		"\u0006 \uffff\uffff\u0000\u02bb\u02bd\u0001\u0000\u0000\u0000\u02bc\u027e"+
		"\u0001\u0000\u0000\u0000\u02bc\u0283\u0001\u0000\u0000\u0000\u02bc\u0287"+
		"\u0001\u0000\u0000\u0000\u02bc\u028c\u0001\u0000\u0000\u0000\u02bc\u028e"+
		"\u0001\u0000\u0000\u0000\u02bc\u0290\u0001\u0000\u0000\u0000\u02bc\u0292"+
		"\u0001\u0000\u0000\u0000\u02bc\u0294\u0001\u0000\u0000\u0000\u02bc\u0296"+
		"\u0001\u0000\u0000\u0000\u02bc\u0299\u0001\u0000\u0000\u0000\u02bc\u029c"+
		"\u0001\u0000\u0000\u0000\u02bc\u029f\u0001\u0000\u0000\u0000\u02bc\u02a2"+
		"\u0001\u0000\u0000\u0000\u02bc\u02a5\u0001\u0000\u0000\u0000\u02bc\u02a8"+
		"\u0001\u0000\u0000\u0000\u02bc\u02ab\u0001\u0000\u0000\u0000\u02bc\u02b1"+
		"\u0001\u0000\u0000\u0000\u02bc\u02b4\u0001\u0000\u0000\u0000\u02bc\u02b7"+
		"\u0001\u0000\u0000\u0000\u02bd\u02e3\u0001\u0000\u0000\u0000\u02be\u02bf"+
		"\n\u001a\u0000\u0000\u02bf\u02c0\u0007\u0003\u0000\u0000\u02c0\u02c1\u0003"+
		"@ \u001b\u02c1\u02c2\u0006 \uffff\uffff\u0000\u02c2\u02e2\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c4\n\u0019\u0000\u0000\u02c4\u02c5\u0007\u0004\u0000"+
		"\u0000\u02c5\u02c6\u0003@ \u001a\u02c6\u02c7\u0006 \uffff\uffff\u0000"+
		"\u02c7\u02e2\u0001\u0000\u0000\u0000\u02c8\u02c9\n\u0018\u0000\u0000\u02c9"+
		"\u02ca\u0007\u0005\u0000\u0000\u02ca\u02cb\u0003@ \u0019\u02cb\u02cc\u0006"+
		" \uffff\uffff\u0000\u02cc\u02e2\u0001\u0000\u0000\u0000\u02cd\u02ce\n"+
		"\u0017\u0000\u0000\u02ce\u02cf\u0007\u0006\u0000\u0000\u02cf\u02d0\u0003"+
		"@ \u0018\u02d0\u02d1\u0006 \uffff\uffff\u0000\u02d1\u02e2\u0001\u0000"+
		"\u0000\u0000\u02d2\u02d3\n\u0016\u0000\u0000\u02d3\u02d4\u0007\u0007\u0000"+
		"\u0000\u02d4\u02d5\u0003@ \u0017\u02d5\u02d6\u0006 \uffff\uffff\u0000"+
		"\u02d6\u02e2\u0001\u0000\u0000\u0000\u02d7\u02d8\n\u0015\u0000\u0000\u02d8"+
		"\u02d9\u0005(\u0000\u0000\u02d9\u02da\u0003@ \u0016\u02da\u02db\u0006"+
		" \uffff\uffff\u0000\u02db\u02e2\u0001\u0000\u0000\u0000\u02dc\u02dd\n"+
		"\u0014\u0000\u0000\u02dd\u02de\u0005\'\u0000\u0000\u02de\u02df\u0003@"+
		" \u0015\u02df\u02e0\u0006 \uffff\uffff\u0000\u02e0\u02e2\u0001\u0000\u0000"+
		"\u0000\u02e1\u02be\u0001\u0000\u0000\u0000\u02e1\u02c3\u0001\u0000\u0000"+
		"\u0000\u02e1\u02c8\u0001\u0000\u0000\u0000\u02e1\u02cd\u0001\u0000\u0000"+
		"\u0000\u02e1\u02d2\u0001\u0000\u0000\u0000\u02e1\u02d7\u0001\u0000\u0000"+
		"\u0000\u02e1\u02dc\u0001\u0000\u0000\u0000\u02e2\u02e5\u0001\u0000\u0000"+
		"\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000"+
		"\u0000\u02e4A\u0001\u0000\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000"+
		"\u02e6\u02e7\u0005#\u0000\u0000\u02e7\u02e8\u0005;\u0000\u0000\u02e8\u02e9"+
		"\u0005#\u0000\u0000\u02e9\u02f1\u0006!\uffff\uffff\u0000\u02ea\u02eb\u0005"+
		"#\u0000\u0000\u02eb\u02ec\u0005;\u0000\u0000\u02ec\u02ed\u0005#\u0000"+
		"\u0000\u02ed\u02ee\u0005;\u0000\u0000\u02ee\u02ef\u0005#\u0000\u0000\u02ef"+
		"\u02f1\u0006!\uffff\uffff\u0000\u02f0\u02e6\u0001\u0000\u0000\u0000\u02f0"+
		"\u02ea\u0001\u0000\u0000\u0000\u02f1C\u0001\u0000\u0000\u0000\u02f2\u02f3"+
		"\u0005#\u0000\u0000\u02f3\u02f4\u00055\u0000\u0000\u02f4\u02f5\u0003R"+
		")\u0000\u02f5\u02f6\u00056\u0000\u0000\u02f6\u02f7\u0006\"\uffff\uffff"+
		"\u0000\u02f7\u02fc\u0001\u0000\u0000\u0000\u02f8\u02f9\u0005#\u0000\u0000"+
		"\u02f9\u02fa\u00055\u0000\u0000\u02fa\u02fc\u00056\u0000\u0000\u02fb\u02f2"+
		"\u0001\u0000\u0000\u0000\u02fb\u02f8\u0001\u0000\u0000\u0000\u02fcE\u0001"+
		"\u0000\u0000\u0000\u02fd\u02fe\u0005\u0002\u0000\u0000\u02fe\u02ff\u0005"+
		"5\u0000\u0000\u02ff\u0300\u0003@ \u0000\u0300\u0301\u00056\u0000\u0000"+
		"\u0301\u0302\u0006#\uffff\uffff\u0000\u0302G\u0001\u0000\u0000\u0000\u0303"+
		"\u0304\u0005\u0003\u0000\u0000\u0304\u0305\u00055\u0000\u0000\u0305\u0306"+
		"\u0003@ \u0000\u0306\u0307\u00056\u0000\u0000\u0307\u0308\u0006$\uffff"+
		"\uffff\u0000\u0308I\u0001\u0000\u0000\u0000\u0309\u030a\u0005\u0001\u0000"+
		"\u0000\u030a\u030b\u00055\u0000\u0000\u030b\u030c\u0003@ \u0000\u030c"+
		"\u030d\u00056\u0000\u0000\u030d\u030e\u0006%\uffff\uffff\u0000\u030eK"+
		"\u0001\u0000\u0000\u0000\u030f\u0310\u0005#\u0000\u0000\u0310\u0311\u0006"+
		"&\uffff\uffff\u0000\u0311M\u0001\u0000\u0000\u0000\u0312\u0313\u0005#"+
		"\u0000\u0000\u0313\u0314\u0005*\u0000\u0000\u0314\u0316\u0003@ \u0000"+
		"\u0315\u0317\u0005=\u0000\u0000\u0316\u0315\u0001\u0000\u0000\u0000\u0316"+
		"\u0317\u0001\u0000\u0000\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318"+
		"\u0319\u0006\'\uffff\uffff\u0000\u0319\u0323\u0001\u0000\u0000\u0000\u031a"+
		"\u031b\u0005#\u0000\u0000\u031b\u031c\u0005+\u0000\u0000\u031c\u031e\u0003"+
		"@ \u0000\u031d\u031f\u0005=\u0000\u0000\u031e\u031d\u0001\u0000\u0000"+
		"\u0000\u031e\u031f\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000"+
		"\u0000\u0320\u0321\u0006\'\uffff\uffff\u0000\u0321\u0323\u0001\u0000\u0000"+
		"\u0000\u0322\u0312\u0001\u0000\u0000\u0000\u0322\u031a\u0001\u0000\u0000"+
		"\u0000\u0323O\u0001\u0000\u0000\u0000\u0324\u0325\u0005\u0001\u0000\u0000"+
		"\u0325\u0331\u0006(\uffff\uffff\u0000\u0326\u0327\u0005\u0002\u0000\u0000"+
		"\u0327\u0331\u0006(\uffff\uffff\u0000\u0328\u0329\u0005\u0003\u0000\u0000"+
		"\u0329\u0331\u0006(\uffff\uffff\u0000\u032a\u032b\u0005\u0004\u0000\u0000"+
		"\u032b\u0331\u0006(\uffff\uffff\u0000\u032c\u032d\u0005\u0005\u0000\u0000"+
		"\u032d\u0331\u0006(\uffff\uffff\u0000\u032e\u032f\u0005#\u0000\u0000\u032f"+
		"\u0331\u0006(\uffff\uffff\u0000\u0330\u0324\u0001\u0000\u0000\u0000\u0330"+
		"\u0326\u0001\u0000\u0000\u0000\u0330\u0328\u0001\u0000\u0000\u0000\u0330"+
		"\u032a\u0001\u0000\u0000\u0000\u0330\u032c\u0001\u0000\u0000\u0000\u0330"+
		"\u032e\u0001\u0000\u0000\u0000\u0331Q\u0001\u0000\u0000\u0000\u0332\u0336"+
		"\u0006)\uffff\uffff\u0000\u0333\u0337\u0005A\u0000\u0000\u0334\u0335\u0005"+
		"#\u0000\u0000\u0335\u0337\u00059\u0000\u0000\u0336\u0333\u0001\u0000\u0000"+
		"\u0000\u0336\u0334\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000\u0000"+
		"\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338\u0339\u0003@ \u0000\u0339"+
		"\u033a\u0006)\uffff\uffff\u0000\u033a\u0347\u0001\u0000\u0000\u0000\u033b"+
		"\u033c\n\u0002\u0000\u0000\u033c\u0340\u0005<\u0000\u0000\u033d\u0341"+
		"\u0005A\u0000\u0000\u033e\u033f\u0005#\u0000\u0000\u033f\u0341\u00059"+
		"\u0000\u0000\u0340\u033d\u0001\u0000\u0000\u0000\u0340\u033e\u0001\u0000"+
		"\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000"+
		"\u0000\u0000\u0342\u0343\u0003@ \u0000\u0343\u0344\u0006)\uffff\uffff"+
		"\u0000\u0344\u0346\u0001\u0000\u0000\u0000\u0345\u033b\u0001\u0000\u0000"+
		"\u0000\u0346\u0349\u0001\u0000\u0000\u0000\u0347\u0345\u0001\u0000\u0000"+
		"\u0000\u0347\u0348\u0001\u0000\u0000\u0000\u0348S\u0001\u0000\u0000\u0000"+
		"\u0349\u0347\u0001\u0000\u0000\u0000\u034a\u034b\u0006*\uffff\uffff\u0000"+
		"\u034b\u034c\u0005#\u0000\u0000\u034c\u034d\u00059\u0000\u0000\u034d\u034e"+
		"\u0003@ \u0000\u034e\u034f\u0006*\uffff\uffff\u0000\u034f\u0352\u0001"+
		"\u0000\u0000\u0000\u0350\u0352\u0006*\uffff\uffff\u0000\u0351\u034a\u0001"+
		"\u0000\u0000\u0000\u0351\u0350\u0001\u0000\u0000\u0000\u0352\u035e\u0001"+
		"\u0000\u0000\u0000\u0353\u0355\n\u0003\u0000\u0000\u0354\u0356\u0005<"+
		"\u0000\u0000\u0355\u0354\u0001\u0000\u0000\u0000\u0355\u0356\u0001\u0000"+
		"\u0000\u0000\u0356\u0357\u0001\u0000\u0000\u0000\u0357\u0358\u0005#\u0000"+
		"\u0000\u0358\u0359\u00059\u0000\u0000\u0359\u035a\u0003@ \u0000\u035a"+
		"\u035b\u0006*\uffff\uffff\u0000\u035b\u035d\u0001\u0000\u0000\u0000\u035c"+
		"\u0353\u0001\u0000\u0000\u0000\u035d\u0360\u0001\u0000\u0000\u0000\u035e"+
		"\u035c\u0001\u0000\u0000\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035f"+
		"U\u0001\u0000\u0000\u0000\u0360\u035e\u0001\u0000\u0000\u00009]\u009a"+
		"\u00a1\u00ac\u00b5\u00bf\u00c3\u00cc\u00d5\u00d9\u00de\u00fd\u010f\u0121"+
		"\u0126\u012e\u0138\u0158\u0164\u016a\u0170\u0175\u0178\u0183\u0190\u019d"+
		"\u01a8\u01ac\u01bc\u01c6\u01d3\u01eb\u01fc\u0207\u0235\u0242\u024f\u0252"+
		"\u0256\u025f\u0270\u027b\u02bc\u02e1\u02e3\u02f0\u02fb\u0316\u031e\u0322"+
		"\u0330\u0336\u0340\u0347\u0351\u0355\u035e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}