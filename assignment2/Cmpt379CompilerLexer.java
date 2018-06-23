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
		Else=9, For=10, Ret=11, Brk=12, Cnt=13, Callout=14, DecLit=15, HexLit=16, 
		BoolLit=17, Type=18, Ident=19, While=20, EqOp=21, Relop=22, AssignOp=23, 
		ArithOp=24, CondOp=25, OParen=26, CParen=27, OBrace=28, CBrace=29, OBracket=30, 
		CBracket=31, SemiColon=32, Comma=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "Delim", "Letter", "Digit", "HexDigit", "Alpha", "AlphaNum", "WhiteSpace", 
		"Char", "Str", "Class", "Program", "Void", "If", "Else", "For", "Ret", 
		"Brk", "Cnt", "Callout", "DecLit", "HexLit", "BoolLit", "Type", "Ident", 
		"While", "EqOp", "Relop", "AssignOp", "ArithOp", "CondOp", "OParen", "CParen", 
		"OBrace", "CBrace", "OBracket", "CBracket", "SemiColon", "Comma"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", null, null, null, "'class'", "'Program'", "'void'", "'if'", 
		"'else'", "'for'", "'return'", "'break'", "'continue'", "'callout'", null, 
		null, null, null, null, "'while'", null, null, null, null, null, "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WhiteSpace", "Char", "Str", "Class", "Program", "Void", "If", 
		"Else", "For", "Ret", "Brk", "Cnt", "Callout", "DecLit", "HexLit", "BoolLit", 
		"Type", "Ident", "While", "EqOp", "Relop", "AssignOp", "ArithOp", "CondOp", 
		"OParen", "CParen", "OBrace", "CBrace", "OBracket", "CBracket", "SemiColon", 
		"Comma"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u011b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\5\6\\\n\6\3\7\3\7\5\7`\n\7\3\b\3\b\5\bd\n\b\3\t\6"+
		"\tg\n\t\r\t\16\th\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nu\n\n\3\13"+
		"\3\13\3\13\3\13\7\13{\n\13\f\13\16\13~\13\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\6\26\u00c0\n\26\r\26\16\26\u00c1\3\27\3\27\3\27\3\27\6\27\u00c8\n\27"+
		"\r\27\16\27\u00c9\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00d5"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00e1\n\31"+
		"\3\32\3\32\7\32\u00e5\n\32\f\32\16\32\u00e8\13\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u00f4\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u00fb\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u0102\n\36\3\37\3\37\3"+
		" \3 \3 \3 \5 \u010a\n \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\2\2)\3\3\5\2\7\2\t\2\13\2\r\2\17\2\21\4\23\5\25\6\27\7\31\b\33\t"+
		"\35\n\37\13!\f#\r%\16\'\17)\20+\21-\22/\23\61\24\63\25\65\26\67\279\30"+
		";\31=\32?\33A\34C\35E\36G\37I K!M\"O#\3\2\n\4\2\13\f\"\"\4\2C\\c|\3\2"+
		"\62;\4\2CHch\3\2^^\4\2$$^^\4\2>>@@\6\2\'\',-//\61\61\u0126\2\3\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7U\3\2\2\2\tW\3\2"+
		"\2\2\13[\3\2\2\2\r_\3\2\2\2\17c\3\2\2\2\21f\3\2\2\2\23t\3\2\2\2\25v\3"+
		"\2\2\2\27\u0081\3\2\2\2\31\u0087\3\2\2\2\33\u008f\3\2\2\2\35\u0094\3\2"+
		"\2\2\37\u0097\3\2\2\2!\u009c\3\2\2\2#\u00a0\3\2\2\2%\u00a7\3\2\2\2\'\u00ad"+
		"\3\2\2\2)\u00b6\3\2\2\2+\u00bf\3\2\2\2-\u00c3\3\2\2\2/\u00d4\3\2\2\2\61"+
		"\u00e0\3\2\2\2\63\u00e2\3\2\2\2\65\u00e9\3\2\2\2\67\u00f3\3\2\2\29\u00fa"+
		"\3\2\2\2;\u0101\3\2\2\2=\u0103\3\2\2\2?\u0109\3\2\2\2A\u010b\3\2\2\2C"+
		"\u010d\3\2\2\2E\u010f\3\2\2\2G\u0111\3\2\2\2I\u0113\3\2\2\2K\u0115\3\2"+
		"\2\2M\u0117\3\2\2\2O\u0119\3\2\2\2QR\7?\2\2R\4\3\2\2\2ST\t\2\2\2T\6\3"+
		"\2\2\2UV\t\3\2\2V\b\3\2\2\2WX\t\4\2\2X\n\3\2\2\2Y\\\5\t\5\2Z\\\t\5\2\2"+
		"[Y\3\2\2\2[Z\3\2\2\2\\\f\3\2\2\2]`\5\7\4\2^`\7a\2\2_]\3\2\2\2_^\3\2\2"+
		"\2`\16\3\2\2\2ad\5\r\7\2bd\5\t\5\2ca\3\2\2\2cb\3\2\2\2d\20\3\2\2\2eg\5"+
		"\5\3\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\b\t\2\2k\22"+
		"\3\2\2\2lm\7)\2\2mn\n\6\2\2nu\7)\2\2op\7)\2\2pq\7^\2\2qr\3\2\2\2rs\13"+
		"\2\2\2su\7)\2\2tl\3\2\2\2to\3\2\2\2u\24\3\2\2\2v|\7$\2\2w{\n\7\2\2xy\7"+
		"^\2\2y{\13\2\2\2zw\3\2\2\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177"+
		"\3\2\2\2~|\3\2\2\2\177\u0080\7$\2\2\u0080\26\3\2\2\2\u0081\u0082\7e\2"+
		"\2\u0082\u0083\7n\2\2\u0083\u0084\7c\2\2\u0084\u0085\7u\2\2\u0085\u0086"+
		"\7u\2\2\u0086\30\3\2\2\2\u0087\u0088\7R\2\2\u0088\u0089\7t\2\2\u0089\u008a"+
		"\7q\2\2\u008a\u008b\7i\2\2\u008b\u008c\7t\2\2\u008c\u008d\7c\2\2\u008d"+
		"\u008e\7o\2\2\u008e\32\3\2\2\2\u008f\u0090\7x\2\2\u0090\u0091\7q\2\2\u0091"+
		"\u0092\7k\2\2\u0092\u0093\7f\2\2\u0093\34\3\2\2\2\u0094\u0095\7k\2\2\u0095"+
		"\u0096\7h\2\2\u0096\36\3\2\2\2\u0097\u0098\7g\2\2\u0098\u0099\7n\2\2\u0099"+
		"\u009a\7u\2\2\u009a\u009b\7g\2\2\u009b \3\2\2\2\u009c\u009d\7h\2\2\u009d"+
		"\u009e\7q\2\2\u009e\u009f\7t\2\2\u009f\"\3\2\2\2\u00a0\u00a1\7t\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7t\2\2"+
		"\u00a5\u00a6\7p\2\2\u00a6$\3\2\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\7t\2"+
		"\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7m\2\2\u00ac&\3\2"+
		"\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1"+
		"\7v\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7w\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5(\3\2\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7c\2\2\u00b8"+
		"\u00b9\7n\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7w\2\2"+
		"\u00bc\u00bd\7v\2\2\u00bd*\3\2\2\2\u00be\u00c0\5\t\5\2\u00bf\u00be\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		",\3\2\2\2\u00c3\u00c4\7\62\2\2\u00c4\u00c5\7z\2\2\u00c5\u00c7\3\2\2\2"+
		"\u00c6\u00c8\5\13\6\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca.\3\2\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd"+
		"\7t\2\2\u00cd\u00ce\7w\2\2\u00ce\u00d5\7g\2\2\u00cf\u00d0\7h\2\2\u00d0"+
		"\u00d1\7c\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d5\7g\2\2"+
		"\u00d4\u00cb\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d5\60\3\2\2\2\u00d6\u00d7"+
		"\7k\2\2\u00d7\u00d8\7p\2\2\u00d8\u00e1\7v\2\2\u00d9\u00da\7d\2\2\u00da"+
		"\u00db\7q\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7g\2\2"+
		"\u00de\u00df\7c\2\2\u00df\u00e1\7p\2\2\u00e0\u00d6\3\2\2\2\u00e0\u00d9"+
		"\3\2\2\2\u00e1\62\3\2\2\2\u00e2\u00e6\5\r\7\2\u00e3\u00e5\5\17\b\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\64\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7y\2\2\u00ea\u00eb"+
		"\7j\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7g\2\2\u00ee"+
		"\66\3\2\2\2\u00ef\u00f0\7?\2\2\u00f0\u00f4\7?\2\2\u00f1\u00f2\7#\2\2\u00f2"+
		"\u00f4\7?\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f48\3\2\2\2\u00f5"+
		"\u00f6\7>\2\2\u00f6\u00fb\7?\2\2\u00f7\u00f8\7@\2\2\u00f8\u00fb\7?\2\2"+
		"\u00f9\u00fb\t\b\2\2\u00fa\u00f5\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb:\3\2\2\2\u00fc\u0102\7?\2\2\u00fd\u00fe\7-\2\2\u00fe\u0102"+
		"\7?\2\2\u00ff\u0100\7/\2\2\u0100\u0102\7?\2\2\u0101\u00fc\3\2\2\2\u0101"+
		"\u00fd\3\2\2\2\u0101\u00ff\3\2\2\2\u0102<\3\2\2\2\u0103\u0104\t\t\2\2"+
		"\u0104>\3\2\2\2\u0105\u0106\7(\2\2\u0106\u010a\7(\2\2\u0107\u0108\7~\2"+
		"\2\u0108\u010a\7~\2\2\u0109\u0105\3\2\2\2\u0109\u0107\3\2\2\2\u010a@\3"+
		"\2\2\2\u010b\u010c\7*\2\2\u010cB\3\2\2\2\u010d\u010e\7+\2\2\u010eD\3\2"+
		"\2\2\u010f\u0110\7}\2\2\u0110F\3\2\2\2\u0111\u0112\7\177\2\2\u0112H\3"+
		"\2\2\2\u0113\u0114\7]\2\2\u0114J\3\2\2\2\u0115\u0116\7_\2\2\u0116L\3\2"+
		"\2\2\u0117\u0118\7=\2\2\u0118N\3\2\2\2\u0119\u011a\7.\2\2\u011aP\3\2\2"+
		"\2\23\2[_chtz|\u00c1\u00c9\u00d4\u00e0\u00e6\u00f3\u00fa\u0101\u0109\3"+
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