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
		WhiteSpace=18, Char=19, Str=20, Class=21, Program=22, Void=23, While=24, 
		Switch=25, Case=26, If=27, Else=28, For=29, Ret=30, Brk=31, Cnt=32, Callout=33, 
		DecNum=34, HexNum=35, BoolLit=36, Type=37, Ident=38, RelOp=39, AssignOp=40, 
		Minus=41, SecondOp=42, ThirdOp=43, CondOp=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"Delim", "Letter", "Digit", "HexDigit", "Alpha", "AlphaNum", "WhiteSpace", 
		"Char", "Str", "Class", "Program", "Void", "While", "Switch", "Case", 
		"If", "Else", "For", "Ret", "Brk", "Cnt", "Callout", "DecNum", "HexNum", 
		"BoolLit", "Type", "Ident", "RelOp", "AssignOp", "Minus", "SecondOp", 
		"ThirdOp", "CondOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", "'['", "']'", "'='", "'('", "')'", "'&&'", 
		"'||'", "'!'", "'true'", "'false'", "'*'", "'/'", "'+'", null, null, null, 
		"'class'", "'Program'", "'void'", "'while'", "'switch'", "'case'", "'if'", 
		"'else'", "'for'", "'return'", "'break'", "'continue'", "'callout'", null, 
		null, null, null, null, null, null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "WhiteSpace", "Char", "Str", "Class", 
		"Program", "Void", "While", "Switch", "Case", "If", "Else", "For", "Ret", 
		"Brk", "Cnt", "Callout", "DecNum", "HexNum", "BoolLit", "Type", "Ident", 
		"RelOp", "AssignOp", "Minus", "SecondOp", "ThirdOp", "CondOp"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u0159\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\5\26\u009b\n\26\3\27\3\27\5\27\u009f\n\27\3\30\3\30\5"+
		"\30\u00a3\n\30\3\31\6\31\u00a6\n\31\r\31\16\31\u00a7\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00b4\n\32\3\33\3\33\3\33\3\33"+
		"\7\33\u00ba\n\33\f\33\16\33\u00bd\13\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3)\6)\u0111\n)\r)\16)\u0112\3*\3*\3*\3*\6*\u0119\n*\r*\16*\u011a\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0126\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,"+
		"\u0132\n,\3-\3-\7-\u0136\n-\f-\16-\u0139\13-\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\5.\u0144\n.\3/\3/\3/\3/\5/\u014a\n/\3\60\3\60\3\61\3\61\3\62\3\62\5"+
		"\62\u0152\n\62\3\63\3\63\3\63\3\63\5\63\u0158\n\63\2\2\64\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\2\'\2)\2+\2-\2/\2\61\24\63\25\65\26\67\279\30;\31=\32?\33A\34C\35E\36"+
		"G\37I K!M\"O#Q$S%U&W\'Y([)]*_+a,c-e.\3\2\n\4\2\13\f\"\"\4\2C\\c|\3\2\62"+
		";\4\2CHch\3\2^^\4\2$$^^\4\2>>@@\5\2\'\',,\61\61\u0165\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13o\3\2\2\2"+
		"\rq\3\2\2\2\17s\3\2\2\2\21u\3\2\2\2\23w\3\2\2\2\25y\3\2\2\2\27|\3\2\2"+
		"\2\31\177\3\2\2\2\33\u0081\3\2\2\2\35\u0086\3\2\2\2\37\u008c\3\2\2\2!"+
		"\u008e\3\2\2\2#\u0090\3\2\2\2%\u0092\3\2\2\2\'\u0094\3\2\2\2)\u0096\3"+
		"\2\2\2+\u009a\3\2\2\2-\u009e\3\2\2\2/\u00a2\3\2\2\2\61\u00a5\3\2\2\2\63"+
		"\u00b3\3\2\2\2\65\u00b5\3\2\2\2\67\u00c0\3\2\2\29\u00c6\3\2\2\2;\u00ce"+
		"\3\2\2\2=\u00d3\3\2\2\2?\u00d9\3\2\2\2A\u00e0\3\2\2\2C\u00e5\3\2\2\2E"+
		"\u00e8\3\2\2\2G\u00ed\3\2\2\2I\u00f1\3\2\2\2K\u00f8\3\2\2\2M\u00fe\3\2"+
		"\2\2O\u0107\3\2\2\2Q\u0110\3\2\2\2S\u0114\3\2\2\2U\u0125\3\2\2\2W\u0131"+
		"\3\2\2\2Y\u0133\3\2\2\2[\u0143\3\2\2\2]\u0149\3\2\2\2_\u014b\3\2\2\2a"+
		"\u014d\3\2\2\2c\u0151\3\2\2\2e\u0157\3\2\2\2gh\7}\2\2h\4\3\2\2\2ij\7\177"+
		"\2\2j\6\3\2\2\2kl\7=\2\2l\b\3\2\2\2mn\7.\2\2n\n\3\2\2\2op\7]\2\2p\f\3"+
		"\2\2\2qr\7_\2\2r\16\3\2\2\2st\7?\2\2t\20\3\2\2\2uv\7*\2\2v\22\3\2\2\2"+
		"wx\7+\2\2x\24\3\2\2\2yz\7(\2\2z{\7(\2\2{\26\3\2\2\2|}\7~\2\2}~\7~\2\2"+
		"~\30\3\2\2\2\177\u0080\7#\2\2\u0080\32\3\2\2\2\u0081\u0082\7v\2\2\u0082"+
		"\u0083\7t\2\2\u0083\u0084\7w\2\2\u0084\u0085\7g\2\2\u0085\34\3\2\2\2\u0086"+
		"\u0087\7h\2\2\u0087\u0088\7c\2\2\u0088\u0089\7n\2\2\u0089\u008a\7u\2\2"+
		"\u008a\u008b\7g\2\2\u008b\36\3\2\2\2\u008c\u008d\7,\2\2\u008d \3\2\2\2"+
		"\u008e\u008f\7\61\2\2\u008f\"\3\2\2\2\u0090\u0091\7-\2\2\u0091$\3\2\2"+
		"\2\u0092\u0093\t\2\2\2\u0093&\3\2\2\2\u0094\u0095\t\3\2\2\u0095(\3\2\2"+
		"\2\u0096\u0097\t\4\2\2\u0097*\3\2\2\2\u0098\u009b\5)\25\2\u0099\u009b"+
		"\t\5\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b,\3\2\2\2\u009c"+
		"\u009f\5\'\24\2\u009d\u009f\7a\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2"+
		"\2\2\u009f.\3\2\2\2\u00a0\u00a3\5-\27\2\u00a1\u00a3\5)\25\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\60\3\2\2\2\u00a4\u00a6\5%\23\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\31\2\2\u00aa\62\3\2\2\2\u00ab\u00ac"+
		"\7)\2\2\u00ac\u00ad\n\6\2\2\u00ad\u00b4\7)\2\2\u00ae\u00af\7)\2\2\u00af"+
		"\u00b0\7^\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\13\2\2\2\u00b2\u00b4\7)"+
		"\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4\64\3\2\2\2\u00b5\u00bb"+
		"\7$\2\2\u00b6\u00ba\n\7\2\2\u00b7\u00b8\7^\2\2\u00b8\u00ba\13\2\2\2\u00b9"+
		"\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00bf\7$\2\2\u00bf\66\3\2\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7n\2\2\u00c2"+
		"\u00c3\7c\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7u\2\2\u00c58\3\2\2\2\u00c6"+
		"\u00c7\7R\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7i\2\2"+
		"\u00ca\u00cb\7t\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7o\2\2\u00cd:\3\2\2"+
		"\2\u00ce\u00cf\7x\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2"+
		"\7f\2\2\u00d2<\3\2\2\2\u00d3\u00d4\7y\2\2\u00d4\u00d5\7j\2\2\u00d5\u00d6"+
		"\7k\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7g\2\2\u00d8>\3\2\2\2\u00d9\u00da"+
		"\7u\2\2\u00da\u00db\7y\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7v\2\2\u00dd"+
		"\u00de\7e\2\2\u00de\u00df\7j\2\2\u00df@\3\2\2\2\u00e0\u00e1\7e\2\2\u00e1"+
		"\u00e2\7c\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7g\2\2\u00e4B\3\2\2\2\u00e5"+
		"\u00e6\7k\2\2\u00e6\u00e7\7h\2\2\u00e7D\3\2\2\2\u00e8\u00e9\7g\2\2\u00e9"+
		"\u00ea\7n\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7g\2\2\u00ecF\3\2\2\2\u00ed"+
		"\u00ee\7h\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7t\2\2\u00f0H\3\2\2\2\u00f1"+
		"\u00f2\7t\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7w\2\2"+
		"\u00f5\u00f6\7t\2\2\u00f6\u00f7\7p\2\2\u00f7J\3\2\2\2\u00f8\u00f9\7d\2"+
		"\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd"+
		"\7m\2\2\u00fdL\3\2\2\2\u00fe\u00ff\7e\2\2\u00ff\u0100\7q\2\2\u0100\u0101"+
		"\7p\2\2\u0101\u0102\7v\2\2\u0102\u0103\7k\2\2\u0103\u0104\7p\2\2\u0104"+
		"\u0105\7w\2\2\u0105\u0106\7g\2\2\u0106N\3\2\2\2\u0107\u0108\7e\2\2\u0108"+
		"\u0109\7c\2\2\u0109\u010a\7n\2\2\u010a\u010b\7n\2\2\u010b\u010c\7q\2\2"+
		"\u010c\u010d\7w\2\2\u010d\u010e\7v\2\2\u010eP\3\2\2\2\u010f\u0111\5)\25"+
		"\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113R\3\2\2\2\u0114\u0115\7\62\2\2\u0115\u0116\7z\2\2\u0116"+
		"\u0118\3\2\2\2\u0117\u0119\5+\26\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011bT\3\2\2\2\u011c\u011d"+
		"\7v\2\2\u011d\u011e\7t\2\2\u011e\u011f\7w\2\2\u011f\u0126\7g\2\2\u0120"+
		"\u0121\7h\2\2\u0121\u0122\7c\2\2\u0122\u0123\7n\2\2\u0123\u0124\7u\2\2"+
		"\u0124\u0126\7g\2\2\u0125\u011c\3\2\2\2\u0125\u0120\3\2\2\2\u0126V\3\2"+
		"\2\2\u0127\u0128\7k\2\2\u0128\u0129\7p\2\2\u0129\u0132\7v\2\2\u012a\u012b"+
		"\7d\2\2\u012b\u012c\7q\2\2\u012c\u012d\7q\2\2\u012d\u012e\7n\2\2\u012e"+
		"\u012f\7g\2\2\u012f\u0130\7c\2\2\u0130\u0132\7p\2\2\u0131\u0127\3\2\2"+
		"\2\u0131\u012a\3\2\2\2\u0132X\3\2\2\2\u0133\u0137\5-\27\2\u0134\u0136"+
		"\5/\30\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138Z\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7>\2\2\u013b"+
		"\u0144\7?\2\2\u013c\u013d\7@\2\2\u013d\u0144\7?\2\2\u013e\u0144\t\b\2"+
		"\2\u013f\u0140\7?\2\2\u0140\u0144\7?\2\2\u0141\u0142\7#\2\2\u0142\u0144"+
		"\7?\2\2\u0143\u013a\3\2\2\2\u0143\u013c\3\2\2\2\u0143\u013e\3\2\2\2\u0143"+
		"\u013f\3\2\2\2\u0143\u0141\3\2\2\2\u0144\\\3\2\2\2\u0145\u0146\7-\2\2"+
		"\u0146\u014a\7?\2\2\u0147\u0148\7/\2\2\u0148\u014a\7?\2\2\u0149\u0145"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u014a^\3\2\2\2\u014b\u014c\7/\2\2\u014c`"+
		"\3\2\2\2\u014d\u014e\t\t\2\2\u014eb\3\2\2\2\u014f\u0152\7-\2\2\u0150\u0152"+
		"\5_\60\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152d\3\2\2\2\u0153"+
		"\u0154\7(\2\2\u0154\u0158\7(\2\2\u0155\u0156\7~\2\2\u0156\u0158\7~\2\2"+
		"\u0157\u0153\3\2\2\2\u0157\u0155\3\2\2\2\u0158f\3\2\2\2\23\2\u009a\u009e"+
		"\u00a2\u00a7\u00b3\u00b9\u00bb\u0112\u011a\u0125\u0131\u0137\u0143\u0149"+
		"\u0151\u0157\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}