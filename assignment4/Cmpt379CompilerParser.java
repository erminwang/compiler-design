// Generated from Cmpt379Compiler.g4 by ANTLR 4.5.3


import x86.*;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, WhiteSpace=21, Char=22, Str=23, Class=24, 
		Program=25, Void=26, If=27, Else=28, While=29, Switch=30, Case=31, Ret=32, 
		Brk=33, Cnt=34, Callout=35, DecNum=36, HexNum=37, BoolLit=38, Type=39, 
		Ident=40, AssignOp=41, MulDiv=42, AddSub=43;
	public static final int
		RULE_prog = 0, RULE_field_decls = 1, RULE_field_decl = 2, RULE_inited_field_decl = 3, 
		RULE_method_decls = 4, RULE_method_decl = 5, RULE_params = 6, RULE_block = 7, 
		RULE_var_decls = 8, RULE_var_decl = 9, RULE_statements = 10, RULE_statement = 11, 
		RULE_cases = 12, RULE_expr = 13, RULE_methodCall = 14, RULE_args = 15, 
		RULE_someArgs = 16, RULE_calloutArgs = 17, RULE_marker = 18, RULE_next = 19, 
		RULE_location = 20, RULE_num = 21, RULE_literal = 22, RULE_eqOp = 23;
	public static final String[] ruleNames = {
		"prog", "field_decls", "field_decl", "inited_field_decl", "method_decls", 
		"method_decl", "params", "block", "var_decls", "var_decl", "statements", 
		"statement", "cases", "expr", "methodCall", "args", "someArgs", "calloutArgs", 
		"marker", "next", "location", "num", "literal", "eqOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", "'['", "']'", "'='", "'('", "')'", "':'", 
		"'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'!'", "'&&'", "'||'", 
		null, null, null, "'class'", "'Program'", "'void'", "'if'", "'else'", 
		"'while'", "'switch'", "'case'", "'return'", "'break'", "'continue'", 
		"'callout'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "WhiteSpace", "Char", 
		"Str", "Class", "Program", "Void", "If", "Else", "While", "Switch", "Case", 
		"Ret", "Brk", "Cnt", "Callout", "DecNum", "HexNum", "BoolLit", "Type", 
		"Ident", "AssignOp", "MulDiv", "AddSub"
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











		SymStack s = new SymStack();

		QuadTab q = new QuadTab(s);



	public Cmpt379CompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
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
			setState(48);
			match(Class);
			setState(49);
			match(Program);
			setState(50);
			match(T__0);
			setState(51);
			field_decls(0);

				s.BlockEntry();

			setState(53);
			method_decls(0);
			setState(54);
			match(T__1);

				s.Print();
				//print global variables

				System.out.println(".globl main");
				System.out.println(".data");
				s.PrintGlobals();
				System.out.println(".text");

				q.AsmPrint();

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
		public Field_declsContext f;
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
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(66);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new Field_declsContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decls);
						setState(58);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(59);
						field_decl(0);
						setState(60);
						match(T__2);
						}
						break;
					case 2:
						{
						_localctx = new Field_declsContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decls);
						setState(62);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(63);
						inited_field_decl();
						setState(64);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(70);
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
		public DataType t;
		public Field_declContext f;
		public Token Type;
		public Token Ident;
		public NumContext num;
		public TerminalNode Type() { return getToken(Cmpt379CompilerParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
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
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(72);
				((Field_declContext)_localctx).Type = match(Type);
				setState(73);
				((Field_declContext)_localctx).Ident = match(Ident);

					((Field_declContext)_localctx).t =  DataType.valueOf((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null).toUpperCase());
					Symbol sym = s.Add((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null), _localctx.t);

				}
				break;
			case 2:
				{
				setState(75);
				((Field_declContext)_localctx).Type = match(Type);
				setState(76);
				((Field_declContext)_localctx).Ident = match(Ident);
				setState(77);
				match(T__4);
				setState(78);
				((Field_declContext)_localctx).num = num();
				setState(79);
				match(T__5);

					((Field_declContext)_localctx).t =  DataType.valueOf((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null).toUpperCase());
					Symbol sym = s.Add((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null), _localctx.t, Integer.parseInt((((Field_declContext)_localctx).num!=null?_input.getText(((Field_declContext)_localctx).num.start,((Field_declContext)_localctx).num.stop):null)));

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(96);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Field_declContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decl);
						setState(84);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(85);
						match(T__3);
						setState(86);
						((Field_declContext)_localctx).Ident = match(Ident);

						          	((Field_declContext)_localctx).t =  ((Field_declContext)_localctx).f.t;
						          	Symbol sym = s.Add((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null), _localctx.t);
						          
						}
						break;
					case 2:
						{
						_localctx = new Field_declContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decl);
						setState(88);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(89);
						match(T__3);
						setState(90);
						((Field_declContext)_localctx).Ident = match(Ident);
						setState(91);
						match(T__4);
						setState(92);
						((Field_declContext)_localctx).num = num();
						setState(93);
						match(T__5);

						          	((Field_declContext)_localctx).t =  ((Field_declContext)_localctx).f.t;
						          	Symbol sym = s.Add((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null), _localctx.t, Integer.parseInt((((Field_declContext)_localctx).num!=null?_input.getText(((Field_declContext)_localctx).num.start,((Field_declContext)_localctx).num.stop):null)));
						          
						}
						break;
					}
					} 
				}
				setState(100);
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
			setState(101);
			((Inited_field_declContext)_localctx).Type = match(Type);
			setState(102);
			((Inited_field_declContext)_localctx).Ident = match(Ident);
			setState(103);
			match(T__6);
			setState(104);
			((Inited_field_declContext)_localctx).literal = literal();

				DataType t = DataType.valueOf((((Inited_field_declContext)_localctx).Type!=null?((Inited_field_declContext)_localctx).Type.getText():null).toUpperCase());
				Symbol src1 = s.insert((((Inited_field_declContext)_localctx).literal!=null?_input.getText(((Inited_field_declContext)_localctx).literal.start,((Inited_field_declContext)_localctx).literal.stop):null), t, Boolean.TRUE);
				Symbol dst = s.Add((((Inited_field_declContext)_localctx).Ident!=null?((Inited_field_declContext)_localctx).Ident.getText():null), t, src1);
				//q.Add(dst, src1, null, "=");

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
		public Method_declsContext m;
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
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
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
					setState(108);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(109);
					method_decl();
					}
					} 
				}
				setState(114);
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
		public int stackSize;
		public LocList retList;
		public Token Type;
		public Token Ident;
		public BlockContext block;
		public MarkerContext marker;
		public TerminalNode Type() { return getToken(Cmpt379CompilerParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MarkerContext marker() {
			return getRuleContext(MarkerContext.class,0);
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
			setState(137);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				((Method_declContext)_localctx).Type = match(Type);
				setState(116);
				((Method_declContext)_localctx).Ident = match(Ident);

					DataType t = DataType.valueOf((((Method_declContext)_localctx).Type!=null?((Method_declContext)_localctx).Type.getText():null).toUpperCase());
					Symbol sym = s.Add((((Method_declContext)_localctx).Ident!=null?((Method_declContext)_localctx).Ident.getText():null), t);
					s.FunctionEntry();
					q.Add(sym);
					int entry = q.Add(null, null, null, "frame");


				setState(118);
				match(T__7);
				setState(119);
				params(0);
				setState(120);
				match(T__8);


					((Method_declContext)_localctx).retList =  new LocList();
					_localctx.retList.Add(entry);

				setState(122);
				((Method_declContext)_localctx).block = block();
				setState(123);
				marker();


					s.PopSymTab(q);

					_localctx.retList.Merge(((Method_declContext)_localctx).block.retList);
					_localctx.retList.BackPatch(q, s.insert("" + s.GetOffset(), DataType.INT, Boolean.TRUE));

				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(Void);
				setState(127);
				((Method_declContext)_localctx).Ident = match(Ident);

					DataType t = DataType.VOID;
					Symbol sym = s.Add((((Method_declContext)_localctx).Ident!=null?((Method_declContext)_localctx).Ident.getText():null), t);
					s.FunctionEntry();
					q.Add(sym);                                     // Add #main | main: push %rbp | mov %rsp, %rbp
					int entry = q.Add(null, null, null, "frame");


				setState(129);
				match(T__7);
				setState(130);
				params(0);
				setState(131);
				match(T__8);


					((Method_declContext)_localctx).retList =  new LocList();
					_localctx.retList.Add(entry);

				setState(133);
				((Method_declContext)_localctx).block = block();
				setState(134);
				((Method_declContext)_localctx).marker = marker();

					if (!((Method_declContext)_localctx).block.nextlist.IsEmpty()) {
						q.Add(null, null, null, "ret");
						((Method_declContext)_localctx).block.nextlist.BackPatch (q, ((Method_declContext)_localctx).marker.label);
					}
					s.PopSymTab(q);

					_localctx.retList.Merge(((Method_declContext)_localctx).block.retList);
					_localctx.retList.BackPatch(q, s.insert("" + s.GetOffset(), DataType.INT, Boolean.TRUE));

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
		public int count;
		public ParamsContext p;
		public Token Type;
		public Token Ident;
		public TerminalNode Type() { return getToken(Cmpt379CompilerParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
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
		return params(0);
	}

	private ParamsContext params(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParamsContext _localctx = new ParamsContext(_ctx, _parentState);
		ParamsContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_params, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(140);
				((ParamsContext)_localctx).Type = match(Type);
				setState(141);
				((ParamsContext)_localctx).Ident = match(Ident);

					DataType t = DataType.valueOf((((ParamsContext)_localctx).Type!=null?((ParamsContext)_localctx).Type.getText():null).toUpperCase());
					Symbol sym = s.Add((((ParamsContext)_localctx).Ident!=null?((ParamsContext)_localctx).Ident.getText():null), t);

					((ParamsContext)_localctx).count =  1;
					q.Add (null, null, null, "push %rdi");

				}
				break;
			case 2:
				{

					((ParamsContext)_localctx).count =  0;

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParamsContext(_parentctx, _parentState);
					_localctx.p = _prevctx;
					_localctx.p = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_params);
					setState(146);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(147);
					match(T__3);
					setState(148);
					((ParamsContext)_localctx).Type = match(Type);
					setState(149);
					((ParamsContext)_localctx).Ident = match(Ident);

					          	DataType t = DataType.valueOf((((ParamsContext)_localctx).Type!=null?((ParamsContext)_localctx).Type.getText():null).toUpperCase());
					          	Symbol sym = s.Add((((ParamsContext)_localctx).Ident!=null?((ParamsContext)_localctx).Ident.getText():null), t);

					          	((ParamsContext)_localctx).count =  ((ParamsContext)_localctx).p.count + 1;
					          	switch (_localctx.count) {
					          		case 1: q.Add (null, null, null, "push %rdi");
					          				break;
					          		case 2: q.Add (null, null, null, "push %rsi");
					          				break;
					          		case 3: q.Add (null, null, null, "push %rdx");
					          				break;
					          		case 4: q.Add (null, null, null, "push %rcx");
					          				break;
					          		case 5: q.Add (null, null, null, "push %r8");
					          				break;
					          		case 6: q.Add (null, null, null, "push %r9");
					          				break;
					          	}

					          
					}
					} 
				}
				setState(155);
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
		public LocList nextlist;
		public LocList brklist;
		public LocList cntlist;
		public LocList retList;
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
		enterRule(_localctx, 14, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__0);

				s.BlockEntry();

			setState(158);
			var_decls(0);
			setState(159);
			((BlockContext)_localctx).statements = statements(0);
			setState(160);
			match(T__1);

				((BlockContext)_localctx).nextlist =  ((BlockContext)_localctx).statements.nextlist;
				((BlockContext)_localctx).brklist =  ((BlockContext)_localctx).statements.brklist;
				((BlockContext)_localctx).cntlist =  ((BlockContext)_localctx).statements.cntlist;
				((BlockContext)_localctx).retList =  ((BlockContext)_localctx).statements.retList;

				s.PopSymTab(q);

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
		public Var_declsContext v;
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_var_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
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
					setState(164);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(165);
					var_decl(0);
					setState(166);
					match(T__2);

					          
					}
					} 
				}
				setState(173);
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
		public DataType t;
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_var_decl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(175);
			((Var_declContext)_localctx).Type = match(Type);
			setState(176);
			((Var_declContext)_localctx).Ident = match(Ident);

				((Var_declContext)_localctx).t =  DataType.valueOf((((Var_declContext)_localctx).Type!=null?((Var_declContext)_localctx).Type.getText():null).toUpperCase());
				Symbol sym = s.Add((((Var_declContext)_localctx).Ident!=null?((Var_declContext)_localctx).Ident.getText():null), _localctx.t);

			}
			_ctx.stop = _input.LT(-1);
			setState(185);
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
					setState(179);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(180);
					match(T__3);
					setState(181);
					((Var_declContext)_localctx).Ident = match(Ident);

					          	((Var_declContext)_localctx).t =  ((Var_declContext)_localctx).v.t;
					          	Symbol sym = s.Add((((Var_declContext)_localctx).Ident!=null?((Var_declContext)_localctx).Ident.getText():null), _localctx.t);
					          
					}
					} 
				}
				setState(187);
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
		public LocList nextlist;
		public LocList brklist;
		public LocList cntlist;
		public LocList retList;
		public StatementsContext t;
		public MarkerContext marker;
		public StatementContext statement;
		public MarkerContext marker() {
			return getRuleContext(MarkerContext.class,0);
		}
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
		return statements(0);
	}

	private StatementsContext statements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementsContext _localctx = new StatementsContext(_ctx, _parentState);
		StatementsContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_statements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{

				((StatementsContext)_localctx).nextlist =  new LocList ();
				((StatementsContext)_localctx).brklist =  new LocList ();
				((StatementsContext)_localctx).cntlist =  new LocList ();
				((StatementsContext)_localctx).retList =  new LocList ();

			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementsContext(_parentctx, _parentState);
					_localctx.t = _prevctx;
					_localctx.t = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_statements);
					setState(191);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(192);
					((StatementsContext)_localctx).marker = marker();
					setState(193);
					((StatementsContext)_localctx).statement = statement();

					          	((StatementsContext)_localctx).t.nextlist.BackPatch(q, ((StatementsContext)_localctx).marker.label);
					          	((StatementsContext)_localctx).nextlist =  ((StatementsContext)_localctx).statement.nextlist;
					          	((StatementsContext)_localctx).brklist =  ((StatementsContext)_localctx).t.brklist;
					          	_localctx.brklist.Merge (((StatementsContext)_localctx).statement.brklist);
					          	((StatementsContext)_localctx).cntlist =  ((StatementsContext)_localctx).t.cntlist;
					          	_localctx.cntlist.Merge (((StatementsContext)_localctx).statement.cntlist);

					          	((StatementsContext)_localctx).retList =  ((StatementsContext)_localctx).t.retList;
					          	_localctx.retList.Merge(((StatementsContext)_localctx).statement.retList);

					          
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public LocList nextlist;
		public LocList brklist;
		public LocList cntlist;
		public LocList retList;
		public LocationContext location;
		public EqOpContext eqOp;
		public ExprContext expr;
		public MarkerContext marker;
		public BlockContext block;
		public MarkerContext m1;
		public BlockContext b1;
		public NextContext next;
		public MarkerContext m2;
		public BlockContext b2;
		public StatementContext s1;
		public CasesContext c;
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public EqOpContext eqOp() {
			return getRuleContext(EqOpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode If() { return getToken(Cmpt379CompilerParser.If, 0); }
		public List<MarkerContext> marker() {
			return getRuleContexts(MarkerContext.class);
		}
		public MarkerContext marker(int i) {
			return getRuleContext(MarkerContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public NextContext next() {
			return getRuleContext(NextContext.class,0);
		}
		public TerminalNode Else() { return getToken(Cmpt379CompilerParser.Else, 0); }
		public TerminalNode While() { return getToken(Cmpt379CompilerParser.While, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Switch() { return getToken(Cmpt379CompilerParser.Switch, 0); }
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public TerminalNode Brk() { return getToken(Cmpt379CompilerParser.Brk, 0); }
		public TerminalNode Cnt() { return getToken(Cmpt379CompilerParser.Cnt, 0); }
		public TerminalNode Ret() { return getToken(Cmpt379CompilerParser.Ret, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				((StatementContext)_localctx).location = location();
				setState(202);
				((StatementContext)_localctx).eqOp = eqOp();
				setState(203);
				((StatementContext)_localctx).expr = expr(0);
				setState(204);
				match(T__2);

					if ((((StatementContext)_localctx).eqOp!=null?_input.getText(((StatementContext)_localctx).eqOp.start,((StatementContext)_localctx).eqOp.stop):null).equals("+=")) {
						Symbol sym1 = s.Add(((StatementContext)_localctx).location.base.GetType());
						if (((StatementContext)_localctx).location.offset != null) q.Add(sym1, ((StatementContext)_localctx).location.base, ((StatementContext)_localctx).location.offset, "[]=");
						else q.Add(sym1, ((StatementContext)_localctx).location.base, null, "=");
						Symbol sym2 = s.Add(((StatementContext)_localctx).location.base.GetType());
						q.Add(sym2, sym1, ((StatementContext)_localctx).expr.sym, "+");
						if (((StatementContext)_localctx).location.offset != null) {
							q.Add(((StatementContext)_localctx).location.base, ((StatementContext)_localctx).location.offset, sym2, "[]=");
						} else {
							q.Add(((StatementContext)_localctx).location.base, sym2, null, "=");
						}
					} else if ((((StatementContext)_localctx).eqOp!=null?_input.getText(((StatementContext)_localctx).eqOp.start,((StatementContext)_localctx).eqOp.stop):null).equals("-=")) {
						Symbol sym1 = s.Add(((StatementContext)_localctx).location.base.GetType());
						if (((StatementContext)_localctx).location.offset != null) q.Add(sym1, ((StatementContext)_localctx).location.base, ((StatementContext)_localctx).location.offset, "[]=");
						else q.Add(sym1, ((StatementContext)_localctx).location.base, null, "=");
						Symbol sym2 = s.Add(((StatementContext)_localctx).location.base.GetType());
						q.Add(sym2, sym1, ((StatementContext)_localctx).expr.sym, "-");
						if (((StatementContext)_localctx).location.offset != null) {
							q.Add(((StatementContext)_localctx).location.base, ((StatementContext)_localctx).location.offset, sym2, "[]=");
						} else {
							q.Add(((StatementContext)_localctx).location.base, sym2, null, "=");
						}
					} else {
						if (((StatementContext)_localctx).location.offset != null) {
							q.Add(((StatementContext)_localctx).location.base, ((StatementContext)_localctx).location.offset, ((StatementContext)_localctx).expr.sym, "[]=");
						} else {
							q.Add(((StatementContext)_localctx).location.base, ((StatementContext)_localctx).expr.sym, null, "=");
						}
					}
					((StatementContext)_localctx).nextlist =  new LocList();
					((StatementContext)_localctx).brklist =  new LocList ();
					((StatementContext)_localctx).cntlist =  new LocList ();
					((StatementContext)_localctx).retList =  new LocList ();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(If);
				setState(208);
				match(T__7);
				setState(209);
				((StatementContext)_localctx).expr = expr(0);
				setState(210);
				match(T__8);
				setState(211);
				((StatementContext)_localctx).marker = marker();
				setState(212);
				((StatementContext)_localctx).block = block();


					((StatementContext)_localctx).expr.truelist.BackPatch(q, ((StatementContext)_localctx).marker.label);
					((StatementContext)_localctx).nextlist =  ((StatementContext)_localctx).expr.falselist;
					_localctx.nextlist.Merge(((StatementContext)_localctx).block.nextlist);

					((StatementContext)_localctx).brklist =  ((StatementContext)_localctx).block.brklist;
					((StatementContext)_localctx).cntlist =  ((StatementContext)_localctx).block.cntlist;
					((StatementContext)_localctx).retList =  ((StatementContext)_localctx).block.retList;

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(If);
				setState(216);
				match(T__7);
				setState(217);
				((StatementContext)_localctx).expr = expr(0);
				setState(218);
				match(T__8);
				setState(219);
				((StatementContext)_localctx).m1 = marker();
				setState(220);
				((StatementContext)_localctx).b1 = block();
				setState(221);
				((StatementContext)_localctx).next = next();
				setState(222);
				match(Else);
				setState(223);
				((StatementContext)_localctx).m2 = marker();
				setState(224);
				((StatementContext)_localctx).b2 = block();

					((StatementContext)_localctx).expr.truelist.BackPatch(q, ((StatementContext)_localctx).m1.label);
					((StatementContext)_localctx).expr.falselist.BackPatch(q, ((StatementContext)_localctx).m2.label);
					((StatementContext)_localctx).nextlist =  ((StatementContext)_localctx).b1.nextlist;
					_localctx.nextlist.Merge(((StatementContext)_localctx).b2.nextlist);
					_localctx.nextlist.Merge(((StatementContext)_localctx).next.nextlist);

					((StatementContext)_localctx).brklist =  ((StatementContext)_localctx).b1.brklist;
					_localctx.brklist.Merge (((StatementContext)_localctx).b2.brklist);
					((StatementContext)_localctx).cntlist =  ((StatementContext)_localctx).b1.cntlist;
					_localctx.cntlist.Merge (((StatementContext)_localctx).b2.cntlist);
					((StatementContext)_localctx).retList =  ((StatementContext)_localctx).b1.retList;
					_localctx.retList.Merge (((StatementContext)_localctx).b2.retList);

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(While);
				setState(228);
				((StatementContext)_localctx).m1 = marker();
				setState(229);
				match(T__7);
				setState(230);
				((StatementContext)_localctx).expr = expr(0);
				setState(231);
				match(T__8);
				setState(232);
				((StatementContext)_localctx).m2 = marker();
				setState(233);
				((StatementContext)_localctx).s1 = statement();

				    ((StatementContext)_localctx).expr.truelist.BackPatch(q, ((StatementContext)_localctx).m2.label);
				    ((StatementContext)_localctx).s1.nextlist.BackPatch(q, ((StatementContext)_localctx).m1.label);
				    ((StatementContext)_localctx).nextlist =  ((StatementContext)_localctx).expr.falselist;
				    q.Add(((StatementContext)_localctx).m1.label, null, null, "goto");

				    LocList breakList = ((StatementContext)_localctx).s1.brklist;
				    LocList continueList = ((StatementContext)_localctx).s1.cntlist;
				    ((StatementContext)_localctx).retList =   ((StatementContext)_localctx).s1.retList;

						/* continueList.BackPatch(q, s.Find("L_" + (q.GetNextLabel() - 1))); */
						Symbol continueLabel = s.Add(q.GetNextLabel() - 1);
						Symbol breakLabel = s.Add(q.GetNextLabel());

						continueList.BackPatch(q, continueLabel);
						breakList.BackPatch(q, breakLabel);

						((StatementContext)_localctx).brklist =  new LocList();
						((StatementContext)_localctx).cntlist =  new LocList();

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				match(Switch);
				setState(237);
				((StatementContext)_localctx).expr = expr(0);
				setState(238);
				match(T__0);
				setState(239);
				((StatementContext)_localctx).c = cases(0);
				setState(240);
				match(T__1);

					((StatementContext)_localctx).c.nextlist.BackPatchSrc2(q, ((StatementContext)_localctx).expr.sym);

					((StatementContext)_localctx).c.brklist.BackPatch(q, s.Add(q.GetNextLabel()));

					((StatementContext)_localctx).nextlist =  new LocList ();
					((StatementContext)_localctx).brklist =  new LocList();
					((StatementContext)_localctx).cntlist =  new LocList ();
					((StatementContext)_localctx).retList =  new LocList ();

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				match(Brk);
				setState(244);
				match(T__2);

					((StatementContext)_localctx).nextlist =  new LocList ();

					((StatementContext)_localctx).brklist =  new LocList ();
					_localctx.brklist.Add (q.Add (null, null, null, "goto"));

					((StatementContext)_localctx).cntlist =  new LocList ();
					((StatementContext)_localctx).retList =  new LocList ();

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(246);
				match(Cnt);
				setState(247);
				match(T__2);


					((StatementContext)_localctx).nextlist =  new LocList ();

					((StatementContext)_localctx).cntlist =  new LocList ();
					_localctx.cntlist.Add (q.Add (null, null, null, "goto"));

					((StatementContext)_localctx).brklist =  new LocList ();
					((StatementContext)_localctx).retList =  new LocList ();

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(249);
				((StatementContext)_localctx).block = block();

					((StatementContext)_localctx).nextlist =  ((StatementContext)_localctx).block.nextlist;
					((StatementContext)_localctx).brklist =  ((StatementContext)_localctx).block.brklist;
					((StatementContext)_localctx).cntlist =  ((StatementContext)_localctx).block.cntlist;
					((StatementContext)_localctx).retList =  ((StatementContext)_localctx).block.retList;

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(252);
				match(Ret);
				setState(253);
				match(T__2);

					int retins = q.Add (null, null, null, "ret");
					((StatementContext)_localctx).nextlist =  new LocList ();
					((StatementContext)_localctx).brklist =  new LocList ();
					((StatementContext)_localctx).cntlist =  new LocList ();
					((StatementContext)_localctx).retList =  new LocList ();
					_localctx.retList.Add(retins);

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(255);
				match(Ret);
				setState(256);
				match(T__7);
				setState(257);
				((StatementContext)_localctx).expr = expr(0);
				setState(258);
				match(T__8);
				setState(259);
				match(T__2);

					int retins = q.Add (null, ((StatementContext)_localctx).expr.sym, null, "ret");
					((StatementContext)_localctx).nextlist =  new LocList ();
					((StatementContext)_localctx).brklist =  new LocList ();
					((StatementContext)_localctx).cntlist =  new LocList ();
					((StatementContext)_localctx).retList =  new LocList ();
					_localctx.retList.Add(retins);

				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(262);
				methodCall();
				setState(263);
				match(T__2);

					((StatementContext)_localctx).nextlist =  new LocList ();
					((StatementContext)_localctx).brklist =  new LocList ();
					((StatementContext)_localctx).cntlist =  new LocList ();
					((StatementContext)_localctx).retList =  new LocList ();

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

	public static class CasesContext extends ParserRuleContext {
		public LocList nextlist;
		public Symbol sym;
		public LocList brklist;
		public CasesContext c1;
		public LiteralContext literal;
		public StatementsContext statements;
		public TerminalNode Case() { return getToken(Cmpt379CompilerParser.Case, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_cases, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(269);
			match(Case);
			setState(270);
			((CasesContext)_localctx).literal = literal();
			setState(271);
			match(T__9);

				((CasesContext)_localctx).sym =  s.Add(DataType.BOOLEAN);
				int id = q.Add(_localctx.sym, ((CasesContext)_localctx).literal.sym, null, "cmp");
				((CasesContext)_localctx).nextlist =  new LocList ();
				_localctx.nextlist.Add(id);
				q.Add(s.Add(q.GetNextLabel() + 2), null, null, "je");

				int id2 = q.Add(null, null, null, "jne");

			setState(273);
			((CasesContext)_localctx).statements = statements(0);

				q.BackPatch(id2, s.Add(q.GetNextLabel()));
				((CasesContext)_localctx).brklist =  ((CasesContext)_localctx).statements.brklist;

			}
			_ctx.stop = _input.LT(-1);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CasesContext(_parentctx, _parentState);
					_localctx.c1 = _prevctx;
					_localctx.c1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_cases);
					setState(276);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(277);
					match(Case);
					setState(278);
					((CasesContext)_localctx).literal = literal();
					setState(279);
					match(T__9);

					          	((CasesContext)_localctx).sym =  s.Add(DataType.BOOLEAN);
					          	int id = q.Add(_localctx.sym, ((CasesContext)_localctx).literal.sym, null, "cmp");
					          	((CasesContext)_localctx).nextlist =  ((CasesContext)_localctx).c1.nextlist;
					          	_localctx.nextlist.Add(id);
					          	q.Add(s.Add(q.GetNextLabel() + 2), null, null, "je");
					          	int id2 = q.Add(null, null, null, "jne");
					          
					setState(281);
					((CasesContext)_localctx).statements = statements(0);

					          	q.BackPatch(id2, s.Add(q.GetNextLabel()));
					          	((CasesContext)_localctx).brklist =  ((CasesContext)_localctx).c1.brklist;
					          	_localctx.brklist.Merge(((CasesContext)_localctx).statements.brklist);
					          
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public Symbol sym;
		public LocList truelist;
		public LocList falselist;
		public ExprContext e1;
		public LiteralContext literal;
		public LocationContext location;
		public ExprContext e;
		public Token AddSub;
		public Token Ident;
		public ArgsContext args;
		public Token Str;
		public CalloutArgsContext calloutArgs;
		public Token MulDiv;
		public ExprContext e2;
		public MarkerContext marker;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AddSub() { return getToken(Cmpt379CompilerParser.AddSub, 0); }
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode Callout() { return getToken(Cmpt379CompilerParser.Callout, 0); }
		public TerminalNode Str() { return getToken(Cmpt379CompilerParser.Str, 0); }
		public CalloutArgsContext calloutArgs() {
			return getRuleContext(CalloutArgsContext.class,0);
		}
		public TerminalNode MulDiv() { return getToken(Cmpt379CompilerParser.MulDiv, 0); }
		public MarkerContext marker() {
			return getRuleContext(MarkerContext.class,0);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(290);
				((ExprContext)_localctx).literal = literal();

					((ExprContext)_localctx).sym =  ((ExprContext)_localctx).literal.sym;

				}
				break;
			case 2:
				{
				setState(293);
				((ExprContext)_localctx).location = location();

					if (((ExprContext)_localctx).location.offset != null) {
						((ExprContext)_localctx).sym =  s.Add(((ExprContext)_localctx).location.base.GetType());
						q.Add(_localctx.sym, ((ExprContext)_localctx).location.base, ((ExprContext)_localctx).location.offset, "[]");
					} else {
						((ExprContext)_localctx).sym =  ((ExprContext)_localctx).location.base;
					}

				}
				break;
			case 3:
				{
				setState(296);
				match(T__7);
				setState(297);
				((ExprContext)_localctx).e = expr(0);
				setState(298);
				match(T__8);

					((ExprContext)_localctx).sym =  ((ExprContext)_localctx).e.sym;
					((ExprContext)_localctx).truelist =  ((ExprContext)_localctx).e.truelist;
					((ExprContext)_localctx).falselist =  ((ExprContext)_localctx).e.falselist;

				}
				break;
			case 4:
				{
				setState(301);
				((ExprContext)_localctx).AddSub = match(AddSub);
				setState(302);
				((ExprContext)_localctx).e = expr(15);

					((ExprContext)_localctx).sym =  s.Add(DataType.INT);
					q.Add(_localctx.sym, s.insert("0", DataType.INT), ((ExprContext)_localctx).e.sym, (((ExprContext)_localctx).AddSub!=null?((ExprContext)_localctx).AddSub.getText():null));

				}
				break;
			case 5:
				{
				setState(305);
				match(T__17);
				setState(306);
				((ExprContext)_localctx).e = expr(5);

					((ExprContext)_localctx).truelist =  ((ExprContext)_localctx).e.falselist;
					((ExprContext)_localctx).falselist =  ((ExprContext)_localctx).e.truelist;

				}
				break;
			case 6:
				{
				setState(309);
				((ExprContext)_localctx).Ident = match(Ident);
				setState(310);
				match(T__7);
				setState(311);
				((ExprContext)_localctx).args = args();
				setState(312);
				match(T__8);

					((ExprContext)_localctx).sym =  s.Add (s.Find ((((ExprContext)_localctx).Ident!=null?((ExprContext)_localctx).Ident.getText():null)).GetType());
					String count = "" + ((ExprContext)_localctx).args.count;
					q.Add (_localctx.sym, s.Find ((((ExprContext)_localctx).Ident!=null?((ExprContext)_localctx).Ident.getText():null)) , s.insert(count, DataType.INT), "callexp");

				}
				break;
			case 7:
				{
				setState(315);
				match(Callout);
				setState(316);
				match(T__7);
				setState(317);
				((ExprContext)_localctx).Str = match(Str);
				setState(318);
				((ExprContext)_localctx).calloutArgs = calloutArgs(0);
				setState(319);
				match(T__8);

					((ExprContext)_localctx).sym =  s.Add (DataType.INT);
					String count = "" + ((ExprContext)_localctx).calloutArgs.count;
					q.Add (_localctx.sym, s.insert ((((ExprContext)_localctx).Str!=null?((ExprContext)_localctx).Str.getText():null), DataType.STR), s.insert(count, DataType.INT), "callexp");

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(381);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(324);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(325);
						((ExprContext)_localctx).MulDiv = match(MulDiv);
						setState(326);
						((ExprContext)_localctx).e2 = expr(15);

						          	((ExprContext)_localctx).sym =  s.Add(DataType.INT);
						          	q.Add(_localctx.sym, ((ExprContext)_localctx).e1.sym, ((ExprContext)_localctx).e2.sym, (((ExprContext)_localctx).MulDiv!=null?((ExprContext)_localctx).MulDiv.getText():null));
						          
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(329);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(330);
						((ExprContext)_localctx).AddSub = match(AddSub);
						setState(331);
						((ExprContext)_localctx).e2 = expr(14);

						          	((ExprContext)_localctx).sym =  s.Add(DataType.INT);
						          	q.Add(_localctx.sym, ((ExprContext)_localctx).e1.sym, ((ExprContext)_localctx).e2.sym, (((ExprContext)_localctx).AddSub!=null?((ExprContext)_localctx).AddSub.getText():null));
						          
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(334);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(335);
						match(T__10);
						setState(336);
						((ExprContext)_localctx).e2 = expr(13);

						          	Symbol sym1 = s.Add(DataType.INT);
						          	q.Add(sym1, ((ExprContext)_localctx).e1.sym, ((ExprContext)_localctx).e2.sym, "/");
						          	Symbol sym2 = s.Add(DataType.INT);
						          	q.Add(sym2, sym1, ((ExprContext)_localctx).e2.sym, "*");
						          	((ExprContext)_localctx).sym =  s.Add(DataType.INT);
						          	q.Add(_localctx.sym, ((ExprContext)_localctx).e1.sym, sym2, "-");
						          
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(339);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(340);
						match(T__11);
						setState(341);
						((ExprContext)_localctx).e2 = expr(12);

						          	((ExprContext)_localctx).sym =  s.Add(DataType.BOOLEAN);
						          	q.Add(_localctx.sym, ((ExprContext)_localctx).e1.sym, ((ExprContext)_localctx).e2.sym, "cmp");
						          	((ExprContext)_localctx).truelist =  new LocList ();
						          	_localctx.truelist.Add(q.Add(null, _localctx.sym, null, "jg"));
						          	((ExprContext)_localctx).falselist =  new LocList ();
						          	_localctx.falselist.Add(q.Add(null, _localctx.sym, null, "jle"));
						          
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(344);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(345);
						match(T__12);
						setState(346);
						((ExprContext)_localctx).e2 = expr(11);

						          	((ExprContext)_localctx).sym =  s.Add(DataType.BOOLEAN);
						          	q.Add(_localctx.sym, ((ExprContext)_localctx).e1.sym, ((ExprContext)_localctx).e2.sym, "cmp");
						          	((ExprContext)_localctx).truelist =  new LocList ();
						          	_localctx.truelist.Add(q.Add(null, _localctx.sym, null, "jl"));
						          	((ExprContext)_localctx).falselist =  new LocList ();
						          	_localctx.falselist.Add(q.Add(null, _localctx.sym, null, "jge"));
						          
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(349);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(350);
						match(T__13);
						setState(351);
						((ExprContext)_localctx).e2 = expr(10);

						          	((ExprContext)_localctx).sym =  s.Add(DataType.BOOLEAN);
						          	q.Add(_localctx.sym, ((ExprContext)_localctx).e1.sym, ((ExprContext)_localctx).e2.sym, "cmp");
						          	((ExprContext)_localctx).truelist =  new LocList ();
						          	_localctx.truelist.Add(q.Add(null, _localctx.sym, null, "jge"));
						          	((ExprContext)_localctx).falselist =  new LocList ();
						          	_localctx.falselist.Add(q.Add(null, _localctx.sym, null, "jl"));
						          
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(354);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(355);
						match(T__14);
						setState(356);
						((ExprContext)_localctx).e2 = expr(9);

						          	((ExprContext)_localctx).sym =  s.Add(DataType.BOOLEAN);
						          	q.Add(_localctx.sym, ((ExprContext)_localctx).e1.sym, ((ExprContext)_localctx).e2.sym, "cmp");
						          	((ExprContext)_localctx).truelist =  new LocList ();
						          	_localctx.truelist.Add(q.Add(null, _localctx.sym, null, "jle"));
						          	((ExprContext)_localctx).falselist =  new LocList ();
						          	_localctx.falselist.Add(q.Add(null, _localctx.sym, null, "jg"));
						          
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(359);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(360);
						match(T__15);
						setState(361);
						((ExprContext)_localctx).e2 = expr(8);

						          	((ExprContext)_localctx).sym =  s.Add(DataType.BOOLEAN);
						          	q.Add(_localctx.sym, ((ExprContext)_localctx).e1.sym, ((ExprContext)_localctx).e2.sym, "cmp");
						          	((ExprContext)_localctx).truelist =  new LocList ();
						          	_localctx.truelist.Add(q.Add(null, _localctx.sym, null, "je"));
						          	((ExprContext)_localctx).falselist =  new LocList ();
						          	_localctx.falselist.Add(q.Add(null, _localctx.sym, null, "jne"));
						          
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(364);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(365);
						match(T__16);
						setState(366);
						((ExprContext)_localctx).e2 = expr(7);

						          	((ExprContext)_localctx).sym =  s.Add(DataType.BOOLEAN);
						          	q.Add(_localctx.sym, ((ExprContext)_localctx).e1.sym, ((ExprContext)_localctx).e2.sym, "cmp");
						          	((ExprContext)_localctx).truelist =  new LocList ();
						          	_localctx.truelist.Add(q.Add(null, _localctx.sym, null, "jne"));
						          	((ExprContext)_localctx).falselist =  new LocList ();
						          	_localctx.falselist.Add(q.Add(null, _localctx.sym, null, "je"));
						          
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(369);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(370);
						match(T__18);
						setState(371);
						((ExprContext)_localctx).marker = marker();
						setState(372);
						((ExprContext)_localctx).e2 = expr(5);

						          	((ExprContext)_localctx).e1.truelist.BackPatch(q, ((ExprContext)_localctx).marker.label);
						          	((ExprContext)_localctx).truelist =  ((ExprContext)_localctx).e2.truelist;
						          	((ExprContext)_localctx).falselist =  ((ExprContext)_localctx).e1.falselist;
						          	_localctx.falselist.Merge(((ExprContext)_localctx).e2.falselist);
						          
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(375);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(376);
						match(T__19);
						setState(377);
						((ExprContext)_localctx).marker = marker();
						setState(378);
						((ExprContext)_localctx).e2 = expr(4);

						          	((ExprContext)_localctx).e1.falselist.BackPatch(q, ((ExprContext)_localctx).marker.label);
						          	((ExprContext)_localctx).truelist =  ((ExprContext)_localctx).e1.truelist;
						          	((ExprContext)_localctx).falselist =  ((ExprContext)_localctx).e2.falselist;
						          	_localctx.truelist.Merge(((ExprContext)_localctx).e2.truelist);
						          
						}
						break;
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class MethodCallContext extends ParserRuleContext {
		public Token Ident;
		public ArgsContext args;
		public Token Str;
		public CalloutArgsContext calloutArgs;
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode Callout() { return getToken(Cmpt379CompilerParser.Callout, 0); }
		public TerminalNode Str() { return getToken(Cmpt379CompilerParser.Str, 0); }
		public CalloutArgsContext calloutArgs() {
			return getRuleContext(CalloutArgsContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodCall);
		try {
			setState(399);
			switch (_input.LA(1)) {
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				((MethodCallContext)_localctx).Ident = match(Ident);
				setState(387);
				match(T__7);
				setState(388);
				((MethodCallContext)_localctx).args = args();
				setState(389);
				match(T__8);

					String count = "" + ((MethodCallContext)_localctx).args.count;
					q.Add (null, s.Find ((((MethodCallContext)_localctx).Ident!=null?((MethodCallContext)_localctx).Ident.getText():null)) , s.insert(count, DataType.INT), "call");

				}
				break;
			case Callout:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(Callout);
				setState(393);
				match(T__7);
				setState(394);
				((MethodCallContext)_localctx).Str = match(Str);
				setState(395);
				((MethodCallContext)_localctx).calloutArgs = calloutArgs(0);
				setState(396);
				match(T__8);

					String count = "" + ((MethodCallContext)_localctx).calloutArgs.count;
					q.Add (null, s.insert ((((MethodCallContext)_localctx).Str!=null?((MethodCallContext)_localctx).Str.getText():null).replace("\"", ""), DataType.STR), s.insert(count, DataType.INT), "call");

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

	public static class ArgsContext extends ParserRuleContext {
		public int count;
		public SomeArgsContext someArgs;
		public SomeArgsContext someArgs() {
			return getRuleContext(SomeArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_args);
		try {
			setState(405);
			switch (_input.LA(1)) {
			case T__7:
			case T__17:
			case Char:
			case Callout:
			case DecNum:
			case HexNum:
			case BoolLit:
			case Ident:
			case AddSub:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				((ArgsContext)_localctx).someArgs = someArgs(0);

					((ArgsContext)_localctx).count =  ((ArgsContext)_localctx).someArgs.count;

				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{

					((ArgsContext)_localctx).count =  0;

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

	public static class SomeArgsContext extends ParserRuleContext {
		public int count;
		public SomeArgsContext t;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SomeArgsContext someArgs() {
			return getRuleContext(SomeArgsContext.class,0);
		}
		public SomeArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_someArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterSomeArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitSomeArgs(this);
		}
	}

	public final SomeArgsContext someArgs() throws RecognitionException {
		return someArgs(0);
	}

	private SomeArgsContext someArgs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SomeArgsContext _localctx = new SomeArgsContext(_ctx, _parentState);
		SomeArgsContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_someArgs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(408);
			((SomeArgsContext)_localctx).expr = expr(0);

				((SomeArgsContext)_localctx).count =  1;
				switch (_localctx.count) {
					case 1: q.Add (((SomeArgsContext)_localctx).expr.sym, null, null, "rdi");
							break;
					case 2: q.Add (((SomeArgsContext)_localctx).expr.sym, null, null, "rsi");
							break;
					case 3: q.Add (((SomeArgsContext)_localctx).expr.sym, null, null, "rdx");
							break;
					case 4: q.Add (((SomeArgsContext)_localctx).expr.sym, null, null, "rcx");
							break;
					case 5: q.Add (((SomeArgsContext)_localctx).expr.sym, null, null, "r8");
							break;
					case 6: q.Add (((SomeArgsContext)_localctx).expr.sym, null, null, "r9");
							break;
				}


			}
			_ctx.stop = _input.LT(-1);
			setState(418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SomeArgsContext(_parentctx, _parentState);
					_localctx.t = _prevctx;
					_localctx.t = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_someArgs);
					setState(411);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(412);
					match(T__3);
					setState(413);
					((SomeArgsContext)_localctx).expr = expr(0);

					          	((SomeArgsContext)_localctx).count =  ((SomeArgsContext)_localctx).t.count + 1;

					          	switch (_localctx.count) {
					          		case 1: q.Add (((SomeArgsContext)_localctx).expr.sym, null, null, "rdi");
					          				break;
					          		case 2: q.Add (((SomeArgsContext)_localctx).expr.sym, null, null, "rsi");
					          				break;
					          		case 3: q.Add (((SomeArgsContext)_localctx).expr.sym, null, null, "rdx");
					          				break;
					          		case 4: q.Add (((SomeArgsContext)_localctx).expr.sym, null, null, "rcx");
					          				break;
					          		case 5: q.Add (((SomeArgsContext)_localctx).expr.sym, null, null, "r8");
					          				break;
					          		case 6: q.Add (((SomeArgsContext)_localctx).expr.sym, null, null, "r9");
					          				break;
					          	}

					          
					}
					} 
				}
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class CalloutArgsContext extends ParserRuleContext {
		public int count;
		public CalloutArgsContext c;
		public ExprContext expr;
		public Token Str;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CalloutArgsContext calloutArgs() {
			return getRuleContext(CalloutArgsContext.class,0);
		}
		public TerminalNode Str() { return getToken(Cmpt379CompilerParser.Str, 0); }
		public CalloutArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calloutArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterCalloutArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitCalloutArgs(this);
		}
	}

	public final CalloutArgsContext calloutArgs() throws RecognitionException {
		return calloutArgs(0);
	}

	private CalloutArgsContext calloutArgs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CalloutArgsContext _localctx = new CalloutArgsContext(_ctx, _parentState);
		CalloutArgsContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_calloutArgs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{

				((CalloutArgsContext)_localctx).count =  0;

			}
			_ctx.stop = _input.LT(-1);
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(433);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new CalloutArgsContext(_parentctx, _parentState);
						_localctx.c = _prevctx;
						_localctx.c = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calloutArgs);
						setState(424);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(425);
						match(T__3);
						setState(426);
						((CalloutArgsContext)_localctx).expr = expr(0);


						          	((CalloutArgsContext)_localctx).count =  ((CalloutArgsContext)_localctx).c.count + 1;
						          	switch (_localctx.count) {
						          		case 1: q.Add (((CalloutArgsContext)_localctx).expr.sym, null, null, "rdi");
						          				break;
						          		case 2: q.Add (((CalloutArgsContext)_localctx).expr.sym, null, null, "rsi");
						          				break;
						          		case 3: q.Add (((CalloutArgsContext)_localctx).expr.sym, null, null, "rdx");
						          				break;
						          		case 4: q.Add (((CalloutArgsContext)_localctx).expr.sym, null, null, "rcx");
						          				break;
						          		case 5: q.Add (((CalloutArgsContext)_localctx).expr.sym, null, null, "r8");
						          				break;
						          		case 6: q.Add (((CalloutArgsContext)_localctx).expr.sym, null, null, "r9");
						          				break;
						          	}
						          
						}
						break;
					case 2:
						{
						_localctx = new CalloutArgsContext(_parentctx, _parentState);
						_localctx.c = _prevctx;
						_localctx.c = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calloutArgs);
						setState(429);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(430);
						match(T__3);
						setState(431);
						((CalloutArgsContext)_localctx).Str = match(Str);

						          	Symbol str = s.insertString((((CalloutArgsContext)_localctx).Str!=null?((CalloutArgsContext)_localctx).Str.getText():null), DataType.STR);
						          	((CalloutArgsContext)_localctx).count =  ((CalloutArgsContext)_localctx).c.count + 1;
						          	switch (_localctx.count) {
						          		case 1: q.Add (str, null, null, "rdi");
						          				break;
						          		case 2: q.Add (str, null, null, "rsi");
						          				break;
						          		case 3: q.Add (str, null, null, "rdx");
						          				break;
						          		case 4: q.Add (str, null, null, "rcx");
						          				break;
						          		case 5: q.Add (str, null, null, "r8");
						          				break;
						          		case 6: q.Add (str, null, null, "r9");
						          				break;
						          	}
						          
						}
						break;
					}
					} 
				}
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class MarkerContext extends ParserRuleContext {
		public Symbol label;
		public MarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterMarker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitMarker(this);
		}
	}

	public final MarkerContext marker() throws RecognitionException {
		MarkerContext _localctx = new MarkerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_marker);
		try {
			enterOuterAlt(_localctx, 1);
			{

				int l = q.GetNextLabel();
				((MarkerContext)_localctx).label =  s.Add(l);

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

	public static class NextContext extends ParserRuleContext {
		public LocList nextlist;
		public NextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitNext(this);
		}
	}

	public final NextContext next() throws RecognitionException {
		NextContext _localctx = new NextContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_next);
		try {
			enterOuterAlt(_localctx, 1);
			{

				((NextContext)_localctx).nextlist =  new LocList();
				_localctx.nextlist.Add(q.Add(null, null, null, "goto"));

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

	public static class LocationContext extends ParserRuleContext {
		public Symbol base;
		public Symbol offset;
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
		enterRule(_localctx, 40, RULE_location);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				((LocationContext)_localctx).Ident = match(Ident);

					((LocationContext)_localctx).base =  s.Find((((LocationContext)_localctx).Ident!=null?((LocationContext)_localctx).Ident.getText():null));
					((LocationContext)_localctx).offset =  null;

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				((LocationContext)_localctx).Ident = match(Ident);
				setState(445);
				match(T__4);
				setState(446);
				((LocationContext)_localctx).expr = expr(0);
				setState(447);
				match(T__5);

					((LocationContext)_localctx).base =  s.Find((((LocationContext)_localctx).Ident!=null?((LocationContext)_localctx).Ident.getText():null));
					((LocationContext)_localctx).offset =  s.Add(DataType.INT);
					q.Add(_localctx.offset, ((LocationContext)_localctx).expr.sym, s.insert("8", DataType.INT, Boolean.TRUE), "*");

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

	public static class NumContext extends ParserRuleContext {
		public Symbol sym;
		public TerminalNode DecNum() { return getToken(Cmpt379CompilerParser.DecNum, 0); }
		public TerminalNode HexNum() { return getToken(Cmpt379CompilerParser.HexNum, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_num);
		try {
			setState(456);
			switch (_input.LA(1)) {
			case DecNum:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(DecNum);

					((NumContext)_localctx).sym =  s.Add(_input.getText(_localctx.start, _input.LT(-1)), DataType.INT, Boolean.TRUE);

				}
				break;
			case HexNum:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(HexNum);

					((NumContext)_localctx).sym =  s.Add(_input.getText(_localctx.start, _input.LT(-1)), DataType.INT, Boolean.TRUE);

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

	public static class LiteralContext extends ParserRuleContext {
		public Symbol sym;
		public NumContext num;
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode Char() { return getToken(Cmpt379CompilerParser.Char, 0); }
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
		enterRule(_localctx, 44, RULE_literal);
		try {
			setState(465);
			switch (_input.LA(1)) {
			case DecNum:
			case HexNum:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				((LiteralContext)_localctx).num = num();

					((LiteralContext)_localctx).sym =  ((LiteralContext)_localctx).num.sym;

				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				match(Char);

					((LiteralContext)_localctx).sym =  s.Add(_input.getText(_localctx.start, _input.LT(-1)), DataType.INT, Boolean.TRUE);

				}
				break;
			case BoolLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				match(BoolLit);

					((LiteralContext)_localctx).sym =  s.Add(_input.getText(_localctx.start, _input.LT(-1)), DataType.BOOLEAN, Boolean.TRUE);

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

	public static class EqOpContext extends ParserRuleContext {
		public TerminalNode AssignOp() { return getToken(Cmpt379CompilerParser.AssignOp, 0); }
		public EqOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterEqOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitEqOp(this);
		}
	}

	public final EqOpContext eqOp() throws RecognitionException {
		EqOpContext _localctx = new EqOpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_eqOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==AssignOp) ) {
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
		case 6:
			return params_sempred((ParamsContext)_localctx, predIndex);
		case 8:
			return var_decls_sempred((Var_declsContext)_localctx, predIndex);
		case 9:
			return var_decl_sempred((Var_declContext)_localctx, predIndex);
		case 10:
			return statements_sempred((StatementsContext)_localctx, predIndex);
		case 12:
			return cases_sempred((CasesContext)_localctx, predIndex);
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 16:
			return someArgs_sempred((SomeArgsContext)_localctx, predIndex);
		case 17:
			return calloutArgs_sempred((CalloutArgsContext)_localctx, predIndex);
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
	private boolean params_sempred(ParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
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
	private boolean statements_sempred(StatementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cases_sempred(CasesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 13);
		case 12:
			return precpred(_ctx, 12);
		case 13:
			return precpred(_ctx, 11);
		case 14:
			return precpred(_ctx, 10);
		case 15:
			return precpred(_ctx, 9);
		case 16:
			return precpred(_ctx, 8);
		case 17:
			return precpred(_ctx, 7);
		case 18:
			return precpred(_ctx, 6);
		case 19:
			return precpred(_ctx, 4);
		case 20:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean someArgs_sempred(SomeArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean calloutArgs_sempred(CalloutArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 3);
		case 23:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u01d8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3E\n\3\f\3\16\3H\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4U\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4c\n\4\f\4"+
		"\16\4f\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6q\n\6\f\6\16\6t\13"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u008c\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u0093\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u009a\n\b\f\b\16\b\u009d\13\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ac\n\n\f\n\16\n\u00af\13\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ba\n\13\f\13\16\13"+
		"\u00bd\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c7\n\f\f\f\16\f\u00ca"+
		"\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010d\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u011f\n\16\f\16\16\16\u0122\13\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0145\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u0180\n\17\f\17\16\17\u0183\13\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0192"+
		"\n\20\3\21\3\21\3\21\3\21\5\21\u0198\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u01a3\n\22\f\22\16\22\u01a6\13\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01b4\n\23\f\23\16"+
		"\23\u01b7\13\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u01c5\n\26\3\27\3\27\3\27\3\27\5\27\u01cb\n\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u01d4\n\30\3\31\3\31\3\31\2\r\4\6\n\16\22"+
		"\24\26\32\34\"$\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\2\3\4\2\t\t++\u01f0\2\62\3\2\2\2\4;\3\2\2\2\6T\3\2\2\2\bg\3\2\2\2\nm"+
		"\3\2\2\2\f\u008b\3\2\2\2\16\u0092\3\2\2\2\20\u009e\3\2\2\2\22\u00a5\3"+
		"\2\2\2\24\u00b0\3\2\2\2\26\u00be\3\2\2\2\30\u010c\3\2\2\2\32\u010e\3\2"+
		"\2\2\34\u0144\3\2\2\2\36\u0191\3\2\2\2 \u0197\3\2\2\2\"\u0199\3\2\2\2"+
		"$\u01a7\3\2\2\2&\u01b8\3\2\2\2(\u01ba\3\2\2\2*\u01c4\3\2\2\2,\u01ca\3"+
		"\2\2\2.\u01d3\3\2\2\2\60\u01d5\3\2\2\2\62\63\7\32\2\2\63\64\7\33\2\2\64"+
		"\65\7\3\2\2\65\66\5\4\3\2\66\67\b\2\1\2\678\5\n\6\289\7\4\2\29:\b\2\1"+
		"\2:\3\3\2\2\2;F\b\3\1\2<=\f\5\2\2=>\5\6\4\2>?\7\5\2\2?E\3\2\2\2@A\f\4"+
		"\2\2AB\5\b\5\2BC\7\5\2\2CE\3\2\2\2D<\3\2\2\2D@\3\2\2\2EH\3\2\2\2FD\3\2"+
		"\2\2FG\3\2\2\2G\5\3\2\2\2HF\3\2\2\2IJ\b\4\1\2JK\7)\2\2KL\7*\2\2LU\b\4"+
		"\1\2MN\7)\2\2NO\7*\2\2OP\7\7\2\2PQ\5,\27\2QR\7\b\2\2RS\b\4\1\2SU\3\2\2"+
		"\2TI\3\2\2\2TM\3\2\2\2Ud\3\2\2\2VW\f\6\2\2WX\7\6\2\2XY\7*\2\2Yc\b\4\1"+
		"\2Z[\f\5\2\2[\\\7\6\2\2\\]\7*\2\2]^\7\7\2\2^_\5,\27\2_`\7\b\2\2`a\b\4"+
		"\1\2ac\3\2\2\2bV\3\2\2\2bZ\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\7\3"+
		"\2\2\2fd\3\2\2\2gh\7)\2\2hi\7*\2\2ij\7\t\2\2jk\5.\30\2kl\b\5\1\2l\t\3"+
		"\2\2\2mr\b\6\1\2no\f\4\2\2oq\5\f\7\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3"+
		"\2\2\2s\13\3\2\2\2tr\3\2\2\2uv\7)\2\2vw\7*\2\2wx\b\7\1\2xy\7\n\2\2yz\5"+
		"\16\b\2z{\7\13\2\2{|\b\7\1\2|}\5\20\t\2}~\5&\24\2~\177\b\7\1\2\177\u008c"+
		"\3\2\2\2\u0080\u0081\7\34\2\2\u0081\u0082\7*\2\2\u0082\u0083\b\7\1\2\u0083"+
		"\u0084\7\n\2\2\u0084\u0085\5\16\b\2\u0085\u0086\7\13\2\2\u0086\u0087\b"+
		"\7\1\2\u0087\u0088\5\20\t\2\u0088\u0089\5&\24\2\u0089\u008a\b\7\1\2\u008a"+
		"\u008c\3\2\2\2\u008bu\3\2\2\2\u008b\u0080\3\2\2\2\u008c\r\3\2\2\2\u008d"+
		"\u008e\b\b\1\2\u008e\u008f\7)\2\2\u008f\u0090\7*\2\2\u0090\u0093\b\b\1"+
		"\2\u0091\u0093\b\b\1\2\u0092\u008d\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u009b"+
		"\3\2\2\2\u0094\u0095\f\5\2\2\u0095\u0096\7\6\2\2\u0096\u0097\7)\2\2\u0097"+
		"\u0098\7*\2\2\u0098\u009a\b\b\1\2\u0099\u0094\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\17\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u009f\7\3\2\2\u009f\u00a0\b\t\1\2\u00a0\u00a1\5\22\n\2"+
		"\u00a1\u00a2\5\26\f\2\u00a2\u00a3\7\4\2\2\u00a3\u00a4\b\t\1\2\u00a4\21"+
		"\3\2\2\2\u00a5\u00ad\b\n\1\2\u00a6\u00a7\f\4\2\2\u00a7\u00a8\5\24\13\2"+
		"\u00a8\u00a9\7\5\2\2\u00a9\u00aa\b\n\1\2\u00aa\u00ac\3\2\2\2\u00ab\u00a6"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\23\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\b\13\1\2\u00b1\u00b2\7)\2"+
		"\2\u00b2\u00b3\7*\2\2\u00b3\u00b4\b\13\1\2\u00b4\u00bb\3\2\2\2\u00b5\u00b6"+
		"\f\4\2\2\u00b6\u00b7\7\6\2\2\u00b7\u00b8\7*\2\2\u00b8\u00ba\b\13\1\2\u00b9"+
		"\u00b5\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\25\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\b\f\1\2\u00bf\u00c0"+
		"\b\f\1\2\u00c0\u00c8\3\2\2\2\u00c1\u00c2\f\4\2\2\u00c2\u00c3\5&\24\2\u00c3"+
		"\u00c4\5\30\r\2\u00c4\u00c5\b\f\1\2\u00c5\u00c7\3\2\2\2\u00c6\u00c1\3"+
		"\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\27\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5*\26\2\u00cc\u00cd\5\60\31"+
		"\2\u00cd\u00ce\5\34\17\2\u00ce\u00cf\7\5\2\2\u00cf\u00d0\b\r\1\2\u00d0"+
		"\u010d\3\2\2\2\u00d1\u00d2\7\35\2\2\u00d2\u00d3\7\n\2\2\u00d3\u00d4\5"+
		"\34\17\2\u00d4\u00d5\7\13\2\2\u00d5\u00d6\5&\24\2\u00d6\u00d7\5\20\t\2"+
		"\u00d7\u00d8\b\r\1\2\u00d8\u010d\3\2\2\2\u00d9\u00da\7\35\2\2\u00da\u00db"+
		"\7\n\2\2\u00db\u00dc\5\34\17\2\u00dc\u00dd\7\13\2\2\u00dd\u00de\5&\24"+
		"\2\u00de\u00df\5\20\t\2\u00df\u00e0\5(\25\2\u00e0\u00e1\7\36\2\2\u00e1"+
		"\u00e2\5&\24\2\u00e2\u00e3\5\20\t\2\u00e3\u00e4\b\r\1\2\u00e4\u010d\3"+
		"\2\2\2\u00e5\u00e6\7\37\2\2\u00e6\u00e7\5&\24\2\u00e7\u00e8\7\n\2\2\u00e8"+
		"\u00e9\5\34\17\2\u00e9\u00ea\7\13\2\2\u00ea\u00eb\5&\24\2\u00eb\u00ec"+
		"\5\30\r\2\u00ec\u00ed\b\r\1\2\u00ed\u010d\3\2\2\2\u00ee\u00ef\7 \2\2\u00ef"+
		"\u00f0\5\34\17\2\u00f0\u00f1\7\3\2\2\u00f1\u00f2\5\32\16\2\u00f2\u00f3"+
		"\7\4\2\2\u00f3\u00f4\b\r\1\2\u00f4\u010d\3\2\2\2\u00f5\u00f6\7#\2\2\u00f6"+
		"\u00f7\7\5\2\2\u00f7\u010d\b\r\1\2\u00f8\u00f9\7$\2\2\u00f9\u00fa\7\5"+
		"\2\2\u00fa\u010d\b\r\1\2\u00fb\u00fc\5\20\t\2\u00fc\u00fd\b\r\1\2\u00fd"+
		"\u010d\3\2\2\2\u00fe\u00ff\7\"\2\2\u00ff\u0100\7\5\2\2\u0100\u010d\b\r"+
		"\1\2\u0101\u0102\7\"\2\2\u0102\u0103\7\n\2\2\u0103\u0104\5\34\17\2\u0104"+
		"\u0105\7\13\2\2\u0105\u0106\7\5\2\2\u0106\u0107\b\r\1\2\u0107\u010d\3"+
		"\2\2\2\u0108\u0109\5\36\20\2\u0109\u010a\7\5\2\2\u010a\u010b\b\r\1\2\u010b"+
		"\u010d\3\2\2\2\u010c\u00cb\3\2\2\2\u010c\u00d1\3\2\2\2\u010c\u00d9\3\2"+
		"\2\2\u010c\u00e5\3\2\2\2\u010c\u00ee\3\2\2\2\u010c\u00f5\3\2\2\2\u010c"+
		"\u00f8\3\2\2\2\u010c\u00fb\3\2\2\2\u010c\u00fe\3\2\2\2\u010c\u0101\3\2"+
		"\2\2\u010c\u0108\3\2\2\2\u010d\31\3\2\2\2\u010e\u010f\b\16\1\2\u010f\u0110"+
		"\7!\2\2\u0110\u0111\5.\30\2\u0111\u0112\7\f\2\2\u0112\u0113\b\16\1\2\u0113"+
		"\u0114\5\26\f\2\u0114\u0115\b\16\1\2\u0115\u0120\3\2\2\2\u0116\u0117\f"+
		"\4\2\2\u0117\u0118\7!\2\2\u0118\u0119\5.\30\2\u0119\u011a\7\f\2\2\u011a"+
		"\u011b\b\16\1\2\u011b\u011c\5\26\f\2\u011c\u011d\b\16\1\2\u011d\u011f"+
		"\3\2\2\2\u011e\u0116\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\33\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\b\17\1"+
		"\2\u0124\u0125\5.\30\2\u0125\u0126\b\17\1\2\u0126\u0145\3\2\2\2\u0127"+
		"\u0128\5*\26\2\u0128\u0129\b\17\1\2\u0129\u0145\3\2\2\2\u012a\u012b\7"+
		"\n\2\2\u012b\u012c\5\34\17\2\u012c\u012d\7\13\2\2\u012d\u012e\b\17\1\2"+
		"\u012e\u0145\3\2\2\2\u012f\u0130\7-\2\2\u0130\u0131\5\34\17\21\u0131\u0132"+
		"\b\17\1\2\u0132\u0145\3\2\2\2\u0133\u0134\7\24\2\2\u0134\u0135\5\34\17"+
		"\7\u0135\u0136\b\17\1\2\u0136\u0145\3\2\2\2\u0137\u0138\7*\2\2\u0138\u0139"+
		"\7\n\2\2\u0139\u013a\5 \21\2\u013a\u013b\7\13\2\2\u013b\u013c\b\17\1\2"+
		"\u013c\u0145\3\2\2\2\u013d\u013e\7%\2\2\u013e\u013f\7\n\2\2\u013f\u0140"+
		"\7\31\2\2\u0140\u0141\5$\23\2\u0141\u0142\7\13\2\2\u0142\u0143\b\17\1"+
		"\2\u0143\u0145\3\2\2\2\u0144\u0123\3\2\2\2\u0144\u0127\3\2\2\2\u0144\u012a"+
		"\3\2\2\2\u0144\u012f\3\2\2\2\u0144\u0133\3\2\2\2\u0144\u0137\3\2\2\2\u0144"+
		"\u013d\3\2\2\2\u0145\u0181\3\2\2\2\u0146\u0147\f\20\2\2\u0147\u0148\7"+
		",\2\2\u0148\u0149\5\34\17\21\u0149\u014a\b\17\1\2\u014a\u0180\3\2\2\2"+
		"\u014b\u014c\f\17\2\2\u014c\u014d\7-\2\2\u014d\u014e\5\34\17\20\u014e"+
		"\u014f\b\17\1\2\u014f\u0180\3\2\2\2\u0150\u0151\f\16\2\2\u0151\u0152\7"+
		"\r\2\2\u0152\u0153\5\34\17\17\u0153\u0154\b\17\1\2\u0154\u0180\3\2\2\2"+
		"\u0155\u0156\f\r\2\2\u0156\u0157\7\16\2\2\u0157\u0158\5\34\17\16\u0158"+
		"\u0159\b\17\1\2\u0159\u0180\3\2\2\2\u015a\u015b\f\f\2\2\u015b\u015c\7"+
		"\17\2\2\u015c\u015d\5\34\17\r\u015d\u015e\b\17\1\2\u015e\u0180\3\2\2\2"+
		"\u015f\u0160\f\13\2\2\u0160\u0161\7\20\2\2\u0161\u0162\5\34\17\f\u0162"+
		"\u0163\b\17\1\2\u0163\u0180\3\2\2\2\u0164\u0165\f\n\2\2\u0165\u0166\7"+
		"\21\2\2\u0166\u0167\5\34\17\13\u0167\u0168\b\17\1\2\u0168\u0180\3\2\2"+
		"\2\u0169\u016a\f\t\2\2\u016a\u016b\7\22\2\2\u016b\u016c\5\34\17\n\u016c"+
		"\u016d\b\17\1\2\u016d\u0180\3\2\2\2\u016e\u016f\f\b\2\2\u016f\u0170\7"+
		"\23\2\2\u0170\u0171\5\34\17\t\u0171\u0172\b\17\1\2\u0172\u0180\3\2\2\2"+
		"\u0173\u0174\f\6\2\2\u0174\u0175\7\25\2\2\u0175\u0176\5&\24\2\u0176\u0177"+
		"\5\34\17\7\u0177\u0178\b\17\1\2\u0178\u0180\3\2\2\2\u0179\u017a\f\5\2"+
		"\2\u017a\u017b\7\26\2\2\u017b\u017c\5&\24\2\u017c\u017d\5\34\17\6\u017d"+
		"\u017e\b\17\1\2\u017e\u0180\3\2\2\2\u017f\u0146\3\2\2\2\u017f\u014b\3"+
		"\2\2\2\u017f\u0150\3\2\2\2\u017f\u0155\3\2\2\2\u017f\u015a\3\2\2\2\u017f"+
		"\u015f\3\2\2\2\u017f\u0164\3\2\2\2\u017f\u0169\3\2\2\2\u017f\u016e\3\2"+
		"\2\2\u017f\u0173\3\2\2\2\u017f\u0179\3\2\2\2\u0180\u0183\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\35\3\2\2\2\u0183\u0181\3\2\2"+
		"\2\u0184\u0185\7*\2\2\u0185\u0186\7\n\2\2\u0186\u0187\5 \21\2\u0187\u0188"+
		"\7\13\2\2\u0188\u0189\b\20\1\2\u0189\u0192\3\2\2\2\u018a\u018b\7%\2\2"+
		"\u018b\u018c\7\n\2\2\u018c\u018d\7\31\2\2\u018d\u018e\5$\23\2\u018e\u018f"+
		"\7\13\2\2\u018f\u0190\b\20\1\2\u0190\u0192\3\2\2\2\u0191\u0184\3\2\2\2"+
		"\u0191\u018a\3\2\2\2\u0192\37\3\2\2\2\u0193\u0194\5\"\22\2\u0194\u0195"+
		"\b\21\1\2\u0195\u0198\3\2\2\2\u0196\u0198\b\21\1\2\u0197\u0193\3\2\2\2"+
		"\u0197\u0196\3\2\2\2\u0198!\3\2\2\2\u0199\u019a\b\22\1\2\u019a\u019b\5"+
		"\34\17\2\u019b\u019c\b\22\1\2\u019c\u01a4\3\2\2\2\u019d\u019e\f\4\2\2"+
		"\u019e\u019f\7\6\2\2\u019f\u01a0\5\34\17\2\u01a0\u01a1\b\22\1\2\u01a1"+
		"\u01a3\3\2\2\2\u01a2\u019d\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5#\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8"+
		"\b\23\1\2\u01a8\u01a9\b\23\1\2\u01a9\u01b5\3\2\2\2\u01aa\u01ab\f\5\2\2"+
		"\u01ab\u01ac\7\6\2\2\u01ac\u01ad\5\34\17\2\u01ad\u01ae\b\23\1\2\u01ae"+
		"\u01b4\3\2\2\2\u01af\u01b0\f\4\2\2\u01b0\u01b1\7\6\2\2\u01b1\u01b2\7\31"+
		"\2\2\u01b2\u01b4\b\23\1\2\u01b3\u01aa\3\2\2\2\u01b3\u01af\3\2\2\2\u01b4"+
		"\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6%\3\2\2\2"+
		"\u01b7\u01b5\3\2\2\2\u01b8\u01b9\b\24\1\2\u01b9\'\3\2\2\2\u01ba\u01bb"+
		"\b\25\1\2\u01bb)\3\2\2\2\u01bc\u01bd\7*\2\2\u01bd\u01c5\b\26\1\2\u01be"+
		"\u01bf\7*\2\2\u01bf\u01c0\7\7\2\2\u01c0\u01c1\5\34\17\2\u01c1\u01c2\7"+
		"\b\2\2\u01c2\u01c3\b\26\1\2\u01c3\u01c5\3\2\2\2\u01c4\u01bc\3\2\2\2\u01c4"+
		"\u01be\3\2\2\2\u01c5+\3\2\2\2\u01c6\u01c7\7&\2\2\u01c7\u01cb\b\27\1\2"+
		"\u01c8\u01c9\7\'\2\2\u01c9\u01cb\b\27\1\2\u01ca\u01c6\3\2\2\2\u01ca\u01c8"+
		"\3\2\2\2\u01cb-\3\2\2\2\u01cc\u01cd\5,\27\2\u01cd\u01ce\b\30\1\2\u01ce"+
		"\u01d4\3\2\2\2\u01cf\u01d0\7\30\2\2\u01d0\u01d4\b\30\1\2\u01d1\u01d2\7"+
		"(\2\2\u01d2\u01d4\b\30\1\2\u01d3\u01cc\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d4/\3\2\2\2\u01d5\u01d6\t\2\2\2\u01d6\61\3\2\2\2\33"+
		"DFTbdr\u008b\u0092\u009b\u00ad\u00bb\u00c8\u010c\u0120\u0144\u017f\u0181"+
		"\u0191\u0197\u01a4\u01b3\u01b5\u01c4\u01ca\u01d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}