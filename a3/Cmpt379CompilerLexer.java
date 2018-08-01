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
		T__17=18, T__18=19, T__19=20, WhiteSpace=21, Char=22, Str=23, Class=24, 
		Program=25, Void=26, While=27, Switch=28, Case=29, If=30, Else=31, For=32, 
		Ret=33, Brk=34, Cnt=35, Callout=36, DecNum=37, HexNum=38, BoolLit=39, 
		Type=40, Ident=41, RelOp=42, AssignOp=43, Minus=44, SecondOp=45, ThirdOp=46, 
		CondOp=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "Delim", "Letter", "Digit", "HexDigit", "Alpha", 
		"AlphaNum", "WhiteSpace", "Char", "Str", "Class", "Program", "Void", "While", 
		"Switch", "Case", "If", "Else", "For", "Ret", "Brk", "Cnt", "Callout", 
		"DecNum", "HexNum", "BoolLit", "Type", "Ident", "RelOp", "AssignOp", "Minus", 
		"SecondOp", "ThirdOp", "CondOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", "'['", "']'", "'='", "'('", "')'", "'+='", 
		"'-='", "':'", "'&&'", "'||'", "'!'", "'true'", "'false'", "'*'", "'/'", 
		"'+'", null, null, null, "'class'", "'Program'", "'void'", "'while'", 
		"'switch'", "'case'", "'if'", "'else'", "'for'", "'return'", "'break'", 
		"'continue'", "'callout'", null, null, null, null, null, null, null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "WhiteSpace", "Char", 
		"Str", "Class", "Program", "Void", "While", "Switch", "Case", "If", "Else", 
		"For", "Ret", "Brk", "Cnt", "Callout", "DecNum", "HexNum", "BoolLit", 
		"Type", "Ident", "RelOp", "AssignOp", "Minus", "SecondOp", "ThirdOp", 
		"CondOp"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u0167\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\5\31\u00a9\n\31\3\32\3\32\5\32\u00ad\n\32\3\33\3\33"+
		"\5\33\u00b1\n\33\3\34\6\34\u00b4\n\34\r\34\16\34\u00b5\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00c2\n\35\3\36\3\36\3\36\3\36"+
		"\7\36\u00c8\n\36\f\36\16\36\u00cb\13\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\6,\u011f\n,\r,\16,\u0120\3-\3-\3-\3"+
		"-\6-\u0127\n-\r-\16-\u0128\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0134\n.\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0140\n/\3\60\3\60\7\60\u0144\n\60\f\60\16"+
		"\60\u0147\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0152"+
		"\n\61\3\62\3\62\3\62\3\62\5\62\u0158\n\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\5\65\u0160\n\65\3\66\3\66\3\66\3\66\5\66\u0166\n\66\2\2\67\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\2-\2/\2\61\2\63\2\65\2\67\279\30;\31=\32?\33A\34C\35"+
		"E\36G\37I K!M\"O#Q$S%U&W\'Y([)]*_+a,c-e.g/i\60k\61\3\2\n\4\2\13\f\"\""+
		"\4\2C\\c|\3\2\62;\4\2CHch\3\2^^\4\2$$^^\4\2>>@@\5\2\'\',,\61\61\u0173"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2"+
		"\5o\3\2\2\2\7q\3\2\2\2\ts\3\2\2\2\13u\3\2\2\2\rw\3\2\2\2\17y\3\2\2\2\21"+
		"{\3\2\2\2\23}\3\2\2\2\25\177\3\2\2\2\27\u0082\3\2\2\2\31\u0085\3\2\2\2"+
		"\33\u0087\3\2\2\2\35\u008a\3\2\2\2\37\u008d\3\2\2\2!\u008f\3\2\2\2#\u0094"+
		"\3\2\2\2%\u009a\3\2\2\2\'\u009c\3\2\2\2)\u009e\3\2\2\2+\u00a0\3\2\2\2"+
		"-\u00a2\3\2\2\2/\u00a4\3\2\2\2\61\u00a8\3\2\2\2\63\u00ac\3\2\2\2\65\u00b0"+
		"\3\2\2\2\67\u00b3\3\2\2\29\u00c1\3\2\2\2;\u00c3\3\2\2\2=\u00ce\3\2\2\2"+
		"?\u00d4\3\2\2\2A\u00dc\3\2\2\2C\u00e1\3\2\2\2E\u00e7\3\2\2\2G\u00ee\3"+
		"\2\2\2I\u00f3\3\2\2\2K\u00f6\3\2\2\2M\u00fb\3\2\2\2O\u00ff\3\2\2\2Q\u0106"+
		"\3\2\2\2S\u010c\3\2\2\2U\u0115\3\2\2\2W\u011e\3\2\2\2Y\u0122\3\2\2\2["+
		"\u0133\3\2\2\2]\u013f\3\2\2\2_\u0141\3\2\2\2a\u0151\3\2\2\2c\u0157\3\2"+
		"\2\2e\u0159\3\2\2\2g\u015b\3\2\2\2i\u015f\3\2\2\2k\u0165\3\2\2\2mn\7}"+
		"\2\2n\4\3\2\2\2op\7\177\2\2p\6\3\2\2\2qr\7=\2\2r\b\3\2\2\2st\7.\2\2t\n"+
		"\3\2\2\2uv\7]\2\2v\f\3\2\2\2wx\7_\2\2x\16\3\2\2\2yz\7?\2\2z\20\3\2\2\2"+
		"{|\7*\2\2|\22\3\2\2\2}~\7+\2\2~\24\3\2\2\2\177\u0080\7-\2\2\u0080\u0081"+
		"\7?\2\2\u0081\26\3\2\2\2\u0082\u0083\7/\2\2\u0083\u0084\7?\2\2\u0084\30"+
		"\3\2\2\2\u0085\u0086\7<\2\2\u0086\32\3\2\2\2\u0087\u0088\7(\2\2\u0088"+
		"\u0089\7(\2\2\u0089\34\3\2\2\2\u008a\u008b\7~\2\2\u008b\u008c\7~\2\2\u008c"+
		"\36\3\2\2\2\u008d\u008e\7#\2\2\u008e \3\2\2\2\u008f\u0090\7v\2\2\u0090"+
		"\u0091\7t\2\2\u0091\u0092\7w\2\2\u0092\u0093\7g\2\2\u0093\"\3\2\2\2\u0094"+
		"\u0095\7h\2\2\u0095\u0096\7c\2\2\u0096\u0097\7n\2\2\u0097\u0098\7u\2\2"+
		"\u0098\u0099\7g\2\2\u0099$\3\2\2\2\u009a\u009b\7,\2\2\u009b&\3\2\2\2\u009c"+
		"\u009d\7\61\2\2\u009d(\3\2\2\2\u009e\u009f\7-\2\2\u009f*\3\2\2\2\u00a0"+
		"\u00a1\t\2\2\2\u00a1,\3\2\2\2\u00a2\u00a3\t\3\2\2\u00a3.\3\2\2\2\u00a4"+
		"\u00a5\t\4\2\2\u00a5\60\3\2\2\2\u00a6\u00a9\5/\30\2\u00a7\u00a9\t\5\2"+
		"\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\62\3\2\2\2\u00aa\u00ad"+
		"\5-\27\2\u00ab\u00ad\7a\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\64\3\2\2\2\u00ae\u00b1\5\63\32\2\u00af\u00b1\5/\30\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00af\3\2\2\2\u00b1\66\3\2\2\2\u00b2\u00b4\5+\26\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\b\34\2\2\u00b88\3\2\2\2\u00b9\u00ba\7)\2\2"+
		"\u00ba\u00bb\n\6\2\2\u00bb\u00c2\7)\2\2\u00bc\u00bd\7)\2\2\u00bd\u00be"+
		"\7^\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\13\2\2\2\u00c0\u00c2\7)\2\2\u00c1"+
		"\u00b9\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2:\3\2\2\2\u00c3\u00c9\7$\2\2\u00c4"+
		"\u00c8\n\7\2\2\u00c5\u00c6\7^\2\2\u00c6\u00c8\13\2\2\2\u00c7\u00c4\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7$"+
		"\2\2\u00cd<\3\2\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1"+
		"\7c\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7u\2\2\u00d3>\3\2\2\2\u00d4\u00d5"+
		"\7R\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7i\2\2\u00d8"+
		"\u00d9\7t\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7o\2\2\u00db@\3\2\2\2\u00dc"+
		"\u00dd\7x\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7f\2\2"+
		"\u00e0B\3\2\2\2\u00e1\u00e2\7y\2\2\u00e2\u00e3\7j\2\2\u00e3\u00e4\7k\2"+
		"\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7g\2\2\u00e6D\3\2\2\2\u00e7\u00e8\7"+
		"u\2\2\u00e8\u00e9\7y\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec"+
		"\7e\2\2\u00ec\u00ed\7j\2\2\u00edF\3\2\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0"+
		"\7c\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7g\2\2\u00f2H\3\2\2\2\u00f3\u00f4"+
		"\7k\2\2\u00f4\u00f5\7h\2\2\u00f5J\3\2\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8"+
		"\7n\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7g\2\2\u00faL\3\2\2\2\u00fb\u00fc"+
		"\7h\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7t\2\2\u00feN\3\2\2\2\u00ff\u0100"+
		"\7t\2\2\u0100\u0101\7g\2\2\u0101\u0102\7v\2\2\u0102\u0103\7w\2\2\u0103"+
		"\u0104\7t\2\2\u0104\u0105\7p\2\2\u0105P\3\2\2\2\u0106\u0107\7d\2\2\u0107"+
		"\u0108\7t\2\2\u0108\u0109\7g\2\2\u0109\u010a\7c\2\2\u010a\u010b\7m\2\2"+
		"\u010bR\3\2\2\2\u010c\u010d\7e\2\2\u010d\u010e\7q\2\2\u010e\u010f\7p\2"+
		"\2\u010f\u0110\7v\2\2\u0110\u0111\7k\2\2\u0111\u0112\7p\2\2\u0112\u0113"+
		"\7w\2\2\u0113\u0114\7g\2\2\u0114T\3\2\2\2\u0115\u0116\7e\2\2\u0116\u0117"+
		"\7c\2\2\u0117\u0118\7n\2\2\u0118\u0119\7n\2\2\u0119\u011a\7q\2\2\u011a"+
		"\u011b\7w\2\2\u011b\u011c\7v\2\2\u011cV\3\2\2\2\u011d\u011f\5/\30\2\u011e"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121X\3\2\2\2\u0122\u0123\7\62\2\2\u0123\u0124\7z\2\2\u0124\u0126"+
		"\3\2\2\2\u0125\u0127\5\61\31\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2"+
		"\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129Z\3\2\2\2\u012a\u012b\7"+
		"v\2\2\u012b\u012c\7t\2\2\u012c\u012d\7w\2\2\u012d\u0134\7g\2\2\u012e\u012f"+
		"\7h\2\2\u012f\u0130\7c\2\2\u0130\u0131\7n\2\2\u0131\u0132\7u\2\2\u0132"+
		"\u0134\7g\2\2\u0133\u012a\3\2\2\2\u0133\u012e\3\2\2\2\u0134\\\3\2\2\2"+
		"\u0135\u0136\7k\2\2\u0136\u0137\7p\2\2\u0137\u0140\7v\2\2\u0138\u0139"+
		"\7d\2\2\u0139\u013a\7q\2\2\u013a\u013b\7q\2\2\u013b\u013c\7n\2\2\u013c"+
		"\u013d\7g\2\2\u013d\u013e\7c\2\2\u013e\u0140\7p\2\2\u013f\u0135\3\2\2"+
		"\2\u013f\u0138\3\2\2\2\u0140^\3\2\2\2\u0141\u0145\5\63\32\2\u0142\u0144"+
		"\5\65\33\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2"+
		"\u0145\u0146\3\2\2\2\u0146`\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7"+
		">\2\2\u0149\u0152\7?\2\2\u014a\u014b\7@\2\2\u014b\u0152\7?\2\2\u014c\u0152"+
		"\t\b\2\2\u014d\u014e\7?\2\2\u014e\u0152\7?\2\2\u014f\u0150\7#\2\2\u0150"+
		"\u0152\7?\2\2\u0151\u0148\3\2\2\2\u0151\u014a\3\2\2\2\u0151\u014c\3\2"+
		"\2\2\u0151\u014d\3\2\2\2\u0151\u014f\3\2\2\2\u0152b\3\2\2\2\u0153\u0154"+
		"\7-\2\2\u0154\u0158\7?\2\2\u0155\u0156\7/\2\2\u0156\u0158\7?\2\2\u0157"+
		"\u0153\3\2\2\2\u0157\u0155\3\2\2\2\u0158d\3\2\2\2\u0159\u015a\7/\2\2\u015a"+
		"f\3\2\2\2\u015b\u015c\t\t\2\2\u015ch\3\2\2\2\u015d\u0160\7-\2\2\u015e"+
		"\u0160\5e\63\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160j\3\2\2\2"+
		"\u0161\u0162\7(\2\2\u0162\u0166\7(\2\2\u0163\u0164\7~\2\2\u0164\u0166"+
		"\7~\2\2\u0165\u0161\3\2\2\2\u0165\u0163\3\2\2\2\u0166l\3\2\2\2\23\2\u00a8"+
		"\u00ac\u00b0\u00b5\u00c1\u00c7\u00c9\u0120\u0128\u0133\u013f\u0145\u0151"+
		"\u0157\u015f\u0165\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}