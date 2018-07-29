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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, WhiteSpace=19, Char=20, Str=21, Class=22, Program=23, Void=24, 
		While=25, Switch=26, Case=27, If=28, Else=29, For=30, Ret=31, Brk=32, 
		Cnt=33, Callout=34, DecNum=35, HexNum=36, BoolLit=37, Type=38, Ident=39, 
		RelOp=40, AssignOp=41, Minus=42, SecondOp=43, ThirdOp=44, CondOp=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "Delim", "Letter", "Digit", "HexDigit", "Alpha", "AlphaNum", 
		"WhiteSpace", "Char", "Str", "Class", "Program", "Void", "While", "Switch", 
		"Case", "If", "Else", "For", "Ret", "Brk", "Cnt", "Callout", "DecNum", 
		"HexNum", "BoolLit", "Type", "Ident", "RelOp", "AssignOp", "Minus", "SecondOp", 
		"ThirdOp", "CondOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", "'['", "']'", "'='", "'('", "')'", "':'", 
		"'&&'", "'||'", "'!'", "'true'", "'false'", "'*'", "'/'", "'+'", null, 
		null, null, "'class'", "'Program'", "'void'", "'while'", "'switch'", "'case'", 
		"'if'", "'else'", "'for'", "'return'", "'break'", "'continue'", "'callout'", 
		null, null, null, null, null, null, null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "WhiteSpace", "Char", "Str", 
		"Class", "Program", "Void", "While", "Switch", "Case", "If", "Else", "For", 
		"Ret", "Brk", "Cnt", "Callout", "DecNum", "HexNum", "BoolLit", "Type", 
		"Ident", "RelOp", "AssignOp", "Minus", "SecondOp", "ThirdOp", "CondOp"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u015d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\5\27\u009f\n\27\3\30\3\30\5\30\u00a3"+
		"\n\30\3\31\3\31\5\31\u00a7\n\31\3\32\6\32\u00aa\n\32\r\32\16\32\u00ab"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00b8\n\33\3\34"+
		"\3\34\3\34\3\34\7\34\u00be\n\34\f\34\16\34\u00c1\13\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3*\6*\u0115\n*\r*\16*\u0116\3+\3+\3+\3+\6+\u011d\n+\r+\16+\u011e"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u012a\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\5-\u0136\n-\3.\3.\7.\u013a\n.\f.\16.\u013d\13.\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\5/\u0148\n/\3\60\3\60\3\60\3\60\5\60\u014e\n\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\5\63\u0156\n\63\3\64\3\64\3\64\3\64\5\64\u015c\n\64\2\2"+
		"\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\2)\2+\2-\2/\2\61\2\63\25\65\26\67\279\30;\31="+
		"\32?\33A\34C\35E\36G\37I K!M\"O#Q$S%U&W\'Y([)]*_+a,c-e.g/\3\2\n\4\2\13"+
		"\f\"\"\4\2C\\c|\3\2\62;\4\2CHch\3\2^^\4\2$$^^\4\2>>@@\5\2\'\',,\61\61"+
		"\u0169\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5k\3\2\2\2\7"+
		"m\3\2\2\2\to\3\2\2\2\13q\3\2\2\2\rs\3\2\2\2\17u\3\2\2\2\21w\3\2\2\2\23"+
		"y\3\2\2\2\25{\3\2\2\2\27}\3\2\2\2\31\u0080\3\2\2\2\33\u0083\3\2\2\2\35"+
		"\u0085\3\2\2\2\37\u008a\3\2\2\2!\u0090\3\2\2\2#\u0092\3\2\2\2%\u0094\3"+
		"\2\2\2\'\u0096\3\2\2\2)\u0098\3\2\2\2+\u009a\3\2\2\2-\u009e\3\2\2\2/\u00a2"+
		"\3\2\2\2\61\u00a6\3\2\2\2\63\u00a9\3\2\2\2\65\u00b7\3\2\2\2\67\u00b9\3"+
		"\2\2\29\u00c4\3\2\2\2;\u00ca\3\2\2\2=\u00d2\3\2\2\2?\u00d7\3\2\2\2A\u00dd"+
		"\3\2\2\2C\u00e4\3\2\2\2E\u00e9\3\2\2\2G\u00ec\3\2\2\2I\u00f1\3\2\2\2K"+
		"\u00f5\3\2\2\2M\u00fc\3\2\2\2O\u0102\3\2\2\2Q\u010b\3\2\2\2S\u0114\3\2"+
		"\2\2U\u0118\3\2\2\2W\u0129\3\2\2\2Y\u0135\3\2\2\2[\u0137\3\2\2\2]\u0147"+
		"\3\2\2\2_\u014d\3\2\2\2a\u014f\3\2\2\2c\u0151\3\2\2\2e\u0155\3\2\2\2g"+
		"\u015b\3\2\2\2ij\7}\2\2j\4\3\2\2\2kl\7\177\2\2l\6\3\2\2\2mn\7=\2\2n\b"+
		"\3\2\2\2op\7.\2\2p\n\3\2\2\2qr\7]\2\2r\f\3\2\2\2st\7_\2\2t\16\3\2\2\2"+
		"uv\7?\2\2v\20\3\2\2\2wx\7*\2\2x\22\3\2\2\2yz\7+\2\2z\24\3\2\2\2{|\7<\2"+
		"\2|\26\3\2\2\2}~\7(\2\2~\177\7(\2\2\177\30\3\2\2\2\u0080\u0081\7~\2\2"+
		"\u0081\u0082\7~\2\2\u0082\32\3\2\2\2\u0083\u0084\7#\2\2\u0084\34\3\2\2"+
		"\2\u0085\u0086\7v\2\2\u0086\u0087\7t\2\2\u0087\u0088\7w\2\2\u0088\u0089"+
		"\7g\2\2\u0089\36\3\2\2\2\u008a\u008b\7h\2\2\u008b\u008c\7c\2\2\u008c\u008d"+
		"\7n\2\2\u008d\u008e\7u\2\2\u008e\u008f\7g\2\2\u008f \3\2\2\2\u0090\u0091"+
		"\7,\2\2\u0091\"\3\2\2\2\u0092\u0093\7\61\2\2\u0093$\3\2\2\2\u0094\u0095"+
		"\7-\2\2\u0095&\3\2\2\2\u0096\u0097\t\2\2\2\u0097(\3\2\2\2\u0098\u0099"+
		"\t\3\2\2\u0099*\3\2\2\2\u009a\u009b\t\4\2\2\u009b,\3\2\2\2\u009c\u009f"+
		"\5+\26\2\u009d\u009f\t\5\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		".\3\2\2\2\u00a0\u00a3\5)\25\2\u00a1\u00a3\7a\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\60\3\2\2\2\u00a4\u00a7\5/\30\2\u00a5\u00a7\5+\26"+
		"\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\62\3\2\2\2\u00a8\u00aa"+
		"\5\'\24\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\32\2\2\u00ae\64"+
		"\3\2\2\2\u00af\u00b0\7)\2\2\u00b0\u00b1\n\6\2\2\u00b1\u00b8\7)\2\2\u00b2"+
		"\u00b3\7)\2\2\u00b3\u00b4\7^\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\13\2"+
		"\2\2\u00b6\u00b8\7)\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b8"+
		"\66\3\2\2\2\u00b9\u00bf\7$\2\2\u00ba\u00be\n\7\2\2\u00bb\u00bc\7^\2\2"+
		"\u00bc\u00be\13\2\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c1"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c3\7$\2\2\u00c38\3\2\2\2\u00c4\u00c5\7e\2\2\u00c5"+
		"\u00c6\7n\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7u\2\2"+
		"\u00c9:\3\2\2\2\u00ca\u00cb\7R\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7q\2"+
		"\2\u00cd\u00ce\7i\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1"+
		"\7o\2\2\u00d1<\3\2\2\2\u00d2\u00d3\7x\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5"+
		"\7k\2\2\u00d5\u00d6\7f\2\2\u00d6>\3\2\2\2\u00d7\u00d8\7y\2\2\u00d8\u00d9"+
		"\7j\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"@\3\2\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7y\2\2\u00df\u00e0\7k\2\2\u00e0"+
		"\u00e1\7v\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7j\2\2\u00e3B\3\2\2\2\u00e4"+
		"\u00e5\7e\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7g\2\2"+
		"\u00e8D\3\2\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7h\2\2\u00ebF\3\2\2\2\u00ec"+
		"\u00ed\7g\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7g\2\2"+
		"\u00f0H\3\2\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7t\2"+
		"\2\u00f4J\3\2\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7"+
		"v\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7p\2\2\u00fbL"+
		"\3\2\2\2\u00fc\u00fd\7d\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7g\2\2\u00ff"+
		"\u0100\7c\2\2\u0100\u0101\7m\2\2\u0101N\3\2\2\2\u0102\u0103\7e\2\2\u0103"+
		"\u0104\7q\2\2\u0104\u0105\7p\2\2\u0105\u0106\7v\2\2\u0106\u0107\7k\2\2"+
		"\u0107\u0108\7p\2\2\u0108\u0109\7w\2\2\u0109\u010a\7g\2\2\u010aP\3\2\2"+
		"\2\u010b\u010c\7e\2\2\u010c\u010d\7c\2\2\u010d\u010e\7n\2\2\u010e\u010f"+
		"\7n\2\2\u010f\u0110\7q\2\2\u0110\u0111\7w\2\2\u0111\u0112\7v\2\2\u0112"+
		"R\3\2\2\2\u0113\u0115\5+\26\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2"+
		"\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117T\3\2\2\2\u0118\u0119\7"+
		"\62\2\2\u0119\u011a\7z\2\2\u011a\u011c\3\2\2\2\u011b\u011d\5-\27\2\u011c"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011fV\3\2\2\2\u0120\u0121\7v\2\2\u0121\u0122\7t\2\2\u0122\u0123"+
		"\7w\2\2\u0123\u012a\7g\2\2\u0124\u0125\7h\2\2\u0125\u0126\7c\2\2\u0126"+
		"\u0127\7n\2\2\u0127\u0128\7u\2\2\u0128\u012a\7g\2\2\u0129\u0120\3\2\2"+
		"\2\u0129\u0124\3\2\2\2\u012aX\3\2\2\2\u012b\u012c\7k\2\2\u012c\u012d\7"+
		"p\2\2\u012d\u0136\7v\2\2\u012e\u012f\7d\2\2\u012f\u0130\7q\2\2\u0130\u0131"+
		"\7q\2\2\u0131\u0132\7n\2\2\u0132\u0133\7g\2\2\u0133\u0134\7c\2\2\u0134"+
		"\u0136\7p\2\2\u0135\u012b\3\2\2\2\u0135\u012e\3\2\2\2\u0136Z\3\2\2\2\u0137"+
		"\u013b\5/\30\2\u0138\u013a\5\61\31\2\u0139\u0138\3\2\2\2\u013a\u013d\3"+
		"\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\\\3\2\2\2\u013d\u013b"+
		"\3\2\2\2\u013e\u013f\7>\2\2\u013f\u0148\7?\2\2\u0140\u0141\7@\2\2\u0141"+
		"\u0148\7?\2\2\u0142\u0148\t\b\2\2\u0143\u0144\7?\2\2\u0144\u0148\7?\2"+
		"\2\u0145\u0146\7#\2\2\u0146\u0148\7?\2\2\u0147\u013e\3\2\2\2\u0147\u0140"+
		"\3\2\2\2\u0147\u0142\3\2\2\2\u0147\u0143\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"^\3\2\2\2\u0149\u014a\7-\2\2\u014a\u014e\7?\2\2\u014b\u014c\7/\2\2\u014c"+
		"\u014e\7?\2\2\u014d\u0149\3\2\2\2\u014d\u014b\3\2\2\2\u014e`\3\2\2\2\u014f"+
		"\u0150\7/\2\2\u0150b\3\2\2\2\u0151\u0152\t\t\2\2\u0152d\3\2\2\2\u0153"+
		"\u0156\7-\2\2\u0154\u0156\5a\61\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2"+
		"\2\2\u0156f\3\2\2\2\u0157\u0158\7(\2\2\u0158\u015c\7(\2\2\u0159\u015a"+
		"\7~\2\2\u015a\u015c\7~\2\2\u015b\u0157\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"h\3\2\2\2\23\2\u009e\u00a2\u00a6\u00ab\u00b7\u00bd\u00bf\u0116\u011e\u0129"+
		"\u0135\u013b\u0147\u014d\u0155\u015b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}