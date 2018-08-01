// Generated from d:\compiler-design\assignment3\A3Demo.g4 by ANTLR 4.7.1


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
public class A3DemoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, WhiteSpace=9, 
		Char=10, Str=11, Class=12, Program=13, Void=14, If=15, Else=16, For=17, 
		Ret=18, Brk=19, Cnt=20, Callout=21, DecNum=22, HexNum=23, Type=24, Ident=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "Delim", 
		"Letter", "Digit", "HexDigit", "Alpha", "AlphaNum", "WhiteSpace", "Char", 
		"Str", "Class", "Program", "Void", "If", "Else", "For", "Ret", "Brk", 
		"Cnt", "Callout", "DecNum", "HexNum", "Type", "Ident"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", "'('", "')'", "'='", "'+'", null, null, 
		null, "'class'", "'Program'", "'void'", "'if'", "'else'", "'for'", "'return'", 
		"'break'", "'continue'", "'callout'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "WhiteSpace", "Char", 
		"Str", "Class", "Program", "Void", "If", "Else", "For", "Ret", "Brk", 
		"Cnt", "Callout", "DecNum", "HexNum", "Type", "Ident"
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


	public A3DemoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "A3Demo.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00dc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\5\rZ\n\r\3\16\3\16\5\16^\n\16\3\17\3\17"+
		"\5\17b\n\17\3\20\6\20e\n\20\r\20\16\20f\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21s\n\21\3\22\3\22\3\22\3\22\7\22y\n\22\f\22\16"+
		"\22|\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\6\35\u00be\n\35\r\35"+
		"\16\35\u00bf\3\36\3\36\3\36\3\36\6\36\u00c6\n\36\r\36\16\36\u00c7\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00d4\n\37\3 \3 \7"+
		" \u00d8\n \f \16 \u00db\13 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\2\25\2\27\2\31\2\33\2\35\2\37\13!\f#\r%\16\'\17)\20+\21-\22/\23\61\24"+
		"\63\25\65\26\67\279\30;\31=\32?\33\3\2\b\4\2\13\f\"\"\4\2C\\c|\3\2\62"+
		";\4\2CHch\3\2^^\4\2$$^^\2\u00e0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2"+
		"\2\7E\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2"+
		"\2\23Q\3\2\2\2\25S\3\2\2\2\27U\3\2\2\2\31Y\3\2\2\2\33]\3\2\2\2\35a\3\2"+
		"\2\2\37d\3\2\2\2!r\3\2\2\2#t\3\2\2\2%\177\3\2\2\2\'\u0085\3\2\2\2)\u008d"+
		"\3\2\2\2+\u0092\3\2\2\2-\u0095\3\2\2\2/\u009a\3\2\2\2\61\u009e\3\2\2\2"+
		"\63\u00a5\3\2\2\2\65\u00ab\3\2\2\2\67\u00b4\3\2\2\29\u00bd\3\2\2\2;\u00c1"+
		"\3\2\2\2=\u00d3\3\2\2\2?\u00d5\3\2\2\2AB\7}\2\2B\4\3\2\2\2CD\7\177\2\2"+
		"D\6\3\2\2\2EF\7=\2\2F\b\3\2\2\2GH\7.\2\2H\n\3\2\2\2IJ\7*\2\2J\f\3\2\2"+
		"\2KL\7+\2\2L\16\3\2\2\2MN\7?\2\2N\20\3\2\2\2OP\7-\2\2P\22\3\2\2\2QR\t"+
		"\2\2\2R\24\3\2\2\2ST\t\3\2\2T\26\3\2\2\2UV\t\4\2\2V\30\3\2\2\2WZ\5\27"+
		"\f\2XZ\t\5\2\2YW\3\2\2\2YX\3\2\2\2Z\32\3\2\2\2[^\5\25\13\2\\^\7a\2\2]"+
		"[\3\2\2\2]\\\3\2\2\2^\34\3\2\2\2_b\5\33\16\2`b\5\27\f\2a_\3\2\2\2a`\3"+
		"\2\2\2b\36\3\2\2\2ce\5\23\n\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2"+
		"gh\3\2\2\2hi\b\20\2\2i \3\2\2\2jk\7)\2\2kl\n\6\2\2ls\7)\2\2mn\7)\2\2n"+
		"o\7^\2\2op\3\2\2\2pq\13\2\2\2qs\7)\2\2rj\3\2\2\2rm\3\2\2\2s\"\3\2\2\2"+
		"tz\7$\2\2uy\n\7\2\2vw\7^\2\2wy\13\2\2\2xu\3\2\2\2xv\3\2\2\2y|\3\2\2\2"+
		"zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7$\2\2~$\3\2\2\2\177\u0080"+
		"\7e\2\2\u0080\u0081\7n\2\2\u0081\u0082\7c\2\2\u0082\u0083\7u\2\2\u0083"+
		"\u0084\7u\2\2\u0084&\3\2\2\2\u0085\u0086\7R\2\2\u0086\u0087\7t\2\2\u0087"+
		"\u0088\7q\2\2\u0088\u0089\7i\2\2\u0089\u008a\7t\2\2\u008a\u008b\7c\2\2"+
		"\u008b\u008c\7o\2\2\u008c(\3\2\2\2\u008d\u008e\7x\2\2\u008e\u008f\7q\2"+
		"\2\u008f\u0090\7k\2\2\u0090\u0091\7f\2\2\u0091*\3\2\2\2\u0092\u0093\7"+
		"k\2\2\u0093\u0094\7h\2\2\u0094,\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097"+
		"\7n\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099.\3\2\2\2\u009a\u009b"+
		"\7h\2\2\u009b\u009c\7q\2\2\u009c\u009d\7t\2\2\u009d\60\3\2\2\2\u009e\u009f"+
		"\7t\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7w\2\2\u00a2"+
		"\u00a3\7t\2\2\u00a3\u00a4\7p\2\2\u00a4\62\3\2\2\2\u00a5\u00a6\7d\2\2\u00a6"+
		"\u00a7\7t\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7m\2\2"+
		"\u00aa\64\3\2\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7"+
		"p\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2"+
		"\7w\2\2\u00b2\u00b3\7g\2\2\u00b3\66\3\2\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6"+
		"\7c\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7q\2\2\u00b9"+
		"\u00ba\7w\2\2\u00ba\u00bb\7v\2\2\u00bb8\3\2\2\2\u00bc\u00be\5\27\f\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0:\3\2\2\2\u00c1\u00c2\7\62\2\2\u00c2\u00c3\7z\2\2\u00c3\u00c5"+
		"\3\2\2\2\u00c4\u00c6\5\31\r\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2"+
		"\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8<\3\2\2\2\u00c9\u00ca\7"+
		"k\2\2\u00ca\u00cb\7p\2\2\u00cb\u00d4\7v\2\2\u00cc\u00cd\7d\2\2\u00cd\u00ce"+
		"\7q\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7g\2\2\u00d1"+
		"\u00d2\7c\2\2\u00d2\u00d4\7p\2\2\u00d3\u00c9\3\2\2\2\u00d3\u00cc\3\2\2"+
		"\2\u00d4>\3\2\2\2\u00d5\u00d9\5\33\16\2\u00d6\u00d8\5\35\17\2\u00d7\u00d6"+
		"\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"@\3\2\2\2\u00db\u00d9\3\2\2\2\16\2Y]afrxz\u00bf\u00c7\u00d3\u00d9\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}