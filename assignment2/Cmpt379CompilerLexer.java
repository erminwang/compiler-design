// Generated from Cmpt379Compiler.g4 by ANTLR 4.5.3


import java.io.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Cmpt379CompilerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WhiteSpace=2, Char=3, Str=4, Class=5, Program=6, Void=7, If=8, 
		Else=9, For=10, Ret=11, Brk=12, Cnt=13, Callout=14, Num=15, HexNum=16, 
		BoolLit=17, Type=18, Ident=19, While=20, Relop=21, AssignOp=22, ArithOp=23, 
		CondOp=24, OParen=25, CParen=26, OBrace=27, CBrace=28, OBracket=29, CBracket=30, 
		SemiColon=31, Comma=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "Delim", "Letter", "Digit", "HexDigit", "Alpha", "AlphaNum", "WhiteSpace", 
		"Char", "Str", "Class", "Program", "Void", "If", "Else", "For", "Ret", 
		"Brk", "Cnt", "Callout", "Num", "HexNum", "BoolLit", "Type", "Ident", 
		"While", "Relop", "AssignOp", "ArithOp", "CondOp", "OParen", "CParen", 
		"OBrace", "CBrace", "OBracket", "CBracket", "SemiColon", "Comma"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", null, null, null, "'class'", "'Program'", "'void'", "'if'", 
		"'else'", "'for'", "'return'", "'break'", "'continue'", "'callout'", null, 
		null, null, null, null, "'while'", null, null, null, null, "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WhiteSpace", "Char", "Str", "Class", "Program", "Void", "If", 
		"Else", "For", "Ret", "Brk", "Cnt", "Callout", "Num", "HexNum", "BoolLit", 
		"Type", "Ident", "While", "Relop", "AssignOp", "ArithOp", "CondOp", "OParen", 
		"CParen", "OBrace", "CBrace", "OBracket", "CBracket", "SemiColon", "Comma"
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


	public Cmpt379CompilerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmpt379Compiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u0118\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\5\6Z\n\6\3\7\3\7\5\7^\n\7\3\b\3\b\5\bb\n\b\3\t\6\te\n\t"+
		"\r\t\16\tf\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\ns\n\n\3\13\3\13"+
		"\3\13\3\13\7\13y\n\13\f\13\16\13|\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\6\26"+
		"\u00be\n\26\r\26\16\26\u00bf\3\27\3\27\3\27\3\27\6\27\u00c6\n\27\r\27"+
		"\16\27\u00c7\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00d3\n"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00df\n\31"+
		"\3\32\3\32\7\32\u00e3\n\32\f\32\16\32\u00e6\13\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00f7\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u00fe\n\35\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0107\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\2\2(\3\3\5\2\7\2\t\2\13\2\r\2\17\2\21\4\23\5\25\6\27\7\31\b\33\t"+
		"\35\n\37\13!\f#\r%\16\'\17)\20+\21-\22/\23\61\24\63\25\65\26\67\279\30"+
		";\31=\32?\33A\34C\35E\36G\37I K!M\"\3\2\n\4\2\13\f\"\"\4\2C\\c|\3\2\62"+
		";\4\2CHch\3\2^^\4\2$$^^\4\2>>@@\6\2\'\',-//\61\61\u0125\2\3\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13Y\3\2"+
		"\2\2\r]\3\2\2\2\17a\3\2\2\2\21d\3\2\2\2\23r\3\2\2\2\25t\3\2\2\2\27\177"+
		"\3\2\2\2\31\u0085\3\2\2\2\33\u008d\3\2\2\2\35\u0092\3\2\2\2\37\u0095\3"+
		"\2\2\2!\u009a\3\2\2\2#\u009e\3\2\2\2%\u00a5\3\2\2\2\'\u00ab\3\2\2\2)\u00b4"+
		"\3\2\2\2+\u00bd\3\2\2\2-\u00c1\3\2\2\2/\u00d2\3\2\2\2\61\u00de\3\2\2\2"+
		"\63\u00e0\3\2\2\2\65\u00e7\3\2\2\2\67\u00f6\3\2\2\29\u00fd\3\2\2\2;\u00ff"+
		"\3\2\2\2=\u0106\3\2\2\2?\u0108\3\2\2\2A\u010a\3\2\2\2C\u010c\3\2\2\2E"+
		"\u010e\3\2\2\2G\u0110\3\2\2\2I\u0112\3\2\2\2K\u0114\3\2\2\2M\u0116\3\2"+
		"\2\2OP\7?\2\2P\4\3\2\2\2QR\t\2\2\2R\6\3\2\2\2ST\t\3\2\2T\b\3\2\2\2UV\t"+
		"\4\2\2V\n\3\2\2\2WZ\5\t\5\2XZ\t\5\2\2YW\3\2\2\2YX\3\2\2\2Z\f\3\2\2\2["+
		"^\5\7\4\2\\^\7a\2\2][\3\2\2\2]\\\3\2\2\2^\16\3\2\2\2_b\5\r\7\2`b\5\t\5"+
		"\2a_\3\2\2\2a`\3\2\2\2b\20\3\2\2\2ce\5\5\3\2dc\3\2\2\2ef\3\2\2\2fd\3\2"+
		"\2\2fg\3\2\2\2gh\3\2\2\2hi\b\t\2\2i\22\3\2\2\2jk\7)\2\2kl\n\6\2\2ls\7"+
		")\2\2mn\7)\2\2no\7^\2\2op\3\2\2\2pq\13\2\2\2qs\7)\2\2rj\3\2\2\2rm\3\2"+
		"\2\2s\24\3\2\2\2tz\7$\2\2uy\n\7\2\2vw\7^\2\2wy\13\2\2\2xu\3\2\2\2xv\3"+
		"\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7$\2\2~\26"+
		"\3\2\2\2\177\u0080\7e\2\2\u0080\u0081\7n\2\2\u0081\u0082\7c\2\2\u0082"+
		"\u0083\7u\2\2\u0083\u0084\7u\2\2\u0084\30\3\2\2\2\u0085\u0086\7R\2\2\u0086"+
		"\u0087\7t\2\2\u0087\u0088\7q\2\2\u0088\u0089\7i\2\2\u0089\u008a\7t\2\2"+
		"\u008a\u008b\7c\2\2\u008b\u008c\7o\2\2\u008c\32\3\2\2\2\u008d\u008e\7"+
		"x\2\2\u008e\u008f\7q\2\2\u008f\u0090\7k\2\2\u0090\u0091\7f\2\2\u0091\34"+
		"\3\2\2\2\u0092\u0093\7k\2\2\u0093\u0094\7h\2\2\u0094\36\3\2\2\2\u0095"+
		"\u0096\7g\2\2\u0096\u0097\7n\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2"+
		"\u0099 \3\2\2\2\u009a\u009b\7h\2\2\u009b\u009c\7q\2\2\u009c\u009d\7t\2"+
		"\2\u009d\"\3\2\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7"+
		"v\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7p\2\2\u00a4$"+
		"\3\2\2\2\u00a5\u00a6\7d\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7g\2\2\u00a8"+
		"\u00a9\7c\2\2\u00a9\u00aa\7m\2\2\u00aa&\3\2\2\2\u00ab\u00ac\7e\2\2\u00ac"+
		"\u00ad\7q\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7k\2\2"+
		"\u00b0\u00b1\7p\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7g\2\2\u00b3(\3\2\2"+
		"\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8"+
		"\7n\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7v\2\2\u00bb"+
		"*\3\2\2\2\u00bc\u00be\5\t\5\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2"+
		"\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0,\3\2\2\2\u00c1\u00c2\7"+
		"\62\2\2\u00c2\u00c3\7z\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c6\5\13\6\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8.\3\2\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc"+
		"\7w\2\2\u00cc\u00d3\7g\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf\7c\2\2\u00cf"+
		"\u00d0\7n\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d3\7g\2\2\u00d2\u00c9\3\2\2"+
		"\2\u00d2\u00cd\3\2\2\2\u00d3\60\3\2\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6"+
		"\7p\2\2\u00d6\u00df\7v\2\2\u00d7\u00d8\7d\2\2\u00d8\u00d9\7q\2\2\u00d9"+
		"\u00da\7q\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7c\2\2"+
		"\u00dd\u00df\7p\2\2\u00de\u00d4\3\2\2\2\u00de\u00d7\3\2\2\2\u00df\62\3"+
		"\2\2\2\u00e0\u00e4\5\r\7\2\u00e1\u00e3\5\17\b\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\64\3\2\2"+
		"\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7y\2\2\u00e8\u00e9\7j\2\2\u00e9\u00ea"+
		"\7k\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7g\2\2\u00ec\66\3\2\2\2\u00ed\u00ee"+
		"\7>\2\2\u00ee\u00f7\7?\2\2\u00ef\u00f0\7@\2\2\u00f0\u00f7\7?\2\2\u00f1"+
		"\u00f7\t\b\2\2\u00f2\u00f3\7?\2\2\u00f3\u00f7\7?\2\2\u00f4\u00f5\7#\2"+
		"\2\u00f5\u00f7\7?\2\2\u00f6\u00ed\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f1"+
		"\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f78\3\2\2\2\u00f8"+
		"\u00fe\7?\2\2\u00f9\u00fa\7-\2\2\u00fa\u00fe\7?\2\2\u00fb\u00fc\7/\2\2"+
		"\u00fc\u00fe\7?\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe:\3\2\2\2\u00ff\u0100\t\t\2\2\u0100<\3\2\2\2\u0101\u0102"+
		"\7(\2\2\u0102\u0107\7(\2\2\u0103\u0104\7~\2\2\u0104\u0107\7~\2\2\u0105"+
		"\u0107\7#\2\2\u0106\u0101\3\2\2\2\u0106\u0103\3\2\2\2\u0106\u0105\3\2"+
		"\2\2\u0107>\3\2\2\2\u0108\u0109\7*\2\2\u0109@\3\2\2\2\u010a\u010b\7+\2"+
		"\2\u010bB\3\2\2\2\u010c\u010d\7}\2\2\u010dD\3\2\2\2\u010e\u010f\7\177"+
		"\2\2\u010fF\3\2\2\2\u0110\u0111\7]\2\2\u0111H\3\2\2\2\u0112\u0113\7_\2"+
		"\2\u0113J\3\2\2\2\u0114\u0115\7=\2\2\u0115L\3\2\2\2\u0116\u0117\7.\2\2"+
		"\u0117N\3\2\2\2\22\2Y]afrxz\u00bf\u00c7\u00d2\u00de\u00e4\u00f6\u00fd"+
		"\u0106\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}