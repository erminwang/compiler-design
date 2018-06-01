// Generated from A1_lexer.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class A1_lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WhiteSpace=1, Char_literal=2, Str_literal=3, Class=4, Program=5, Void=6, 
		If=7, Else=8, For=9, While=10, Ret=11, Brk=12, Cnt=13, Callout=14, Switch=15, 
		Case=16, Decimal_literal=17, Hex_literal=18, Boolean_literal=19, Type=20, 
		Ident=21, RelOp=22, AssignOp=23, ArithOp=24, ConOp=25, LParenthesis=26, 
		RParenthesis=27, LCurlyBrace=28, RCurlyBrace=29, LBracket=30, RBracket=31, 
		SemiColon=32, Colon=33, Comma=34, EqOp=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Delim", "Char", "Alpha", "Digit", "Alpha_num", "Hex_digit", "WhiteSpace", 
		"Char_literal", "Str_literal", "Class", "Program", "Void", "If", "Else", 
		"For", "While", "Ret", "Brk", "Cnt", "Callout", "Switch", "Case", "Decimal_literal", 
		"Hex_literal", "Boolean_literal", "Type", "Ident", "RelOp", "AssignOp", 
		"ArithOp", "ConOp", "LParenthesis", "RParenthesis", "LCurlyBrace", "RCurlyBrace", 
		"LBracket", "RBracket", "SemiColon", "Colon", "Comma", "EqOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'class'", "'Program'", "'void'", "'if'", "'else'", 
		"'for'", "'while'", "'return'", "'break'", "'continue'", "'callout'", 
		"'switch'", "'case'", null, null, null, null, null, null, null, null, 
		null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "':'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WhiteSpace", "Char_literal", "Str_literal", "Class", "Program", 
		"Void", "If", "Else", "For", "While", "Ret", "Brk", "Cnt", "Callout", 
		"Switch", "Case", "Decimal_literal", "Hex_literal", "Boolean_literal", 
		"Type", "Ident", "RelOp", "AssignOp", "ArithOp", "ConOp", "LParenthesis", 
		"RParenthesis", "LCurlyBrace", "RCurlyBrace", "LBracket", "RBracket", 
		"SemiColon", "Colon", "Comma", "EqOp"
	};
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


	public A1_lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "A1_lexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u0124\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\3\5\3[\n\3\3\4\3\4\3\5\3\5\3\6\3\6\5\6c\n\6\3\7\3\7\5\7g\n"+
		"\7\3\b\6\bj\n\b\r\b\16\bk\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\7\nv\n\n\f\n"+
		"\16\ny\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\6\30\u00cd"+
		"\n\30\r\30\16\30\u00ce\3\31\3\31\3\31\3\31\6\31\u00d5\n\31\r\31\16\31"+
		"\u00d6\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00e2\n\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00ee\n\33\3\34"+
		"\3\34\7\34\u00f2\n\34\f\34\16\34\u00f5\13\34\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u00fc\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u0103\n\36\3\37\3\37\3"+
		" \3 \3 \3 \5 \u010b\n \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3*\3*\5*\u0123\n*\3w\2+\3\2\5\2\7\2\t\2\13\2\r\2\17\3"+
		"\21\4\23\5\25\6\27\7\31\b\33\t\35\n\37\13!\f#\r%\16\'\17)\20+\21-\22/"+
		"\23\61\24\63\25\65\26\67\279\30;\31=\32?\33A\34C\35E\36G\37I K!M\"O#Q"+
		"$S%\3\2\b\4\2\13\f\"\"\5\2C\\aac|\3\2\62;\4\2CHch\4\2>>@@\6\2\'\',-//"+
		"\61\61\u012d\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\3U\3\2\2\2\5Z\3\2\2\2\7\\\3\2\2\2\t^\3\2\2\2\13b\3\2\2\2\rf\3"+
		"\2\2\2\17i\3\2\2\2\21o\3\2\2\2\23s\3\2\2\2\25|\3\2\2\2\27\u0082\3\2\2"+
		"\2\31\u008a\3\2\2\2\33\u008f\3\2\2\2\35\u0092\3\2\2\2\37\u0097\3\2\2\2"+
		"!\u009b\3\2\2\2#\u00a1\3\2\2\2%\u00a8\3\2\2\2\'\u00ae\3\2\2\2)\u00b7\3"+
		"\2\2\2+\u00bf\3\2\2\2-\u00c6\3\2\2\2/\u00cc\3\2\2\2\61\u00d0\3\2\2\2\63"+
		"\u00e1\3\2\2\2\65\u00ed\3\2\2\2\67\u00ef\3\2\2\29\u00fb\3\2\2\2;\u0102"+
		"\3\2\2\2=\u0104\3\2\2\2?\u010a\3\2\2\2A\u010c\3\2\2\2C\u010e\3\2\2\2E"+
		"\u0110\3\2\2\2G\u0112\3\2\2\2I\u0114\3\2\2\2K\u0116\3\2\2\2M\u0118\3\2"+
		"\2\2O\u011a\3\2\2\2Q\u011c\3\2\2\2S\u0122\3\2\2\2UV\t\2\2\2V\4\3\2\2\2"+
		"W[\13\2\2\2XY\7^\2\2Y[\13\2\2\2ZW\3\2\2\2ZX\3\2\2\2[\6\3\2\2\2\\]\t\3"+
		"\2\2]\b\3\2\2\2^_\t\4\2\2_\n\3\2\2\2`c\5\7\4\2ac\5\t\5\2b`\3\2\2\2ba\3"+
		"\2\2\2c\f\3\2\2\2dg\5\t\5\2eg\t\5\2\2fd\3\2\2\2fe\3\2\2\2g\16\3\2\2\2"+
		"hj\5\3\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\b\b\2\2"+
		"n\20\3\2\2\2op\7)\2\2pq\5\5\3\2qr\7)\2\2r\22\3\2\2\2sw\7$\2\2tv\5\5\3"+
		"\2ut\3\2\2\2vy\3\2\2\2wx\3\2\2\2wu\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7$\2"+
		"\2{\24\3\2\2\2|}\7e\2\2}~\7n\2\2~\177\7c\2\2\177\u0080\7u\2\2\u0080\u0081"+
		"\7u\2\2\u0081\26\3\2\2\2\u0082\u0083\7R\2\2\u0083\u0084\7t\2\2\u0084\u0085"+
		"\7q\2\2\u0085\u0086\7i\2\2\u0086\u0087\7t\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7o\2\2\u0089\30\3\2\2\2\u008a\u008b\7x\2\2\u008b\u008c\7q\2\2\u008c"+
		"\u008d\7k\2\2\u008d\u008e\7f\2\2\u008e\32\3\2\2\2\u008f\u0090\7k\2\2\u0090"+
		"\u0091\7h\2\2\u0091\34\3\2\2\2\u0092\u0093\7g\2\2\u0093\u0094\7n\2\2\u0094"+
		"\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096\36\3\2\2\2\u0097\u0098\7h\2\2\u0098"+
		"\u0099\7q\2\2\u0099\u009a\7t\2\2\u009a \3\2\2\2\u009b\u009c\7y\2\2\u009c"+
		"\u009d\7j\2\2\u009d\u009e\7k\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7g\2\2"+
		"\u00a0\"\3\2\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7v"+
		"\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7p\2\2\u00a7$\3"+
		"\2\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		"\u00ac\7c\2\2\u00ac\u00ad\7m\2\2\u00ad&\3\2\2\2\u00ae\u00af\7e\2\2\u00af"+
		"\u00b0\7q\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7k\2\2"+
		"\u00b3\u00b4\7p\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7g\2\2\u00b6(\3\2\2"+
		"\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb"+
		"\7n\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7v\2\2\u00be"+
		"*\3\2\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7y\2\2\u00c1\u00c2\7k\2\2\u00c2"+
		"\u00c3\7v\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7j\2\2\u00c5,\3\2\2\2\u00c6"+
		"\u00c7\7e\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7g\2\2"+
		"\u00ca.\3\2\2\2\u00cb\u00cd\5\t\5\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3"+
		"\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\60\3\2\2\2\u00d0"+
		"\u00d1\7\62\2\2\u00d1\u00d2\7z\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d5\5\r"+
		"\7\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\62\3\2\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7t\2\2"+
		"\u00da\u00db\7w\2\2\u00db\u00e2\7g\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de"+
		"\7c\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7u\2\2\u00e0\u00e2\7g\2\2\u00e1"+
		"\u00d8\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7k\2\2"+
		"\u00e4\u00e5\7p\2\2\u00e5\u00ee\7v\2\2\u00e6\u00e7\7d\2\2\u00e7\u00e8"+
		"\7q\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb\7g\2\2\u00eb"+
		"\u00ec\7c\2\2\u00ec\u00ee\7p\2\2\u00ed\u00e3\3\2\2\2\u00ed\u00e6\3\2\2"+
		"\2\u00ee\66\3\2\2\2\u00ef\u00f3\5\7\4\2\u00f0\u00f2\5\13\6\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"8\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fc\t\6\2\2\u00f7\u00f8\7>\2\2\u00f8"+
		"\u00fc\7?\2\2\u00f9\u00fa\7@\2\2\u00fa\u00fc\7?\2\2\u00fb\u00f6\3\2\2"+
		"\2\u00fb\u00f7\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc:\3\2\2\2\u00fd\u0103"+
		"\7?\2\2\u00fe\u00ff\7-\2\2\u00ff\u0103\7?\2\2\u0100\u0101\7/\2\2\u0101"+
		"\u0103\7?\2\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0103<\3\2\2\2\u0104\u0105\t\7\2\2\u0105>\3\2\2\2\u0106\u0107\7("+
		"\2\2\u0107\u010b\7(\2\2\u0108\u0109\7~\2\2\u0109\u010b\7~\2\2\u010a\u0106"+
		"\3\2\2\2\u010a\u0108\3\2\2\2\u010b@\3\2\2\2\u010c\u010d\7*\2\2\u010dB"+
		"\3\2\2\2\u010e\u010f\7+\2\2\u010fD\3\2\2\2\u0110\u0111\7}\2\2\u0111F\3"+
		"\2\2\2\u0112\u0113\7\177\2\2\u0113H\3\2\2\2\u0114\u0115\7]\2\2\u0115J"+
		"\3\2\2\2\u0116\u0117\7_\2\2\u0117L\3\2\2\2\u0118\u0119\7=\2\2\u0119N\3"+
		"\2\2\2\u011a\u011b\7<\2\2\u011bP\3\2\2\2\u011c\u011d\7.\2\2\u011dR\3\2"+
		"\2\2\u011e\u011f\7?\2\2\u011f\u0123\7?\2\2\u0120\u0121\7#\2\2\u0121\u0123"+
		"\7?\2\2\u0122\u011e\3\2\2\2\u0122\u0120\3\2\2\2\u0123T\3\2\2\2\21\2Zb"+
		"fkw\u00ce\u00d6\u00e1\u00ed\u00f3\u00fb\u0102\u010a\u0122\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}