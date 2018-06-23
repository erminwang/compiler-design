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
		T__0=1, T__1=2, T__2=3, T__3=4, WhiteSpace=5, Char=6, Str=7, Class=8, 
		Program=9, Void=10, If=11, Else=12, For=13, Ret=14, Brk=15, Cnt=16, Callout=17, 
		Switch=18, Case=19, DecLit=20, HexLit=21, BoolLit=22, Type=23, Ident=24, 
		While=25, EqOp=26, Relop=27, AssignOp=28, ArithOp=29, CondOp=30, OParen=31, 
		CParen=32, OBrace=33, CBrace=34, OBracket=35, CBracket=36, SemiColon=37, 
		Comma=38;
	public static final int
		RULE_prog = 0, RULE_field_decls = 1, RULE_field_decl = 2, RULE_inited_field_decl = 3, 
		RULE_method_decls = 4, RULE_method_decl = 5, RULE_params = 6, RULE_nextParams = 7, 
		RULE_block = 8, RULE_var_decls = 9, RULE_var_decl = 10, RULE_statements = 11, 
		RULE_statement = 12, RULE_method_call = 13, RULE_nextCalloutArgs = 14, 
		RULE_calloutArg = 15, RULE_arguments = 16, RULE_nextArgs = 17, RULE_cases = 18, 
		RULE_nextCase = 19, RULE_expr = 20, RULE_location = 21, RULE_intLit = 22, 
		RULE_literal = 23, RULE_binOp = 24;
	public static final String[] ruleNames = {
		"prog", "field_decls", "field_decl", "inited_field_decl", "method_decls", 
		"method_decl", "params", "nextParams", "block", "var_decls", "var_decl", 
		"statements", "statement", "method_call", "nextCalloutArgs", "calloutArg", 
		"arguments", "nextArgs", "cases", "nextCase", "expr", "location", "intLit", 
		"literal", "binOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "':'", "'-'", "'!'", null, null, null, "'class'", "'Program'", 
		"'void'", "'if'", "'else'", "'for'", "'return'", "'break'", "'continue'", 
		"'callout'", "'switch'", "'case'", null, null, null, null, null, "'while'", 
		null, null, null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "WhiteSpace", "Char", "Str", "Class", "Program", 
		"Void", "If", "Else", "For", "Ret", "Brk", "Cnt", "Callout", "Switch", 
		"Case", "DecLit", "HexLit", "BoolLit", "Type", "Ident", "While", "EqOp", 
		"Relop", "AssignOp", "ArithOp", "CondOp", "OParen", "CParen", "OBrace", 
		"CBrace", "OBracket", "CBracket", "SemiColon", "Comma"
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
			setState(50);
			match(Class);
			setState(51);
			match(Program);
			setState(52);
			match(OBrace);
			setState(53);
			((ProgContext)_localctx).field_decls = field_decls(0);
			setState(54);
			((ProgContext)_localctx).method_decls = method_decls(0);
			setState(55);
			match(CBrace);

				int id = PrintNode("Program");

				if (((ProgContext)_localctx).field_decls.s.size > 0) {
					int id2 = PrintNode("FieldDecls");
					PrintEdges(id2, ((ProgContext)_localctx).field_decls.s);
					PrintEdge(id, id2);
				}

				if (((ProgContext)_localctx).method_decls.s.size > 0) {
					int id2 = PrintNode("MethodDecls");
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
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new Field_declsContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decls);
						setState(61);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(62);
						((Field_declsContext)_localctx).field_decl = field_decl(0);
						setState(63);
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
						setState(66);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(67);
						((Field_declsContext)_localctx).inited_field_decl = inited_field_decl();
						setState(68);
						match(SemiColon);

						          	((Field_declsContext)_localctx).s =  ((Field_declsContext)_localctx).f.s;
						          	_localctx.s.ExtendArray(((Field_declsContext)_localctx).inited_field_decl.id);
						          
						}
						break;
					}
					} 
				}
				setState(75);
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(77);
				((Field_declContext)_localctx).Type = match(Type);
				setState(78);
				((Field_declContext)_localctx).Ident = match(Ident);

					((Field_declContext)_localctx).id =  PrintNode("FieldDecl");

					PrintEdge(_localctx.id, PrintNode((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null)));
					PrintEdge(_localctx.id, PrintNode((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null)));

				}
				break;
			case 2:
				{
				setState(80);
				((Field_declContext)_localctx).Type = match(Type);
				setState(81);
				((Field_declContext)_localctx).Ident = match(Ident);
				setState(82);
				match(OBracket);
				setState(83);
				((Field_declContext)_localctx).intLit = intLit();
				setState(84);
				match(CBracket);

					((Field_declContext)_localctx).id =  PrintNode("FieldDecl");

					PrintEdge(_localctx.id, PrintNode((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null)));
					PrintEdge(_localctx.id, PrintNode((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null)));
					PrintEdge(_localctx.id, PrintNode((((Field_declContext)_localctx).intLit!=null?_input.getText(((Field_declContext)_localctx).intLit.start,((Field_declContext)_localctx).intLit.stop):null)));

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Field_declContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decl);
						setState(89);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(90);
						match(Comma);
						setState(91);
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
						setState(93);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(94);
						match(Comma);
						setState(95);
						((Field_declContext)_localctx).Ident = match(Ident);
						setState(96);
						match(OBracket);
						setState(97);
						((Field_declContext)_localctx).intLit = intLit();
						setState(98);
						match(CBracket);

						          	((Field_declContext)_localctx).id =  ((Field_declContext)_localctx).f.id;

						          	PrintEdge(_localctx.id, PrintNode((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null)));
						          	PrintEdge(_localctx.id, PrintNode((((Field_declContext)_localctx).intLit!=null?_input.getText(((Field_declContext)_localctx).intLit.start,((Field_declContext)_localctx).intLit.stop):null)));
						          
						}
						break;
					}
					} 
				}
				setState(105);
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
			setState(106);
			((Inited_field_declContext)_localctx).Type = match(Type);
			setState(107);
			((Inited_field_declContext)_localctx).Ident = match(Ident);
			setState(108);
			match(T__0);
			setState(109);
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
			setState(121);
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
					setState(115);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(116);
					((Method_declsContext)_localctx).method_decl = method_decl();

					          	((Method_declsContext)_localctx).s =  ((Method_declsContext)_localctx).m.s;
					          	_localctx.s.ExtendArray(((Method_declsContext)_localctx).method_decl.id);
					          
					}
					} 
				}
				setState(123);
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
			setState(140);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				((Method_declContext)_localctx).Type = match(Type);
				setState(125);
				((Method_declContext)_localctx).Ident = match(Ident);
				setState(126);
				match(OParen);
				setState(127);
				((Method_declContext)_localctx).params = params();
				setState(128);
				match(CParen);
				setState(129);
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
				setState(132);
				match(Void);
				setState(133);
				((Method_declContext)_localctx).Ident = match(Ident);
				setState(134);
				match(OParen);
				setState(135);
				((Method_declContext)_localctx).params = params();
				setState(136);
				match(CParen);
				setState(137);
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
			setState(148);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((ParamsContext)_localctx).Type = match(Type);
				setState(143);
				((ParamsContext)_localctx).Ident = match(Ident);
				setState(144);
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
			setState(160);
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
					setState(153);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(154);
					match(Comma);
					setState(155);
					((NextParamsContext)_localctx).Type = match(Type);
					setState(156);
					((NextParamsContext)_localctx).Ident = match(Ident);

					          	((NextParamsContext)_localctx).s =  ((NextParamsContext)_localctx).n.s;

					          	_localctx.s.ExtendArray(PrintNode((((NextParamsContext)_localctx).Type!=null?((NextParamsContext)_localctx).Type.getText():null)));
					          	_localctx.s.ExtendArray(PrintNode((((NextParamsContext)_localctx).Ident!=null?((NextParamsContext)_localctx).Ident.getText():null)));
					          
					}
					} 
				}
				setState(162);
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
		public Var_declsContext var_decls;
		public StatementsContext statements;
		public Var_declsContext var_decls() {
			return getRuleContext(Var_declsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
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
			setState(163);
			match(OBrace);
			setState(164);
			((BlockContext)_localctx).var_decls = var_decls(0);
			setState(165);
			((BlockContext)_localctx).statements = statements();
			setState(166);
			match(CBrace);

				((BlockContext)_localctx).id =  -1;
				if (((BlockContext)_localctx).var_decls.s.size > 0) {
					((BlockContext)_localctx).id =  PrintNode("Block");
					int id2 = PrintNode("VarDecls");
					PrintEdges(id2, ((BlockContext)_localctx).var_decls.s);
					PrintEdge(_localctx.id, id2);
				}
				if (((BlockContext)_localctx).statements.id != -1) {
					if (_localctx.id == -1) ((BlockContext)_localctx).id =  PrintNode("Block");
					PrintEdge(_localctx.id, ((BlockContext)_localctx).statements.id);
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

	public static class Var_declsContext extends ParserRuleContext {
		public MySet s;
		public Var_declsContext v;
		public Var_declContext var_decl;
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_declsContext var_decls() {
			return getRuleContext(Var_declsContext.class,0);
		}
		public Var_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterVar_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitVar_decls(this);
		}
	}

	public final Var_declsContext var_decls() throws RecognitionException {
		return var_decls(0);
	}

	private Var_declsContext var_decls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Var_declsContext _localctx = new Var_declsContext(_ctx, _parentState);
		Var_declsContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_var_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{

				((Var_declsContext)_localctx).s =  new MySet();

			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Var_declsContext(_parentctx, _parentState);
					_localctx.v = _prevctx;
					_localctx.v = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_var_decls);
					setState(172);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(173);
					((Var_declsContext)_localctx).var_decl = var_decl(0);
					setState(174);
					match(SemiColon);

					          	((Var_declsContext)_localctx).s =  ((Var_declsContext)_localctx).v.s;
					          	_localctx.s.ExtendArray(((Var_declsContext)_localctx).var_decl.id);
					          
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Var_declContext extends ParserRuleContext {
		public int id;
		public Var_declContext v;
		public Token Type;
		public Token Ident;
		public TerminalNode Type() { return getToken(Cmpt379CompilerParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		return var_decl(0);
	}

	private Var_declContext var_decl(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Var_declContext _localctx = new Var_declContext(_ctx, _parentState);
		Var_declContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_var_decl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(183);
			((Var_declContext)_localctx).Type = match(Type);
			setState(184);
			((Var_declContext)_localctx).Ident = match(Ident);

				((Var_declContext)_localctx).id =  PrintNode("VarDecl");

				PrintEdge(_localctx.id, PrintNode((((Var_declContext)_localctx).Type!=null?((Var_declContext)_localctx).Type.getText():null)));
				PrintEdge(_localctx.id, PrintNode((((Var_declContext)_localctx).Ident!=null?((Var_declContext)_localctx).Ident.getText():null)));

			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Var_declContext(_parentctx, _parentState);
					_localctx.v = _prevctx;
					_localctx.v = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_var_decl);
					setState(187);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(188);
					match(Comma);
					setState(189);
					((Var_declContext)_localctx).Ident = match(Ident);

					          	((Var_declContext)_localctx).id =  ((Var_declContext)_localctx).v.id;

					          	PrintEdge(_localctx.id, PrintNode((((Var_declContext)_localctx).Ident!=null?((Var_declContext)_localctx).Ident.getText():null)));
					          
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class StatementsContext extends ParserRuleContext {
		public int id;
		public StatementContext statement;
		public StatementsContext t;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statements);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				((StatementsContext)_localctx).statement = statement();
				setState(197);
				((StatementsContext)_localctx).t = statements();

					if (((StatementsContext)_localctx).t.id != -1) {
						((StatementsContext)_localctx).id =  PrintNode("Seq");
						PrintEdge(_localctx.id, ((StatementsContext)_localctx).statement.id);
						PrintEdge(_localctx.id, ((StatementsContext)_localctx).t.id);
					} else {
						((StatementsContext)_localctx).id =  ((StatementsContext)_localctx).statement.id;
					}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

					((StatementsContext)_localctx).id =  -1;

				}
				break;
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

	public static class StatementContext extends ParserRuleContext {
		public int id;
		public LocationContext location;
		public Token AssignOp;
		public ExprContext expr;
		public Method_callContext method_call;
		public BlockContext b1;
		public BlockContext b2;
		public BlockContext block;
		public CasesContext cases;
		public StatementContext statement;
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode AssignOp() { return getToken(Cmpt379CompilerParser.AssignOp, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode If() { return getToken(Cmpt379CompilerParser.If, 0); }
		public TerminalNode Else() { return getToken(Cmpt379CompilerParser.Else, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode Switch() { return getToken(Cmpt379CompilerParser.Switch, 0); }
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public TerminalNode While() { return getToken(Cmpt379CompilerParser.While, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Ret() { return getToken(Cmpt379CompilerParser.Ret, 0); }
		public TerminalNode Brk() { return getToken(Cmpt379CompilerParser.Brk, 0); }
		public TerminalNode Cnt() { return getToken(Cmpt379CompilerParser.Cnt, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				((StatementContext)_localctx).location = location();
				setState(204);
				((StatementContext)_localctx).AssignOp = match(AssignOp);
				setState(205);
				((StatementContext)_localctx).expr = expr(0);
				setState(206);
				match(SemiColon);

					((StatementContext)_localctx).id =  PrintNode("Assign");
					PrintEdge(_localctx.id, ((StatementContext)_localctx).location.id);
					PrintEdge(_localctx.id, PrintNode((((StatementContext)_localctx).AssignOp!=null?((StatementContext)_localctx).AssignOp.getText():null)));
					PrintEdge(_localctx.id, ((StatementContext)_localctx).expr.id);

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				((StatementContext)_localctx).method_call = method_call();
				setState(210);
				match(SemiColon);

					((StatementContext)_localctx).id =  PrintNode("CallExpr");
					PrintEdge(_localctx.id, ((StatementContext)_localctx).method_call.id);

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(If);
				setState(214);
				match(OParen);
				setState(215);
				((StatementContext)_localctx).expr = expr(0);
				setState(216);
				match(CParen);
				setState(217);
				((StatementContext)_localctx).b1 = block();
				setState(218);
				match(Else);
				setState(219);
				((StatementContext)_localctx).b2 = block();

					((StatementContext)_localctx).id =  PrintNode("IfElse");
					int id2 = PrintNode("If");
					int id3 = PrintNode("Else");
					PrintEdge(id2, ((StatementContext)_localctx).expr.id);
					PrintEdge(id2, ((StatementContext)_localctx).b1.id);
					PrintEdge(id3, ((StatementContext)_localctx).b2.id);
					PrintEdge(_localctx.id, id2);
					PrintEdge(_localctx.id, id3);

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(If);
				setState(223);
				match(OParen);
				setState(224);
				((StatementContext)_localctx).expr = expr(0);
				setState(225);
				match(CParen);
				setState(226);
				((StatementContext)_localctx).block = block();

					((StatementContext)_localctx).id =  PrintNode("IfElse");
					int id2 = PrintNode("If");
					PrintEdge(id2, ((StatementContext)_localctx).expr.id);
					PrintEdge(id2, ((StatementContext)_localctx).block.id);
					PrintEdge(_localctx.id, id2);

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				match(Switch);
				setState(230);
				((StatementContext)_localctx).expr = expr(0);
				setState(231);
				match(OBrace);
				setState(232);
				((StatementContext)_localctx).cases = cases(0);
				setState(233);
				match(CBrace);

					((StatementContext)_localctx).id =  PrintNode("Switch");
					int id2 = PrintNode("CaseSeq");
					PrintEdge(_localctx.id, ((StatementContext)_localctx).expr.id);
					PrintEdges(id2, ((StatementContext)_localctx).cases.s);
					PrintEdge(_localctx.id, id2);

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(236);
				match(While);
				setState(237);
				match(OParen);
				setState(238);
				((StatementContext)_localctx).expr = expr(0);
				setState(239);
				match(CParen);
				setState(240);
				((StatementContext)_localctx).statement = statement();

					((StatementContext)_localctx).id =  PrintNode("While");
					PrintEdge(_localctx.id, ((StatementContext)_localctx).expr.id);
					PrintEdge(_localctx.id, _localctx.id);

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(243);
				match(Ret);
				setState(244);
				((StatementContext)_localctx).expr = expr(0);
				setState(245);
				match(SemiColon);

					((StatementContext)_localctx).id =  PrintNode("Ret");
					PrintEdge(_localctx.id, ((StatementContext)_localctx).expr.id);

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(248);
				match(Ret);
				setState(249);
				match(SemiColon);

					((StatementContext)_localctx).id =  PrintNode("Ret");

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(251);
				match(Brk);
				setState(252);
				match(SemiColon);

					((StatementContext)_localctx).id =  PrintNode("Brk");

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(254);
				match(Cnt);
				setState(255);
				match(SemiColon);

					((StatementContext)_localctx).id =  PrintNode("Cnt");

				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(257);
				((StatementContext)_localctx).block = block();

					((StatementContext)_localctx).id =  ((StatementContext)_localctx).block.id;

				}
				break;
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

	public static class Method_callContext extends ParserRuleContext {
		public int id;
		public Token Ident;
		public ArgumentsContext arguments;
		public NextCalloutArgsContext nextCalloutArgs;
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode Callout() { return getToken(Cmpt379CompilerParser.Callout, 0); }
		public TerminalNode Str() { return getToken(Cmpt379CompilerParser.Str, 0); }
		public NextCalloutArgsContext nextCalloutArgs() {
			return getRuleContext(NextCalloutArgsContext.class,0);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_method_call);
		try {
			setState(275);
			switch (_input.LA(1)) {
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				((Method_callContext)_localctx).Ident = match(Ident);
				setState(263);
				match(OParen);
				setState(264);
				((Method_callContext)_localctx).arguments = arguments();
				setState(265);
				match(CParen);

					((Method_callContext)_localctx).id =  PrintNode("Call");
					PrintEdge(_localctx.id, PrintNode((((Method_callContext)_localctx).Ident!=null?((Method_callContext)_localctx).Ident.getText():null)));
					PrintEdge(_localctx.id, ((Method_callContext)_localctx).arguments.id);

				}
				break;
			case Callout:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(Callout);
				setState(269);
				match(OParen);
				setState(270);
				match(Str);
				setState(271);
				((Method_callContext)_localctx).nextCalloutArgs = nextCalloutArgs(0);
				setState(272);
				match(CParen);

				    ((Method_callContext)_localctx).id =  PrintNode("Callout");
				    PrintEdge(_localctx.id, PrintNode("StringArg"));
				    PrintEdges(_localctx.id, ((Method_callContext)_localctx).nextCalloutArgs.s);

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

	public static class NextCalloutArgsContext extends ParserRuleContext {
		public MySet s;
		public NextCalloutArgsContext c;
		public CalloutArgContext calloutArg;
		public CalloutArgContext calloutArg() {
			return getRuleContext(CalloutArgContext.class,0);
		}
		public NextCalloutArgsContext nextCalloutArgs() {
			return getRuleContext(NextCalloutArgsContext.class,0);
		}
		public NextCalloutArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextCalloutArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterNextCalloutArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitNextCalloutArgs(this);
		}
	}

	public final NextCalloutArgsContext nextCalloutArgs() throws RecognitionException {
		return nextCalloutArgs(0);
	}

	private NextCalloutArgsContext nextCalloutArgs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NextCalloutArgsContext _localctx = new NextCalloutArgsContext(_ctx, _parentState);
		NextCalloutArgsContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_nextCalloutArgs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{

			    ((NextCalloutArgsContext)_localctx).s =  new MySet();

			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NextCalloutArgsContext(_parentctx, _parentState);
					_localctx.c = _prevctx;
					_localctx.c = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_nextCalloutArgs);
					setState(280);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(281);
					match(Comma);
					setState(282);
					((NextCalloutArgsContext)_localctx).calloutArg = calloutArg();

					              ((NextCalloutArgsContext)_localctx).s =  ((NextCalloutArgsContext)_localctx).c.s;
					              _localctx.s.ExtendArray(((NextCalloutArgsContext)_localctx).calloutArg.id);
					          
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class CalloutArgContext extends ParserRuleContext {
		public int id;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Str() { return getToken(Cmpt379CompilerParser.Str, 0); }
		public CalloutArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calloutArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterCalloutArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitCalloutArg(this);
		}
	}

	public final CalloutArgContext calloutArg() throws RecognitionException {
		CalloutArgContext _localctx = new CalloutArgContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_calloutArg);
		try {
			setState(295);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case Char:
			case Callout:
			case DecLit:
			case HexLit:
			case BoolLit:
			case Ident:
			case OParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				((CalloutArgContext)_localctx).expr = expr(0);

				    ((CalloutArgContext)_localctx).id =  PrintNode("CalloutExpr");
				    PrintEdge(_localctx.id, ((CalloutArgContext)_localctx).expr.id);

				}
				break;
			case Str:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(Str);

				    ((CalloutArgContext)_localctx).id =  PrintNode("CalloutString");
				    PrintEdge(_localctx.id, PrintNode("StringArg"));

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

	public static class ArgumentsContext extends ParserRuleContext {
		public int id;
		public ExprContext expr;
		public NextArgsContext nextArgs;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NextArgsContext nextArgs() {
			return getRuleContext(NextArgsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arguments);
		try {
			setState(302);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case Char:
			case Callout:
			case DecLit:
			case HexLit:
			case BoolLit:
			case Ident:
			case OParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				((ArgumentsContext)_localctx).expr = expr(0);
				setState(298);
				((ArgumentsContext)_localctx).nextArgs = nextArgs(0);

					((ArgumentsContext)_localctx).id =  PrintNode("ExprArg");
					PrintEdge(_localctx.id, ((ArgumentsContext)_localctx).expr.id);
					PrintEdges(_localctx.id, ((ArgumentsContext)_localctx).nextArgs.s);

				}
				break;
			case CParen:
				enterOuterAlt(_localctx, 2);
				{

					((ArgumentsContext)_localctx).id =  -1;

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

	public static class NextArgsContext extends ParserRuleContext {
		public MySet s;
		public NextArgsContext a;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NextArgsContext nextArgs() {
			return getRuleContext(NextArgsContext.class,0);
		}
		public NextArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterNextArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitNextArgs(this);
		}
	}

	public final NextArgsContext nextArgs() throws RecognitionException {
		return nextArgs(0);
	}

	private NextArgsContext nextArgs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NextArgsContext _localctx = new NextArgsContext(_ctx, _parentState);
		NextArgsContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_nextArgs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{

			    ((NextArgsContext)_localctx).s =  new MySet();

			}
			_ctx.stop = _input.LT(-1);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NextArgsContext(_parentctx, _parentState);
					_localctx.a = _prevctx;
					_localctx.a = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_nextArgs);
					setState(307);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(308);
					match(Comma);
					setState(309);
					((NextArgsContext)_localctx).expr = expr(0);

					              ((NextArgsContext)_localctx).s =  ((NextArgsContext)_localctx).a.s;
					              _localctx.s.ExtendArray(((NextArgsContext)_localctx).expr.id);
					          
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class CasesContext extends ParserRuleContext {
		public MySet s;
		public CasesContext c;
		public NextCaseContext nextCase;
		public NextCaseContext nextCase() {
			return getRuleContext(NextCaseContext.class,0);
		}
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitCases(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		return cases(0);
	}

	private CasesContext cases(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CasesContext _localctx = new CasesContext(_ctx, _parentState);
		CasesContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_cases, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(318);
			((CasesContext)_localctx).nextCase = nextCase();

			    ((CasesContext)_localctx).s =  new MySet();
			    _localctx.s.ExtendArray(((CasesContext)_localctx).nextCase.id);

			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CasesContext(_parentctx, _parentState);
					_localctx.c = _prevctx;
					_localctx.c = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_cases);
					setState(321);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(322);
					((CasesContext)_localctx).nextCase = nextCase();

					          	((CasesContext)_localctx).s =  ((CasesContext)_localctx).c.s;
					          	_localctx.s.ExtendArray(((CasesContext)_localctx).nextCase.id);
					          
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class NextCaseContext extends ParserRuleContext {
		public int id;
		public LiteralContext literal;
		public StatementsContext statements;
		public TerminalNode Case() { return getToken(Cmpt379CompilerParser.Case, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public NextCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterNextCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitNextCase(this);
		}
	}

	public final NextCaseContext nextCase() throws RecognitionException {
		NextCaseContext _localctx = new NextCaseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nextCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(Case);
			setState(331);
			((NextCaseContext)_localctx).literal = literal();
			setState(332);
			match(T__1);
			setState(333);
			((NextCaseContext)_localctx).statements = statements();

				((NextCaseContext)_localctx).id =  PrintNode("Case");
				PrintEdge(_localctx.id, PrintNode((((NextCaseContext)_localctx).literal!=null?_input.getText(((NextCaseContext)_localctx).literal.start,((NextCaseContext)_localctx).literal.stop):null)));
				if(((NextCaseContext)_localctx).statements.id != -1) {
				    PrintEdge(_localctx.id, ((NextCaseContext)_localctx).statements.id);
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

	public static class ExprContext extends ParserRuleContext {
		public int id;
		public ExprContext e1;
		public LocationContext location;
		public Method_callContext method_call;
		public LiteralContext literal;
		public ExprContext expr;
		public BinOpContext binOp;
		public ExprContext e2;
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinOpContext binOp() {
			return getRuleContext(BinOpContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(337);
				((ExprContext)_localctx).location = location();

					((ExprContext)_localctx).id =  PrintNode("LocExpr");
					PrintEdge(_localctx.id, ((ExprContext)_localctx).location.id);

				}
				break;
			case 2:
				{
				setState(340);
				((ExprContext)_localctx).method_call = method_call();

				    ((ExprContext)_localctx).id =  PrintNode("CallExpr");
				    PrintEdge(_localctx.id, ((ExprContext)_localctx).method_call.id);

				}
				break;
			case 3:
				{
				setState(343);
				((ExprContext)_localctx).literal = literal();

					((ExprContext)_localctx).id =  PrintNode("ConstExpr");
					PrintEdge(_localctx.id, PrintNode((((ExprContext)_localctx).literal!=null?_input.getText(((ExprContext)_localctx).literal.start,((ExprContext)_localctx).literal.stop):null)));

				}
				break;
			case 4:
				{
				setState(346);
				match(T__2);
				setState(347);
				((ExprContext)_localctx).expr = expr(3);

				    ((ExprContext)_localctx).id =  PrintNode("NegExpr");
				    PrintEdge(_localctx.id, _localctx.id);

				}
				break;
			case 5:
				{
				setState(350);
				match(T__3);
				setState(351);
				((ExprContext)_localctx).expr = expr(2);

				    ((ExprContext)_localctx).id =  PrintNode("NotExpr");
				    PrintEdge(_localctx.id, _localctx.id);

				}
				break;
			case 6:
				{
				setState(354);
				match(OParen);
				setState(355);
				((ExprContext)_localctx).expr = expr(0);
				setState(356);
				match(CParen);

				    ((ExprContext)_localctx).id =  PrintNode("ExprArg");
				    PrintEdge(_localctx.id, _localctx.id);

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					_localctx.e1 = _prevctx;
					_localctx.e1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(361);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(362);
					((ExprContext)_localctx).binOp = binOp();
					setState(363);
					((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(5);

					          	((ExprContext)_localctx).id =  PrintNode("Bin_expr");
					          	PrintEdge(_localctx.id, ((ExprContext)_localctx).e1.id);
					          	PrintEdge(_localctx.id, PrintNode((((ExprContext)_localctx).binOp!=null?_input.getText(((ExprContext)_localctx).binOp.start,((ExprContext)_localctx).binOp.stop):null)));
					          	PrintEdge(_localctx.id, ((ExprContext)_localctx).e2.id);
					          
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class LocationContext extends ParserRuleContext {
		public int id;
		public Token Ident;
		public ExprContext expr;
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_location);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				((LocationContext)_localctx).Ident = match(Ident);

				    ((LocationContext)_localctx).id =  PrintNode("Loc");
					PrintEdge(_localctx.id, PrintNode((((LocationContext)_localctx).Ident!=null?((LocationContext)_localctx).Ident.getText():null)));

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				((LocationContext)_localctx).Ident = match(Ident);
				setState(374);
				match(OBracket);
				setState(375);
				((LocationContext)_localctx).expr = expr(0);
				setState(376);
				match(CBracket);

				    ((LocationContext)_localctx).id =  PrintNode("LocExpr2");
				    PrintEdge(_localctx.id, PrintNode((((LocationContext)_localctx).Ident!=null?((LocationContext)_localctx).Ident.getText():null)));
				    PrintEdge(_localctx.id, ((LocationContext)_localctx).expr.id);

				}
				break;
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
		enterRule(_localctx, 44, RULE_intLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
		enterRule(_localctx, 46, RULE_literal);
		try {
			setState(386);
			switch (_input.LA(1)) {
			case Char:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(Char);
				}
				break;
			case DecLit:
			case HexLit:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				intLit();
				}
				break;
			case BoolLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
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
		enterRule(_localctx, 48, RULE_binOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
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
		case 9:
			return var_decls_sempred((Var_declsContext)_localctx, predIndex);
		case 10:
			return var_decl_sempred((Var_declContext)_localctx, predIndex);
		case 14:
			return nextCalloutArgs_sempred((NextCalloutArgsContext)_localctx, predIndex);
		case 17:
			return nextArgs_sempred((NextArgsContext)_localctx, predIndex);
		case 18:
			return cases_sempred((CasesContext)_localctx, predIndex);
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
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
	private boolean var_decls_sempred(Var_declsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean var_decl_sempred(Var_declContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean nextCalloutArgs_sempred(NextCalloutArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean nextArgs_sempred(NextArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cases_sempred(CasesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0189\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4h\n\4\f\4\16\4k\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6z\n\6\f\6\16\6}\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008f\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0097\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a1\n\t\f\t\16"+
		"\t\u00a4\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\7\13\u00b4\n\13\f\13\16\13\u00b7\13\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\7\f\u00c2\n\f\f\f\16\f\u00c5\13\f\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00cc\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u0107\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0116\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u0120\n\20\f\20\16\20\u0123\13\20\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u012a\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u0131\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u013b\n\23\f\23\16\23\u013e"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0148\n\24\f\24\16"+
		"\24\u014b\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u016a\n\26\3\26\3\26\3\26\3\26\3\26\7\26\u0171"+
		"\n\26\f\26\16\26\u0174\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5"+
		"\27\u017e\n\27\3\30\3\30\3\31\3\31\3\31\5\31\u0185\n\31\3\32\3\32\3\32"+
		"\2\f\4\6\n\20\24\26\36$&*\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\2\4\3\2\26\27\4\2\34\35\37 \u0194\2\64\3\2\2\2\4<\3\2\2\2"+
		"\6Y\3\2\2\2\bl\3\2\2\2\nr\3\2\2\2\f\u008e\3\2\2\2\16\u0096\3\2\2\2\20"+
		"\u0098\3\2\2\2\22\u00a5\3\2\2\2\24\u00ab\3\2\2\2\26\u00b8\3\2\2\2\30\u00cb"+
		"\3\2\2\2\32\u0106\3\2\2\2\34\u0115\3\2\2\2\36\u0117\3\2\2\2 \u0129\3\2"+
		"\2\2\"\u0130\3\2\2\2$\u0132\3\2\2\2&\u013f\3\2\2\2(\u014c\3\2\2\2*\u0169"+
		"\3\2\2\2,\u017d\3\2\2\2.\u017f\3\2\2\2\60\u0184\3\2\2\2\62\u0186\3\2\2"+
		"\2\64\65\7\n\2\2\65\66\7\13\2\2\66\67\7#\2\2\678\5\4\3\289\5\n\6\29:\7"+
		"$\2\2:;\b\2\1\2;\3\3\2\2\2<=\b\3\1\2=>\b\3\1\2>K\3\2\2\2?@\f\5\2\2@A\5"+
		"\6\4\2AB\7\'\2\2BC\b\3\1\2CJ\3\2\2\2DE\f\4\2\2EF\5\b\5\2FG\7\'\2\2GH\b"+
		"\3\1\2HJ\3\2\2\2I?\3\2\2\2ID\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\5"+
		"\3\2\2\2MK\3\2\2\2NO\b\4\1\2OP\7\31\2\2PQ\7\32\2\2QZ\b\4\1\2RS\7\31\2"+
		"\2ST\7\32\2\2TU\7%\2\2UV\5.\30\2VW\7&\2\2WX\b\4\1\2XZ\3\2\2\2YN\3\2\2"+
		"\2YR\3\2\2\2Zi\3\2\2\2[\\\f\6\2\2\\]\7(\2\2]^\7\32\2\2^h\b\4\1\2_`\f\5"+
		"\2\2`a\7(\2\2ab\7\32\2\2bc\7%\2\2cd\5.\30\2de\7&\2\2ef\b\4\1\2fh\3\2\2"+
		"\2g[\3\2\2\2g_\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\7\3\2\2\2ki\3\2"+
		"\2\2lm\7\31\2\2mn\7\32\2\2no\7\3\2\2op\5\60\31\2pq\b\5\1\2q\t\3\2\2\2"+
		"rs\b\6\1\2st\b\6\1\2t{\3\2\2\2uv\f\4\2\2vw\5\f\7\2wx\b\6\1\2xz\3\2\2\2"+
		"yu\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\13\3\2\2\2}{\3\2\2\2~\177\7"+
		"\31\2\2\177\u0080\7\32\2\2\u0080\u0081\7!\2\2\u0081\u0082\5\16\b\2\u0082"+
		"\u0083\7\"\2\2\u0083\u0084\5\22\n\2\u0084\u0085\b\7\1\2\u0085\u008f\3"+
		"\2\2\2\u0086\u0087\7\f\2\2\u0087\u0088\7\32\2\2\u0088\u0089\7!\2\2\u0089"+
		"\u008a\5\16\b\2\u008a\u008b\7\"\2\2\u008b\u008c\5\22\n\2\u008c\u008d\b"+
		"\7\1\2\u008d\u008f\3\2\2\2\u008e~\3\2\2\2\u008e\u0086\3\2\2\2\u008f\r"+
		"\3\2\2\2\u0090\u0091\7\31\2\2\u0091\u0092\7\32\2\2\u0092\u0093\5\20\t"+
		"\2\u0093\u0094\b\b\1\2\u0094\u0097\3\2\2\2\u0095\u0097\b\b\1\2\u0096\u0090"+
		"\3\2\2\2\u0096\u0095\3\2\2\2\u0097\17\3\2\2\2\u0098\u0099\b\t\1\2\u0099"+
		"\u009a\b\t\1\2\u009a\u00a2\3\2\2\2\u009b\u009c\f\4\2\2\u009c\u009d\7("+
		"\2\2\u009d\u009e\7\31\2\2\u009e\u009f\7\32\2\2\u009f\u00a1\b\t\1\2\u00a0"+
		"\u009b\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\21\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7#\2\2\u00a6\u00a7"+
		"\5\24\13\2\u00a7\u00a8\5\30\r\2\u00a8\u00a9\7$\2\2\u00a9\u00aa\b\n\1\2"+
		"\u00aa\23\3\2\2\2\u00ab\u00ac\b\13\1\2\u00ac\u00ad\b\13\1\2\u00ad\u00b5"+
		"\3\2\2\2\u00ae\u00af\f\4\2\2\u00af\u00b0\5\26\f\2\u00b0\u00b1\7\'\2\2"+
		"\u00b1\u00b2\b\13\1\2\u00b2\u00b4\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4\u00b7"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\25\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00b9\b\f\1\2\u00b9\u00ba\7\31\2\2\u00ba\u00bb\7"+
		"\32\2\2\u00bb\u00bc\b\f\1\2\u00bc\u00c3\3\2\2\2\u00bd\u00be\f\4\2\2\u00be"+
		"\u00bf\7(\2\2\u00bf\u00c0\7\32\2\2\u00c0\u00c2\b\f\1\2\u00c1\u00bd\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\27\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\5\32\16\2\u00c7\u00c8\5\30"+
		"\r\2\u00c8\u00c9\b\r\1\2\u00c9\u00cc\3\2\2\2\u00ca\u00cc\b\r\1\2\u00cb"+
		"\u00c6\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\31\3\2\2\2\u00cd\u00ce\5,\27"+
		"\2\u00ce\u00cf\7\36\2\2\u00cf\u00d0\5*\26\2\u00d0\u00d1\7\'\2\2\u00d1"+
		"\u00d2\b\16\1\2\u00d2\u0107\3\2\2\2\u00d3\u00d4\5\34\17\2\u00d4\u00d5"+
		"\7\'\2\2\u00d5\u00d6\b\16\1\2\u00d6\u0107\3\2\2\2\u00d7\u00d8\7\r\2\2"+
		"\u00d8\u00d9\7!\2\2\u00d9\u00da\5*\26\2\u00da\u00db\7\"\2\2\u00db\u00dc"+
		"\5\22\n\2\u00dc\u00dd\7\16\2\2\u00dd\u00de\5\22\n\2\u00de\u00df\b\16\1"+
		"\2\u00df\u0107\3\2\2\2\u00e0\u00e1\7\r\2\2\u00e1\u00e2\7!\2\2\u00e2\u00e3"+
		"\5*\26\2\u00e3\u00e4\7\"\2\2\u00e4\u00e5\5\22\n\2\u00e5\u00e6\b\16\1\2"+
		"\u00e6\u0107\3\2\2\2\u00e7\u00e8\7\24\2\2\u00e8\u00e9\5*\26\2\u00e9\u00ea"+
		"\7#\2\2\u00ea\u00eb\5&\24\2\u00eb\u00ec\7$\2\2\u00ec\u00ed\b\16\1\2\u00ed"+
		"\u0107\3\2\2\2\u00ee\u00ef\7\33\2\2\u00ef\u00f0\7!\2\2\u00f0\u00f1\5*"+
		"\26\2\u00f1\u00f2\7\"\2\2\u00f2\u00f3\5\32\16\2\u00f3\u00f4\b\16\1\2\u00f4"+
		"\u0107\3\2\2\2\u00f5\u00f6\7\20\2\2\u00f6\u00f7\5*\26\2\u00f7\u00f8\7"+
		"\'\2\2\u00f8\u00f9\b\16\1\2\u00f9\u0107\3\2\2\2\u00fa\u00fb\7\20\2\2\u00fb"+
		"\u00fc\7\'\2\2\u00fc\u0107\b\16\1\2\u00fd\u00fe\7\21\2\2\u00fe\u00ff\7"+
		"\'\2\2\u00ff\u0107\b\16\1\2\u0100\u0101\7\22\2\2\u0101\u0102\7\'\2\2\u0102"+
		"\u0107\b\16\1\2\u0103\u0104\5\22\n\2\u0104\u0105\b\16\1\2\u0105\u0107"+
		"\3\2\2\2\u0106\u00cd\3\2\2\2\u0106\u00d3\3\2\2\2\u0106\u00d7\3\2\2\2\u0106"+
		"\u00e0\3\2\2\2\u0106\u00e7\3\2\2\2\u0106\u00ee\3\2\2\2\u0106\u00f5\3\2"+
		"\2\2\u0106\u00fa\3\2\2\2\u0106\u00fd\3\2\2\2\u0106\u0100\3\2\2\2\u0106"+
		"\u0103\3\2\2\2\u0107\33\3\2\2\2\u0108\u0109\7\32\2\2\u0109\u010a\7!\2"+
		"\2\u010a\u010b\5\"\22\2\u010b\u010c\7\"\2\2\u010c\u010d\b\17\1\2\u010d"+
		"\u0116\3\2\2\2\u010e\u010f\7\23\2\2\u010f\u0110\7!\2\2\u0110\u0111\7\t"+
		"\2\2\u0111\u0112\5\36\20\2\u0112\u0113\7\"\2\2\u0113\u0114\b\17\1\2\u0114"+
		"\u0116\3\2\2\2\u0115\u0108\3\2\2\2\u0115\u010e\3\2\2\2\u0116\35\3\2\2"+
		"\2\u0117\u0118\b\20\1\2\u0118\u0119\b\20\1\2\u0119\u0121\3\2\2\2\u011a"+
		"\u011b\f\4\2\2\u011b\u011c\7(\2\2\u011c\u011d\5 \21\2\u011d\u011e\b\20"+
		"\1\2\u011e\u0120\3\2\2\2\u011f\u011a\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\37\3\2\2\2\u0123\u0121\3\2\2"+
		"\2\u0124\u0125\5*\26\2\u0125\u0126\b\21\1\2\u0126\u012a\3\2\2\2\u0127"+
		"\u0128\7\t\2\2\u0128\u012a\b\21\1\2\u0129\u0124\3\2\2\2\u0129\u0127\3"+
		"\2\2\2\u012a!\3\2\2\2\u012b\u012c\5*\26\2\u012c\u012d\5$\23\2\u012d\u012e"+
		"\b\22\1\2\u012e\u0131\3\2\2\2\u012f\u0131\b\22\1\2\u0130\u012b\3\2\2\2"+
		"\u0130\u012f\3\2\2\2\u0131#\3\2\2\2\u0132\u0133\b\23\1\2\u0133\u0134\b"+
		"\23\1\2\u0134\u013c\3\2\2\2\u0135\u0136\f\4\2\2\u0136\u0137\7(\2\2\u0137"+
		"\u0138\5*\26\2\u0138\u0139\b\23\1\2\u0139\u013b\3\2\2\2\u013a\u0135\3"+
		"\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"%\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\b\24\1\2\u0140\u0141\5(\25\2"+
		"\u0141\u0142\b\24\1\2\u0142\u0149\3\2\2\2\u0143\u0144\f\4\2\2\u0144\u0145"+
		"\5(\25\2\u0145\u0146\b\24\1\2\u0146\u0148\3\2\2\2\u0147\u0143\3\2\2\2"+
		"\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\'\3"+
		"\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7\25\2\2\u014d\u014e\5\60\31\2"+
		"\u014e\u014f\7\4\2\2\u014f\u0150\5\30\r\2\u0150\u0151\b\25\1\2\u0151)"+
		"\3\2\2\2\u0152\u0153\b\26\1\2\u0153\u0154\5,\27\2\u0154\u0155\b\26\1\2"+
		"\u0155\u016a\3\2\2\2\u0156\u0157\5\34\17\2\u0157\u0158\b\26\1\2\u0158"+
		"\u016a\3\2\2\2\u0159\u015a\5\60\31\2\u015a\u015b\b\26\1\2\u015b\u016a"+
		"\3\2\2\2\u015c\u015d\7\5\2\2\u015d\u015e\5*\26\5\u015e\u015f\b\26\1\2"+
		"\u015f\u016a\3\2\2\2\u0160\u0161\7\6\2\2\u0161\u0162\5*\26\4\u0162\u0163"+
		"\b\26\1\2\u0163\u016a\3\2\2\2\u0164\u0165\7!\2\2\u0165\u0166\5*\26\2\u0166"+
		"\u0167\7\"\2\2\u0167\u0168\b\26\1\2\u0168\u016a\3\2\2\2\u0169\u0152\3"+
		"\2\2\2\u0169\u0156\3\2\2\2\u0169\u0159\3\2\2\2\u0169\u015c\3\2\2\2\u0169"+
		"\u0160\3\2\2\2\u0169\u0164\3\2\2\2\u016a\u0172\3\2\2\2\u016b\u016c\f\6"+
		"\2\2\u016c\u016d\5\62\32\2\u016d\u016e\5*\26\7\u016e\u016f\b\26\1\2\u016f"+
		"\u0171\3\2\2\2\u0170\u016b\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173+\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176"+
		"\7\32\2\2\u0176\u017e\b\27\1\2\u0177\u0178\7\32\2\2\u0178\u0179\7%\2\2"+
		"\u0179\u017a\5*\26\2\u017a\u017b\7&\2\2\u017b\u017c\b\27\1\2\u017c\u017e"+
		"\3\2\2\2\u017d\u0175\3\2\2\2\u017d\u0177\3\2\2\2\u017e-\3\2\2\2\u017f"+
		"\u0180\t\2\2\2\u0180/\3\2\2\2\u0181\u0185\7\b\2\2\u0182\u0185\5.\30\2"+
		"\u0183\u0185\7\30\2\2\u0184\u0181\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0183"+
		"\3\2\2\2\u0185\61\3\2\2\2\u0186\u0187\t\3\2\2\u0187\63\3\2\2\2\31IKYg"+
		"i{\u008e\u0096\u00a2\u00b5\u00c3\u00cb\u0106\u0115\u0121\u0129\u0130\u013c"+
		"\u0149\u0169\u0172\u017d\u0184";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}