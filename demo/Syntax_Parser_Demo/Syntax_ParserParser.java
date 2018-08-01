// Generated from Syntax_Parser.g4 by ANTLR 4.5.3


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
public class Syntax_ParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WhiteSpace=7, Class=8, 
		Program=9, Void=10, Ret=11, Callout=12, DecNum=13, Type=14, Ident=15, 
		RelOp=16, ArithOp=17, AssignOp=18;
	public static final int
		RULE_prog = 0, RULE_field_decls = 1, RULE_field_decl = 2, RULE_inited_field_decl = 3, 
		RULE_method_decls = 4, RULE_method_decl = 5, RULE_params = 6, RULE_nextParams = 7, 
		RULE_block = 8, RULE_var_decls = 9, RULE_var_decl = 10, RULE_statements = 11, 
		RULE_statement = 12, RULE_expr = 13, RULE_location = 14, RULE_num = 15, 
		RULE_literal = 16, RULE_eqOp = 17, RULE_binOp = 18;
	public static final String[] ruleNames = {
		"prog", "field_decls", "field_decl", "inited_field_decl", "method_decls", 
		"method_decl", "params", "nextParams", "block", "var_decls", "var_decl", 
		"statements", "statement", "expr", "location", "num", "literal", "eqOp", 
		"binOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", "'('", "')'", null, "'class'", "'Program'", 
		"'void'", "'return'", "'callout'", null, null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "WhiteSpace", "Class", "Program", 
		"Void", "Ret", "Callout", "DecNum", "Type", "Ident", "RelOp", "ArithOp", 
		"AssignOp"
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
	public String getGrammarFileName() { return "Syntax_Parser.g4"; }

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




		

	public Syntax_ParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Field_declsContext field_decls;
		public Method_declsContext method_decls;
		public TerminalNode Class() { return getToken(Syntax_ParserParser.Class, 0); }
		public TerminalNode Program() { return getToken(Syntax_ParserParser.Program, 0); }
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
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(Class);
			setState(39);
			match(Program);
			setState(40);
			match(T__0);
			setState(41);
			((ProgContext)_localctx).field_decls = field_decls(0);
			setState(42);
			((ProgContext)_localctx).method_decls = method_decls(0);
			setState(43);
			match(T__1);

				
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
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterField_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitField_decls(this);
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
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new Field_declsContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decls);
						setState(49);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(50);
						((Field_declsContext)_localctx).field_decl = field_decl(0);
						setState(51);
						match(T__2);

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
						setState(54);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(55);
						((Field_declsContext)_localctx).inited_field_decl = inited_field_decl();
						setState(56);
						match(T__2);

						          	((Field_declsContext)_localctx).s =  ((Field_declsContext)_localctx).f.s;
						          	_localctx.s.ExtendArray(((Field_declsContext)_localctx).inited_field_decl.id);
						          
						}
						break;
					}
					} 
				}
				setState(63);
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
		public TerminalNode Type() { return getToken(Syntax_ParserParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Syntax_ParserParser.Ident, 0); }
		public Field_declContext field_decl() {
			return getRuleContext(Field_declContext.class,0);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitField_decl(this);
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
			{
			setState(65);
			((Field_declContext)_localctx).Type = match(Type);
			setState(66);
			((Field_declContext)_localctx).Ident = match(Ident);

				((Field_declContext)_localctx).id =  PrintNode("Field_decl");

				PrintEdge(_localctx.id, PrintNode((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null)));
				PrintEdge(_localctx.id, PrintNode((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null)));

			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Field_declContext(_parentctx, _parentState);
					_localctx.f = _prevctx;
					_localctx.f = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_field_decl);
					setState(69);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(70);
					match(T__3);
					setState(71);
					((Field_declContext)_localctx).Ident = match(Ident);

					          	((Field_declContext)_localctx).id =  ((Field_declContext)_localctx).f.id;

					          	PrintEdge(((Field_declContext)_localctx).f.id, PrintNode((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null)));
					          
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		public TerminalNode Type() { return getToken(Syntax_ParserParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Syntax_ParserParser.Ident, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Inited_field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inited_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterInited_field_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitInited_field_decl(this);
		}
	}

	public final Inited_field_declContext inited_field_decl() throws RecognitionException {
		Inited_field_declContext _localctx = new Inited_field_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inited_field_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((Inited_field_declContext)_localctx).Type = match(Type);
			setState(79);
			((Inited_field_declContext)_localctx).Ident = match(Ident);
			setState(80);
			match(AssignOp);
			setState(81);
			((Inited_field_declContext)_localctx).literal = literal();

				((Inited_field_declContext)_localctx).id =  PrintNode("Inited_field_decl");

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
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterMethod_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitMethod_decls(this);
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
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
					setState(87);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(88);
					((Method_declsContext)_localctx).method_decl = method_decl();

					          	
					          	((Method_declsContext)_localctx).s =  ((Method_declsContext)_localctx).m.s;
					          	_localctx.s.ExtendArray(((Method_declsContext)_localctx).method_decl.id);
					          
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public TerminalNode Type() { return getToken(Syntax_ParserParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Syntax_ParserParser.Ident, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Void() { return getToken(Syntax_ParserParser.Void, 0); }
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method_decl);
		try {
			setState(112);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				((Method_declContext)_localctx).Type = match(Type);
				setState(97);
				((Method_declContext)_localctx).Ident = match(Ident);
				setState(98);
				match(T__4);
				setState(99);
				((Method_declContext)_localctx).params = params();
				setState(100);
				match(T__5);
				setState(101);
				((Method_declContext)_localctx).block = block();

					((Method_declContext)_localctx).id =  PrintNode("Method_decl");

					PrintEdge(_localctx.id, PrintNode((((Method_declContext)_localctx).Type!=null?((Method_declContext)_localctx).Type.getText():null)));
					PrintEdge(_localctx.id, PrintNode((((Method_declContext)_localctx).Ident!=null?((Method_declContext)_localctx).Ident.getText():null)));
					PrintEdge(_localctx.id, ((Method_declContext)_localctx).params.id);
					PrintEdge(_localctx.id, ((Method_declContext)_localctx).block.id);	

				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(Void);
				setState(105);
				((Method_declContext)_localctx).Ident = match(Ident);
				setState(106);
				match(T__4);
				setState(107);
				((Method_declContext)_localctx).params = params();
				setState(108);
				match(T__5);
				setState(109);
				((Method_declContext)_localctx).block = block();

					((Method_declContext)_localctx).id =  PrintNode("Method_decl");

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
		public TerminalNode Type() { return getToken(Syntax_ParserParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Syntax_ParserParser.Ident, 0); }
		public NextParamsContext nextParams() {
			return getRuleContext(NextParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		try {
			setState(120);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				((ParamsContext)_localctx).Type = match(Type);
				setState(115);
				((ParamsContext)_localctx).Ident = match(Ident);
				setState(116);
				((ParamsContext)_localctx).nextParams = nextParams(0);

					((ParamsContext)_localctx).id =  PrintNode("Method_args");
					
					PrintEdge(_localctx.id, PrintNode((((ParamsContext)_localctx).Type!=null?((ParamsContext)_localctx).Type.getText():null)));
					PrintEdge(_localctx.id, PrintNode((((ParamsContext)_localctx).Ident!=null?((ParamsContext)_localctx).Ident.getText():null)));

					PrintEdges(_localctx.id, ((ParamsContext)_localctx).nextParams.s);

				}
				break;
			case T__5:
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
		public TerminalNode Type() { return getToken(Syntax_ParserParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Syntax_ParserParser.Ident, 0); }
		public NextParamsContext nextParams() {
			return getRuleContext(NextParamsContext.class,0);
		}
		public NextParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterNextParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitNextParams(this);
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
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
					setState(125);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(126);
					match(T__3);
					setState(127);
					((NextParamsContext)_localctx).Type = match(Type);
					setState(128);
					((NextParamsContext)_localctx).Ident = match(Ident);

					          	((NextParamsContext)_localctx).s =  ((NextParamsContext)_localctx).n.s;
					          	
					          	_localctx.s.ExtendArray(PrintNode((((NextParamsContext)_localctx).Type!=null?((NextParamsContext)_localctx).Type.getText():null)));
					          	_localctx.s.ExtendArray(PrintNode((((NextParamsContext)_localctx).Ident!=null?((NextParamsContext)_localctx).Ident.getText():null)));
					          
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__0);
			setState(136);
			((BlockContext)_localctx).var_decls = var_decls(0);
			setState(137);
			((BlockContext)_localctx).statements = statements();
			setState(138);
			match(T__1);

				((BlockContext)_localctx).id =  -1;
				if (((BlockContext)_localctx).var_decls.s.size > 0) {
					((BlockContext)_localctx).id =  PrintNode("Block");
					int id2 = PrintNode("Var_decls");
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
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterVar_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitVar_decls(this);
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
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
					setState(144);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(145);
					((Var_declsContext)_localctx).var_decl = var_decl(0);
					setState(146);
					match(T__2);

					          	((Var_declsContext)_localctx).s =  ((Var_declsContext)_localctx).v.s;
					          	_localctx.s.ExtendArray(((Var_declsContext)_localctx).var_decl.id);
					          
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public TerminalNode Type() { return getToken(Syntax_ParserParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Syntax_ParserParser.Ident, 0); }
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitVar_decl(this);
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
			setState(155);
			((Var_declContext)_localctx).Type = match(Type);
			setState(156);
			((Var_declContext)_localctx).Ident = match(Ident);

				((Var_declContext)_localctx).id =  PrintNode("Var_decl");
				
				PrintEdge(_localctx.id, PrintNode((((Var_declContext)_localctx).Type!=null?((Var_declContext)_localctx).Type.getText():null)));
				PrintEdge(_localctx.id, PrintNode((((Var_declContext)_localctx).Ident!=null?((Var_declContext)_localctx).Ident.getText():null)));

			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
					setState(159);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(160);
					match(T__3);
					setState(161);
					((Var_declContext)_localctx).Ident = match(Ident);

					          	((Var_declContext)_localctx).id =  ((Var_declContext)_localctx).v.id;
					          	
					          	PrintEdge(_localctx.id, PrintNode((((Var_declContext)_localctx).Ident!=null?((Var_declContext)_localctx).Ident.getText():null)));
					          
					}
					} 
				}
				setState(167);
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
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statements);
		try {
			setState(173);
			switch (_input.LA(1)) {
			case T__0:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				((StatementsContext)_localctx).statement = statement();
				setState(169);
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
			case T__1:
				enterOuterAlt(_localctx, 2);
				{

					((StatementsContext)_localctx).id =  -1;

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

	public static class StatementContext extends ParserRuleContext {
		public int id;
		public LocationContext location;
		public EqOpContext eqOp;
		public ExprContext expr;
		public BlockContext block;
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public EqOpContext eqOp() {
			return getRuleContext(EqOpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(184);
			switch (_input.LA(1)) {
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				((StatementContext)_localctx).location = location();
				setState(176);
				((StatementContext)_localctx).eqOp = eqOp();
				setState(177);
				((StatementContext)_localctx).expr = expr(0);
				setState(178);
				match(T__2);

					((StatementContext)_localctx).id =  PrintNode("Assign");
					PrintEdge(_localctx.id, ((StatementContext)_localctx).location.id);
					PrintEdge(_localctx.id, PrintNode((((StatementContext)_localctx).eqOp!=null?_input.getText(((StatementContext)_localctx).eqOp.start,((StatementContext)_localctx).eqOp.stop):null)));
					PrintEdge(_localctx.id, ((StatementContext)_localctx).expr.id);

				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				((StatementContext)_localctx).block = block();

					((StatementContext)_localctx).id =  ((StatementContext)_localctx).block.id;

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

	public static class ExprContext extends ParserRuleContext {
		public int id;
		public ExprContext e1;
		public LiteralContext literal;
		public LocationContext location;
		public BinOpContext binOp;
		public ExprContext e2;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public BinOpContext binOp() {
			return getRuleContext(BinOpContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitExpr(this);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			switch (_input.LA(1)) {
			case DecNum:
				{
				setState(187);
				((ExprContext)_localctx).literal = literal();

					((ExprContext)_localctx).id =  PrintNode("Const_expr");
					PrintEdge(_localctx.id, PrintNode((((ExprContext)_localctx).literal!=null?_input.getText(((ExprContext)_localctx).literal.start,((ExprContext)_localctx).literal.stop):null)));

				}
				break;
			case Ident:
				{
				setState(190);
				((ExprContext)_localctx).location = location();

					((ExprContext)_localctx).id =  PrintNode("Loc_expr");
					PrintEdge(_localctx.id, ((ExprContext)_localctx).location.id);

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
					setState(195);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(196);
					((ExprContext)_localctx).binOp = binOp();
					setState(197);
					((ExprContext)_localctx).e2 = expr(3);

					          	((ExprContext)_localctx).id =  PrintNode("Bin_expr");
					          	PrintEdge(_localctx.id, ((ExprContext)_localctx).e1.id);
					          	PrintEdge(_localctx.id, PrintNode((((ExprContext)_localctx).binOp!=null?_input.getText(((ExprContext)_localctx).binOp.start,((ExprContext)_localctx).binOp.stop):null)));
					          	PrintEdge(_localctx.id, ((ExprContext)_localctx).e2.id);
					          
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public TerminalNode Ident() { return getToken(Syntax_ParserParser.Ident, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			((LocationContext)_localctx).Ident = match(Ident);

				((LocationContext)_localctx).id =  PrintNode("Loc");
				PrintEdge(_localctx.id, PrintNode((((LocationContext)_localctx).Ident!=null?((LocationContext)_localctx).Ident.getText():null)));

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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode DecNum() { return getToken(Syntax_ParserParser.DecNum, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(DecNum);
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
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			num();
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

	public static class EqOpContext extends ParserRuleContext {
		public TerminalNode AssignOp() { return getToken(Syntax_ParserParser.AssignOp, 0); }
		public EqOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterEqOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitEqOp(this);
		}
	}

	public final EqOpContext eqOp() throws RecognitionException {
		EqOpContext _localctx = new EqOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_eqOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !(_la==AssignOp) ) {
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

	public static class BinOpContext extends ParserRuleContext {
		public TerminalNode ArithOp() { return getToken(Syntax_ParserParser.ArithOp, 0); }
		public TerminalNode RelOp() { return getToken(Syntax_ParserParser.RelOp, 0); }
		public BinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).enterBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Syntax_ParserListener ) ((Syntax_ParserListener)listener).exitBinOp(this);
		}
	}

	public final BinOpContext binOp() throws RecognitionException {
		BinOpContext _localctx = new BinOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_binOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !(_la==RelOp || _la==ArithOp) ) {
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
		case 13:
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
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean method_decls_sempred(Method_declsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean nextParams_sempred(NextParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean var_decls_sempred(Var_declsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean var_decl_sempred(Var_declContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24\u00db\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7s\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b{\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0085\n\t\f"+
		"\t\16\t\u0088\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u0098\n\13\f\13\16\13\u009b\13\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\7\f\u00a6\n\f\f\f\16\f\u00a9\13\f\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00b0\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00bb"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c4\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00cb\n\17\f\17\16\17\u00ce\13\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\2\t\4\6\n\20\24\26\34\25\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\4\3\2\24\24\3\2\22\23\u00d4"+
		"\2(\3\2\2\2\4\60\3\2\2\2\6B\3\2\2\2\bP\3\2\2\2\nV\3\2\2\2\fr\3\2\2\2\16"+
		"z\3\2\2\2\20|\3\2\2\2\22\u0089\3\2\2\2\24\u008f\3\2\2\2\26\u009c\3\2\2"+
		"\2\30\u00af\3\2\2\2\32\u00ba\3\2\2\2\34\u00c3\3\2\2\2\36\u00cf\3\2\2\2"+
		" \u00d2\3\2\2\2\"\u00d4\3\2\2\2$\u00d6\3\2\2\2&\u00d8\3\2\2\2()\7\n\2"+
		"\2)*\7\13\2\2*+\7\3\2\2+,\5\4\3\2,-\5\n\6\2-.\7\4\2\2./\b\2\1\2/\3\3\2"+
		"\2\2\60\61\b\3\1\2\61\62\b\3\1\2\62?\3\2\2\2\63\64\f\5\2\2\64\65\5\6\4"+
		"\2\65\66\7\5\2\2\66\67\b\3\1\2\67>\3\2\2\289\f\4\2\29:\5\b\5\2:;\7\5\2"+
		"\2;<\b\3\1\2<>\3\2\2\2=\63\3\2\2\2=8\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2"+
		"\2\2@\5\3\2\2\2A?\3\2\2\2BC\b\4\1\2CD\7\20\2\2DE\7\21\2\2EF\b\4\1\2FM"+
		"\3\2\2\2GH\f\4\2\2HI\7\6\2\2IJ\7\21\2\2JL\b\4\1\2KG\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2N\7\3\2\2\2OM\3\2\2\2PQ\7\20\2\2QR\7\21\2\2RS\7\24"+
		"\2\2ST\5\"\22\2TU\b\5\1\2U\t\3\2\2\2VW\b\6\1\2WX\b\6\1\2X_\3\2\2\2YZ\f"+
		"\4\2\2Z[\5\f\7\2[\\\b\6\1\2\\^\3\2\2\2]Y\3\2\2\2^a\3\2\2\2_]\3\2\2\2_"+
		"`\3\2\2\2`\13\3\2\2\2a_\3\2\2\2bc\7\20\2\2cd\7\21\2\2de\7\7\2\2ef\5\16"+
		"\b\2fg\7\b\2\2gh\5\22\n\2hi\b\7\1\2is\3\2\2\2jk\7\f\2\2kl\7\21\2\2lm\7"+
		"\7\2\2mn\5\16\b\2no\7\b\2\2op\5\22\n\2pq\b\7\1\2qs\3\2\2\2rb\3\2\2\2r"+
		"j\3\2\2\2s\r\3\2\2\2tu\7\20\2\2uv\7\21\2\2vw\5\20\t\2wx\b\b\1\2x{\3\2"+
		"\2\2y{\b\b\1\2zt\3\2\2\2zy\3\2\2\2{\17\3\2\2\2|}\b\t\1\2}~\b\t\1\2~\u0086"+
		"\3\2\2\2\177\u0080\f\4\2\2\u0080\u0081\7\6\2\2\u0081\u0082\7\20\2\2\u0082"+
		"\u0083\7\21\2\2\u0083\u0085\b\t\1\2\u0084\177\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\21\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008a\7\3\2\2\u008a\u008b\5\24\13\2\u008b\u008c\5\30\r"+
		"\2\u008c\u008d\7\4\2\2\u008d\u008e\b\n\1\2\u008e\23\3\2\2\2\u008f\u0090"+
		"\b\13\1\2\u0090\u0091\b\13\1\2\u0091\u0099\3\2\2\2\u0092\u0093\f\4\2\2"+
		"\u0093\u0094\5\26\f\2\u0094\u0095\7\5\2\2\u0095\u0096\b\13\1\2\u0096\u0098"+
		"\3\2\2\2\u0097\u0092\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\25\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\b\f\1"+
		"\2\u009d\u009e\7\20\2\2\u009e\u009f\7\21\2\2\u009f\u00a0\b\f\1\2\u00a0"+
		"\u00a7\3\2\2\2\u00a1\u00a2\f\4\2\2\u00a2\u00a3\7\6\2\2\u00a3\u00a4\7\21"+
		"\2\2\u00a4\u00a6\b\f\1\2\u00a5\u00a1\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\27\3\2\2\2\u00a9\u00a7\3\2\2"+
		"\2\u00aa\u00ab\5\32\16\2\u00ab\u00ac\5\30\r\2\u00ac\u00ad\b\r\1\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00b0\b\r\1\2\u00af\u00aa\3\2\2\2\u00af\u00ae\3\2"+
		"\2\2\u00b0\31\3\2\2\2\u00b1\u00b2\5\36\20\2\u00b2\u00b3\5$\23\2\u00b3"+
		"\u00b4\5\34\17\2\u00b4\u00b5\7\5\2\2\u00b5\u00b6\b\16\1\2\u00b6\u00bb"+
		"\3\2\2\2\u00b7\u00b8\5\22\n\2\u00b8\u00b9\b\16\1\2\u00b9\u00bb\3\2\2\2"+
		"\u00ba\u00b1\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb\33\3\2\2\2\u00bc\u00bd"+
		"\b\17\1\2\u00bd\u00be\5\"\22\2\u00be\u00bf\b\17\1\2\u00bf\u00c4\3\2\2"+
		"\2\u00c0\u00c1\5\36\20\2\u00c1\u00c2\b\17\1\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00bc\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\u00cc\3\2\2\2\u00c5\u00c6\f\4"+
		"\2\2\u00c6\u00c7\5&\24\2\u00c7\u00c8\5\34\17\5\u00c8\u00c9\b\17\1\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c5\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\35\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0"+
		"\7\21\2\2\u00d0\u00d1\b\20\1\2\u00d1\37\3\2\2\2\u00d2\u00d3\7\17\2\2\u00d3"+
		"!\3\2\2\2\u00d4\u00d5\5 \21\2\u00d5#\3\2\2\2\u00d6\u00d7\t\2\2\2\u00d7"+
		"%\3\2\2\2\u00d8\u00d9\t\3\2\2\u00d9\'\3\2\2\2\17=?M_rz\u0086\u0099\u00a7"+
		"\u00af\u00ba\u00c3\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}