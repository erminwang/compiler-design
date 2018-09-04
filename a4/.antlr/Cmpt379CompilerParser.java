// Generated from d:\compiler-design\demo\Cmpt379Compiler.g4 by ANTLR 4.7.1


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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, WhiteSpace=20, Char=21, Str=22, Class=23, Program=24, 
		Void=25, If=26, Else=27, Ret=28, Brk=29, Cnt=30, Callout=31, DecNum=32, 
		HexNum=33, BoolLit=34, Type=35, Ident=36, AssignOp=37, MulDiv=38, AddSub=39;
	public static final int
		RULE_prog = 0, RULE_field_decls = 1, RULE_field_decl = 2, RULE_inited_field_decl = 3, 
		RULE_method_decls = 4, RULE_method_decl = 5, RULE_params = 6, RULE_block = 7, 
		RULE_var_decls = 8, RULE_var_decl = 9, RULE_statements = 10, RULE_statement = 11, 
		RULE_expr = 12, RULE_methodCall = 13, RULE_args = 14, RULE_someArgs = 15, 
		RULE_calloutArgs = 16, RULE_marker = 17, RULE_next = 18, RULE_location = 19, 
		RULE_num = 20, RULE_literal = 21, RULE_eqOp = 22;
	public static final String[] ruleNames = {
		"prog", "field_decls", "field_decl", "inited_field_decl", "method_decls", 
		"method_decl", "params", "block", "var_decls", "var_decl", "statements", 
		"statement", "expr", "methodCall", "args", "someArgs", "calloutArgs", 
		"marker", "next", "location", "num", "literal", "eqOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", "'['", "']'", "'='", "'('", "')'", "'%'", 
		"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'!'", "'&&'", "'||'", null, 
		null, null, "'class'", "'Program'", "'void'", "'if'", "'else'", "'return'", 
		"'break'", "'continue'", "'callout'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "WhiteSpace", "Char", 
		"Str", "Class", "Program", "Void", "If", "Else", "Ret", "Brk", "Cnt", 
		"Callout", "DecNum", "HexNum", "BoolLit", "Type", "Ident", "AssignOp", 
		"MulDiv", "AddSub"
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(Class);
			setState(47);
			match(Program);
			setState(48);
			match(T__0);
			setState(49);
			field_decls(0);

				s.BlockEntry();

			setState(51);
			method_decls(0);
			setState(52);
			match(T__1);

				s.Print();
				//print global variables

				System.out.println(".globl main");
				System.out.println(".data");
				s.PrintGlobals();
				System.out.println(".text");

				//q.AsmPrint();

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
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(64);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new Field_declsContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decls);
						setState(56);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(57);
						field_decl(0);
						setState(58);
						match(T__2);
						}
						break;
					case 2:
						{
						_localctx = new Field_declsContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decls);
						setState(60);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(61);
						inited_field_decl();
						setState(62);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(68);
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(70);
				((Field_declContext)_localctx).Type = match(Type);
				setState(71);
				((Field_declContext)_localctx).Ident = match(Ident);

					((Field_declContext)_localctx).t =  DataType.valueOf((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null).toUpperCase());
					Symbol sym = s.Add((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null), _localctx.t);

				}
				break;
			case 2:
				{
				setState(73);
				((Field_declContext)_localctx).Type = match(Type);
				setState(74);
				((Field_declContext)_localctx).Ident = match(Ident);
				setState(75);
				match(T__4);
				setState(76);
				((Field_declContext)_localctx).num = num();
				setState(77);
				match(T__5);

					((Field_declContext)_localctx).t =  DataType.valueOf((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null).toUpperCase());
					Symbol sym = s.Add((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null), _localctx.t, Integer.parseInt((((Field_declContext)_localctx).num!=null?_input.getText(((Field_declContext)_localctx).num.start,((Field_declContext)_localctx).num.stop):null)));

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(94);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Field_declContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decl);
						setState(82);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(83);
						match(T__3);
						setState(84);
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
						setState(86);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(87);
						match(T__3);
						setState(88);
						((Field_declContext)_localctx).Ident = match(Ident);
						setState(89);
						match(T__4);
						setState(90);
						((Field_declContext)_localctx).num = num();
						setState(91);
						match(T__5);

						          	((Field_declContext)_localctx).t =  ((Field_declContext)_localctx).f.t;
						          	Symbol sym = s.Add((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null), _localctx.t, Integer.parseInt((((Field_declContext)_localctx).num!=null?_input.getText(((Field_declContext)_localctx).num.start,((Field_declContext)_localctx).num.stop):null)));
						          
						}
						break;
					}
					} 
				}
				setState(98);
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
	}

	public final Inited_field_declContext inited_field_decl() throws RecognitionException {
		Inited_field_declContext _localctx = new Inited_field_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inited_field_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			((Inited_field_declContext)_localctx).Type = match(Type);
			setState(100);
			((Inited_field_declContext)_localctx).Ident = match(Ident);
			setState(101);
			match(T__6);
			setState(102);
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
			setState(110);
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
					setState(106);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(107);
					method_decl();
					}
					} 
				}
				setState(112);
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
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method_decl);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((Method_declContext)_localctx).Type = match(Type);
				setState(114);
				((Method_declContext)_localctx).Ident = match(Ident);

					DataType t = DataType.valueOf((((Method_declContext)_localctx).Type!=null?((Method_declContext)_localctx).Type.getText():null).toUpperCase());
					Symbol sym = s.Add((((Method_declContext)_localctx).Ident!=null?((Method_declContext)_localctx).Ident.getText():null), t);
					s.FunctionEntry();
					q.Add(sym);
					int entry = q.Add(null, null, null, "frame");


				setState(116);
				match(T__7);
				setState(117);
				params(0);
				setState(118);
				match(T__8);


					((Method_declContext)_localctx).retList =  new LocList();
					_localctx.retList.Add(entry);

				setState(120);
				((Method_declContext)_localctx).block = block();
				setState(121);
				marker();

					
					s.PopSymTab(q);

					_localctx.retList.Merge(((Method_declContext)_localctx).block.retList);
					_localctx.retList.BackPatch(q, s.insert("" + s.GetOffset(), DataType.INT, Boolean.TRUE));

				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(Void);
				setState(125);
				((Method_declContext)_localctx).Ident = match(Ident);

					DataType t = DataType.VOID;
					Symbol sym = s.Add((((Method_declContext)_localctx).Ident!=null?((Method_declContext)_localctx).Ident.getText():null), t);
					s.FunctionEntry();
					q.Add(sym);                                     // Add #main | main: push %rbp | mov %rsp, %rbp
					int entry = q.Add(null, null, null, "frame");


				setState(127);
				match(T__7);
				setState(128);
				params(0);
				setState(129);
				match(T__8);


					((Method_declContext)_localctx).retList =  new LocList();
					_localctx.retList.Add(entry);	

				setState(131);
				((Method_declContext)_localctx).block = block();
				setState(132);
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
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(138);
				((ParamsContext)_localctx).Type = match(Type);
				setState(139);
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
			setState(151);
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
					setState(144);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(145);
					match(T__3);
					setState(146);
					((ParamsContext)_localctx).Type = match(Type);
					setState(147);
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
				setState(153);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__0);
				
				s.BlockEntry();

			setState(156);
			var_decls(0);
			setState(157);
			((BlockContext)_localctx).statements = statements(0);
			setState(158);
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
			setState(169);
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
					setState(162);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(163);
					var_decl(0);
					setState(164);
					match(T__2);

					          
					}
					} 
				}
				setState(171);
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
			setState(173);
			((Var_declContext)_localctx).Type = match(Type);
			setState(174);
			((Var_declContext)_localctx).Ident = match(Ident);

				((Var_declContext)_localctx).t =  DataType.valueOf((((Var_declContext)_localctx).Type!=null?((Var_declContext)_localctx).Type.getText():null).toUpperCase());
				Symbol sym = s.Add((((Var_declContext)_localctx).Ident!=null?((Var_declContext)_localctx).Ident.getText():null), _localctx.t);

			}
			_ctx.stop = _input.LT(-1);
			setState(183);
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
					setState(177);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(178);
					match(T__3);
					setState(179);
					((Var_declContext)_localctx).Ident = match(Ident);

					          	((Var_declContext)_localctx).t =  ((Var_declContext)_localctx).v.t;
					          	Symbol sym = s.Add((((Var_declContext)_localctx).Ident!=null?((Var_declContext)_localctx).Ident.getText():null), _localctx.t);
					          
					}
					} 
				}
				setState(185);
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
			setState(196);
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
					setState(189);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(190);
					((StatementsContext)_localctx).marker = marker();
					setState(191);
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
				setState(198);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				((StatementContext)_localctx).location = location();
				setState(200);
				((StatementContext)_localctx).eqOp = eqOp();
				setState(201);
				((StatementContext)_localctx).expr = expr(0);
				setState(202);
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
				setState(205);
				match(If);
				setState(206);
				match(T__7);
				setState(207);
				((StatementContext)_localctx).expr = expr(0);
				setState(208);
				match(T__8);
				setState(209);
				((StatementContext)_localctx).marker = marker();
				setState(210);
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
				setState(213);
				match(If);
				setState(214);
				match(T__7);
				setState(215);
				((StatementContext)_localctx).expr = expr(0);
				setState(216);
				match(T__8);
				setState(217);
				((StatementContext)_localctx).m1 = marker();
				setState(218);
				((StatementContext)_localctx).b1 = block();
				setState(219);
				((StatementContext)_localctx).next = next();
				setState(220);
				match(Else);
				setState(221);
				((StatementContext)_localctx).m2 = marker();
				setState(222);
				((StatementContext)_localctx).b2 = block();

					((StatementContext)_localctx).expr.truelist.BackPatch(q, ((StatementContext)_localctx).m1.label);
					((StatementContext)_localctx).expr.falselist.BackPatch(q, ((StatementContext)_localctx).m2.label);
					((StatementContext)_localctx).nextlist =  ((StatementContext)_localctx).b1.nextlist;
					_localctx.nextlist.Merge(((StatementContext)_localctx).b2.nextlist);
					_localctx.nextlist.Merge(((StatementContext)_localctx).next.nextlist);

					((StatementContext)_localctx).brklist =  ((StatementContext)_localctx).b1.brklist;
					_localctx.brklist.Merge (((StatementContext)_localctx).b2.brklist);
					((StatementContext)_localctx).cntlist =  ((StatementContext)_localctx).b1.cntlist;
					_localctx.cntlist.Merge (((StatementContext)_localctx).b2.brklist);
					((StatementContext)_localctx).retList =  ((StatementContext)_localctx).b1.retList;
					_localctx.retList.Merge (((StatementContext)_localctx).b2.retList);

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(Brk);
				setState(226);
				match(T__2);

					((StatementContext)_localctx).nextlist =  new LocList ();
						
					((StatementContext)_localctx).brklist =  new LocList ();
					_localctx.brklist.Add (q.Add (null, null, null, "goto"));

					((StatementContext)_localctx).cntlist =  new LocList ();
					((StatementContext)_localctx).retList =  new LocList ();

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				match(Cnt);
				setState(229);
				match(T__2);


					((StatementContext)_localctx).nextlist =  new LocList ();

					((StatementContext)_localctx).cntlist =  new LocList ();
					_localctx.cntlist.Add (q.Add (null, null, null, "goto"));

					((StatementContext)_localctx).brklist =  new LocList ();
					((StatementContext)_localctx).retList =  new LocList ();

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				((StatementContext)_localctx).block = block();

					((StatementContext)_localctx).nextlist =  ((StatementContext)_localctx).block.nextlist;
					((StatementContext)_localctx).brklist =  ((StatementContext)_localctx).block.brklist;
					((StatementContext)_localctx).cntlist =  ((StatementContext)_localctx).block.cntlist;
					((StatementContext)_localctx).retList =  ((StatementContext)_localctx).block.retList;

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				match(Ret);
				setState(235);
				match(T__2);

					int retins = q.Add (null, null, null, "ret");
					((StatementContext)_localctx).nextlist =  new LocList ();	
					((StatementContext)_localctx).brklist =  new LocList ();	
					((StatementContext)_localctx).cntlist =  new LocList ();	
					((StatementContext)_localctx).retList =  new LocList ();
					_localctx.retList.Add(retins);

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(237);
				match(Ret);
				setState(238);
				match(T__7);
				setState(239);
				((StatementContext)_localctx).expr = expr(0);
				setState(240);
				match(T__8);
				setState(241);
				match(T__2);

					int retins = q.Add (null, ((StatementContext)_localctx).expr.sym, null, "ret");
					((StatementContext)_localctx).nextlist =  new LocList ();	
					((StatementContext)_localctx).brklist =  new LocList ();	
					((StatementContext)_localctx).cntlist =  new LocList ();
					((StatementContext)_localctx).retList =  new LocList ();
					_localctx.retList.Add(retins);

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(244);
				methodCall();
				setState(245);
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
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(251);
				((ExprContext)_localctx).literal = literal();

					((ExprContext)_localctx).sym =  ((ExprContext)_localctx).literal.sym;

				}
				break;
			case 2:
				{
				setState(254);
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
				setState(257);
				match(T__7);
				setState(258);
				((ExprContext)_localctx).e = expr(0);
				setState(259);
				match(T__8);

					((ExprContext)_localctx).sym =  ((ExprContext)_localctx).e.sym;
					((ExprContext)_localctx).truelist =  ((ExprContext)_localctx).e.truelist;
					((ExprContext)_localctx).falselist =  ((ExprContext)_localctx).e.falselist;

				}
				break;
			case 4:
				{
				setState(262);
				((ExprContext)_localctx).AddSub = match(AddSub);
				setState(263);
				((ExprContext)_localctx).e = expr(15);

					((ExprContext)_localctx).sym =  s.Add(DataType.INT);
					q.Add(_localctx.sym, s.insert("0", DataType.INT), ((ExprContext)_localctx).e.sym, (((ExprContext)_localctx).AddSub!=null?((ExprContext)_localctx).AddSub.getText():null)); 

				}
				break;
			case 5:
				{
				setState(266);
				match(T__16);
				setState(267);
				((ExprContext)_localctx).e = expr(5);

					((ExprContext)_localctx).truelist =  ((ExprContext)_localctx).e.falselist;
					((ExprContext)_localctx).falselist =  ((ExprContext)_localctx).e.truelist;

				}
				break;
			case 6:
				{
				setState(270);
				((ExprContext)_localctx).Ident = match(Ident);
				setState(271);
				match(T__7);
				setState(272);
				((ExprContext)_localctx).args = args();
				setState(273);
				match(T__8);

					((ExprContext)_localctx).sym =  s.Add (s.Find ((((ExprContext)_localctx).Ident!=null?((ExprContext)_localctx).Ident.getText():null)).GetType());
					String count = "" + ((ExprContext)_localctx).args.count;
					q.Add (_localctx.sym, s.Find ((((ExprContext)_localctx).Ident!=null?((ExprContext)_localctx).Ident.getText():null)) , s.insert(count, DataType.INT), "callexp");	

				}
				break;
			case 7:
				{
				setState(276);
				match(Callout);
				setState(277);
				match(T__7);
				setState(278);
				((ExprContext)_localctx).Str = match(Str);
				setState(279);
				((ExprContext)_localctx).calloutArgs = calloutArgs(0);
				setState(280);
				match(T__8);

					((ExprContext)_localctx).sym =  s.Add (DataType.INT);
					String count = "" + ((ExprContext)_localctx).calloutArgs.count;
					q.Add (_localctx.sym, s.insert ((((ExprContext)_localctx).Str!=null?((ExprContext)_localctx).Str.getText():null), DataType.STR), s.insert(count, DataType.INT), "callexp");

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(342);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(286);
						((ExprContext)_localctx).MulDiv = match(MulDiv);
						setState(287);
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
						setState(290);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(291);
						((ExprContext)_localctx).AddSub = match(AddSub);
						setState(292);
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
						setState(295);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(296);
						match(T__9);
						setState(297);
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
						setState(300);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(301);
						match(T__10);
						setState(302);
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
						setState(305);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(306);
						match(T__11);
						setState(307);
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
						setState(310);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(311);
						match(T__12);
						setState(312);
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
						setState(315);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(316);
						match(T__13);
						setState(317);
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
						setState(320);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(321);
						match(T__14);
						setState(322);
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
						setState(325);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(326);
						match(T__15);
						setState(327);
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
						setState(330);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(331);
						match(T__17);
						setState(332);
						((ExprContext)_localctx).marker = marker();
						setState(333);
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
						setState(336);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(337);
						match(T__18);
						setState(338);
						((ExprContext)_localctx).marker = marker();
						setState(339);
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
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodCall);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				((MethodCallContext)_localctx).Ident = match(Ident);
				setState(348);
				match(T__7);
				setState(349);
				((MethodCallContext)_localctx).args = args();
				setState(350);
				match(T__8);

					String count = "" + ((MethodCallContext)_localctx).args.count;
					q.Add (null, s.Find ((((MethodCallContext)_localctx).Ident!=null?((MethodCallContext)_localctx).Ident.getText():null)) , s.insert(count, DataType.INT), "call");	

				}
				break;
			case Callout:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(Callout);
				setState(354);
				match(T__7);
				setState(355);
				((MethodCallContext)_localctx).Str = match(Str);
				setState(356);
				((MethodCallContext)_localctx).calloutArgs = calloutArgs(0);
				setState(357);
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
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_args);
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__16:
			case Char:
			case Callout:
			case DecNum:
			case HexNum:
			case BoolLit:
			case Ident:
			case AddSub:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
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
	}

	public final SomeArgsContext someArgs() throws RecognitionException {
		return someArgs(0);
	}

	private SomeArgsContext someArgs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SomeArgsContext _localctx = new SomeArgsContext(_ctx, _parentState);
		SomeArgsContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_someArgs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(369);
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
			setState(379);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
					setState(372);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(373);
					match(T__3);
					setState(374);
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
				setState(381);
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
	}

	public final CalloutArgsContext calloutArgs() throws RecognitionException {
		return calloutArgs(0);
	}

	private CalloutArgsContext calloutArgs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CalloutArgsContext _localctx = new CalloutArgsContext(_ctx, _parentState);
		CalloutArgsContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_calloutArgs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{

				((CalloutArgsContext)_localctx).count =  0;

			}
			_ctx.stop = _input.LT(-1);
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(394);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new CalloutArgsContext(_parentctx, _parentState);
						_localctx.c = _prevctx;
						_localctx.c = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calloutArgs);
						setState(385);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(386);
						match(T__3);
						setState(387);
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
						setState(390);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(391);
						match(T__3);
						setState(392);
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
				setState(398);
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

	public static class MarkerContext extends ParserRuleContext {
		public Symbol label;
		public MarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marker; }
	}

	public final MarkerContext marker() throws RecognitionException {
		MarkerContext _localctx = new MarkerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_marker);
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
	}

	public final NextContext next() throws RecognitionException {
		NextContext _localctx = new NextContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_next);
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
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_location);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				((LocationContext)_localctx).Ident = match(Ident);

					((LocationContext)_localctx).base =  s.Find((((LocationContext)_localctx).Ident!=null?((LocationContext)_localctx).Ident.getText():null));
					((LocationContext)_localctx).offset =  null;

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				((LocationContext)_localctx).Ident = match(Ident);
				setState(406);
				match(T__4);
				setState(407);
				((LocationContext)_localctx).expr = expr(0);
				setState(408);
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
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_num);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DecNum:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(DecNum);

					((NumContext)_localctx).sym =  s.Add(_input.getText(_localctx.start, _input.LT(-1)), DataType.INT, Boolean.TRUE);

				}
				break;
			case HexNum:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
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
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DecNum:
			case HexNum:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				((LiteralContext)_localctx).num = num();

					((LiteralContext)_localctx).sym =  ((LiteralContext)_localctx).num.sym;

				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(Char);

					((LiteralContext)_localctx).sym =  s.Add(_input.getText(_localctx.start, _input.LT(-1)), DataType.INT, Boolean.TRUE);

				}
				break;
			case BoolLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
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
	}

	public final EqOpContext eqOp() throws RecognitionException {
		EqOpContext _localctx = new EqOpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_eqOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==AssignOp) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 15:
			return someArgs_sempred((SomeArgsContext)_localctx, predIndex);
		case 16:
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
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 11);
		case 13:
			return precpred(_ctx, 10);
		case 14:
			return precpred(_ctx, 9);
		case 15:
			return precpred(_ctx, 8);
		case 16:
			return precpred(_ctx, 7);
		case 17:
			return precpred(_ctx, 6);
		case 18:
			return precpred(_ctx, 4);
		case 19:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean someArgs_sempred(SomeArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean calloutArgs_sempred(CalloutArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 3);
		case 22:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u01b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3C\n"+
		"\3\f\3\16\3F\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4S\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4a\n\4\f\4\16\4d\13"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u008a\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u0091\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\b\u0098\n\b\f\b\16\b\u009b\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00aa\n\n\f\n\16\n\u00ad\13\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b8\n\13\f\13\16\13\u00bb\13"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c5\n\f\f\f\16\f\u00c8\13\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00fb\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u011e\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0159\n\16\f\16\16"+
		"\16\u015c\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u016b\n\17\3\20\3\20\3\20\3\20\5\20\u0171\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u017c\n\21\f\21\16\21\u017f"+
		"\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u018d\n\22\f\22\16\22\u0190\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u019e\n\25\3\26\3\26\3\26\3\26\5\26\u01a4"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01ad\n\27\3\30\3\30\3\30"+
		"\2\f\4\6\n\16\22\24\26\32 \"\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\2\3\4\2\t\t\'\'\2\u01c7\2\60\3\2\2\2\49\3\2\2\2\6R\3\2\2\2\b"+
		"e\3\2\2\2\nk\3\2\2\2\f\u0089\3\2\2\2\16\u0090\3\2\2\2\20\u009c\3\2\2\2"+
		"\22\u00a3\3\2\2\2\24\u00ae\3\2\2\2\26\u00bc\3\2\2\2\30\u00fa\3\2\2\2\32"+
		"\u011d\3\2\2\2\34\u016a\3\2\2\2\36\u0170\3\2\2\2 \u0172\3\2\2\2\"\u0180"+
		"\3\2\2\2$\u0191\3\2\2\2&\u0193\3\2\2\2(\u019d\3\2\2\2*\u01a3\3\2\2\2,"+
		"\u01ac\3\2\2\2.\u01ae\3\2\2\2\60\61\7\31\2\2\61\62\7\32\2\2\62\63\7\3"+
		"\2\2\63\64\5\4\3\2\64\65\b\2\1\2\65\66\5\n\6\2\66\67\7\4\2\2\678\b\2\1"+
		"\28\3\3\2\2\29D\b\3\1\2:;\f\5\2\2;<\5\6\4\2<=\7\5\2\2=C\3\2\2\2>?\f\4"+
		"\2\2?@\5\b\5\2@A\7\5\2\2AC\3\2\2\2B:\3\2\2\2B>\3\2\2\2CF\3\2\2\2DB\3\2"+
		"\2\2DE\3\2\2\2E\5\3\2\2\2FD\3\2\2\2GH\b\4\1\2HI\7%\2\2IJ\7&\2\2JS\b\4"+
		"\1\2KL\7%\2\2LM\7&\2\2MN\7\7\2\2NO\5*\26\2OP\7\b\2\2PQ\b\4\1\2QS\3\2\2"+
		"\2RG\3\2\2\2RK\3\2\2\2Sb\3\2\2\2TU\f\6\2\2UV\7\6\2\2VW\7&\2\2Wa\b\4\1"+
		"\2XY\f\5\2\2YZ\7\6\2\2Z[\7&\2\2[\\\7\7\2\2\\]\5*\26\2]^\7\b\2\2^_\b\4"+
		"\1\2_a\3\2\2\2`T\3\2\2\2`X\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\7\3"+
		"\2\2\2db\3\2\2\2ef\7%\2\2fg\7&\2\2gh\7\t\2\2hi\5,\27\2ij\b\5\1\2j\t\3"+
		"\2\2\2kp\b\6\1\2lm\f\4\2\2mo\5\f\7\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3"+
		"\2\2\2q\13\3\2\2\2rp\3\2\2\2st\7%\2\2tu\7&\2\2uv\b\7\1\2vw\7\n\2\2wx\5"+
		"\16\b\2xy\7\13\2\2yz\b\7\1\2z{\5\20\t\2{|\5$\23\2|}\b\7\1\2}\u008a\3\2"+
		"\2\2~\177\7\33\2\2\177\u0080\7&\2\2\u0080\u0081\b\7\1\2\u0081\u0082\7"+
		"\n\2\2\u0082\u0083\5\16\b\2\u0083\u0084\7\13\2\2\u0084\u0085\b\7\1\2\u0085"+
		"\u0086\5\20\t\2\u0086\u0087\5$\23\2\u0087\u0088\b\7\1\2\u0088\u008a\3"+
		"\2\2\2\u0089s\3\2\2\2\u0089~\3\2\2\2\u008a\r\3\2\2\2\u008b\u008c\b\b\1"+
		"\2\u008c\u008d\7%\2\2\u008d\u008e\7&\2\2\u008e\u0091\b\b\1\2\u008f\u0091"+
		"\b\b\1\2\u0090\u008b\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0099\3\2\2\2\u0092"+
		"\u0093\f\5\2\2\u0093\u0094\7\6\2\2\u0094\u0095\7%\2\2\u0095\u0096\7&\2"+
		"\2\u0096\u0098\b\b\1\2\u0097\u0092\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\17\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009d\7\3\2\2\u009d\u009e\b\t\1\2\u009e\u009f\5\22\n\2\u009f\u00a0\5"+
		"\26\f\2\u00a0\u00a1\7\4\2\2\u00a1\u00a2\b\t\1\2\u00a2\21\3\2\2\2\u00a3"+
		"\u00ab\b\n\1\2\u00a4\u00a5\f\4\2\2\u00a5\u00a6\5\24\13\2\u00a6\u00a7\7"+
		"\5\2\2\u00a7\u00a8\b\n\1\2\u00a8\u00aa\3\2\2\2\u00a9\u00a4\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\23\3\2\2"+
		"\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\b\13\1\2\u00af\u00b0\7%\2\2\u00b0\u00b1"+
		"\7&\2\2\u00b1\u00b2\b\13\1\2\u00b2\u00b9\3\2\2\2\u00b3\u00b4\f\4\2\2\u00b4"+
		"\u00b5\7\6\2\2\u00b5\u00b6\7&\2\2\u00b6\u00b8\b\13\1\2\u00b7\u00b3\3\2"+
		"\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\25\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\b\f\1\2\u00bd\u00be\b\f\1"+
		"\2\u00be\u00c6\3\2\2\2\u00bf\u00c0\f\4\2\2\u00c0\u00c1\5$\23\2\u00c1\u00c2"+
		"\5\30\r\2\u00c2\u00c3\b\f\1\2\u00c3\u00c5\3\2\2\2\u00c4\u00bf\3\2\2\2"+
		"\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\27"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\5(\25\2\u00ca\u00cb\5.\30\2\u00cb"+
		"\u00cc\5\32\16\2\u00cc\u00cd\7\5\2\2\u00cd\u00ce\b\r\1\2\u00ce\u00fb\3"+
		"\2\2\2\u00cf\u00d0\7\34\2\2\u00d0\u00d1\7\n\2\2\u00d1\u00d2\5\32\16\2"+
		"\u00d2\u00d3\7\13\2\2\u00d3\u00d4\5$\23\2\u00d4\u00d5\5\20\t\2\u00d5\u00d6"+
		"\b\r\1\2\u00d6\u00fb\3\2\2\2\u00d7\u00d8\7\34\2\2\u00d8\u00d9\7\n\2\2"+
		"\u00d9\u00da\5\32\16\2\u00da\u00db\7\13\2\2\u00db\u00dc\5$\23\2\u00dc"+
		"\u00dd\5\20\t\2\u00dd\u00de\5&\24\2\u00de\u00df\7\35\2\2\u00df\u00e0\5"+
		"$\23\2\u00e0\u00e1\5\20\t\2\u00e1\u00e2\b\r\1\2\u00e2\u00fb\3\2\2\2\u00e3"+
		"\u00e4\7\37\2\2\u00e4\u00e5\7\5\2\2\u00e5\u00fb\b\r\1\2\u00e6\u00e7\7"+
		" \2\2\u00e7\u00e8\7\5\2\2\u00e8\u00fb\b\r\1\2\u00e9\u00ea\5\20\t\2\u00ea"+
		"\u00eb\b\r\1\2\u00eb\u00fb\3\2\2\2\u00ec\u00ed\7\36\2\2\u00ed\u00ee\7"+
		"\5\2\2\u00ee\u00fb\b\r\1\2\u00ef\u00f0\7\36\2\2\u00f0\u00f1\7\n\2\2\u00f1"+
		"\u00f2\5\32\16\2\u00f2\u00f3\7\13\2\2\u00f3\u00f4\7\5\2\2\u00f4\u00f5"+
		"\b\r\1\2\u00f5\u00fb\3\2\2\2\u00f6\u00f7\5\34\17\2\u00f7\u00f8\7\5\2\2"+
		"\u00f8\u00f9\b\r\1\2\u00f9\u00fb\3\2\2\2\u00fa\u00c9\3\2\2\2\u00fa\u00cf"+
		"\3\2\2\2\u00fa\u00d7\3\2\2\2\u00fa\u00e3\3\2\2\2\u00fa\u00e6\3\2\2\2\u00fa"+
		"\u00e9\3\2\2\2\u00fa\u00ec\3\2\2\2\u00fa\u00ef\3\2\2\2\u00fa\u00f6\3\2"+
		"\2\2\u00fb\31\3\2\2\2\u00fc\u00fd\b\16\1\2\u00fd\u00fe\5,\27\2\u00fe\u00ff"+
		"\b\16\1\2\u00ff\u011e\3\2\2\2\u0100\u0101\5(\25\2\u0101\u0102\b\16\1\2"+
		"\u0102\u011e\3\2\2\2\u0103\u0104\7\n\2\2\u0104\u0105\5\32\16\2\u0105\u0106"+
		"\7\13\2\2\u0106\u0107\b\16\1\2\u0107\u011e\3\2\2\2\u0108\u0109\7)\2\2"+
		"\u0109\u010a\5\32\16\21\u010a\u010b\b\16\1\2\u010b\u011e\3\2\2\2\u010c"+
		"\u010d\7\23\2\2\u010d\u010e\5\32\16\7\u010e\u010f\b\16\1\2\u010f\u011e"+
		"\3\2\2\2\u0110\u0111\7&\2\2\u0111\u0112\7\n\2\2\u0112\u0113\5\36\20\2"+
		"\u0113\u0114\7\13\2\2\u0114\u0115\b\16\1\2\u0115\u011e\3\2\2\2\u0116\u0117"+
		"\7!\2\2\u0117\u0118\7\n\2\2\u0118\u0119\7\30\2\2\u0119\u011a\5\"\22\2"+
		"\u011a\u011b\7\13\2\2\u011b\u011c\b\16\1\2\u011c\u011e\3\2\2\2\u011d\u00fc"+
		"\3\2\2\2\u011d\u0100\3\2\2\2\u011d\u0103\3\2\2\2\u011d\u0108\3\2\2\2\u011d"+
		"\u010c\3\2\2\2\u011d\u0110\3\2\2\2\u011d\u0116\3\2\2\2\u011e\u015a\3\2"+
		"\2\2\u011f\u0120\f\20\2\2\u0120\u0121\7(\2\2\u0121\u0122\5\32\16\21\u0122"+
		"\u0123\b\16\1\2\u0123\u0159\3\2\2\2\u0124\u0125\f\17\2\2\u0125\u0126\7"+
		")\2\2\u0126\u0127\5\32\16\20\u0127\u0128\b\16\1\2\u0128\u0159\3\2\2\2"+
		"\u0129\u012a\f\16\2\2\u012a\u012b\7\f\2\2\u012b\u012c\5\32\16\17\u012c"+
		"\u012d\b\16\1\2\u012d\u0159\3\2\2\2\u012e\u012f\f\r\2\2\u012f\u0130\7"+
		"\r\2\2\u0130\u0131\5\32\16\16\u0131\u0132\b\16\1\2\u0132\u0159\3\2\2\2"+
		"\u0133\u0134\f\f\2\2\u0134\u0135\7\16\2\2\u0135\u0136\5\32\16\r\u0136"+
		"\u0137\b\16\1\2\u0137\u0159\3\2\2\2\u0138\u0139\f\13\2\2\u0139\u013a\7"+
		"\17\2\2\u013a\u013b\5\32\16\f\u013b\u013c\b\16\1\2\u013c\u0159\3\2\2\2"+
		"\u013d\u013e\f\n\2\2\u013e\u013f\7\20\2\2\u013f\u0140\5\32\16\13\u0140"+
		"\u0141\b\16\1\2\u0141\u0159\3\2\2\2\u0142\u0143\f\t\2\2\u0143\u0144\7"+
		"\21\2\2\u0144\u0145\5\32\16\n\u0145\u0146\b\16\1\2\u0146\u0159\3\2\2\2"+
		"\u0147\u0148\f\b\2\2\u0148\u0149\7\22\2\2\u0149\u014a\5\32\16\t\u014a"+
		"\u014b\b\16\1\2\u014b\u0159\3\2\2\2\u014c\u014d\f\6\2\2\u014d\u014e\7"+
		"\24\2\2\u014e\u014f\5$\23\2\u014f\u0150\5\32\16\7\u0150\u0151\b\16\1\2"+
		"\u0151\u0159\3\2\2\2\u0152\u0153\f\5\2\2\u0153\u0154\7\25\2\2\u0154\u0155"+
		"\5$\23\2\u0155\u0156\5\32\16\6\u0156\u0157\b\16\1\2\u0157\u0159\3\2\2"+
		"\2\u0158\u011f\3\2\2\2\u0158\u0124\3\2\2\2\u0158\u0129\3\2\2\2\u0158\u012e"+
		"\3\2\2\2\u0158\u0133\3\2\2\2\u0158\u0138\3\2\2\2\u0158\u013d\3\2\2\2\u0158"+
		"\u0142\3\2\2\2\u0158\u0147\3\2\2\2\u0158\u014c\3\2\2\2\u0158\u0152\3\2"+
		"\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\33\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7&\2\2\u015e\u015f\7\n\2\2"+
		"\u015f\u0160\5\36\20\2\u0160\u0161\7\13\2\2\u0161\u0162\b\17\1\2\u0162"+
		"\u016b\3\2\2\2\u0163\u0164\7!\2\2\u0164\u0165\7\n\2\2\u0165\u0166\7\30"+
		"\2\2\u0166\u0167\5\"\22\2\u0167\u0168\7\13\2\2\u0168\u0169\b\17\1\2\u0169"+
		"\u016b\3\2\2\2\u016a\u015d\3\2\2\2\u016a\u0163\3\2\2\2\u016b\35\3\2\2"+
		"\2\u016c\u016d\5 \21\2\u016d\u016e\b\20\1\2\u016e\u0171\3\2\2\2\u016f"+
		"\u0171\b\20\1\2\u0170\u016c\3\2\2\2\u0170\u016f\3\2\2\2\u0171\37\3\2\2"+
		"\2\u0172\u0173\b\21\1\2\u0173\u0174\5\32\16\2\u0174\u0175\b\21\1\2\u0175"+
		"\u017d\3\2\2\2\u0176\u0177\f\4\2\2\u0177\u0178\7\6\2\2\u0178\u0179\5\32"+
		"\16\2\u0179\u017a\b\21\1\2\u017a\u017c\3\2\2\2\u017b\u0176\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e!\3\2\2\2"+
		"\u017f\u017d\3\2\2\2\u0180\u0181\b\22\1\2\u0181\u0182\b\22\1\2\u0182\u018e"+
		"\3\2\2\2\u0183\u0184\f\5\2\2\u0184\u0185\7\6\2\2\u0185\u0186\5\32\16\2"+
		"\u0186\u0187\b\22\1\2\u0187\u018d\3\2\2\2\u0188\u0189\f\4\2\2\u0189\u018a"+
		"\7\6\2\2\u018a\u018b\7\30\2\2\u018b\u018d\b\22\1\2\u018c\u0183\3\2\2\2"+
		"\u018c\u0188\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f#\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\b\23\1\2\u0192"+
		"%\3\2\2\2\u0193\u0194\b\24\1\2\u0194\'\3\2\2\2\u0195\u0196\7&\2\2\u0196"+
		"\u019e\b\25\1\2\u0197\u0198\7&\2\2\u0198\u0199\7\7\2\2\u0199\u019a\5\32"+
		"\16\2\u019a\u019b\7\b\2\2\u019b\u019c\b\25\1\2\u019c\u019e\3\2\2\2\u019d"+
		"\u0195\3\2\2\2\u019d\u0197\3\2\2\2\u019e)\3\2\2\2\u019f\u01a0\7\"\2\2"+
		"\u01a0\u01a4\b\26\1\2\u01a1\u01a2\7#\2\2\u01a2\u01a4\b\26\1\2\u01a3\u019f"+
		"\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4+\3\2\2\2\u01a5\u01a6\5*\26\2\u01a6"+
		"\u01a7\b\27\1\2\u01a7\u01ad\3\2\2\2\u01a8\u01a9\7\27\2\2\u01a9\u01ad\b"+
		"\27\1\2\u01aa\u01ab\7$\2\2\u01ab\u01ad\b\27\1\2\u01ac\u01a5\3\2\2\2\u01ac"+
		"\u01a8\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad-\3\2\2\2\u01ae\u01af\t\2\2\2"+
		"\u01af/\3\2\2\2\32BDR`bp\u0089\u0090\u0099\u00ab\u00b9\u00c6\u00fa\u011d"+
		"\u0158\u015a\u016a\u0170\u017d\u018c\u018e\u019d\u01a3\u01ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}