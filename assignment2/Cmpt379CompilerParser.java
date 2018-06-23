// Generated from Cmpt379Compiler.g4 by ANTLR 4.5.3


import java.io.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Cmpt379CompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WhiteSpace=2, Char=3, Str=4, Class=5, Program=6, Void=7, If=8, 
		Else=9, For=10, Ret=11, Brk=12, Cnt=13, Callout=14, DecLit=15, HexLit=16, 
		BoolLit=17, Type=18, Ident=19, While=20, EqOp=21, Relop=22, AssignOp=23, 
		ArithOp=24, CondOp=25, OParen=26, CParen=27, OBrace=28, CBrace=29, OBracket=30, 
		CBracket=31, SemiColon=32, Comma=33, Indent=34;
	public static final int
		RULE_prog = 0, RULE_field_decls = 1, RULE_field_decl = 2, RULE_inited_field_decl = 3, 
		RULE_method_decls = 4, RULE_method_decl = 5, RULE_params = 6, RULE_nextParams = 7, 
		RULE_block = 8, RULE_intLit = 9, RULE_literal = 10, RULE_binOp = 11;
	public static final String[] ruleNames = {
		"prog", "field_decls", "field_decl", "inited_field_decl", "method_decls", 
		"method_decl", "params", "nextParams", "block", "intLit", "literal", "binOp"
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
		"Comma", "Indent"
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

	@Override
	public String getGrammarFileName() { return "Cmpt379Compiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	        //AST node count
		int count = 0;
		String graph = "";

		int GetId() {
			return count++;
		}


		public class MySet {




			int[] ids;
			int size;

			MySet () {
				System.out.println("\n\nInitArray\n-------------");


				ids = new int [100];
				size = 0;


			}

			void ExtendArray(int val) {
				System.out.println("\n\nExtendArray\n-------------\nsize = " + size + "\nval = " + val);

				ids[size] = val;
				size ++;


			}

			void AppendArray(MySet s) {
				for (int i = 0; i < s.size; i ++) {
					ExtendArray(s.ids[i]);
				}
			}



		}//MySet

		String ProcessString(String s) {
			String x = "\\" + s.substring(0, s.length() - 1) + "\\\"";
			return x;
		}

		int PrintNode (String label) {
			System.out.println("\n\nPrintNode\n-------------\nlabel = " + label + "\nid = " + count);

			int id = GetId();
			graph += (id + " [label=\"" + label + "\"]\n");
			return id;

		}

		void PrintEdge (int id1, int id2) {
			System.out.println("\n\nPrintEdge\n-------------\nid1 = " + id1 + "\nid2 = " + id2);


			if ((id1 != -1) && (id2 != -1)) graph += (id1 + " -> " + id2 + "\n");



		}

		void PrintEdges (int id, MySet s) {
			System.out.println("\n\nPrintEdges\n-------------\nid = " + id + "\nsize = " + s.size);


			for (int i = 0; i < s.size; i ++) {
				PrintEdge(id, s.ids[i]);
			}
		}

		void PrintGraph () throws IOException {
			System.out.println("\n\nPrintGraph\n-------------");


			File file = new File("test.dot");
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
			writer.write("digraph G {\nordering=out\n" + graph + "\n}\n");
			writer.flush();
			writer.close();


			System.out.println("digraph G {\nordering=out\n" + graph + "\n}\n");
		}






	public Cmpt379CompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Field_declsContext field_decls;
		public Method_declsContext method_decls;
		public TerminalNode Class() { return getToken(Cmpt379CompilerParser.Class, 0); }
		public TerminalNode Program() { return getToken(Cmpt379CompilerParser.Program, 0); }
		public Field_declsContext field_decls() {
			return getRuleContext(Field_declsContext.class,0);
		}
		public Method_declsContext method_decls() {
			return getRuleContext(Method_declsContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(Class);
			setState(25);
			match(Program);
			setState(26);
			match(OBrace);
			setState(27);
			((ProgContext)_localctx).field_decls = field_decls(0);
			setState(28);
			((ProgContext)_localctx).method_decls = method_decls(0);
			setState(29);
			match(CBrace);

				int id = PrintNode("Program");

				if (((ProgContext)_localctx).field_decls.s.size > 0) {
					int id2 = PrintNode("Field_decls");
					PrintEdges(id2, ((ProgContext)_localctx).field_decls.s);
					PrintEdge(id, id2);
				}

				if (((ProgContext)_localctx).method_decls.s.size > 0) {
					int id2 = PrintNode("Method_decls");
					PrintEdges(id2, ((ProgContext)_localctx).method_decls.s);
					PrintEdge(id, id2);
				}

				try {PrintGraph();} catch(IOException e) {}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_declsContext extends ParserRuleContext {
		public MySet s;
		public Field_declsContext f;
		public Field_declContext field_decl;
		public Inited_field_declContext inited_field_decl;
		public Field_declContext field_decl() {
			return getRuleContext(Field_declContext.class,0);
		}
		public Field_declsContext field_decls() {
			return getRuleContext(Field_declsContext.class,0);
		}
		public Inited_field_declContext inited_field_decl() {
			return getRuleContext(Inited_field_declContext.class,0);
		}
		public Field_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterField_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitField_decls(this);
		}
	}

	public final Field_declsContext field_decls() throws RecognitionException {
		return field_decls(0);
	}

	private Field_declsContext field_decls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Field_declsContext _localctx = new Field_declsContext(_ctx, _parentState);
		Field_declsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_field_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{

				((Field_declsContext)_localctx).s =  new MySet();

			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new Field_declsContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decls);
						setState(35);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(36);
						((Field_declsContext)_localctx).field_decl = field_decl(0);
						setState(37);
						match(SemiColon);

						          	((Field_declsContext)_localctx).s =  ((Field_declsContext)_localctx).f.s;
						          	_localctx.s.ExtendArray(((Field_declsContext)_localctx).field_decl.id);
						          
						}
						break;
					case 2:
						{
						_localctx = new Field_declsContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decls);
						setState(40);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(41);
						((Field_declsContext)_localctx).inited_field_decl = inited_field_decl();
						setState(42);
						match(SemiColon);

						          	((Field_declsContext)_localctx).s =  ((Field_declsContext)_localctx).f.s;
						          	_localctx.s.ExtendArray(((Field_declsContext)_localctx).inited_field_decl.id);
						          
						}
						break;
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Field_declContext extends ParserRuleContext {
		public int id;
		public Field_declContext f;
		public Token Type;
		public Token Ident;
		public IntLitContext intLit;
		public TerminalNode Type() { return getToken(Cmpt379CompilerParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
		public TerminalNode Indent() { return getToken(Cmpt379CompilerParser.Indent, 0); }
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public Field_declContext field_decl() {
			return getRuleContext(Field_declContext.class,0);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitField_decl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		return field_decl(0);
	}

	private Field_declContext field_decl(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Field_declContext _localctx = new Field_declContext(_ctx, _parentState);
		Field_declContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_field_decl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(51);
				((Field_declContext)_localctx).Type = match(Type);
				setState(52);
				((Field_declContext)_localctx).Ident = match(Ident);

					((Field_declContext)_localctx).id =  PrintNode("FieldDecl");

					PrintEdge(_localctx.id, PrintNode((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null)));
					PrintEdge(_localctx.id, PrintNode((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null)));

				}
				break;
			case 2:
				{
				setState(54);
				((Field_declContext)_localctx).Type = match(Type);
				setState(55);
				match(Indent);
				setState(56);
				match(OBracket);
				setState(57);
				((Field_declContext)_localctx).intLit = intLit();
				setState(58);
				match(CBracket);

					((Field_declContext)_localctx).id =  PrintNode("FieldDecl");

					PrintEdge(_localctx.id, PrintNode((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null)));
					PrintEdge(_localctx.id, PrintNode((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null)));
					PrintEdge(_localctx.id, PrintNode((((Field_declContext)_localctx).intLit!=null?_input.getText(((Field_declContext)_localctx).intLit.start,((Field_declContext)_localctx).intLit.stop):null)));

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Field_declContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decl);
						setState(63);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(64);
						match(Comma);
						setState(65);
						((Field_declContext)_localctx).Ident = match(Ident);

						          	((Field_declContext)_localctx).id =  ((Field_declContext)_localctx).f.id;

						          	PrintEdge(_localctx.id, PrintNode((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null)));
						          
						}
						break;
					case 2:
						{
						_localctx = new Field_declContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decl);
						setState(67);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(68);
						match(Comma);
						setState(69);
						match(Indent);
						setState(70);
						match(OBracket);
						setState(71);
						((Field_declContext)_localctx).intLit = intLit();
						setState(72);
						match(CBracket);

						          	((Field_declContext)_localctx).id =  ((Field_declContext)_localctx).f.id;

						          	PrintEdge(_localctx.id, PrintNode((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null)));
						          	PrintEdge(_localctx.id, PrintNode((((Field_declContext)_localctx).intLit!=null?_input.getText(((Field_declContext)_localctx).intLit.start,((Field_declContext)_localctx).intLit.stop):null)));
						          
						}
						break;
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Inited_field_declContext extends ParserRuleContext {
		public int id;
		public Token Type;
		public Token Ident;
		public LiteralContext literal;
		public TerminalNode Type() { return getToken(Cmpt379CompilerParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Inited_field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inited_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterInited_field_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitInited_field_decl(this);
		}
	}

	public final Inited_field_declContext inited_field_decl() throws RecognitionException {
		Inited_field_declContext _localctx = new Inited_field_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inited_field_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((Inited_field_declContext)_localctx).Type = match(Type);
			setState(81);
			((Inited_field_declContext)_localctx).Ident = match(Ident);
			setState(82);
			match(T__0);
			setState(83);
			((Inited_field_declContext)_localctx).literal = literal();

				((Inited_field_declContext)_localctx).id =  PrintNode("InitedFieldDecl");

				PrintEdge(_localctx.id, PrintNode((((Inited_field_declContext)_localctx).Type!=null?((Inited_field_declContext)_localctx).Type.getText():null)));
				PrintEdge(_localctx.id, PrintNode((((Inited_field_declContext)_localctx).Ident!=null?((Inited_field_declContext)_localctx).Ident.getText():null)));
				PrintEdge(_localctx.id, PrintNode((((Inited_field_declContext)_localctx).literal!=null?_input.getText(((Inited_field_declContext)_localctx).literal.start,((Inited_field_declContext)_localctx).literal.stop):null)));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declsContext extends ParserRuleContext {
		public MySet s;
		public Method_declsContext m;
		public Method_declContext method_decl;
		public Method_declContext method_decl() {
			return getRuleContext(Method_declContext.class,0);
		}
		public Method_declsContext method_decls() {
			return getRuleContext(Method_declsContext.class,0);
		}
		public Method_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterMethod_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitMethod_decls(this);
		}
	}

	public final Method_declsContext method_decls() throws RecognitionException {
		return method_decls(0);
	}

	private Method_declsContext method_decls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Method_declsContext _localctx = new Method_declsContext(_ctx, _parentState);
		Method_declsContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_method_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{

				((Method_declsContext)_localctx).s =  new MySet();

			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Method_declsContext(_parentctx, _parentState);
					_localctx.m = _prevctx;
					_localctx.m = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_method_decls);
					setState(89);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(90);
					((Method_declsContext)_localctx).method_decl = method_decl();

					          	((Method_declsContext)_localctx).s =  ((Method_declsContext)_localctx).m.s;
					          	_localctx.s.ExtendArray(((Method_declsContext)_localctx).method_decl.id);
					          
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Method_declContext extends ParserRuleContext {
		public int id;
		public Token Type;
		public Token Ident;
		public ParamsContext params;
		public BlockContext block;
		public TerminalNode Type() { return getToken(Cmpt379CompilerParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Void() { return getToken(Cmpt379CompilerParser.Void, 0); }
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method_decl);
		try {
			setState(114);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				((Method_declContext)_localctx).Type = match(Type);
				setState(99);
				((Method_declContext)_localctx).Ident = match(Ident);
				setState(100);
				match(OParen);
				setState(101);
				((Method_declContext)_localctx).params = params();
				setState(102);
				match(CParen);
				setState(103);
				((Method_declContext)_localctx).block = block();

					((Method_declContext)_localctx).id =  PrintNode("MethodDecl");

					PrintEdge(_localctx.id, PrintNode((((Method_declContext)_localctx).Type!=null?((Method_declContext)_localctx).Type.getText():null)));
					PrintEdge(_localctx.id, PrintNode((((Method_declContext)_localctx).Ident!=null?((Method_declContext)_localctx).Ident.getText():null)));
					PrintEdge(_localctx.id, ((Method_declContext)_localctx).params.id);
					PrintEdge(_localctx.id, ((Method_declContext)_localctx).block.id);

				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(Void);
				setState(107);
				((Method_declContext)_localctx).Ident = match(Ident);
				setState(108);
				match(OParen);
				setState(109);
				((Method_declContext)_localctx).params = params();
				setState(110);
				match(CParen);
				setState(111);
				((Method_declContext)_localctx).block = block();

					((Method_declContext)_localctx).id =  PrintNode("MethodDecl");

					PrintEdge(_localctx.id, PrintNode("void"));
					PrintEdge(_localctx.id, PrintNode((((Method_declContext)_localctx).Ident!=null?((Method_declContext)_localctx).Ident.getText():null)));
					PrintEdge(_localctx.id, ((Method_declContext)_localctx).params.id);
					PrintEdge(_localctx.id, ((Method_declContext)_localctx).block.id);


				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public int id;
		public Token Type;
		public Token Ident;
		public NextParamsContext nextParams;
		public TerminalNode Type() { return getToken(Cmpt379CompilerParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
		public NextParamsContext nextParams() {
			return getRuleContext(NextParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		try {
			setState(122);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				((ParamsContext)_localctx).Type = match(Type);
				setState(117);
				((ParamsContext)_localctx).Ident = match(Ident);
				setState(118);
				((ParamsContext)_localctx).nextParams = nextParams(0);

					((ParamsContext)_localctx).id =  PrintNode("MethodArg");

					PrintEdge(_localctx.id, PrintNode((((ParamsContext)_localctx).Type!=null?((ParamsContext)_localctx).Type.getText():null)));
					PrintEdge(_localctx.id, PrintNode((((ParamsContext)_localctx).Ident!=null?((ParamsContext)_localctx).Ident.getText():null)));

					PrintEdges(_localctx.id, ((ParamsContext)_localctx).nextParams.s);

				}
				break;
			case CParen:
				enterOuterAlt(_localctx, 2);
				{

					((ParamsContext)_localctx).id =  -1;

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NextParamsContext extends ParserRuleContext {
		public MySet s;
		public NextParamsContext n;
		public Token Type;
		public Token Ident;
		public TerminalNode Type() { return getToken(Cmpt379CompilerParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
		public NextParamsContext nextParams() {
			return getRuleContext(NextParamsContext.class,0);
		}
		public NextParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterNextParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitNextParams(this);
		}
	}

	public final NextParamsContext nextParams() throws RecognitionException {
		return nextParams(0);
	}

	private NextParamsContext nextParams(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NextParamsContext _localctx = new NextParamsContext(_ctx, _parentState);
		NextParamsContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_nextParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{

				((NextParamsContext)_localctx).s =  new MySet();

			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NextParamsContext(_parentctx, _parentState);
					_localctx.n = _prevctx;
					_localctx.n = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_nextParams);
					setState(127);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(128);
					match(Comma);
					setState(129);
					((NextParamsContext)_localctx).Type = match(Type);
					setState(130);
					((NextParamsContext)_localctx).Ident = match(Ident);

					          	((NextParamsContext)_localctx).s =  ((NextParamsContext)_localctx).n.s;

					          	_localctx.s.ExtendArray(PrintNode((((NextParamsContext)_localctx).Type!=null?((NextParamsContext)_localctx).Type.getText():null)));
					          	_localctx.s.ExtendArray(PrintNode((((NextParamsContext)_localctx).Ident!=null?((NextParamsContext)_localctx).Ident.getText():null)));
					          
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public int id;
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{

				((BlockContext)_localctx).id =  1;

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntLitContext extends ParserRuleContext {
		public TerminalNode DecLit() { return getToken(Cmpt379CompilerParser.DecLit, 0); }
		public TerminalNode HexLit() { return getToken(Cmpt379CompilerParser.HexLit, 0); }
		public IntLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterIntLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitIntLit(this);
		}
	}

	public final IntLitContext intLit() throws RecognitionException {
		IntLitContext _localctx = new IntLitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_intLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !(_la==DecLit || _la==HexLit) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Char() { return getToken(Cmpt379CompilerParser.Char, 0); }
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TerminalNode BoolLit() { return getToken(Cmpt379CompilerParser.BoolLit, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal);
		try {
			setState(144);
			switch (_input.LA(1)) {
			case Char:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(Char);
				}
				break;
			case DecLit:
			case HexLit:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				intLit();
				}
				break;
			case BoolLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(BoolLit);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinOpContext extends ParserRuleContext {
		public TerminalNode ArithOp() { return getToken(Cmpt379CompilerParser.ArithOp, 0); }
		public TerminalNode Relop() { return getToken(Cmpt379CompilerParser.Relop, 0); }
		public TerminalNode EqOp() { return getToken(Cmpt379CompilerParser.EqOp, 0); }
		public TerminalNode CondOp() { return getToken(Cmpt379CompilerParser.CondOp, 0); }
		public BinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitBinOp(this);
		}
	}

	public final BinOpContext binOp() throws RecognitionException {
		BinOpContext _localctx = new BinOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_binOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EqOp) | (1L << Relop) | (1L << ArithOp) | (1L << CondOp))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return field_decls_sempred((Field_declsContext)_localctx, predIndex);
		case 2:
			return field_decl_sempred((Field_declContext)_localctx, predIndex);
		case 4:
			return method_decls_sempred((Method_declsContext)_localctx, predIndex);
		case 7:
			return nextParams_sempred((NextParamsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean field_decls_sempred(Field_declsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean field_decl_sempred(Field_declContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean method_decls_sempred(Method_declsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean nextParams_sempred(NextParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u0097\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4N\n\4\f\4\16\4Q\13\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7u\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b}\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0087\n\t\f"+
		"\t\16\t\u008a\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\5\f\u0093\n\f\3\r\3\r"+
		"\3\r\2\6\4\6\n\20\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\21\22\4\2\27"+
		"\30\32\33\u0095\2\32\3\2\2\2\4\"\3\2\2\2\6?\3\2\2\2\bR\3\2\2\2\nX\3\2"+
		"\2\2\ft\3\2\2\2\16|\3\2\2\2\20~\3\2\2\2\22\u008b\3\2\2\2\24\u008d\3\2"+
		"\2\2\26\u0092\3\2\2\2\30\u0094\3\2\2\2\32\33\7\7\2\2\33\34\7\b\2\2\34"+
		"\35\7\36\2\2\35\36\5\4\3\2\36\37\5\n\6\2\37 \7\37\2\2 !\b\2\1\2!\3\3\2"+
		"\2\2\"#\b\3\1\2#$\b\3\1\2$\61\3\2\2\2%&\f\5\2\2&\'\5\6\4\2\'(\7\"\2\2"+
		"()\b\3\1\2)\60\3\2\2\2*+\f\4\2\2+,\5\b\5\2,-\7\"\2\2-.\b\3\1\2.\60\3\2"+
		"\2\2/%\3\2\2\2/*\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\5"+
		"\3\2\2\2\63\61\3\2\2\2\64\65\b\4\1\2\65\66\7\24\2\2\66\67\7\25\2\2\67"+
		"@\b\4\1\289\7\24\2\29:\7$\2\2:;\7 \2\2;<\5\24\13\2<=\7!\2\2=>\b\4\1\2"+
		">@\3\2\2\2?\64\3\2\2\2?8\3\2\2\2@O\3\2\2\2AB\f\6\2\2BC\7#\2\2CD\7\25\2"+
		"\2DN\b\4\1\2EF\f\5\2\2FG\7#\2\2GH\7$\2\2HI\7 \2\2IJ\5\24\13\2JK\7!\2\2"+
		"KL\b\4\1\2LN\3\2\2\2MA\3\2\2\2ME\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2"+
		"P\7\3\2\2\2QO\3\2\2\2RS\7\24\2\2ST\7\25\2\2TU\7\3\2\2UV\5\26\f\2VW\b\5"+
		"\1\2W\t\3\2\2\2XY\b\6\1\2YZ\b\6\1\2Za\3\2\2\2[\\\f\4\2\2\\]\5\f\7\2]^"+
		"\b\6\1\2^`\3\2\2\2_[\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\13\3\2\2\2"+
		"ca\3\2\2\2de\7\24\2\2ef\7\25\2\2fg\7\34\2\2gh\5\16\b\2hi\7\35\2\2ij\5"+
		"\22\n\2jk\b\7\1\2ku\3\2\2\2lm\7\t\2\2mn\7\25\2\2no\7\34\2\2op\5\16\b\2"+
		"pq\7\35\2\2qr\5\22\n\2rs\b\7\1\2su\3\2\2\2td\3\2\2\2tl\3\2\2\2u\r\3\2"+
		"\2\2vw\7\24\2\2wx\7\25\2\2xy\5\20\t\2yz\b\b\1\2z}\3\2\2\2{}\b\b\1\2|v"+
		"\3\2\2\2|{\3\2\2\2}\17\3\2\2\2~\177\b\t\1\2\177\u0080\b\t\1\2\u0080\u0088"+
		"\3\2\2\2\u0081\u0082\f\4\2\2\u0082\u0083\7#\2\2\u0083\u0084\7\24\2\2\u0084"+
		"\u0085\7\25\2\2\u0085\u0087\b\t\1\2\u0086\u0081\3\2\2\2\u0087\u008a\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\21\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\b\n\1\2\u008c\23\3\2\2\2\u008d\u008e\t\2\2"+
		"\2\u008e\25\3\2\2\2\u008f\u0093\7\5\2\2\u0090\u0093\5\24\13\2\u0091\u0093"+
		"\7\23\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2"+
		"\u0093\27\3\2\2\2\u0094\u0095\t\3\2\2\u0095\31\3\2\2\2\f/\61?MOat|\u0088"+
		"\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}