// Generated from c:\Users\50246\Desktop\Ingeniería-Sexto Semestre\Compiladores 2\Proyecto 2\Server\Grammar.g4 by ANTLR 4.9.2

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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		RULE_removestmt = 21, RULE_emptvecstmt = 22, RULE_countvecstmt = 23, RULE_accessvecstmt = 24, 
		RULE_assignationvecstmt = 25, RULE_declarematrixstmt = 26, RULE_declarefuncstmt = 27, 
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
			"removestmt", "emptvecstmt", "countvecstmt", "accessvecstmt", "assignationvecstmt", 
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
		  
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(90);
					((BlockContext)_localctx).instruction = instruction();
					((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(93); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

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
		public AssignationvecstmtContext assignationvecstmt;
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
		public AssignationvecstmtContext assignationvecstmt() {
			return getRuleContext(AssignationvecstmtContext.class,0);
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
			setState(157);
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
				_localctx.inst = ((InstructionContext)_localctx).constantstmt.const
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
				_localctx.inst = ((InstructionContext)_localctx).whilestmt.while
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				((InstructionContext)_localctx).forstmt = forstmt();
				_localctx.inst = ((InstructionContext)_localctx).forstmt.for
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(121);
				((InstructionContext)_localctx).switchstmt = switchstmt();
				_localctx.inst = ((InstructionContext)_localctx).switchstmt.switch
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
				((InstructionContext)_localctx).assignationvecstmt = assignationvecstmt();
				_localctx.inst = ((InstructionContext)_localctx).assignationvecstmt.assignvec
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(145);
				((InstructionContext)_localctx).declarefuncstmt = declarefuncstmt();
				_localctx.inst = ((InstructionContext)_localctx).declarefuncstmt.decfunc
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(148);
				((InstructionContext)_localctx).accessfuncinstruction = accessfuncinstruction();
				_localctx.inst = ((InstructionContext)_localctx).accessfuncinstruction.accessfuncin
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(151);
				((InstructionContext)_localctx).declarestructstmt = declarestructstmt();
				_localctx.inst = ((InstructionContext)_localctx).declarestructstmt.decstruct 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(154);
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
			setState(159);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(160);
			match(PARIZQ);
			setState(161);
			((PrintstmtContext)_localctx).listParams = listParams(0);
			setState(162);
			match(PARDER);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTCOMA) {
				{
				setState(163);
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
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				((DeclarestmtContext)_localctx).VAR = match(VAR);
				setState(169);
				((DeclarestmtContext)_localctx).ID = match(ID);
				setState(170);
				match(DOUBLEPTS);
				setState(171);
				((DeclarestmtContext)_localctx).type = type();
				setState(172);
				match(IG);
				setState(173);
				((DeclarestmtContext)_localctx).expr = expr(0);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(174);
					match(PTCOMA);
					}
				}

				_localctx.dec = instructions.NewTodeclare((((DeclarestmtContext)_localctx).VAR!=null?((DeclarestmtContext)_localctx).VAR.getLine():0), (((DeclarestmtContext)_localctx).VAR!=null?((DeclarestmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarestmtContext)_localctx).ID!=null?((DeclarestmtContext)_localctx).ID.getText():null), ((DeclarestmtContext)_localctx).type.t, ((DeclarestmtContext)_localctx).expr.e, false)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				((DeclarestmtContext)_localctx).VAR = match(VAR);
				setState(180);
				((DeclarestmtContext)_localctx).ID = match(ID);
				setState(181);
				match(IG);
				setState(182);
				((DeclarestmtContext)_localctx).expr = expr(0);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(183);
					match(PTCOMA);
					}
				}

				_localctx.dec = instructions.NewTodeclare((((DeclarestmtContext)_localctx).VAR!=null?((DeclarestmtContext)_localctx).VAR.getLine():0), (((DeclarestmtContext)_localctx).VAR!=null?((DeclarestmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarestmtContext)_localctx).ID!=null?((DeclarestmtContext)_localctx).ID.getText():null), environment.NULL, ((DeclarestmtContext)_localctx).expr.e, false)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				((DeclarestmtContext)_localctx).VAR = match(VAR);
				setState(189);
				((DeclarestmtContext)_localctx).ID = match(ID);
				setState(190);
				match(DOUBLEPTS);
				setState(191);
				((DeclarestmtContext)_localctx).type = type();
				setState(192);
				match(QUESTION);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(193);
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

	public static class ConstantstmtContext extends ParserRuleContext {
		public interfaces.Instruction const;
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				((ConstantstmtContext)_localctx).LET = match(LET);
				setState(201);
				((ConstantstmtContext)_localctx).ID = match(ID);
				setState(202);
				match(DOUBLEPTS);
				setState(203);
				((ConstantstmtContext)_localctx).type = type();
				setState(204);
				match(IG);
				setState(205);
				((ConstantstmtContext)_localctx).expr = expr(0);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(206);
					match(PTCOMA);
					}
				}

				_localctx.const = instructions.NewTodeclare((((ConstantstmtContext)_localctx).LET!=null?((ConstantstmtContext)_localctx).LET.getLine():0), (((ConstantstmtContext)_localctx).LET!=null?((ConstantstmtContext)_localctx).LET.getCharPositionInLine():0), (((ConstantstmtContext)_localctx).ID!=null?((ConstantstmtContext)_localctx).ID.getText():null), ((ConstantstmtContext)_localctx).type.t, ((ConstantstmtContext)_localctx).expr.e, true)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				((ConstantstmtContext)_localctx).LET = match(LET);
				setState(212);
				((ConstantstmtContext)_localctx).ID = match(ID);
				setState(213);
				match(IG);
				setState(214);
				((ConstantstmtContext)_localctx).expr = expr(0);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(215);
					match(PTCOMA);
					}
				}

				_localctx.const = instructions.NewTodeclare((((ConstantstmtContext)_localctx).LET!=null?((ConstantstmtContext)_localctx).LET.getLine():0), (((ConstantstmtContext)_localctx).LET!=null?((ConstantstmtContext)_localctx).LET.getCharPositionInLine():0), (((ConstantstmtContext)_localctx).ID!=null?((ConstantstmtContext)_localctx).ID.getText():null), environment.NULL, ((ConstantstmtContext)_localctx).expr.e, true)
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
			setState(223); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(222);
					((BlockelifsContext)_localctx).ifstmt = ifstmt();
					((BlockelifsContext)_localctx).elif.add(((BlockelifsContext)_localctx).ifstmt);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(225); 
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

	public static class IfstmtContext extends ParserRuleContext {
		public interfaces.Instruction ift;
		public []interface{} el;
		public interfaces.Instruction else;
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
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(230);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(231);
				match(LLAVEIZQ);
				setState(232);
				((IfstmtContext)_localctx).ifb = block();
				setState(233);
				match(LLAVEDER);
				 ((IfstmtContext)_localctx).ift =  instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).ifb.blk, nil); 
				                                        _localctx.el = ((IfstmtContext)_localctx).ifb.blk
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(237);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(238);
				match(LLAVEIZQ);
				setState(239);
				((IfstmtContext)_localctx).ifelseblck = block();
				setState(240);
				match(LLAVEDER);
				setState(241);
				match(ELSE);
				setState(242);
				match(LLAVEIZQ);
				setState(243);
				((IfstmtContext)_localctx).elseifblck = block();
				setState(244);
				match(LLAVEDER);
				 ((IfstmtContext)_localctx).ift =  instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).ifelseblck.blk, ((IfstmtContext)_localctx).elseifblck.blk); 
				                                                                                        ((IfstmtContext)_localctx).el =  ((IfstmtContext)_localctx).ifelseblck.blk;
				                                                                                        
				                                                                                        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(248);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(249);
				match(LLAVEIZQ);
				setState(250);
				((IfstmtContext)_localctx).elif = block();
				setState(251);
				match(LLAVEDER);
				setState(252);
				match(ELSE);
				setState(253);
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

	public static class SwitchstmtContext extends ParserRuleContext {
		public interfaces.Instruction switch;
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
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				((SwitchstmtContext)_localctx).SWITCH = match(SWITCH);
				setState(259);
				((SwitchstmtContext)_localctx).expr = expr(0);
				setState(260);
				match(LLAVEIZQ);
				setState(261);
				match(DEFAULT);
				setState(262);
				match(DOUBLEPTS);
				setState(263);
				((SwitchstmtContext)_localctx).block = block();
				setState(264);
				match(LLAVEDER);
				 ((SwitchstmtContext)_localctx).switch =  instructions.NewSwitch((((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getLine():0), (((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getCharPositionInLine():0), ((SwitchstmtContext)_localctx).expr.e, nil,  nil, ((SwitchstmtContext)_localctx).block.blk);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				((SwitchstmtContext)_localctx).SWITCH = match(SWITCH);
				setState(268);
				((SwitchstmtContext)_localctx).expr = expr(0);
				setState(269);
				match(LLAVEIZQ);
				setState(270);
				((SwitchstmtContext)_localctx).casestmt = casestmt();
				setState(271);
				match(LLAVEDER);
				((SwitchstmtContext)_localctx).switch =  instructions.NewSwitch((((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getLine():0), (((SwitchstmtContext)_localctx).SWITCH!=null?((SwitchstmtContext)_localctx).SWITCH.getCharPositionInLine():0), ((SwitchstmtContext)_localctx).expr.e, nil, ((SwitchstmtContext)_localctx).casestmt.cas, nil);
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
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				((CasestmtContext)_localctx).CASE = match(CASE);
				setState(277);
				((CasestmtContext)_localctx).expr = expr(0);
				setState(278);
				match(DOUBLEPTS);
				setState(279);
				((CasestmtContext)_localctx).block = block();
				setState(280);
				((CasestmtContext)_localctx).blockcases = blockcases();
				 _localctx.cas = instructions.NewCase((((CasestmtContext)_localctx).CASE!=null?((CasestmtContext)_localctx).CASE.getLine():0),(((CasestmtContext)_localctx).CASE!=null?((CasestmtContext)_localctx).CASE.getCharPositionInLine():0), ((CasestmtContext)_localctx).expr.e,((CasestmtContext)_localctx).block.blk, ((CasestmtContext)_localctx).blockcases.blkcase)
				                                
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				((CasestmtContext)_localctx).CASE = match(CASE);
				setState(284);
				((CasestmtContext)_localctx).expr = expr(0);
				setState(285);
				match(DOUBLEPTS);
				setState(286);
				((CasestmtContext)_localctx).sen = block();
				setState(287);
				match(DEFAULT);
				setState(288);
				match(DOUBLEPTS);
				setState(289);
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
			setState(295); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(294);
					((BlockcasesContext)_localctx).casestmt = casestmt();
					((BlockcasesContext)_localctx).casedef.add(((BlockcasesContext)_localctx).casestmt);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(297); 
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
			setState(301);
			((AssignationstmtContext)_localctx).ID = match(ID);
			setState(302);
			match(IG);
			setState(303);
			((AssignationstmtContext)_localctx).expr = expr(0);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTCOMA) {
				{
				setState(304);
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
			setState(309);
			((AssignationstructstmtContext)_localctx).ID = match(ID);
			setState(310);
			match(POINT);
			setState(311);
			((AssignationstructstmtContext)_localctx).second = match(ID);
			setState(312);
			match(IG);
			setState(313);
			((AssignationstructstmtContext)_localctx).expr = expr(0);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTCOMA) {
				{
				setState(314);
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

	public static class WhilestmtContext extends ParserRuleContext {
		public interfaces.Instruction while;
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
			setState(319);
			((WhilestmtContext)_localctx).WHILE = match(WHILE);
			setState(320);
			((WhilestmtContext)_localctx).expr = expr(0);
			setState(321);
			match(LLAVEIZQ);
			setState(322);
			((WhilestmtContext)_localctx).block = block();
			setState(323);
			match(LLAVEDER);
			_localctx.while = instructions.NewWhile((((WhilestmtContext)_localctx).WHILE!=null?((WhilestmtContext)_localctx).WHILE.getLine():0), (((WhilestmtContext)_localctx).WHILE!=null?((WhilestmtContext)_localctx).WHILE.getCharPositionInLine():0),  ((WhilestmtContext)_localctx).expr.e, ((WhilestmtContext)_localctx).block.blk)
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

	public static class ForstmtContext extends ParserRuleContext {
		public interfaces.Instruction for;
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
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				((ForstmtContext)_localctx).FOR = match(FOR);
				setState(327);
				((ForstmtContext)_localctx).ID = match(ID);
				setState(328);
				match(IN);
				setState(329);
				((ForstmtContext)_localctx).expr = expr(0);
				setState(330);
				match(LLAVEIZQ);
				setState(331);
				((ForstmtContext)_localctx).block = block();
				setState(332);
				match(LLAVEDER);
				_localctx.for = instructions.NewFor((((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getLine():0), (((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getCharPositionInLine():0), (((ForstmtContext)_localctx).ID!=null?((ForstmtContext)_localctx).ID.getText():null), ((ForstmtContext)_localctx).expr.e, nil, ((ForstmtContext)_localctx).block.blk)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				((ForstmtContext)_localctx).FOR = match(FOR);
				setState(336);
				((ForstmtContext)_localctx).ID = match(ID);
				setState(337);
				match(IN);
				setState(338);
				((ForstmtContext)_localctx).first = expr(0);
				setState(339);
				match(POINT);
				setState(340);
				match(POINT);
				setState(341);
				((ForstmtContext)_localctx).second = expr(0);
				setState(342);
				match(LLAVEIZQ);
				setState(343);
				((ForstmtContext)_localctx).block = block();
				setState(344);
				match(LLAVEDER);
				_localctx.for = instructions.NewFor((((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getLine():0), (((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getCharPositionInLine():0), (((ForstmtContext)_localctx).ID!=null?((ForstmtContext)_localctx).ID.getText():null), ((ForstmtContext)_localctx).first.e, ((ForstmtContext)_localctx).second.e, ((ForstmtContext)_localctx).block.blk)
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

	public static class GuardstmtContext extends ParserRuleContext {
		public interfaces.Instruction gua;
		public Token GUARD;
		public ExprContext expr;
		public BlockContext block;
		public Token r;
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
		public TerminalNode CONTINUE() { return getToken(GrammarParser.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(GrammarParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(GrammarParser.BREAK, 0); }
		public GuardstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardstmt; }
	}

	public final GuardstmtContext guardstmt() throws RecognitionException {
		GuardstmtContext _localctx = new GuardstmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_guardstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			((GuardstmtContext)_localctx).GUARD = match(GUARD);
			setState(350);
			((GuardstmtContext)_localctx).expr = expr(0);
			setState(351);
			match(ELSE);
			setState(352);
			match(LLAVEIZQ);
			setState(353);
			((GuardstmtContext)_localctx).block = block();
			setState(354);
			((GuardstmtContext)_localctx).r = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTINUE) | (1L << RETURN) | (1L << BREAK))) != 0)) ) {
				((GuardstmtContext)_localctx).r = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(355);
			match(LLAVEDER);
			_localctx.gua = instructions.NewGuard((((GuardstmtContext)_localctx).GUARD!=null?((GuardstmtContext)_localctx).GUARD.getLine():0), (((GuardstmtContext)_localctx).GUARD!=null?((GuardstmtContext)_localctx).GUARD.getCharPositionInLine():0), ((GuardstmtContext)_localctx).expr.e, ((GuardstmtContext)_localctx).block.blk, (((GuardstmtContext)_localctx).r!=null?((GuardstmtContext)_localctx).r.getText():null))
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
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				((TransferstmtContext)_localctx).RETURN = match(RETURN);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(359);
					match(PTCOMA);
					}
				}

				_localctx.tran = instructions.NewReturnIn((((TransferstmtContext)_localctx).RETURN!=null?((TransferstmtContext)_localctx).RETURN.getLine():0), (((TransferstmtContext)_localctx).RETURN!=null?((TransferstmtContext)_localctx).RETURN.getCharPositionInLine():0), nil)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				((TransferstmtContext)_localctx).RETURN = match(RETURN);
				setState(364);
				((TransferstmtContext)_localctx).expr = expr(0);
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(365);
					match(PTCOMA);
					}
				}

				_localctx.tran = instructions.NewReturnIn((((TransferstmtContext)_localctx).RETURN!=null?((TransferstmtContext)_localctx).RETURN.getLine():0), (((TransferstmtContext)_localctx).RETURN!=null?((TransferstmtContext)_localctx).RETURN.getCharPositionInLine():0), ((TransferstmtContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				((TransferstmtContext)_localctx).CONTINUE = match(CONTINUE);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(371);
					match(PTCOMA);
					}
				}

				_localctx.tran = instructions.NewContinue((((TransferstmtContext)_localctx).CONTINUE!=null?((TransferstmtContext)_localctx).CONTINUE.getLine():0), (((TransferstmtContext)_localctx).CONTINUE!=null?((TransferstmtContext)_localctx).CONTINUE.getCharPositionInLine():0))
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(375);
				((TransferstmtContext)_localctx).BREAK = match(BREAK);
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(376);
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

	public static class DeclarevectorstmtContext extends ParserRuleContext {
		public interfaces.Instruction decvec;
		public Token VAR;
		public Token ID;
		public TypeContext type;
		public ListParamsContext listParams;
		public Token F;
		public Token S;
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode DOUBLEPTS() { return getToken(GrammarParser.DOUBLEPTS, 0); }
		public List<TerminalNode> CORCHETEIZQ() { return getTokens(GrammarParser.CORCHETEIZQ); }
		public TerminalNode CORCHETEIZQ(int i) {
			return getToken(GrammarParser.CORCHETEIZQ, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> CORCHETEDER() { return getTokens(GrammarParser.CORCHETEDER); }
		public TerminalNode CORCHETEDER(int i) {
			return getToken(GrammarParser.CORCHETEDER, i);
		}
		public TerminalNode IG() { return getToken(GrammarParser.IG, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
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
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				((DeclarevectorstmtContext)_localctx).VAR = match(VAR);
				setState(383);
				((DeclarevectorstmtContext)_localctx).ID = match(ID);
				setState(384);
				match(DOUBLEPTS);
				setState(385);
				match(CORCHETEIZQ);
				setState(386);
				((DeclarevectorstmtContext)_localctx).type = type();
				setState(387);
				match(CORCHETEDER);
				setState(388);
				match(IG);
				setState(389);
				match(CORCHETEIZQ);
				setState(390);
				((DeclarevectorstmtContext)_localctx).listParams = listParams(0);
				setState(391);
				match(CORCHETEDER);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(392);
					match(PTCOMA);
					}
				}

				_localctx.decvec = instructions.NewToDeclareVector((((DeclarevectorstmtContext)_localctx).VAR!=null?((DeclarevectorstmtContext)_localctx).VAR.getLine():0), (((DeclarevectorstmtContext)_localctx).VAR!=null?((DeclarevectorstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarevectorstmtContext)_localctx).ID!=null?((DeclarevectorstmtContext)_localctx).ID.getText():null), ((DeclarevectorstmtContext)_localctx).type.t, ((DeclarevectorstmtContext)_localctx).listParams.l, "")
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				((DeclarevectorstmtContext)_localctx).VAR = match(VAR);
				setState(398);
				((DeclarevectorstmtContext)_localctx).ID = match(ID);
				setState(399);
				match(DOUBLEPTS);
				setState(400);
				match(CORCHETEIZQ);
				setState(401);
				((DeclarevectorstmtContext)_localctx).type = type();
				setState(402);
				match(CORCHETEDER);
				setState(403);
				match(IG);
				setState(404);
				match(CORCHETEIZQ);
				setState(405);
				match(CORCHETEDER);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(406);
					match(PTCOMA);
					}
				}

				_localctx.decvec = instructions.NewToDeclareVector((((DeclarevectorstmtContext)_localctx).VAR!=null?((DeclarevectorstmtContext)_localctx).VAR.getLine():0), (((DeclarevectorstmtContext)_localctx).VAR!=null?((DeclarevectorstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarevectorstmtContext)_localctx).ID!=null?((DeclarevectorstmtContext)_localctx).ID.getText():null), ((DeclarevectorstmtContext)_localctx).type.t, nil, "")
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				match(VAR);
				setState(412);
				match(ID);
				setState(413);
				match(IG);
				setState(414);
				match(CORCHETEIZQ);
				setState(415);
				type();
				setState(416);
				match(CORCHETEDER);
				setState(417);
				match(PARIZQ);
				setState(418);
				match(PARDER);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(419);
					match(PTCOMA);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(422);
				((DeclarevectorstmtContext)_localctx).VAR = match(VAR);
				setState(423);
				((DeclarevectorstmtContext)_localctx).F = match(ID);
				setState(424);
				match(DOUBLEPTS);
				setState(425);
				match(CORCHETEIZQ);
				setState(426);
				((DeclarevectorstmtContext)_localctx).type = type();
				setState(427);
				match(CORCHETEDER);
				setState(428);
				match(IG);
				setState(429);
				((DeclarevectorstmtContext)_localctx).S = match(ID);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(430);
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
			setState(437);
			((AccessfuncinstructionContext)_localctx).ID = match(ID);
			setState(438);
			match(PARIZQ);
			setState(439);
			((AccessfuncinstructionContext)_localctx).listParams = listParams(0);
			setState(440);
			match(PARDER);
			setState(441);
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
			setState(444);
			((AppendstmtContext)_localctx).ID = match(ID);
			setState(445);
			match(POINT);
			setState(446);
			match(APPEND);
			setState(447);
			match(PARIZQ);
			setState(448);
			((AppendstmtContext)_localctx).expr = expr(0);
			setState(449);
			match(PARDER);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTCOMA) {
				{
				setState(450);
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
			setState(455);
			((RemovelaststmtContext)_localctx).ID = match(ID);
			setState(456);
			match(POINT);
			setState(457);
			match(REMOVELAST);
			setState(458);
			match(PARIZQ);
			setState(459);
			match(PARDER);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTCOMA) {
				{
				setState(460);
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
			setState(465);
			((RemovestmtContext)_localctx).ID = match(ID);
			setState(466);
			match(POINT);
			setState(467);
			match(REMOVE);
			setState(468);
			match(PARIZQ);
			setState(469);
			match(AT);
			setState(470);
			match(DOUBLEPTS);
			setState(471);
			((RemovestmtContext)_localctx).expr = expr(0);
			setState(472);
			match(PARDER);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTCOMA) {
				{
				setState(473);
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
			setState(478);
			((EmptvecstmtContext)_localctx).ID = match(ID);
			setState(479);
			match(POINT);
			setState(480);
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
			setState(483);
			((CountvecstmtContext)_localctx).ID = match(ID);
			setState(484);
			match(POINT);
			setState(485);
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

	public static class AccessvecstmtContext extends ParserRuleContext {
		public interfaces.Expression accessvec;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode CORCHETEIZQ() { return getToken(GrammarParser.CORCHETEIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CORCHETEDER() { return getToken(GrammarParser.CORCHETEDER, 0); }
		public AccessvecstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessvecstmt; }
	}

	public final AccessvecstmtContext accessvecstmt() throws RecognitionException {
		AccessvecstmtContext _localctx = new AccessvecstmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_accessvecstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			((AccessvecstmtContext)_localctx).ID = match(ID);
			setState(489);
			match(CORCHETEIZQ);
			setState(490);
			((AccessvecstmtContext)_localctx).expr = expr(0);
			setState(491);
			match(CORCHETEDER);
			_localctx.accessvec = expressions.NewAccessVector((((AccessvecstmtContext)_localctx).ID!=null?((AccessvecstmtContext)_localctx).ID.getLine():0), (((AccessvecstmtContext)_localctx).ID!=null?((AccessvecstmtContext)_localctx).ID.getCharPositionInLine():0), (((AccessvecstmtContext)_localctx).ID!=null?((AccessvecstmtContext)_localctx).ID.getText():null), ((AccessvecstmtContext)_localctx).expr.e)
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

	public static class AssignationvecstmtContext extends ParserRuleContext {
		public interfaces.Instruction assignvec;
		public Token ID;
		public ExprContext expprim;
		public ExprContext expsegundo;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode CORCHETEIZQ() { return getToken(GrammarParser.CORCHETEIZQ, 0); }
		public TerminalNode CORCHETEDER() { return getToken(GrammarParser.CORCHETEDER, 0); }
		public TerminalNode IG() { return getToken(GrammarParser.IG, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PTCOMA() { return getToken(GrammarParser.PTCOMA, 0); }
		public AssignationvecstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignationvecstmt; }
	}

	public final AssignationvecstmtContext assignationvecstmt() throws RecognitionException {
		AssignationvecstmtContext _localctx = new AssignationvecstmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignationvecstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			((AssignationvecstmtContext)_localctx).ID = match(ID);
			setState(495);
			match(CORCHETEIZQ);
			setState(496);
			((AssignationvecstmtContext)_localctx).expprim = expr(0);
			setState(497);
			match(CORCHETEDER);
			setState(498);
			match(IG);
			setState(499);
			((AssignationvecstmtContext)_localctx).expsegundo = expr(0);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTCOMA) {
				{
				setState(500);
				match(PTCOMA);
				}
			}

			_localctx.assignvec = instructions.NewAssignationVector((((AssignationvecstmtContext)_localctx).ID!=null?((AssignationvecstmtContext)_localctx).ID.getLine():0), (((AssignationvecstmtContext)_localctx).ID!=null?((AssignationvecstmtContext)_localctx).ID.getCharPositionInLine():0), (((AssignationvecstmtContext)_localctx).ID!=null?((AssignationvecstmtContext)_localctx).ID.getText():null), ((AssignationvecstmtContext)_localctx).expprim.e, ((AssignationvecstmtContext)_localctx).expsegundo.e)
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
			setState(505);
			match(VAR);
			setState(506);
			match(ID);
			setState(507);
			match(PARIZQ);
			setState(508);
			match(DOUBLEPTS);
			setState(509);
			type();
			setState(510);
			match(PARDER);
			setState(511);
			match(IG);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTCOMA) {
				{
				setState(512);
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
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(FUNC);
				setState(516);
				((DeclarefuncstmtContext)_localctx).ID = match(ID);
				setState(517);
				match(PARIZQ);
				setState(518);
				((DeclarefuncstmtContext)_localctx).listParamsFunc = listParamsFunc(0);
				setState(519);
				match(PARDER);
				setState(520);
				match(SUB);
				setState(521);
				match(MAYOR);
				setState(522);
				((DeclarefuncstmtContext)_localctx).type = type();
				setState(523);
				match(LLAVEIZQ);
				setState(524);
				((DeclarefuncstmtContext)_localctx).block = block();
				setState(525);
				match(LLAVEDER);
				_localctx.decfunc = instructions.NewToDeclareFunction((((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getLine():0), (((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getCharPositionInLine():0), (((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getText():null), ((DeclarefuncstmtContext)_localctx).listParamsFunc.lf, ((DeclarefuncstmtContext)_localctx).type.t, ((DeclarefuncstmtContext)_localctx).block.blk, 1)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				match(FUNC);
				setState(529);
				((DeclarefuncstmtContext)_localctx).ID = match(ID);
				setState(530);
				match(PARIZQ);
				setState(531);
				((DeclarefuncstmtContext)_localctx).listParamsFunc = listParamsFunc(0);
				setState(532);
				match(PARDER);
				setState(533);
				match(LLAVEIZQ);
				setState(534);
				((DeclarefuncstmtContext)_localctx).block = block();
				setState(535);
				match(LLAVEDER);

				    
				    ((DeclarefuncstmtContext)_localctx).decfunc =  instructions.NewToDeclareFunction((((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getLine():0), (((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getCharPositionInLine():0), (((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getText():null), ((DeclarefuncstmtContext)_localctx).listParamsFunc.lf, environment.NULL, ((DeclarefuncstmtContext)_localctx).block.blk, 2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
				match(FUNC);
				setState(539);
				((DeclarefuncstmtContext)_localctx).ID = match(ID);
				setState(540);
				match(PARIZQ);
				setState(541);
				match(PARDER);
				setState(542);
				match(SUB);
				setState(543);
				match(MAYOR);
				setState(544);
				((DeclarefuncstmtContext)_localctx).type = type();
				setState(545);
				match(LLAVEIZQ);
				setState(546);
				((DeclarefuncstmtContext)_localctx).block = block();
				setState(547);
				match(LLAVEDER);
				_localctx.decfunc = instructions.NewToDeclareFunction((((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getLine():0), (((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getCharPositionInLine():0), (((DeclarefuncstmtContext)_localctx).ID!=null?((DeclarefuncstmtContext)_localctx).ID.getText():null), nil, ((DeclarefuncstmtContext)_localctx).type.t, ((DeclarefuncstmtContext)_localctx).block.blk, 3)
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(550);
				match(FUNC);
				setState(551);
				((DeclarefuncstmtContext)_localctx).ID = match(ID);
				setState(552);
				match(PARIZQ);
				setState(553);
				match(PARDER);
				setState(554);
				match(LLAVEIZQ);
				setState(555);
				((DeclarefuncstmtContext)_localctx).block = block();
				setState(556);
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
			setState(562);
			((ListParamsFuncContext)_localctx).parameterfuncstmt = parameterfuncstmt();

			    
			            _localctx.lf = []interface{}{}
			            _localctx.lf = append(_localctx.lf, ((ListParamsFuncContext)_localctx).parameterfuncstmt.parameterfunc)
			        
			}
			_ctx.stop = _input.LT(-1);
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsFuncContext(_parentctx, _parentState);
					_localctx.listf = _prevctx;
					_localctx.listf = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParamsFunc);
					setState(565);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(566);
					match(COMA);
					setState(567);
					((ListParamsFuncContext)_localctx).parameterfuncstmt = parameterfuncstmt();

					                              
					                                          var arrf []interface{}
					                                          arrf = append(((ListParamsFuncContext)_localctx).listf.lf, ((ListParamsFuncContext)_localctx).parameterfuncstmt.parameterfunc)
					                                          _localctx.lf = arrf
					                                      
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		public TerminalNode CORCHETEIZQ() { return getToken(GrammarParser.CORCHETEIZQ, 0); }
		public TerminalNode CORCHETEDER() { return getToken(GrammarParser.CORCHETEDER, 0); }
		public TerminalNode INOUT() { return getToken(GrammarParser.INOUT, 0); }
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
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
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
				setState(576);
				((ParameterfuncstmtContext)_localctx).ID = match(ID);
				setState(577);
				match(DOUBLEPTS);
				setState(578);
				((ParameterfuncstmtContext)_localctx).type = type();
				_localctx.parameterfunc = expressions.NewParameters((((ParameterfuncstmtContext)_localctx).exte!=null?((ParameterfuncstmtContext)_localctx).exte.getLine():0), (((ParameterfuncstmtContext)_localctx).exte!=null?((ParameterfuncstmtContext)_localctx).exte.getCharPositionInLine():0), ((ParameterfuncstmtContext)_localctx).type.t, (((ParameterfuncstmtContext)_localctx).exte!=null?((ParameterfuncstmtContext)_localctx).exte.getText():null),  (((ParameterfuncstmtContext)_localctx).ID!=null?((ParameterfuncstmtContext)_localctx).ID.getText():null), 1)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(584);
					match(INOUT);
					}
				}

				setState(587);
				match(CORCHETEIZQ);
				setState(588);
				((ParameterfuncstmtContext)_localctx).type = type();
				setState(589);
				match(CORCHETEDER);
				((ParameterfuncstmtContext)_localctx).parameterfunc =  expressions.NewParameters((((ParameterfuncstmtContext)_localctx).exte!=null?((ParameterfuncstmtContext)_localctx).exte.getLine():0), (((ParameterfuncstmtContext)_localctx).exte!=null?((ParameterfuncstmtContext)_localctx).exte.getCharPositionInLine():0), ((ParameterfuncstmtContext)_localctx).type.t, (((ParameterfuncstmtContext)_localctx).exte!=null?((ParameterfuncstmtContext)_localctx).exte.getText():null),  (((ParameterfuncstmtContext)_localctx).ID!=null?((ParameterfuncstmtContext)_localctx).ID.getText():null),2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(592);
				((ParameterfuncstmtContext)_localctx).ID = match(ID);
				setState(593);
				match(DOUBLEPTS);
				setState(594);
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
			setState(599);
			((DeclarestructstmtContext)_localctx).STRUCT = match(STRUCT);
			setState(600);
			((DeclarestructstmtContext)_localctx).ID = match(ID);
			setState(601);
			match(LLAVEIZQ);
			setState(602);
			((DeclarestructstmtContext)_localctx).listStruct = listStruct(0);
			setState(603);
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
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(607);
				match(VAR);
				setState(608);
				((ListStructContext)_localctx).ID = match(ID);
				setState(609);
				match(DOUBLEPTS);
				setState(610);
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
			setState(625);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListStructContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listStruct);
					setState(616);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
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
					                                      arr = append(((ListStructContext)_localctx).list.l, newParams)
					                                      _localctx.l = arr

					          
					}
					} 
				}
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		public AccessvecstmtContext accessvecstmt;
		public IntfunctionstmtContext intfunctionstmt;
		public FloatfunctionstmtContext floatfunctionstmt;
		public StringfunctionstmtContext stringfunctionstmt;
		public AccessfuncstmtContext accessfuncstmt;
		public Token ID;
		public ListStructExpContext listStructExp;
		public AccessstructstmtContext accessstructstmt;
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
		public AccessvecstmtContext accessvecstmt() {
			return getRuleContext(AccessvecstmtContext.class,0);
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
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(629);
				((ExprContext)_localctx).op = match(NOT);
				setState(630);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(18);
				 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).left.e) 
				}
				break;
			case 2:
				{
				setState(633);
				((ExprContext)_localctx).op = match(SUB);
				setState(634);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(17);
				 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e,  (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), nil)
				}
				break;
			case 3:
				{
				setState(637);
				match(PARIZQ);
				setState(638);
				((ExprContext)_localctx).expr = expr(0);
				setState(639);
				match(PARDER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case 4:
				{
				setState(642);
				((ExprContext)_localctx).NUMBER = match(NUMBER);

				        if (strings.Contains((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null),".")){
				            num,err := strconv.ParseFloat((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null), 64);
				            if err!= nil{
				                fmt.Println(err)
				            }
				            _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getLine():0),(((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getCharPositionInLine():0),num,environment.FLOAT)
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
				setState(644);
				((ExprContext)_localctx).STRING = match(STRING);

				        str := (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getLine():0), (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case 6:
				{
				setState(646);
				((ExprContext)_localctx).TRUE = match(TRUE);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).TRUE!=null?((ExprContext)_localctx).TRUE.getLine():0), (((ExprContext)_localctx).TRUE!=null?((ExprContext)_localctx).TRUE.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case 7:
				{
				setState(648);
				((ExprContext)_localctx).FALSE = match(FALSE);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).FALSE!=null?((ExprContext)_localctx).FALSE.getLine():0), (((ExprContext)_localctx).FALSE!=null?((ExprContext)_localctx).FALSE.getCharPositionInLine():0), false, environment.BOOLEAN) 
				}
				break;
			case 8:
				{
				setState(650);
				((ExprContext)_localctx).NIL = match(NIL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NIL!=null?((ExprContext)_localctx).NIL.getLine():0), (((ExprContext)_localctx).NIL!=null?((ExprContext)_localctx).NIL.getCharPositionInLine():0), nil, environment.NULL) 
				}
				break;
			case 9:
				{
				setState(652);
				((ExprContext)_localctx).accessstmt = accessstmt();
				_localctx.e = ((ExprContext)_localctx).accessstmt.access
				}
				break;
			case 10:
				{
				setState(655);
				((ExprContext)_localctx).emptvecstmt = emptvecstmt();
				_localctx.e = ((ExprContext)_localctx).emptvecstmt.emptyvec
				}
				break;
			case 11:
				{
				setState(658);
				((ExprContext)_localctx).countvecstmt = countvecstmt();
				_localctx.e = ((ExprContext)_localctx).countvecstmt.count
				}
				break;
			case 12:
				{
				setState(661);
				((ExprContext)_localctx).accessvecstmt = accessvecstmt();
				_localctx.e = ((ExprContext)_localctx).accessvecstmt.accessvec
				}
				break;
			case 13:
				{
				setState(664);
				((ExprContext)_localctx).intfunctionstmt = intfunctionstmt();
				_localctx.e = ((ExprContext)_localctx).intfunctionstmt.intfunc
				}
				break;
			case 14:
				{
				setState(667);
				((ExprContext)_localctx).floatfunctionstmt = floatfunctionstmt();
				_localctx.e = ((ExprContext)_localctx).floatfunctionstmt.floatfunc
				}
				break;
			case 15:
				{
				setState(670);
				((ExprContext)_localctx).stringfunctionstmt = stringfunctionstmt();
				_localctx.e = ((ExprContext)_localctx).stringfunctionstmt.stringfunc
				}
				break;
			case 16:
				{
				setState(673);
				((ExprContext)_localctx).accessfuncstmt = accessfuncstmt();
				_localctx.e = ((ExprContext)_localctx).accessfuncstmt.funcexp
				}
				break;
			case 17:
				{
				setState(676);
				((ExprContext)_localctx).ID = match(ID);
				setState(677);
				_la = _input.LA(1);
				if ( !(_la==PARIZQ || _la==LLAVEIZQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(678);
				((ExprContext)_localctx).listStructExp = listStructExp(0);
				setState(679);
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
			case 18:
				{
				setState(682);
				((ExprContext)_localctx).accessstructstmt = accessstructstmt();
				_localctx.e = ((ExprContext)_localctx).accessstructstmt.accessstruct
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(724);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(722);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(687);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(688);
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
						setState(689);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(26);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(692);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(693);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << PERCENT))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(694);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(25);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(697);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(698);
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
						setState(699);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(24);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(702);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(703);
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
						setState(704);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(23);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(707);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(708);
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
						setState(709);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(22);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(712);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(713);
						((ExprContext)_localctx).op = match(AND);
						setState(714);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(21);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(717);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(718);
						((ExprContext)_localctx).op = match(OR);
						setState(719);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(20);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(726);
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
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
				((AccessstructstmtContext)_localctx).list = match(ID);
				setState(728);
				match(POINT);
				setState(729);
				((AccessstructstmtContext)_localctx).ID = match(ID);
				 _localctx.accessstruct = expressions.NewAccessStruct((((AccessstructstmtContext)_localctx).list!=null?((AccessstructstmtContext)_localctx).list.getLine():0), (((AccessstructstmtContext)_localctx).list!=null?((AccessstructstmtContext)_localctx).list.getCharPositionInLine():0), (((AccessstructstmtContext)_localctx).list!=null?((AccessstructstmtContext)_localctx).list.getText():null), (((AccessstructstmtContext)_localctx).ID!=null?((AccessstructstmtContext)_localctx).ID.getText():null), "nil")  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				((AccessstructstmtContext)_localctx).list = match(ID);
				setState(732);
				match(POINT);
				setState(733);
				((AccessstructstmtContext)_localctx).ID = match(ID);
				setState(734);
				match(POINT);
				setState(735);
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
			setState(748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				((AccessfuncstmtContext)_localctx).ID = match(ID);
				setState(740);
				match(PARIZQ);
				setState(741);
				((AccessfuncstmtContext)_localctx).listParams = listParams(0);
				setState(742);
				match(PARDER);
				_localctx.funcexp = expressions.NewAccessFunction((((AccessfuncstmtContext)_localctx).ID!=null?((AccessfuncstmtContext)_localctx).ID.getLine():0), (((AccessfuncstmtContext)_localctx).ID!=null?((AccessfuncstmtContext)_localctx).ID.getCharPositionInLine():0), (((AccessfuncstmtContext)_localctx).ID!=null?((AccessfuncstmtContext)_localctx).ID.getText():null), ((AccessfuncstmtContext)_localctx).listParams.l, 1)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				match(ID);
				setState(746);
				match(PARIZQ);
				setState(747);
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
			setState(750);
			((IntfunctionstmtContext)_localctx).INTS = match(INTS);
			setState(751);
			match(PARIZQ);
			setState(752);
			((IntfunctionstmtContext)_localctx).expr = expr(0);
			setState(753);
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
			setState(756);
			((FloatfunctionstmtContext)_localctx).FLOATS = match(FLOATS);
			setState(757);
			match(PARIZQ);
			setState(758);
			((FloatfunctionstmtContext)_localctx).expr = expr(0);
			setState(759);
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
			setState(762);
			((StringfunctionstmtContext)_localctx).STRINGS = match(STRINGS);
			setState(763);
			match(PARIZQ);
			setState(764);
			((StringfunctionstmtContext)_localctx).expr = expr(0);
			setState(765);
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
			setState(768);
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
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				((IncreaseanddecreasestmtContext)_localctx).ID = match(ID);
				setState(772);
				((IncreaseanddecreasestmtContext)_localctx).IG_ADD = match(IG_ADD);
				setState(773);
				((IncreaseanddecreasestmtContext)_localctx).expr = expr(0);
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(774);
					match(PTCOMA);
					}
				}

				_localctx.increasedecrease = instructions.NewIncreaseDecrease((((IncreaseanddecreasestmtContext)_localctx).ID!=null?((IncreaseanddecreasestmtContext)_localctx).ID.getLine():0), (((IncreaseanddecreasestmtContext)_localctx).ID!=null?((IncreaseanddecreasestmtContext)_localctx).ID.getCharPositionInLine():0), (((IncreaseanddecreasestmtContext)_localctx).ID!=null?((IncreaseanddecreasestmtContext)_localctx).ID.getText():null), (((IncreaseanddecreasestmtContext)_localctx).IG_ADD!=null?((IncreaseanddecreasestmtContext)_localctx).IG_ADD.getText():null), ((IncreaseanddecreasestmtContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				((IncreaseanddecreasestmtContext)_localctx).ID = match(ID);
				setState(780);
				((IncreaseanddecreasestmtContext)_localctx).IG_SUB = match(IG_SUB);
				setState(781);
				((IncreaseanddecreasestmtContext)_localctx).expr = expr(0);
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PTCOMA) {
					{
					setState(782);
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
			setState(801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGS:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				match(STRINGS);
				_localctx.t = environment.STRING
				}
				break;
			case INTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
				match(INTS);
				_localctx.t = environment.INTEGER
				}
				break;
			case FLOATS:
				enterOuterAlt(_localctx, 3);
				{
				setState(793);
				match(FLOATS);
				_localctx.t = environment.FLOAT
				}
				break;
			case BOOLS:
				enterOuterAlt(_localctx, 4);
				{
				setState(795);
				match(BOOLS);
				_localctx.t = environment.BOOLEAN 
				}
				break;
			case CHARACTERS:
				enterOuterAlt(_localctx, 5);
				{
				setState(797);
				match(CHARACTERS);
				_localctx.t = environment.CHARACTER
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(799);
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
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(804);
				match(AND_SIMPLE);
				}
				break;
			case 2:
				{
				setState(805);
				match(ID);
				setState(806);
				match(DOUBLEPTS);
				}
				break;
			}
			setState(809);
			((ListParamsContext)_localctx).expr = expr(0);

			            _localctx.l = []interface{}{}
			            _localctx.l = append(_localctx.l, ((ListParamsContext)_localctx).expr.e)
			        
			}
			_ctx.stop = _input.LT(-1);
			setState(824);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParams);
					setState(812);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(813);
					match(COMA);
					setState(817);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(814);
						match(AND_SIMPLE);
						}
						break;
					case 2:
						{
						setState(815);
						match(ID);
						setState(816);
						match(DOUBLEPTS);
						}
						break;
					}
					setState(819);
					((ListParamsContext)_localctx).expr = expr(0);

					                                          var arr []interface{}
					                                          arr = append(((ListParamsContext)_localctx).list.l, ((ListParamsContext)_localctx).expr.e)
					                                          _localctx.l = arr
					                                      
					}
					} 
				}
				setState(826);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(828);
				((ListStructExpContext)_localctx).ID = match(ID);
				setState(829);
				match(DOUBLEPTS);
				setState(830);
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
			setState(847);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListStructExpContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listStructExp);
					setState(836);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(838);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMA) {
						{
						setState(837);
						match(COMA);
						}
					}

					setState(840);
					((ListStructExpContext)_localctx).ID = match(ID);
					setState(841);
					match(DOUBLEPTS);
					setState(842);
					((ListStructExpContext)_localctx).expr = expr(0);

					                                                      var arr []interface{}
					                                                      StrExp := environment.NewStructContent((((ListStructExpContext)_localctx).ID!=null?((ListStructExpContext)_localctx).ID.getText():null), ((ListStructExpContext)_localctx).expr.e)
					                                                      arr = append(((ListStructExpContext)_localctx).list.l, StrExp)
					                                                      _localctx.l = arr
					                                                  
					}
					} 
				}
				setState(849);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
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
	private boolean listParamsFunc_sempred(ListParamsFuncContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listStruct_sempred(ListStructContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 25);
		case 3:
			return precpred(_ctx, 24);
		case 4:
			return precpred(_ctx, 23);
		case 5:
			return precpred(_ctx, 22);
		case 6:
			return precpred(_ctx, 21);
		case 7:
			return precpred(_ctx, 20);
		case 8:
			return precpred(_ctx, 19);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listStructExp_sempred(ListStructExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u0355\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\3\6\3^\n\3\r\3\16\3_\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4\u00a0\n\4\3\5\3\5\3\5\3\5\3\5\5\5\u00a7\n\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b2\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u00bb\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c5\n\6\3\6\3\6\5\6"+
		"\u00c9\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d2\n\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00db\n\7\3\7\3\7\5\7\u00df\n\7\3\b\6\b\u00e2\n\b\r\b\16"+
		"\b\u00e3\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0103\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0115"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u0127\n\13\3\f\6\f\u012a\n\f\r\f\16\f\u012b\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\5\r\u0134\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u013e\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u015e\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\5\22\u016b\n\22\3\22\3\22\3\22\3\22\5\22\u0171"+
		"\n\22\3\22\3\22\3\22\3\22\5\22\u0177\n\22\3\22\3\22\3\22\5\22\u017c\n"+
		"\22\3\22\5\22\u017f\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u018c\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u019a\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u01a7\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u01b2\n\23\3\23\3\23\5\23\u01b6\n\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01c6\n\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01d0\n\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01dd\n\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01f8\n\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0204\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0232\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u023d\n\36\f\36\16"+
		"\36\u0240\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u024c\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0258"+
		"\n\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u0269\n!\3!\3!\3"+
		"!\3!\3!\3!\3!\7!\u0272\n!\f!\16!\u0275\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u02b0"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\7\"\u02d5\n\"\f\"\16\"\u02d8\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5"+
		"#\u02e4\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u02ef\n$\3%\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\5)\u030a"+
		"\n)\3)\3)\3)\3)\3)\3)\5)\u0312\n)\3)\3)\5)\u0316\n)\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\5*\u0324\n*\3+\3+\3+\3+\5+\u032a\n+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\5+\u0334\n+\3+\3+\3+\7+\u0339\n+\f+\16+\u033c\13+\3,\3,\3,\3"+
		",\3,\3,\3,\5,\u0345\n,\3,\3,\5,\u0349\n,\3,\3,\3,\3,\3,\7,\u0350\n,\f"+
		",\16,\u0353\13,\3,\2\7:@BTV-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\13\3\2\27\31\4\2%%BB\4\2\67\6799"+
		"\4\288::\3\2\62\63\3\2\64\66\4\2..\60\60\4\2//\61\61\3\2&\'\2\u0395\2"+
		"X\3\2\2\2\4]\3\2\2\2\6\u009f\3\2\2\2\b\u00a1\3\2\2\2\n\u00c8\3\2\2\2\f"+
		"\u00de\3\2\2\2\16\u00e1\3\2\2\2\20\u0102\3\2\2\2\22\u0114\3\2\2\2\24\u0126"+
		"\3\2\2\2\26\u0129\3\2\2\2\30\u012f\3\2\2\2\32\u0137\3\2\2\2\34\u0141\3"+
		"\2\2\2\36\u015d\3\2\2\2 \u015f\3\2\2\2\"\u017e\3\2\2\2$\u01b5\3\2\2\2"+
		"&\u01b7\3\2\2\2(\u01be\3\2\2\2*\u01c9\3\2\2\2,\u01d3\3\2\2\2.\u01e0\3"+
		"\2\2\2\60\u01e5\3\2\2\2\62\u01ea\3\2\2\2\64\u01f0\3\2\2\2\66\u01fb\3\2"+
		"\2\28\u0231\3\2\2\2:\u0233\3\2\2\2<\u0257\3\2\2\2>\u0259\3\2\2\2@\u0268"+
		"\3\2\2\2B\u02af\3\2\2\2D\u02e3\3\2\2\2F\u02ee\3\2\2\2H\u02f0\3\2\2\2J"+
		"\u02f6\3\2\2\2L\u02fc\3\2\2\2N\u0302\3\2\2\2P\u0315\3\2\2\2R\u0323\3\2"+
		"\2\2T\u0325\3\2\2\2V\u0344\3\2\2\2XY\5\4\3\2YZ\7\2\2\3Z[\b\2\1\2[\3\3"+
		"\2\2\2\\^\5\6\4\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2a"+
		"b\b\3\1\2b\5\3\2\2\2cd\5\b\5\2de\b\4\1\2e\u00a0\3\2\2\2fg\5\n\6\2gh\b"+
		"\4\1\2h\u00a0\3\2\2\2ij\5\f\7\2jk\b\4\1\2k\u00a0\3\2\2\2lm\5\30\r\2mn"+
		"\b\4\1\2n\u00a0\3\2\2\2op\5P)\2pq\b\4\1\2q\u00a0\3\2\2\2rs\5\20\t\2st"+
		"\b\4\1\2t\u00a0\3\2\2\2uv\5\34\17\2vw\b\4\1\2w\u00a0\3\2\2\2xy\5\36\20"+
		"\2yz\b\4\1\2z\u00a0\3\2\2\2{|\5\22\n\2|}\b\4\1\2}\u00a0\3\2\2\2~\177\5"+
		" \21\2\177\u0080\b\4\1\2\u0080\u00a0\3\2\2\2\u0081\u0082\5\"\22\2\u0082"+
		"\u0083\b\4\1\2\u0083\u00a0\3\2\2\2\u0084\u0085\5$\23\2\u0085\u0086\b\4"+
		"\1\2\u0086\u00a0\3\2\2\2\u0087\u0088\5(\25\2\u0088\u0089\b\4\1\2\u0089"+
		"\u00a0\3\2\2\2\u008a\u008b\5*\26\2\u008b\u008c\b\4\1\2\u008c\u00a0\3\2"+
		"\2\2\u008d\u008e\5,\27\2\u008e\u008f\b\4\1\2\u008f\u00a0\3\2\2\2\u0090"+
		"\u0091\5\64\33\2\u0091\u0092\b\4\1\2\u0092\u00a0\3\2\2\2\u0093\u0094\5"+
		"8\35\2\u0094\u0095\b\4\1\2\u0095\u00a0\3\2\2\2\u0096\u0097\5&\24\2\u0097"+
		"\u0098\b\4\1\2\u0098\u00a0\3\2\2\2\u0099\u009a\5> \2\u009a\u009b\b\4\1"+
		"\2\u009b\u00a0\3\2\2\2\u009c\u009d\5\32\16\2\u009d\u009e\b\4\1\2\u009e"+
		"\u00a0\3\2\2\2\u009fc\3\2\2\2\u009ff\3\2\2\2\u009fi\3\2\2\2\u009fl\3\2"+
		"\2\2\u009fo\3\2\2\2\u009fr\3\2\2\2\u009fu\3\2\2\2\u009fx\3\2\2\2\u009f"+
		"{\3\2\2\2\u009f~\3\2\2\2\u009f\u0081\3\2\2\2\u009f\u0084\3\2\2\2\u009f"+
		"\u0087\3\2\2\2\u009f\u008a\3\2\2\2\u009f\u008d\3\2\2\2\u009f\u0090\3\2"+
		"\2\2\u009f\u0093\3\2\2\2\u009f\u0096\3\2\2\2\u009f\u0099\3\2\2\2\u009f"+
		"\u009c\3\2\2\2\u00a0\7\3\2\2\2\u00a1\u00a2\7\f\2\2\u00a2\u00a3\7\67\2"+
		"\2\u00a3\u00a4\5T+\2\u00a4\u00a6\78\2\2\u00a5\u00a7\7?\2\2\u00a6\u00a5"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\5\1\2\u00a9"+
		"\t\3\2\2\2\u00aa\u00ab\7\b\2\2\u00ab\u00ac\7%\2\2\u00ac\u00ad\7;\2\2\u00ad"+
		"\u00ae\5R*\2\u00ae\u00af\7+\2\2\u00af\u00b1\5B\"\2\u00b0\u00b2\7?\2\2"+
		"\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4"+
		"\b\6\1\2\u00b4\u00c9\3\2\2\2\u00b5\u00b6\7\b\2\2\u00b6\u00b7\7%\2\2\u00b7"+
		"\u00b8\7+\2\2\u00b8\u00ba\5B\"\2\u00b9\u00bb\7?\2\2\u00ba\u00b9\3\2\2"+
		"\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\6\1\2\u00bd\u00c9"+
		"\3\2\2\2\u00be\u00bf\7\b\2\2\u00bf\u00c0\7%\2\2\u00c0\u00c1\7;\2\2\u00c1"+
		"\u00c2\5R*\2\u00c2\u00c4\7<\2\2\u00c3\u00c5\7?\2\2\u00c4\u00c3\3\2\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\6\1\2\u00c7\u00c9"+
		"\3\2\2\2\u00c8\u00aa\3\2\2\2\u00c8\u00b5\3\2\2\2\u00c8\u00be\3\2\2\2\u00c9"+
		"\13\3\2\2\2\u00ca\u00cb\7\20\2\2\u00cb\u00cc\7%\2\2\u00cc\u00cd\7;\2\2"+
		"\u00cd\u00ce\5R*\2\u00ce\u00cf\7+\2\2\u00cf\u00d1\5B\"\2\u00d0\u00d2\7"+
		"?\2\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\b\7\1\2\u00d4\u00df\3\2\2\2\u00d5\u00d6\7\20\2\2\u00d6\u00d7\7"+
		"%\2\2\u00d7\u00d8\7+\2\2\u00d8\u00da\5B\"\2\u00d9\u00db\7?\2\2\u00da\u00d9"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\7\1\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00ca\3\2\2\2\u00de\u00d5\3\2\2\2\u00df\r\3\2\2\2"+
		"\u00e0\u00e2\5\20\t\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b\b\1\2\u00e6"+
		"\17\3\2\2\2\u00e7\u00e8\7\r\2\2\u00e8\u00e9\5B\"\2\u00e9\u00ea\79\2\2"+
		"\u00ea\u00eb\5\4\3\2\u00eb\u00ec\7:\2\2\u00ec\u00ed\b\t\1\2\u00ed\u0103"+
		"\3\2\2\2\u00ee\u00ef\7\r\2\2\u00ef\u00f0\5B\"\2\u00f0\u00f1\79\2\2\u00f1"+
		"\u00f2\5\4\3\2\u00f2\u00f3\7:\2\2\u00f3\u00f4\7\16\2\2\u00f4\u00f5\79"+
		"\2\2\u00f5\u00f6\5\4\3\2\u00f6\u00f7\7:\2\2\u00f7\u00f8\b\t\1\2\u00f8"+
		"\u0103\3\2\2\2\u00f9\u00fa\7\r\2\2\u00fa\u00fb\5B\"\2\u00fb\u00fc\79\2"+
		"\2\u00fc\u00fd\5\4\3\2\u00fd\u00fe\7:\2\2\u00fe\u00ff\7\16\2\2\u00ff\u0100"+
		"\5\16\b\2\u0100\u0101\b\t\1\2\u0101\u0103\3\2\2\2\u0102\u00e7\3\2\2\2"+
		"\u0102\u00ee\3\2\2\2\u0102\u00f9\3\2\2\2\u0103\21\3\2\2\2\u0104\u0105"+
		"\7\23\2\2\u0105\u0106\5B\"\2\u0106\u0107\79\2\2\u0107\u0108\7\25\2\2\u0108"+
		"\u0109\7;\2\2\u0109\u010a\5\4\3\2\u010a\u010b\7:\2\2\u010b\u010c\b\n\1"+
		"\2\u010c\u0115\3\2\2\2\u010d\u010e\7\23\2\2\u010e\u010f\5B\"\2\u010f\u0110"+
		"\79\2\2\u0110\u0111\5\24\13\2\u0111\u0112\7:\2\2\u0112\u0113\b\n\1\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0104\3\2\2\2\u0114\u010d\3\2\2\2\u0115\23\3\2\2"+
		"\2\u0116\u0117\7\24\2\2\u0117\u0118\5B\"\2\u0118\u0119\7;\2\2\u0119\u011a"+
		"\5\4\3\2\u011a\u011b\5\26\f\2\u011b\u011c\b\13\1\2\u011c\u0127\3\2\2\2"+
		"\u011d\u011e\7\24\2\2\u011e\u011f\5B\"\2\u011f\u0120\7;\2\2\u0120\u0121"+
		"\5\4\3\2\u0121\u0122\7\25\2\2\u0122\u0123\7;\2\2\u0123\u0124\5\4\3\2\u0124"+
		"\u0125\b\13\1\2\u0125\u0127\3\2\2\2\u0126\u0116\3\2\2\2\u0126\u011d\3"+
		"\2\2\2\u0127\25\3\2\2\2\u0128\u012a\5\24\13\2\u0129\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u012e\b\f\1\2\u012e\27\3\2\2\2\u012f\u0130\7%\2\2\u0130\u0131"+
		"\7+\2\2\u0131\u0133\5B\"\2\u0132\u0134\7?\2\2\u0133\u0132\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\b\r\1\2\u0136\31\3\2\2"+
		"\2\u0137\u0138\7%\2\2\u0138\u0139\7=\2\2\u0139\u013a\7%\2\2\u013a\u013b"+
		"\7+\2\2\u013b\u013d\5B\"\2\u013c\u013e\7?\2\2\u013d\u013c\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\b\16\1\2\u0140\33\3\2\2"+
		"\2\u0141\u0142\7\17\2\2\u0142\u0143\5B\"\2\u0143\u0144\79\2\2\u0144\u0145"+
		"\5\4\3\2\u0145\u0146\7:\2\2\u0146\u0147\b\17\1\2\u0147\35\3\2\2\2\u0148"+
		"\u0149\7\21\2\2\u0149\u014a\7%\2\2\u014a\u014b\7\22\2\2\u014b\u014c\5"+
		"B\"\2\u014c\u014d\79\2\2\u014d\u014e\5\4\3\2\u014e\u014f\7:\2\2\u014f"+
		"\u0150\b\20\1\2\u0150\u015e\3\2\2\2\u0151\u0152\7\21\2\2\u0152\u0153\7"+
		"%\2\2\u0153\u0154\7\22\2\2\u0154\u0155\5B\"\2\u0155\u0156\7=\2\2\u0156"+
		"\u0157\7=\2\2\u0157\u0158\5B\"\2\u0158\u0159\79\2\2\u0159\u015a\5\4\3"+
		"\2\u015a\u015b\7:\2\2\u015b\u015c\b\20\1\2\u015c\u015e\3\2\2\2\u015d\u0148"+
		"\3\2\2\2\u015d\u0151\3\2\2\2\u015e\37\3\2\2\2\u015f\u0160\7\26\2\2\u0160"+
		"\u0161\5B\"\2\u0161\u0162\7\16\2\2\u0162\u0163\79\2\2\u0163\u0164\5\4"+
		"\3\2\u0164\u0165\t\2\2\2\u0165\u0166\7:\2\2\u0166\u0167\b\21\1\2\u0167"+
		"!\3\2\2\2\u0168\u016a\7\30\2\2\u0169\u016b\7?\2\2\u016a\u0169\3\2\2\2"+
		"\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u017f\b\22\1\2\u016d\u016e"+
		"\7\30\2\2\u016e\u0170\5B\"\2\u016f\u0171\7?\2\2\u0170\u016f\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\b\22\1\2\u0173\u017f\3"+
		"\2\2\2\u0174\u0176\7\27\2\2\u0175\u0177\7?\2\2\u0176\u0175\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017f\b\22\1\2\u0179\u017b\7"+
		"\31\2\2\u017a\u017c\7?\2\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017f\b\22\1\2\u017e\u0168\3\2\2\2\u017e\u016d\3"+
		"\2\2\2\u017e\u0174\3\2\2\2\u017e\u0179\3\2\2\2\u017f#\3\2\2\2\u0180\u0181"+
		"\7\b\2\2\u0181\u0182\7%\2\2\u0182\u0183\7;\2\2\u0183\u0184\7@\2\2\u0184"+
		"\u0185\5R*\2\u0185\u0186\7A\2\2\u0186\u0187\7+\2\2\u0187\u0188\7@\2\2"+
		"\u0188\u0189\5T+\2\u0189\u018b\7A\2\2\u018a\u018c\7?\2\2\u018b\u018a\3"+
		"\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\b\23\1\2\u018e"+
		"\u01b6\3\2\2\2\u018f\u0190\7\b\2\2\u0190\u0191\7%\2\2\u0191\u0192\7;\2"+
		"\2\u0192\u0193\7@\2\2\u0193\u0194\5R*\2\u0194\u0195\7A\2\2\u0195\u0196"+
		"\7+\2\2\u0196\u0197\7@\2\2\u0197\u0199\7A\2\2\u0198\u019a\7?\2\2\u0199"+
		"\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\b\23"+
		"\1\2\u019c\u01b6\3\2\2\2\u019d\u019e\7\b\2\2\u019e\u019f\7%\2\2\u019f"+
		"\u01a0\7+\2\2\u01a0\u01a1\7@\2\2\u01a1\u01a2\5R*\2\u01a2\u01a3\7A\2\2"+
		"\u01a3\u01a4\7\67\2\2\u01a4\u01a6\78\2\2\u01a5\u01a7\7?\2\2\u01a6\u01a5"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01b6\3\2\2\2\u01a8\u01a9\7\b\2\2\u01a9"+
		"\u01aa\7%\2\2\u01aa\u01ab\7;\2\2\u01ab\u01ac\7@\2\2\u01ac\u01ad\5R*\2"+
		"\u01ad\u01ae\7A\2\2\u01ae\u01af\7+\2\2\u01af\u01b1\7%\2\2\u01b0\u01b2"+
		"\7?\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b4\b\23\1\2\u01b4\u01b6\3\2\2\2\u01b5\u0180\3\2\2\2\u01b5\u018f\3"+
		"\2\2\2\u01b5\u019d\3\2\2\2\u01b5\u01a8\3\2\2\2\u01b6%\3\2\2\2\u01b7\u01b8"+
		"\7%\2\2\u01b8\u01b9\7\67\2\2\u01b9\u01ba\5T+\2\u01ba\u01bb\78\2\2\u01bb"+
		"\u01bc\7?\2\2\u01bc\u01bd\b\24\1\2\u01bd\'\3\2\2\2\u01be\u01bf\7%\2\2"+
		"\u01bf\u01c0\7=\2\2\u01c0\u01c1\7\32\2\2\u01c1\u01c2\7\67\2\2\u01c2\u01c3"+
		"\5B\"\2\u01c3\u01c5\78\2\2\u01c4\u01c6\7?\2\2\u01c5\u01c4\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\b\25\1\2\u01c8)\3\2\2\2"+
		"\u01c9\u01ca\7%\2\2\u01ca\u01cb\7=\2\2\u01cb\u01cc\7\33\2\2\u01cc\u01cd"+
		"\7\67\2\2\u01cd\u01cf\78\2\2\u01ce\u01d0\7?\2\2\u01cf\u01ce\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\b\26\1\2\u01d2+\3\2\2\2"+
		"\u01d3\u01d4\7%\2\2\u01d4\u01d5\7=\2\2\u01d5\u01d6\7\34\2\2\u01d6\u01d7"+
		"\7\67\2\2\u01d7\u01d8\7\35\2\2\u01d8\u01d9\7;\2\2\u01d9\u01da\5B\"\2\u01da"+
		"\u01dc\78\2\2\u01db\u01dd\7?\2\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2"+
		"\2\u01dd\u01de\3\2\2\2\u01de\u01df\b\27\1\2\u01df-\3\2\2\2\u01e0\u01e1"+
		"\7%\2\2\u01e1\u01e2\7=\2\2\u01e2\u01e3\7\36\2\2\u01e3\u01e4\b\30\1\2\u01e4"+
		"/\3\2\2\2\u01e5\u01e6\7%\2\2\u01e6\u01e7\7=\2\2\u01e7\u01e8\7\37\2\2\u01e8"+
		"\u01e9\b\31\1\2\u01e9\61\3\2\2\2\u01ea\u01eb\7%\2\2\u01eb\u01ec\7@\2\2"+
		"\u01ec\u01ed\5B\"\2\u01ed\u01ee\7A\2\2\u01ee\u01ef\b\32\1\2\u01ef\63\3"+
		"\2\2\2\u01f0\u01f1\7%\2\2\u01f1\u01f2\7@\2\2\u01f2\u01f3\5B\"\2\u01f3"+
		"\u01f4\7A\2\2\u01f4\u01f5\7+\2\2\u01f5\u01f7\5B\"\2\u01f6\u01f8\7?\2\2"+
		"\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa"+
		"\b\33\1\2\u01fa\65\3\2\2\2\u01fb\u01fc\7\b\2\2\u01fc\u01fd\7%\2\2\u01fd"+
		"\u01fe\7\67\2\2\u01fe\u01ff\7;\2\2\u01ff\u0200\5R*\2\u0200\u0201\78\2"+
		"\2\u0201\u0203\7+\2\2\u0202\u0204\7?\2\2\u0203\u0202\3\2\2\2\u0203\u0204"+
		"\3\2\2\2\u0204\67\3\2\2\2\u0205\u0206\7 \2\2\u0206\u0207\7%\2\2\u0207"+
		"\u0208\7\67\2\2\u0208\u0209\5:\36\2\u0209\u020a\78\2\2\u020a\u020b\7\65"+
		"\2\2\u020b\u020c\7\60\2\2\u020c\u020d\5R*\2\u020d\u020e\79\2\2\u020e\u020f"+
		"\5\4\3\2\u020f\u0210\7:\2\2\u0210\u0211\b\35\1\2\u0211\u0232\3\2\2\2\u0212"+
		"\u0213\7 \2\2\u0213\u0214\7%\2\2\u0214\u0215\7\67\2\2\u0215\u0216\5:\36"+
		"\2\u0216\u0217\78\2\2\u0217\u0218\79\2\2\u0218\u0219\5\4\3\2\u0219\u021a"+
		"\7:\2\2\u021a\u021b\b\35\1\2\u021b\u0232\3\2\2\2\u021c\u021d\7 \2\2\u021d"+
		"\u021e\7%\2\2\u021e\u021f\7\67\2\2\u021f\u0220\78\2\2\u0220\u0221\7\65"+
		"\2\2\u0221\u0222\7\60\2\2\u0222\u0223\5R*\2\u0223\u0224\79\2\2\u0224\u0225"+
		"\5\4\3\2\u0225\u0226\7:\2\2\u0226\u0227\b\35\1\2\u0227\u0232\3\2\2\2\u0228"+
		"\u0229\7 \2\2\u0229\u022a\7%\2\2\u022a\u022b\7\67\2\2\u022b\u022c\78\2"+
		"\2\u022c\u022d\79\2\2\u022d\u022e\5\4\3\2\u022e\u022f\7:\2\2\u022f\u0230"+
		"\b\35\1\2\u0230\u0232\3\2\2\2\u0231\u0205\3\2\2\2\u0231\u0212\3\2\2\2"+
		"\u0231\u021c\3\2\2\2\u0231\u0228\3\2\2\2\u02329\3\2\2\2\u0233\u0234\b"+
		"\36\1\2\u0234\u0235\5<\37\2\u0235\u0236\b\36\1\2\u0236\u023e\3\2\2\2\u0237"+
		"\u0238\f\4\2\2\u0238\u0239\7>\2\2\u0239\u023a\5<\37\2\u023a\u023b\b\36"+
		"\1\2\u023b\u023d\3\2\2\2\u023c\u0237\3\2\2\2\u023d\u0240\3\2\2\2\u023e"+
		"\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f;\3\2\2\2\u0240\u023e\3\2\2\2"+
		"\u0241\u0242\t\3\2\2\u0242\u0243\7%\2\2\u0243\u0244\7;\2\2\u0244\u0245"+
		"\5R*\2\u0245\u0246\b\37\1\2\u0246\u0258\3\2\2\2\u0247\u0248\t\3\2\2\u0248"+
		"\u0249\7%\2\2\u0249\u024b\7;\2\2\u024a\u024c\7!\2\2\u024b\u024a\3\2\2"+
		"\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\7@\2\2\u024e\u024f"+
		"\5R*\2\u024f\u0250\7A\2\2\u0250\u0251\b\37\1\2\u0251\u0258\3\2\2\2\u0252"+
		"\u0253\7%\2\2\u0253\u0254\7;\2\2\u0254\u0255\5R*\2\u0255\u0256\b\37\1"+
		"\2\u0256\u0258\3\2\2\2\u0257\u0241\3\2\2\2\u0257\u0247\3\2\2\2\u0257\u0252"+
		"\3\2\2\2\u0258=\3\2\2\2\u0259\u025a\7\"\2\2\u025a\u025b\7%\2\2\u025b\u025c"+
		"\79\2\2\u025c\u025d\5@!\2\u025d\u025e\7:\2\2\u025e\u025f\b \1\2\u025f"+
		"?\3\2\2\2\u0260\u0261\b!\1\2\u0261\u0262\7\b\2\2\u0262\u0263\7%\2\2\u0263"+
		"\u0264\7;\2\2\u0264\u0265\5R*\2\u0265\u0266\b!\1\2\u0266\u0269\3\2\2\2"+
		"\u0267\u0269\b!\1\2\u0268\u0260\3\2\2\2\u0268\u0267\3\2\2\2\u0269\u0273"+
		"\3\2\2\2\u026a\u026b\f\5\2\2\u026b\u026c\7\b\2\2\u026c\u026d\7%\2\2\u026d"+
		"\u026e\7;\2\2\u026e\u026f\5R*\2\u026f\u0270\b!\1\2\u0270\u0272\3\2\2\2"+
		"\u0271\u026a\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274"+
		"\3\2\2\2\u0274A\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0277\b\"\1\2\u0277"+
		"\u0278\7(\2\2\u0278\u0279\5B\"\24\u0279\u027a\b\"\1\2\u027a\u02b0\3\2"+
		"\2\2\u027b\u027c\7\65\2\2\u027c\u027d\5B\"\23\u027d\u027e\b\"\1\2\u027e"+
		"\u02b0\3\2\2\2\u027f\u0280\7\67\2\2\u0280\u0281\5B\"\2\u0281\u0282\78"+
		"\2\2\u0282\u0283\b\"\1\2\u0283\u02b0\3\2\2\2\u0284\u0285\7#\2\2\u0285"+
		"\u02b0\b\"\1\2\u0286\u0287\7$\2\2\u0287\u02b0\b\"\1\2\u0288\u0289\7\n"+
		"\2\2\u0289\u02b0\b\"\1\2\u028a\u028b\7\13\2\2\u028b\u02b0\b\"\1\2\u028c"+
		"\u028d\7\t\2\2\u028d\u02b0\b\"\1\2\u028e\u028f\5N(\2\u028f\u0290\b\"\1"+
		"\2\u0290\u02b0\3\2\2\2\u0291\u0292\5.\30\2\u0292\u0293\b\"\1\2\u0293\u02b0"+
		"\3\2\2\2\u0294\u0295\5\60\31\2\u0295\u0296\b\"\1\2\u0296\u02b0\3\2\2\2"+
		"\u0297\u0298\5\62\32\2\u0298\u0299\b\"\1\2\u0299\u02b0\3\2\2\2\u029a\u029b"+
		"\5H%\2\u029b\u029c\b\"\1\2\u029c\u02b0\3\2\2\2\u029d\u029e\5J&\2\u029e"+
		"\u029f\b\"\1\2\u029f\u02b0\3\2\2\2\u02a0\u02a1\5L\'\2\u02a1\u02a2\b\""+
		"\1\2\u02a2\u02b0\3\2\2\2\u02a3\u02a4\5F$\2\u02a4\u02a5\b\"\1\2\u02a5\u02b0"+
		"\3\2\2\2\u02a6\u02a7\7%\2\2\u02a7\u02a8\t\4\2\2\u02a8\u02a9\5V,\2\u02a9"+
		"\u02aa\t\5\2\2\u02aa\u02ab\b\"\1\2\u02ab\u02b0\3\2\2\2\u02ac\u02ad\5D"+
		"#\2\u02ad\u02ae\b\"\1\2\u02ae\u02b0\3\2\2\2\u02af\u0276\3\2\2\2\u02af"+
		"\u027b\3\2\2\2\u02af\u027f\3\2\2\2\u02af\u0284\3\2\2\2\u02af\u0286\3\2"+
		"\2\2\u02af\u0288\3\2\2\2\u02af\u028a\3\2\2\2\u02af\u028c\3\2\2\2\u02af"+
		"\u028e\3\2\2\2\u02af\u0291\3\2\2\2\u02af\u0294\3\2\2\2\u02af\u0297\3\2"+
		"\2\2\u02af\u029a\3\2\2\2\u02af\u029d\3\2\2\2\u02af\u02a0\3\2\2\2\u02af"+
		"\u02a3\3\2\2\2\u02af\u02a6\3\2\2\2\u02af\u02ac\3\2\2\2\u02b0\u02d6\3\2"+
		"\2\2\u02b1\u02b2\f\33\2\2\u02b2\u02b3\t\6\2\2\u02b3\u02b4\5B\"\34\u02b4"+
		"\u02b5\b\"\1\2\u02b5\u02d5\3\2\2\2\u02b6\u02b7\f\32\2\2\u02b7\u02b8\t"+
		"\7\2\2\u02b8\u02b9\5B\"\33\u02b9\u02ba\b\"\1\2\u02ba\u02d5\3\2\2\2\u02bb"+
		"\u02bc\f\31\2\2\u02bc\u02bd\t\b\2\2\u02bd\u02be\5B\"\32\u02be\u02bf\b"+
		"\"\1\2\u02bf\u02d5\3\2\2\2\u02c0\u02c1\f\30\2\2\u02c1\u02c2\t\t\2\2\u02c2"+
		"\u02c3\5B\"\31\u02c3\u02c4\b\"\1\2\u02c4\u02d5\3\2\2\2\u02c5\u02c6\f\27"+
		"\2\2\u02c6\u02c7\t\n\2\2\u02c7\u02c8\5B\"\30\u02c8\u02c9\b\"\1\2\u02c9"+
		"\u02d5\3\2\2\2\u02ca\u02cb\f\26\2\2\u02cb\u02cc\7*\2\2\u02cc\u02cd\5B"+
		"\"\27\u02cd\u02ce\b\"\1\2\u02ce\u02d5\3\2\2\2\u02cf\u02d0\f\25\2\2\u02d0"+
		"\u02d1\7)\2\2\u02d1\u02d2\5B\"\26\u02d2\u02d3\b\"\1\2\u02d3\u02d5\3\2"+
		"\2\2\u02d4\u02b1\3\2\2\2\u02d4\u02b6\3\2\2\2\u02d4\u02bb\3\2\2\2\u02d4"+
		"\u02c0\3\2\2\2\u02d4\u02c5\3\2\2\2\u02d4\u02ca\3\2\2\2\u02d4\u02cf\3\2"+
		"\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7"+
		"C\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02da\7%\2\2\u02da\u02db\7=\2\2\u02db"+
		"\u02dc\7%\2\2\u02dc\u02e4\b#\1\2\u02dd\u02de\7%\2\2\u02de\u02df\7=\2\2"+
		"\u02df\u02e0\7%\2\2\u02e0\u02e1\7=\2\2\u02e1\u02e2\7%\2\2\u02e2\u02e4"+
		"\b#\1\2\u02e3\u02d9\3\2\2\2\u02e3\u02dd\3\2\2\2\u02e4E\3\2\2\2\u02e5\u02e6"+
		"\7%\2\2\u02e6\u02e7\7\67\2\2\u02e7\u02e8\5T+\2\u02e8\u02e9\78\2\2\u02e9"+
		"\u02ea\b$\1\2\u02ea\u02ef\3\2\2\2\u02eb\u02ec\7%\2\2\u02ec\u02ed\7\67"+
		"\2\2\u02ed\u02ef\78\2\2\u02ee\u02e5\3\2\2\2\u02ee\u02eb\3\2\2\2\u02ef"+
		"G\3\2\2\2\u02f0\u02f1\7\4\2\2\u02f1\u02f2\7\67\2\2\u02f2\u02f3\5B\"\2"+
		"\u02f3\u02f4\78\2\2\u02f4\u02f5\b%\1\2\u02f5I\3\2\2\2\u02f6\u02f7\7\5"+
		"\2\2\u02f7\u02f8\7\67\2\2\u02f8\u02f9\5B\"\2\u02f9\u02fa\78\2\2\u02fa"+
		"\u02fb\b&\1\2\u02fbK\3\2\2\2\u02fc\u02fd\7\3\2\2\u02fd\u02fe\7\67\2\2"+
		"\u02fe\u02ff\5B\"\2\u02ff\u0300\78\2\2\u0300\u0301\b\'\1\2\u0301M\3\2"+
		"\2\2\u0302\u0303\7%\2\2\u0303\u0304\b(\1\2\u0304O\3\2\2\2\u0305\u0306"+
		"\7%\2\2\u0306\u0307\7,\2\2\u0307\u0309\5B\"\2\u0308\u030a\7?\2\2\u0309"+
		"\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\b)"+
		"\1\2\u030c\u0316\3\2\2\2\u030d\u030e\7%\2\2\u030e\u030f\7-\2\2\u030f\u0311"+
		"\5B\"\2\u0310\u0312\7?\2\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"\u0313\3\2\2\2\u0313\u0314\b)\1\2\u0314\u0316\3\2\2\2\u0315\u0305\3\2"+
		"\2\2\u0315\u030d\3\2\2\2\u0316Q\3\2\2\2\u0317\u0318\7\3\2\2\u0318\u0324"+
		"\b*\1\2\u0319\u031a\7\4\2\2\u031a\u0324\b*\1\2\u031b\u031c\7\5\2\2\u031c"+
		"\u0324\b*\1\2\u031d\u031e\7\6\2\2\u031e\u0324\b*\1\2\u031f\u0320\7\7\2"+
		"\2\u0320\u0324\b*\1\2\u0321\u0322\7%\2\2\u0322\u0324\b*\1\2\u0323\u0317"+
		"\3\2\2\2\u0323\u0319\3\2\2\2\u0323\u031b\3\2\2\2\u0323\u031d\3\2\2\2\u0323"+
		"\u031f\3\2\2\2\u0323\u0321\3\2\2\2\u0324S\3\2\2\2\u0325\u0329\b+\1\2\u0326"+
		"\u032a\7C\2\2\u0327\u0328\7%\2\2\u0328\u032a\7;\2\2\u0329\u0326\3\2\2"+
		"\2\u0329\u0327\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c"+
		"\5B\"\2\u032c\u032d\b+\1\2\u032d\u033a\3\2\2\2\u032e\u032f\f\4\2\2\u032f"+
		"\u0333\7>\2\2\u0330\u0334\7C\2\2\u0331\u0332\7%\2\2\u0332\u0334\7;\2\2"+
		"\u0333\u0330\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335"+
		"\3\2\2\2\u0335\u0336\5B\"\2\u0336\u0337\b+\1\2\u0337\u0339\3\2\2\2\u0338"+
		"\u032e\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2"+
		"\2\2\u033bU\3\2\2\2\u033c\u033a\3\2\2\2\u033d\u033e\b,\1\2\u033e\u033f"+
		"\7%\2\2\u033f\u0340\7;\2\2\u0340\u0341\5B\"\2\u0341\u0342\b,\1\2\u0342"+
		"\u0345\3\2\2\2\u0343\u0345\b,\1\2\u0344\u033d\3\2\2\2\u0344\u0343\3\2"+
		"\2\2\u0345\u0351\3\2\2\2\u0346\u0348\f\5\2\2\u0347\u0349\7>\2\2\u0348"+
		"\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\7%"+
		"\2\2\u034b\u034c\7;\2\2\u034c\u034d\5B\"\2\u034d\u034e\b,\1\2\u034e\u0350"+
		"\3\2\2\2\u034f\u0346\3\2\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2\2\2\u0351"+
		"\u0352\3\2\2\2\u0352W\3\2\2\2\u0353\u0351\3\2\2\28_\u009f\u00a6\u00b1"+
		"\u00ba\u00c4\u00c8\u00d1\u00da\u00de\u00e3\u0102\u0114\u0126\u012b\u0133"+
		"\u013d\u015d\u016a\u0170\u0176\u017b\u017e\u018b\u0199\u01a6\u01b1\u01b5"+
		"\u01c5\u01cf\u01dc\u01f7\u0203\u0231\u023e\u024b\u0257\u0268\u0273\u02af"+
		"\u02d4\u02d6\u02e3\u02ee\u0309\u0311\u0315\u0323\u0329\u0333\u033a\u0344"+
		"\u0348\u0351";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}