// Generated from d:\compiler-design\assignment2\Cmpt379Compiler.g4 by ANTLR 4.7.1


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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, WhiteSpace=13, Char=14, Str=15, Class=16, 
		Program=17, Void=18, While=19, Switch=20, Case=21, If=22, Else=23, For=24, 
		Ret=25, Brk=26, Cnt=27, Callout=28, DecNum=29, HexNum=30, BoolLit=31, 
		Type=32, Ident=33, RelOp=34, AssignOp=35, ArithOp=36, CondOp=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "Delim", "Letter", "Digit", "HexDigit", "Alpha", 
		"AlphaNum", "WhiteSpace", "Char", "Str", "Class", "Program", "Void", "While", 
		"Switch", "Case", "If", "Else", "For", "Ret", "Brk", "Cnt", "Callout", 
		"DecNum", "HexNum", "BoolLit", "Type", "Ident", "RelOp", "AssignOp", "ArithOp", 
		"CondOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", "'['", "']'", "'='", "'('", "')'", "':'", 
		"'-'", "'!'", null, null, null, "'class'", "'Program'", "'void'", "'while'", 
		"'switch'", "'case'", "'if'", "'else'", "'for'", "'return'", "'break'", 
		"'continue'", "'callout'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "WhiteSpace", "Char", "Str", "Class", "Program", "Void", "While", 
		"Switch", "Case", "If", "Else", "For", "Ret", "Brk", "Cnt", "Callout", 
		"DecNum", "HexNum", "BoolLit", "Type", "Ident", "RelOp", "AssignOp", "ArithOp", 
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
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0132\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\5\21z\n\21\3\22\3\22\5\22~\n\22\3\23\3\23\5\23\u0082\n\23\3\24\6\24"+
		"\u0085\n\24\r\24\16\24\u0086\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u0093\n\25\3\26\3\26\3\26\3\26\7\26\u0099\n\26\f\26\16\26"+
		"\u009c\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3$\6$\u00f0\n$\r$\16$\u00f1\3%\3%\3%\3%\6%\u00f8\n"+
		"%\r%\16%\u00f9\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0105\n&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0111\n\'\3(\3(\7(\u0115\n(\f(\16(\u0118"+
		"\13(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0123\n)\3*\3*\3*\3*\5*\u0129\n*\3"+
		"+\3+\3,\3,\3,\3,\5,\u0131\n,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\2\35\2\37\2!\2#\2%\2\'\17)\20+\21-\22/\23\61\24"+
		"\63\25\65\26\67\279\30;\31=\32?\33A\34C\35E\36G\37I K!M\"O#Q$S%U&W\'\3"+
		"\2\n\4\2\13\f\"\"\4\2C\\c|\3\2\62;\4\2CHch\3\2^^\4\2$$^^\4\2>>@@\5\2\'"+
		"\',-\61\61\2\u013d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\t"+
		"_\3\2\2\2\13a\3\2\2\2\rc\3\2\2\2\17e\3\2\2\2\21g\3\2\2\2\23i\3\2\2\2\25"+
		"k\3\2\2\2\27m\3\2\2\2\31o\3\2\2\2\33q\3\2\2\2\35s\3\2\2\2\37u\3\2\2\2"+
		"!y\3\2\2\2#}\3\2\2\2%\u0081\3\2\2\2\'\u0084\3\2\2\2)\u0092\3\2\2\2+\u0094"+
		"\3\2\2\2-\u009f\3\2\2\2/\u00a5\3\2\2\2\61\u00ad\3\2\2\2\63\u00b2\3\2\2"+
		"\2\65\u00b8\3\2\2\2\67\u00bf\3\2\2\29\u00c4\3\2\2\2;\u00c7\3\2\2\2=\u00cc"+
		"\3\2\2\2?\u00d0\3\2\2\2A\u00d7\3\2\2\2C\u00dd\3\2\2\2E\u00e6\3\2\2\2G"+
		"\u00ef\3\2\2\2I\u00f3\3\2\2\2K\u0104\3\2\2\2M\u0110\3\2\2\2O\u0112\3\2"+
		"\2\2Q\u0122\3\2\2\2S\u0128\3\2\2\2U\u012a\3\2\2\2W\u0130\3\2\2\2YZ\7}"+
		"\2\2Z\4\3\2\2\2[\\\7\177\2\2\\\6\3\2\2\2]^\7=\2\2^\b\3\2\2\2_`\7.\2\2"+
		"`\n\3\2\2\2ab\7]\2\2b\f\3\2\2\2cd\7_\2\2d\16\3\2\2\2ef\7?\2\2f\20\3\2"+
		"\2\2gh\7*\2\2h\22\3\2\2\2ij\7+\2\2j\24\3\2\2\2kl\7<\2\2l\26\3\2\2\2mn"+
		"\7/\2\2n\30\3\2\2\2op\7#\2\2p\32\3\2\2\2qr\t\2\2\2r\34\3\2\2\2st\t\3\2"+
		"\2t\36\3\2\2\2uv\t\4\2\2v \3\2\2\2wz\5\37\20\2xz\t\5\2\2yw\3\2\2\2yx\3"+
		"\2\2\2z\"\3\2\2\2{~\5\35\17\2|~\7a\2\2}{\3\2\2\2}|\3\2\2\2~$\3\2\2\2\177"+
		"\u0082\5#\22\2\u0080\u0082\5\37\20\2\u0081\177\3\2\2\2\u0081\u0080\3\2"+
		"\2\2\u0082&\3\2\2\2\u0083\u0085\5\33\16\2\u0084\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\b\24\2\2\u0089(\3\2\2\2\u008a\u008b\7)\2\2\u008b\u008c\n\6\2\2"+
		"\u008c\u0093\7)\2\2\u008d\u008e\7)\2\2\u008e\u008f\7^\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\13\2\2\2\u0091\u0093\7)\2\2\u0092\u008a\3\2\2\2\u0092"+
		"\u008d\3\2\2\2\u0093*\3\2\2\2\u0094\u009a\7$\2\2\u0095\u0099\n\7\2\2\u0096"+
		"\u0097\7^\2\2\u0097\u0099\13\2\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7$\2\2\u009e,\3\2\2\2\u009f"+
		"\u00a0\7e\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7u\2\2"+
		"\u00a3\u00a4\7u\2\2\u00a4.\3\2\2\2\u00a5\u00a6\7R\2\2\u00a6\u00a7\7t\2"+
		"\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7i\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab"+
		"\7c\2\2\u00ab\u00ac\7o\2\2\u00ac\60\3\2\2\2\u00ad\u00ae\7x\2\2\u00ae\u00af"+
		"\7q\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7f\2\2\u00b1\62\3\2\2\2\u00b2\u00b3"+
		"\7y\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7n\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7\64\3\2\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7y\2\2\u00ba"+
		"\u00bb\7k\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7j\2\2"+
		"\u00be\66\3\2\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7"+
		"u\2\2\u00c2\u00c3\7g\2\2\u00c38\3\2\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6"+
		"\7h\2\2\u00c6:\3\2\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca"+
		"\7u\2\2\u00ca\u00cb\7g\2\2\u00cb<\3\2\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce"+
		"\7q\2\2\u00ce\u00cf\7t\2\2\u00cf>\3\2\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2"+
		"\7g\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\7t\2\2\u00d5"+
		"\u00d6\7p\2\2\u00d6@\3\2\2\2\u00d7\u00d8\7d\2\2\u00d8\u00d9\7t\2\2\u00d9"+
		"\u00da\7g\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7m\2\2\u00dcB\3\2\2\2\u00dd"+
		"\u00de\7e\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7v\2\2"+
		"\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5"+
		"\7g\2\2\u00e5D\3\2\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9"+
		"\7n\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7w\2\2\u00ec"+
		"\u00ed\7v\2\2\u00edF\3\2\2\2\u00ee\u00f0\5\37\20\2\u00ef\u00ee\3\2\2\2"+
		"\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2H\3"+
		"\2\2\2\u00f3\u00f4\7\62\2\2\u00f4\u00f5\7z\2\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00f8\5!\21\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00faJ\3\2\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd"+
		"\7t\2\2\u00fd\u00fe\7w\2\2\u00fe\u0105\7g\2\2\u00ff\u0100\7h\2\2\u0100"+
		"\u0101\7c\2\2\u0101\u0102\7n\2\2\u0102\u0103\7u\2\2\u0103\u0105\7g\2\2"+
		"\u0104\u00fb\3\2\2\2\u0104\u00ff\3\2\2\2\u0105L\3\2\2\2\u0106\u0107\7"+
		"k\2\2\u0107\u0108\7p\2\2\u0108\u0111\7v\2\2\u0109\u010a\7d\2\2\u010a\u010b"+
		"\7q\2\2\u010b\u010c\7q\2\2\u010c\u010d\7n\2\2\u010d\u010e\7g\2\2\u010e"+
		"\u010f\7c\2\2\u010f\u0111\7p\2\2\u0110\u0106\3\2\2\2\u0110\u0109\3\2\2"+
		"\2\u0111N\3\2\2\2\u0112\u0116\5#\22\2\u0113\u0115\5%\23\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"P\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7>\2\2\u011a\u0123\7?\2\2\u011b"+
		"\u011c\7@\2\2\u011c\u0123\7?\2\2\u011d\u0123\t\b\2\2\u011e\u011f\7?\2"+
		"\2\u011f\u0123\7?\2\2\u0120\u0121\7#\2\2\u0121\u0123\7?\2\2\u0122\u0119"+
		"\3\2\2\2\u0122\u011b\3\2\2\2\u0122\u011d\3\2\2\2\u0122\u011e\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123R\3\2\2\2\u0124\u0125\7-\2\2\u0125\u0129\7?\2\2\u0126"+
		"\u0127\7/\2\2\u0127\u0129\7?\2\2\u0128\u0124\3\2\2\2\u0128\u0126\3\2\2"+
		"\2\u0129T\3\2\2\2\u012a\u012b\t\t\2\2\u012bV\3\2\2\2\u012c\u012d\7(\2"+
		"\2\u012d\u0131\7(\2\2\u012e\u012f\7~\2\2\u012f\u0131\7~\2\2\u0130\u012c"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0131X\3\2\2\2\22\2y}\u0081\u0086\u0092\u0098"+
		"\u009a\u00f1\u00f9\u0104\u0110\u0116\u0122\u0128\u0130\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}