// Generated from c:\Users\50246\Desktop\Ingeniería-Sexto Semestre\Compiladores 2\Proyecto 2\Server\Lex.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lex extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STRINGS", "INTS", "FLOATS", "BOOLS", "CHARACTERS", "VAR", "NIL", "TRUE", 
			"FALSE", "PRINT", "IF", "ELSE", "WHILE", "LET", "FOR", "IN", "SWITCH", 
			"CASE", "DEFAULT", "GUARD", "CONTINUE", "RETURN", "BREAK", "APPEND", 
			"REMOVELAST", "REMOVE", "AT", "ISEMPTY", "COUNT", "FUNC", "INOUT", "STRUCT", 
			"NUMBER", "STRING", "ID", "DIF", "IG_IG", "NOT", "OR", "AND", "IG", "IG_ADD", 
			"IG_SUB", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MUL", "DIV", "ADD", 
			"SUB", "PERCENT", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "DOUBLEPTS", 
			"QUESTION", "POINT", "COMA", "PTCOMA", "CORCHETEIZQ", "CORCHETEDER", 
			"GUION_BAJO", "AND_SIMPLE", "WHITESPACE", "COMMENT", "LINE_COMMENT", 
			"ESC_SEQ"
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


	public Lex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u01cf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3\"\6\"\u014d\n\"\r\"\16\"\u014e\3\"\3\"\6\"\u0153\n\"\r\""+
		"\16\"\u0154\5\"\u0157\n\"\3#\3#\7#\u015b\n#\f#\16#\u015e\13#\3#\3#\3$"+
		"\3$\7$\u0164\n$\f$\16$\u0167\13$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3"+
		")\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\3"+
		"8\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\6C\u01ae"+
		"\nC\rC\16C\u01af\3C\3C\3D\3D\3D\3D\7D\u01b8\nD\fD\16D\u01bb\13D\3D\3D"+
		"\3D\3D\3D\3E\3E\3E\3E\7E\u01c6\nE\fE\16E\u01c9\13E\3E\3E\3F\3F\3F\3\u01b9"+
		"\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b\2\3\2"+
		"\t\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\6\2\13\f\17\17\"\"^^\4\2\f"+
		"\f\17\17\t\2\"#%%--/\60<<BB]_\2\u01d5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\3\u008d\3\2\2\2\5\u0094\3\2\2\2\7\u0098\3\2\2\2\t\u009e\3\2\2"+
		"\2\13\u00a3\3\2\2\2\r\u00ad\3\2\2\2\17\u00b1\3\2\2\2\21\u00b5\3\2\2\2"+
		"\23\u00ba\3\2\2\2\25\u00c0\3\2\2\2\27\u00c6\3\2\2\2\31\u00c9\3\2\2\2\33"+
		"\u00ce\3\2\2\2\35\u00d4\3\2\2\2\37\u00d8\3\2\2\2!\u00dc\3\2\2\2#\u00df"+
		"\3\2\2\2%\u00e6\3\2\2\2\'\u00eb\3\2\2\2)\u00f3\3\2\2\2+\u00f9\3\2\2\2"+
		"-\u0102\3\2\2\2/\u0109\3\2\2\2\61\u010f\3\2\2\2\63\u0116\3\2\2\2\65\u0121"+
		"\3\2\2\2\67\u0128\3\2\2\29\u012b\3\2\2\2;\u0133\3\2\2\2=\u0139\3\2\2\2"+
		"?\u013e\3\2\2\2A\u0144\3\2\2\2C\u014c\3\2\2\2E\u0158\3\2\2\2G\u0161\3"+
		"\2\2\2I\u0168\3\2\2\2K\u016b\3\2\2\2M\u016e\3\2\2\2O\u0170\3\2\2\2Q\u0173"+
		"\3\2\2\2S\u0176\3\2\2\2U\u0178\3\2\2\2W\u017b\3\2\2\2Y\u017e\3\2\2\2["+
		"\u0181\3\2\2\2]\u0184\3\2\2\2_\u0186\3\2\2\2a\u0188\3\2\2\2c\u018a\3\2"+
		"\2\2e\u018c\3\2\2\2g\u018e\3\2\2\2i\u0190\3\2\2\2k\u0192\3\2\2\2m\u0194"+
		"\3\2\2\2o\u0196\3\2\2\2q\u0198\3\2\2\2s\u019a\3\2\2\2u\u019c\3\2\2\2w"+
		"\u019e\3\2\2\2y\u01a0\3\2\2\2{\u01a2\3\2\2\2}\u01a4\3\2\2\2\177\u01a6"+
		"\3\2\2\2\u0081\u01a8\3\2\2\2\u0083\u01aa\3\2\2\2\u0085\u01ad\3\2\2\2\u0087"+
		"\u01b3\3\2\2\2\u0089\u01c1\3\2\2\2\u008b\u01cc\3\2\2\2\u008d\u008e\7U"+
		"\2\2\u008e\u008f\7v\2\2\u008f\u0090\7t\2\2\u0090\u0091\7k\2\2\u0091\u0092"+
		"\7p\2\2\u0092\u0093\7i\2\2\u0093\4\3\2\2\2\u0094\u0095\7K\2\2\u0095\u0096"+
		"\7p\2\2\u0096\u0097\7v\2\2\u0097\6\3\2\2\2\u0098\u0099\7H\2\2\u0099\u009a"+
		"\7n\2\2\u009a\u009b\7q\2\2\u009b\u009c\7c\2\2\u009c\u009d\7v\2\2\u009d"+
		"\b\3\2\2\2\u009e\u009f\7D\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7q\2\2\u00a1"+
		"\u00a2\7n\2\2\u00a2\n\3\2\2\2\u00a3\u00a4\7E\2\2\u00a4\u00a5\7j\2\2\u00a5"+
		"\u00a6\7c\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7e\2\2"+
		"\u00a9\u00aa\7v\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7t\2\2\u00ac\f\3\2"+
		"\2\2\u00ad\u00ae\7x\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7t\2\2\u00b0\16"+
		"\3\2\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7n\2\2\u00b4"+
		"\20\3\2\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7w\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\22\3\2\2\2\u00ba\u00bb\7h\2\2\u00bb\u00bc\7c\2\2\u00bc"+
		"\u00bd\7n\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7g\2\2\u00bf\24\3\2\2\2\u00c0"+
		"\u00c1\7r\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7p\2\2"+
		"\u00c4\u00c5\7v\2\2\u00c5\26\3\2\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7"+
		"h\2\2\u00c8\30\3\2\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc"+
		"\7u\2\2\u00cc\u00cd\7g\2\2\u00cd\32\3\2\2\2\u00ce\u00cf\7y\2\2\u00cf\u00d0"+
		"\7j\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7g\2\2\u00d3"+
		"\34\3\2\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7v\2\2\u00d7"+
		"\36\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7t\2\2\u00db"+
		" \3\2\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7p\2\2\u00de\"\3\2\2\2\u00df"+
		"\u00e0\7u\2\2\u00e0\u00e1\7y\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7v\2\2"+
		"\u00e3\u00e4\7e\2\2\u00e4\u00e5\7j\2\2\u00e5$\3\2\2\2\u00e6\u00e7\7e\2"+
		"\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7g\2\2\u00ea&\3\2"+
		"\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef"+
		"\7c\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7v\2\2\u00f2"+
		"(\3\2\2\2\u00f3\u00f4\7i\2\2\u00f4\u00f5\7w\2\2\u00f5\u00f6\7c\2\2\u00f6"+
		"\u00f7\7t\2\2\u00f7\u00f8\7f\2\2\u00f8*\3\2\2\2\u00f9\u00fa\7e\2\2\u00fa"+
		"\u00fb\7q\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7k\2\2"+
		"\u00fe\u00ff\7p\2\2\u00ff\u0100\7w\2\2\u0100\u0101\7g\2\2\u0101,\3\2\2"+
		"\2\u0102\u0103\7t\2\2\u0103\u0104\7g\2\2\u0104\u0105\7v\2\2\u0105\u0106"+
		"\7w\2\2\u0106\u0107\7t\2\2\u0107\u0108\7p\2\2\u0108.\3\2\2\2\u0109\u010a"+
		"\7d\2\2\u010a\u010b\7t\2\2\u010b\u010c\7g\2\2\u010c\u010d\7c\2\2\u010d"+
		"\u010e\7m\2\2\u010e\60\3\2\2\2\u010f\u0110\7c\2\2\u0110\u0111\7r\2\2\u0111"+
		"\u0112\7r\2\2\u0112\u0113\7g\2\2\u0113\u0114\7p\2\2\u0114\u0115\7f\2\2"+
		"\u0115\62\3\2\2\2\u0116\u0117\7t\2\2\u0117\u0118\7g\2\2\u0118\u0119\7"+
		"o\2\2\u0119\u011a\7q\2\2\u011a\u011b\7x\2\2\u011b\u011c\7g\2\2\u011c\u011d"+
		"\7N\2\2\u011d\u011e\7c\2\2\u011e\u011f\7u\2\2\u011f\u0120\7v\2\2\u0120"+
		"\64\3\2\2\2\u0121\u0122\7t\2\2\u0122\u0123\7g\2\2\u0123\u0124\7o\2\2\u0124"+
		"\u0125\7q\2\2\u0125\u0126\7x\2\2\u0126\u0127\7g\2\2\u0127\66\3\2\2\2\u0128"+
		"\u0129\7c\2\2\u0129\u012a\7v\2\2\u012a8\3\2\2\2\u012b\u012c\7k\2\2\u012c"+
		"\u012d\7u\2\2\u012d\u012e\7G\2\2\u012e\u012f\7o\2\2\u012f\u0130\7r\2\2"+
		"\u0130\u0131\7v\2\2\u0131\u0132\7{\2\2\u0132:\3\2\2\2\u0133\u0134\7e\2"+
		"\2\u0134\u0135\7q\2\2\u0135\u0136\7w\2\2\u0136\u0137\7p\2\2\u0137\u0138"+
		"\7v\2\2\u0138<\3\2\2\2\u0139\u013a\7h\2\2\u013a\u013b\7w\2\2\u013b\u013c"+
		"\7p\2\2\u013c\u013d\7e\2\2\u013d>\3\2\2\2\u013e\u013f\7k\2\2\u013f\u0140"+
		"\7p\2\2\u0140\u0141\7q\2\2\u0141\u0142\7w\2\2\u0142\u0143\7v\2\2\u0143"+
		"@\3\2\2\2\u0144\u0145\7u\2\2\u0145\u0146\7v\2\2\u0146\u0147\7t\2\2\u0147"+
		"\u0148\7w\2\2\u0148\u0149\7e\2\2\u0149\u014a\7v\2\2\u014aB\3\2\2\2\u014b"+
		"\u014d\t\2\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0156\3\2\2\2\u0150\u0152\7\60\2\2\u0151"+
		"\u0153\t\2\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0150\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157D\3\2\2\2\u0158\u015c\7$\2\2\u0159\u015b\n\3\2\2\u015a"+
		"\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7$\2\2\u0160"+
		"F\3\2\2\2\u0161\u0165\t\4\2\2\u0162\u0164\t\5\2\2\u0163\u0162\3\2\2\2"+
		"\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166H\3"+
		"\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7#\2\2\u0169\u016a\7?\2\2\u016a"+
		"J\3\2\2\2\u016b\u016c\7?\2\2\u016c\u016d\7?\2\2\u016dL\3\2\2\2\u016e\u016f"+
		"\7#\2\2\u016fN\3\2\2\2\u0170\u0171\7~\2\2\u0171\u0172\7~\2\2\u0172P\3"+
		"\2\2\2\u0173\u0174\7(\2\2\u0174\u0175\7(\2\2\u0175R\3\2\2\2\u0176\u0177"+
		"\7?\2\2\u0177T\3\2\2\2\u0178\u0179\7-\2\2\u0179\u017a\7?\2\2\u017aV\3"+
		"\2\2\2\u017b\u017c\7/\2\2\u017c\u017d\7?\2\2\u017dX\3\2\2\2\u017e\u017f"+
		"\7@\2\2\u017f\u0180\7?\2\2\u0180Z\3\2\2\2\u0181\u0182\7>\2\2\u0182\u0183"+
		"\7?\2\2\u0183\\\3\2\2\2\u0184\u0185\7@\2\2\u0185^\3\2\2\2\u0186\u0187"+
		"\7>\2\2\u0187`\3\2\2\2\u0188\u0189\7,\2\2\u0189b\3\2\2\2\u018a\u018b\7"+
		"\61\2\2\u018bd\3\2\2\2\u018c\u018d\7-\2\2\u018df\3\2\2\2\u018e\u018f\7"+
		"/\2\2\u018fh\3\2\2\2\u0190\u0191\7\'\2\2\u0191j\3\2\2\2\u0192\u0193\7"+
		"*\2\2\u0193l\3\2\2\2\u0194\u0195\7+\2\2\u0195n\3\2\2\2\u0196\u0197\7}"+
		"\2\2\u0197p\3\2\2\2\u0198\u0199\7\177\2\2\u0199r\3\2\2\2\u019a\u019b\7"+
		"<\2\2\u019bt\3\2\2\2\u019c\u019d\7A\2\2\u019dv\3\2\2\2\u019e\u019f\7\60"+
		"\2\2\u019fx\3\2\2\2\u01a0\u01a1\7.\2\2\u01a1z\3\2\2\2\u01a2\u01a3\7=\2"+
		"\2\u01a3|\3\2\2\2\u01a4\u01a5\7]\2\2\u01a5~\3\2\2\2\u01a6\u01a7\7_\2\2"+
		"\u01a7\u0080\3\2\2\2\u01a8\u01a9\7a\2\2\u01a9\u0082\3\2\2\2\u01aa\u01ab"+
		"\7(\2\2\u01ab\u0084\3\2\2\2\u01ac\u01ae\t\6\2\2\u01ad\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01b2\bC\2\2\u01b2\u0086\3\2\2\2\u01b3\u01b4\7\61\2\2\u01b4"+
		"\u01b5\7,\2\2\u01b5\u01b9\3\2\2\2\u01b6\u01b8\13\2\2\2\u01b7\u01b6\3\2"+
		"\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01ba\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba"+
		"\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\7,\2\2\u01bd\u01be\7\61"+
		"\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\bD\2\2\u01c0\u0088\3\2\2\2\u01c1"+
		"\u01c2\7\61\2\2\u01c2\u01c3\7\61\2\2\u01c3\u01c7\3\2\2\2\u01c4\u01c6\n"+
		"\7\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\bE"+
		"\2\2\u01cb\u008a\3\2\2\2\u01cc\u01cd\7^\2\2\u01cd\u01ce\t\b\2\2\u01ce"+
		"\u008c\3\2\2\2\13\2\u014e\u0154\u0156\u015c\u0165\u01af\u01b9\u01c7\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}