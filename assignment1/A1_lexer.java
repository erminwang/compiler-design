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
		WhiteSpace=1, Class=2, Program=3, If=4, LPar=5, RPar=6, LBra=7, RBra=8, 
		LCur=9, RCur=10, Id=11, Alpha=12, Alpha_num=13, Digit=14, Hex_digit=15, 
		Int_literal=16, Decimal_literal=17, Hex_literal=18, Boolean_literal=19, 
		Char_literal=20, String_literal=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Delim", "Char", "WhiteSpace", "Class", "Program", "If", "LPar", "RPar", 
		"LBra", "RBra", "LCur", "RCur", "Id", "Alpha", "Alpha_num", "Digit", "Hex_digit", 
		"Int_literal", "Decimal_literal", "Hex_literal", "Boolean_literal", "Char_literal", 
		"String_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'class'", "'program'", "'if'", "'('", "')'", "'['", "']'", 
		"'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WhiteSpace", "Class", "Program", "If", "LPar", "RPar", "LBra", 
		"RBra", "LCur", "RCur", "Id", "Alpha", "Alpha_num", "Digit", "Hex_digit", 
		"Int_literal", "Decimal_literal", "Hex_literal", "Boolean_literal", "Char_literal", 
		"String_literal"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\5\3\67\n\3\3\4\6\4:\n\4\r\4\16\4;\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\7\16_\n\16\f\16\16\16b"+
		"\13\16\3\17\3\17\3\17\3\20\3\20\5\20i\n\20\3\21\3\21\3\22\3\22\5\22o\n"+
		"\22\3\23\3\23\5\23s\n\23\3\24\6\24v\n\24\r\24\16\24w\3\25\3\25\3\25\3"+
		"\25\6\25~\n\25\r\25\16\25\177\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u008b\n\26\3\27\3\27\3\27\3\27\3\30\3\30\7\30\u0093\n\30\f"+
		"\30\16\30\u0096\13\30\3\30\3\30\3\u0094\2\31\3\2\5\2\7\3\t\4\13\5\r\6"+
		"\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24"+
		"+\25-\26/\27\3\2\6\4\2\13\f\"\"\4\2C\\c|\3\2\62;\4\2CHch\u00a0\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\66\3\2\2\2\79\3"+
		"\2\2\2\t?\3\2\2\2\13E\3\2\2\2\rM\3\2\2\2\17P\3\2\2\2\21R\3\2\2\2\23T\3"+
		"\2\2\2\25V\3\2\2\2\27X\3\2\2\2\31Z\3\2\2\2\33\\\3\2\2\2\35c\3\2\2\2\37"+
		"h\3\2\2\2!j\3\2\2\2#n\3\2\2\2%r\3\2\2\2\'u\3\2\2\2)y\3\2\2\2+\u008a\3"+
		"\2\2\2-\u008c\3\2\2\2/\u0090\3\2\2\2\61\62\t\2\2\2\62\4\3\2\2\2\63\67"+
		"\13\2\2\2\64\65\7^\2\2\65\67\13\2\2\2\66\63\3\2\2\2\66\64\3\2\2\2\67\6"+
		"\3\2\2\28:\5\3\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2="+
		">\b\4\2\2>\b\3\2\2\2?@\7e\2\2@A\7n\2\2AB\7c\2\2BC\7u\2\2CD\7u\2\2D\n\3"+
		"\2\2\2EF\7r\2\2FG\7t\2\2GH\7q\2\2HI\7i\2\2IJ\7t\2\2JK\7c\2\2KL\7o\2\2"+
		"L\f\3\2\2\2MN\7k\2\2NO\7h\2\2O\16\3\2\2\2PQ\7*\2\2Q\20\3\2\2\2RS\7+\2"+
		"\2S\22\3\2\2\2TU\7]\2\2U\24\3\2\2\2VW\7_\2\2W\26\3\2\2\2XY\7}\2\2Y\30"+
		"\3\2\2\2Z[\7\177\2\2[\32\3\2\2\2\\`\5\35\17\2]_\5\37\20\2^]\3\2\2\2_b"+
		"\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\34\3\2\2\2b`\3\2\2\2cd\t\3\2\2de\7a\2\2"+
		"e\36\3\2\2\2fi\5\35\17\2gi\5!\21\2hf\3\2\2\2hg\3\2\2\2i \3\2\2\2jk\t\4"+
		"\2\2k\"\3\2\2\2lo\5!\21\2mo\t\5\2\2nl\3\2\2\2nm\3\2\2\2o$\3\2\2\2ps\5"+
		")\25\2qs\5\'\24\2rp\3\2\2\2rq\3\2\2\2s&\3\2\2\2tv\5!\21\2ut\3\2\2\2vw"+
		"\3\2\2\2wu\3\2\2\2wx\3\2\2\2x(\3\2\2\2yz\7\62\2\2z{\7z\2\2{}\3\2\2\2|"+
		"~\5#\22\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"*\3\2\2\2\u0081\u0082\7v\2\2\u0082\u0083\7t\2\2\u0083\u0084\7w\2\2\u0084"+
		"\u008b\7g\2\2\u0085\u0086\7h\2\2\u0086\u0087\7c\2\2\u0087\u0088\7n\2\2"+
		"\u0088\u0089\7u\2\2\u0089\u008b\7g\2\2\u008a\u0081\3\2\2\2\u008a\u0085"+
		"\3\2\2\2\u008b,\3\2\2\2\u008c\u008d\7)\2\2\u008d\u008e\5\5\3\2\u008e\u008f"+
		"\7)\2\2\u008f.\3\2\2\2\u0090\u0094\7$\2\2\u0091\u0093\5\5\3\2\u0092\u0091"+
		"\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7$\2\2\u0098\60\3\2\2\2"+
		"\r\2\66;`hnrw\177\u008a\u0094\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}