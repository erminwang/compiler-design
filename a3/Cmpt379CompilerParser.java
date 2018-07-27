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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		WhiteSpace=18, Char=19, Str=20, Class=21, Program=22, Void=23, While=24, 
		Switch=25, Case=26, If=27, Else=28, For=29, Ret=30, Brk=31, Cnt=32, Callout=33, 
		DecNum=34, HexNum=35, BoolLit=36, Type=37, Ident=38, RelOp=39, AssignOp=40, 
		Minus=41, SecondOp=42, ThirdOp=43, CondOp=44;
	public static final int
		RULE_prog = 0, RULE_field_decls = 1, RULE_field_decl = 2, RULE_method_decl = 3, 
		RULE_block = 4, RULE_var_decls = 5, RULE_var_decl = 6, RULE_statements = 7, 
		RULE_statement = 8, RULE_m = 9, RULE_n = 10, RULE_bool_expr = 11, RULE_expr = 12, 
		RULE_location = 13, RULE_intLit = 14, RULE_literal = 15, RULE_eqOp = 16, 
		RULE_mathOp = 17, RULE_boolOp = 18, RULE_binOp = 19;
	public static final String[] ruleNames = {
		"prog", "field_decls", "field_decl", "method_decl", "block", "var_decls", 
		"var_decl", "statements", "statement", "m", "n", "bool_expr", "expr", 
		"location", "intLit", "literal", "eqOp", "mathOp", "boolOp", "binOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", "'['", "']'", "'('", "')'", "'='", "'&&'", 
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

	@Override
	public String getGrammarFileName() { return "Cmpt379Compiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public enum DataType {
		INT, BOOLEAN, INVALID, CHAR, ARRAY, VOID
	}





	public class Symbol {

		String name;
		DataType dt;

		Symbol (String n, DataType d) {
			name = n;
			dt = d;
		}

		Symbol (int id, DataType d) {
			name = "t_" + id;
			dt = d;
		}

		boolean Equal (String n) {
			return (name.equals(n));
		}

		DataType GetType () {
			return dt;
		}

		String GetName () {
			return name;
		}

		void Print() {
			System.out.println(name + "\t" + dt);
		}



	}

	public class SymTab {

		Symbol st[];
		int size;
		int temps;

		SymTab () {
			st = new Symbol[1000];
			size = 0;
			temps = 0;
		}

		// Find the index of n
		int Find (String n) {
			for (int  i = 0; i < size; i ++) {
				if (st[i].Equal(n)) return i;
			}

			return -1;
		}

		int insert(String n, DataType d) {
			int id = Find(n);
			if (id != -1) return id;

			st[size] = new Symbol(n, d);
			return (size ++);
		}

		int Add (DataType d) {
			st [size] = new Symbol (temps, d);
			temps ++;
			return (size ++);
		}

		DataType GetType (int id) {
			if (id == -1) return DataType.INVALID;
			return (st[id].GetType());
		}


		// dst: -2 -> if
		String GetName (int id) {
			if (id == -1) {
				return ("");
			}
			/* else if (id == -2) {
				return "if";
			} else if () */
			return (st[id].GetName());
		}

		void Print() {
			for (int  i = 0; i < size; i ++) {
				st[i].Print();
			}
		}





	}

	SymTab s = new SymTab();



	public class Quad {

		int label;
		String op;
		int src1;
		int src2;
		int dst;


		Quad (int l, int d, int s1, int s2, String o) {
			label = l;
			dst = d;
			src1 = s1;
			src2 = s2;
			op = o;
		}

		void BackPatchSrc2(int instNum) {
			src2 = instNum;
		}

		/* void Print () {
			if(op.equals("=") && s.GetName(src2).equals("")) {
				System.out.println("L_" + label + ": " + s.GetName(dst) + " = "
						+ s.GetName(src1));
			} else {
				System.out.println("L_" + label + ": " + s.GetName(dst) + " = "
						+ s.GetName(src1) + " " + op + " " + s.GetName(src2));
			}
		} */

		void Print () {
			if (dst == -2) {
				System.out.println("L_" + label + ": " + "if" + " " + s.GetName(src1)
								+ " " + "goto" + " " + "L_" + src2);
			}else if (dst == -3) {
				System.out.println("L_" + label + ": " + "ifFalse" + " " + s.GetName(src1)
								+ " " + "goto" + " " + "L_" + src2);
			}else if (src1 == -5) { //print t_6 = fun call 0
				System.out.println("L_" + label + ": " + s.GetName(dst) + " = "
				   + op + " call " + src2);
			}else if (dst == -6) {//dst = -6 means callout function---= "printf" call 2
				System.out.println("L_" + label + ":  = " + op  + " call " + src2);
			}else if (dst == -7) {//-7 means function param---t_6 param
				System.out.println("L_" + label + ": " + s.GetName(src1) + " param");
			}else if (dst == -8) {//-8 means string param when printing--"a = %d\n" param
				System.out.println("L_" + label + ": " + op + " param");
			}else if (dst == -1 && src1 == -1) {    // goto L_7
				System.out.println("L_" + label + ": " + "goto " + "L_" + src2);
			}else if (src2 == -4 && dst == -1) {
				System.out.println("L_" + label + ":   = " + s.GetName(src1) + " ret");
			}else if (src2 == -1) { //it's Assignment op a = b
				System.out.println("L_" + label + ": " + s.GetName(dst) + " = "
						+ s.GetName(src1));
			}else {
				System.out.println("L_" + label + ": " + s.GetName(dst) + " = "
						+ s.GetName(src1) + " " + op + " " + s.GetName(src2));
			}

		}

	}

	// store 3-address codes
	public class QuadTab {

		Quad qt[];
		int size;

		QuadTab () {
			qt = new Quad[1000];
			size = 0;
		}

		void PatchSrc2(int index, int instNum) {
				qt[index].BackPatchSrc2(instNum);
		}

		int Add(int dst, int src1, int src2, String op) {

			qt[size] = new Quad(size, dst, src1, src2, op);
			return (size ++);
		}

		void PrintQT() {
			System.out.println(">>>>>>printingQT>>>>>>>");
			Print();
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<");
		}

		void Print() {
			for (int  i = 0; i < size; i ++) {
				qt[i].Print();
			}
		}


	}



	QuadTab q = new QuadTab();


	public class InstructionSet {

		int[] truelist;
		int[] falselist;
		int sizet;
		int sizef;
		int mlabel;
		int valid;

		InstructionSet () {
			truelist = new int[50];
			falselist = new int[50];
			sizet = 0;
			sizef = 0;
			mlabel = 0;
			valid = 0;

			for(int i = 0; i < 50; i++) {
				truelist[i] = -1;
				falselist[i] = -1;
			}

		}

		/* Quad FindQuadByDst() {

		} */

		void AddToTrueList(int inst) {
			truelist[sizet] = inst;
			sizet++;
		}

		void AddToFalseList(int inst) {
			falselist[sizef] = inst;
			sizef++;
		}

		void AddToBothList(int trueInst, int falseInst) {
			truelist[sizet] = trueInst;
			falselist[sizef] = falseInst;
			sizet++;
			sizef++;
		}
	}


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
		public Method_declContext method_decl() {
			return getRuleContext(Method_declContext.class,0);
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
			setState(40);
			match(Class);
			setState(41);
			match(Program);
			setState(42);
			match(T__0);
			setState(43);
			field_decls(0);
			setState(44);
			method_decl();
			setState(45);
			match(T__1);

				s.Print();
				System.out.println("------------------------------------");
				q.Print();

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
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Field_declsContext(_parentctx, _parentState);
					_localctx.f = _prevctx;
					_localctx.f = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_field_decls);
					setState(49);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(50);
					field_decl(0);
					setState(51);
					match(T__2);
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(59);
				((Field_declContext)_localctx).Type = match(Type);
				setState(60);
				((Field_declContext)_localctx).Ident = match(Ident);

					((Field_declContext)_localctx).t =  DataType.valueOf((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null).toUpperCase());
					s.insert((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null), _localctx.t);

				}
				break;
			case 2:
				{
				setState(62);
				((Field_declContext)_localctx).Type = match(Type);
				setState(63);
				((Field_declContext)_localctx).Ident = match(Ident);
				setState(64);
				match(T__4);
				setState(65);
				intLit();
				setState(66);
				match(T__5);

					((Field_declContext)_localctx).t =  DataType.valueOf((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null).toUpperCase());
					s.insert((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null), _localctx.t);

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
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
					setState(71);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(72);
					match(T__3);
					setState(73);
					((Field_declContext)_localctx).Ident = match(Ident);

					          	((Field_declContext)_localctx).t =  ((Field_declContext)_localctx).f.t;
					          	s.insert((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null), _localctx.t);
					          
					}
					} 
				}
				setState(79);
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

	public static class Method_declContext extends ParserRuleContext {
		public Token Type;
		public Token Ident;
		public Token Void;
		public TerminalNode Type() { return getToken(Cmpt379CompilerParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
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
		enterRule(_localctx, 6, RULE_method_decl);
		try {
			setState(94);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				((Method_declContext)_localctx).Type = match(Type);
				setState(81);
				((Method_declContext)_localctx).Ident = match(Ident);
				setState(82);
				match(T__6);
				setState(83);
				match(T__7);
				setState(84);
				block();

					s.insert((((Method_declContext)_localctx).Ident!=null?((Method_declContext)_localctx).Ident.getText():null), DataType.valueOf((((Method_declContext)_localctx).Type!=null?((Method_declContext)_localctx).Type.getText():null).toUpperCase()));

				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				((Method_declContext)_localctx).Void = match(Void);
				setState(88);
				((Method_declContext)_localctx).Ident = match(Ident);
				setState(89);
				match(T__6);
				setState(90);
				match(T__7);
				setState(91);
				block();

					s.insert((((Method_declContext)_localctx).Ident!=null?((Method_declContext)_localctx).Ident.getText():null), DataType.valueOf((((Method_declContext)_localctx).Void!=null?((Method_declContext)_localctx).Void.getText():null).toUpperCase()));

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

	public static class BlockContext extends ParserRuleContext {
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
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__0);
			setState(97);
			var_decls(0);
			setState(98);
			statements();
			setState(99);
			match(T__1);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_var_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
					setState(102);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(103);
					var_decl(0);
					setState(104);
					match(T__2);
					}
					} 
				}
				setState(110);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_var_decl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(112);
			((Var_declContext)_localctx).Type = match(Type);
			setState(113);
			((Var_declContext)_localctx).Ident = match(Ident);

				((Var_declContext)_localctx).t =  DataType.valueOf((((Var_declContext)_localctx).Type!=null?((Var_declContext)_localctx).Type.getText():null).toUpperCase());
				s.insert((((Var_declContext)_localctx).Ident!=null?((Var_declContext)_localctx).Ident.getText():null), _localctx.t);


			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
					setState(116);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(117);
					match(T__3);
					setState(118);
					((Var_declContext)_localctx).Ident = match(Ident);

					          	((Var_declContext)_localctx).t =  ((Var_declContext)_localctx).v.t;
					          	s.insert((((Var_declContext)_localctx).Ident!=null?((Var_declContext)_localctx).Ident.getText():null), _localctx.t);
					          
					}
					} 
				}
				setState(124);
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

	public static class StatementsContext extends ParserRuleContext {
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
		enterRule(_localctx, 14, RULE_statements);
		try {
			setState(129);
			switch (_input.LA(1)) {
			case T__0:
			case If:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				statement();
				setState(126);
				((StatementsContext)_localctx).t = statements();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
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
		public LocationContext location;
		public ExprContext expr;
		public Bool_exprContext bool_expr;
		public MContext m;
		public Bool_exprContext b;
		public MContext m1;
		public BlockContext b1;
		public NContext n;
		public MContext m2;
		public BlockContext b2;
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode If() { return getToken(Cmpt379CompilerParser.If, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<MContext> m() {
			return getRuleContexts(MContext.class);
		}
		public MContext m(int i) {
			return getRuleContext(MContext.class,i);
		}
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public TerminalNode Else() { return getToken(Cmpt379CompilerParser.Else, 0); }
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
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				((StatementContext)_localctx).location = location();
				setState(132);
				match(T__8);
				setState(133);
				((StatementContext)_localctx).expr = expr(0);
				setState(134);
				match(T__2);

					q.Add(((StatementContext)_localctx).location.id, ((StatementContext)_localctx).expr.id, -1, "=");

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				block();



				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(If);
				setState(141);
				match(T__6);
				setState(142);
				((StatementContext)_localctx).bool_expr = bool_expr(0);
				setState(143);
				match(T__7);
				setState(144);
				((StatementContext)_localctx).m = m();
				setState(145);
				block();

					if(((StatementContext)_localctx).bool_expr.is.truelist[0] != -1) {
						int trueId = ((((StatementContext)_localctx).bool_expr.is).truelist)[0];
						q.PatchSrc2(trueId, ((StatementContext)_localctx).m.id);
						/* System.out.println("trueId is : " + trueId);
						System.out.println("((StatementContext)_localctx).m.id is : " + ((StatementContext)_localctx).m.id); */
					}

					//-3 means iffalse goto qaud entry
					if(((StatementContext)_localctx).bool_expr.is.falselist[0] != -1) {
						int falseId = ((((StatementContext)_localctx).bool_expr.is).falselist)[0];
						q.PatchSrc2(falseId, q.size);
						/* System.out.println("q.size is : " + q.size); */
						/* System.out.println("falseId is : " + falseId); */
					}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(If);
				setState(149);
				match(T__6);
				setState(150);
				((StatementContext)_localctx).b = bool_expr(0);
				setState(151);
				match(T__7);
				setState(152);
				((StatementContext)_localctx).m1 = m();
				setState(153);
				((StatementContext)_localctx).b1 = block();
				setState(154);
				((StatementContext)_localctx).n = n();
				setState(155);
				match(Else);
				setState(156);
				((StatementContext)_localctx).m2 = m();
				setState(157);
				((StatementContext)_localctx).b2 = block();


					for (int i = 0; i < ((StatementContext)_localctx).b.is.sizet; i++) {
						if (((StatementContext)_localctx).b.is.truelist[i] != -1) {
							q.PatchSrc2(((StatementContext)_localctx).b.is.truelist[i], ((StatementContext)_localctx).m1.id);
						}
					}

					for (int i = 0; i < ((StatementContext)_localctx).b.is.sizef; i++) {
						if (((StatementContext)_localctx).b.is.falselist[i] != -1) {
							q.PatchSrc2(((StatementContext)_localctx).b.is.falselist[i], ((StatementContext)_localctx).m2.id);
						}
					}

					//Patch goto L_7 after c = t_1

					int nid = ((StatementContext)_localctx).n.id;
					System.out.println("nid : " + nid);
					q.PatchSrc2(nid, q.size);


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

	public static class MContext extends ParserRuleContext {
		public int id;
		public MContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitM(this);
		}
	}

	public final MContext m() throws RecognitionException {
		MContext _localctx = new MContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_m);
		try {
			enterOuterAlt(_localctx, 1);
			{

				((MContext)_localctx).id =  q.size;

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

	public static class NContext extends ParserRuleContext {
		public int id;
		public NContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitN(this);
		}
	}

	public final NContext n() throws RecognitionException {
		NContext _localctx = new NContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_n);
		try {
			enterOuterAlt(_localctx, 1);
			{

				// add goto L_ before else statement
				((NContext)_localctx).id =  q.size;
				q.Add(-1, -1, -1, "goto");

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

	public static class Bool_exprContext extends ParserRuleContext {
		public InstructionSet is;
		public Bool_exprContext b1;
		public ExprContext e1;
		public Token RelOp;
		public ExprContext e2;
		public IntLitContext intLit;
		public Token Ident;
		public Bool_exprContext b2;
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode RelOp() { return getToken(Cmpt379CompilerParser.RelOp, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitBool_expr(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_bool_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(167);
				match(T__11);
				setState(168);
				((Bool_exprContext)_localctx).b1 = bool_expr(7);



				}
				break;
			case 2:
				{
				setState(171);
				match(T__6);
				setState(172);
				((Bool_exprContext)_localctx).b1 = bool_expr(0);
				setState(173);
				match(T__7);



				}
				break;
			case 3:
				{
				setState(176);
				((Bool_exprContext)_localctx).e1 = expr(0);
				setState(177);
				((Bool_exprContext)_localctx).RelOp = match(RelOp);
				setState(178);
				((Bool_exprContext)_localctx).e2 = expr(0);

					//add t_0 to symbol table
					int id = s.Add(DataType.INT);
					//t_0 = a > 0
					q.Add(id, ((Bool_exprContext)_localctx).e1.id, ((Bool_exprContext)_localctx).e2.id, (((Bool_exprContext)_localctx).RelOp!=null?((Bool_exprContext)_localctx).RelOp.getText():null));
					InstructionSet instructionSet = new InstructionSet();

					// TODO: change to use "AddToBothList"
					instructionSet.AddToTrueList(q.size);

					q.PrintQT();
					System.out.println("-----: " + q.size);
					//-2 refers to
					//int dest1 = q.size + 2;
					q.Add(-2, id, -1, "goto");
					//-3 means iffalse
					//int dest1 = q.size+2;
					instructionSet.AddToFalseList(q.size);
					q.Add(-3, id, -1, "goto");

					((Bool_exprContext)_localctx).is =  instructionSet;

				}
				break;
			case 4:
				{
				setState(181);
				match(T__12);

					InstructionSet instructionSet = new InstructionSet();
					instructionSet.AddToTrueList(q.size);
					instructionSet.valid = -1;
					((Bool_exprContext)_localctx).is =  instructionSet;
					q.Add(-1, -1, -1, "goto");

				}
				break;
			case 5:
				{
				setState(183);
				match(T__13);

					InstructionSet instructionSet = new InstructionSet();
					instructionSet.AddToFalseList(q.size);
					((Bool_exprContext)_localctx).is =  instructionSet;
					q.Add(-1, -1, -1, "goto");

				}
				break;
			case 6:
				{
				setState(185);
				((Bool_exprContext)_localctx).intLit = intLit();

					InstructionSet instructionSet = new InstructionSet();
					System.out.println("intLit.text is : " + (((Bool_exprContext)_localctx).intLit!=null?_input.getText(((Bool_exprContext)_localctx).intLit.start,((Bool_exprContext)_localctx).intLit.stop):null));
					if((((Bool_exprContext)_localctx).intLit!=null?_input.getText(((Bool_exprContext)_localctx).intLit.start,((Bool_exprContext)_localctx).intLit.stop):null).equals("0")) {
						instructionSet.AddToFalseList(q.size);
					} else {
						instructionSet.AddToTrueList(q.size);
					}
					((Bool_exprContext)_localctx).is =  instructionSet;
					q.Add(-1, -1, -1, "goto");

				}
				break;
			case 7:
				{
				setState(188);
				((Bool_exprContext)_localctx).Ident = match(Ident);

					int id = s.Add(DataType.INT);
					int identId = s.Find((((Bool_exprContext)_localctx).Ident!=null?((Bool_exprContext)_localctx).Ident.getText():null));
					q.Add(id, identId, -1, "");
					InstructionSet instructionSet = new InstructionSet();

					instructionSet.AddToTrueList(q.size);
					q.Add(-2, id, -1, "goto");
					instructionSet.AddToFalseList(q.size);
					q.Add(-3, id, -1, "goto");
					((Bool_exprContext)_localctx).is =  instructionSet;

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Bool_exprContext(_parentctx, _parentState);
						_localctx.b1 = _prevctx;
						_localctx.b1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
						setState(192);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(193);
						match(T__9);
						setState(194);
						((Bool_exprContext)_localctx).b2 = bool_expr(10);


						          
						}
						break;
					case 2:
						{
						_localctx = new Bool_exprContext(_parentctx, _parentState);
						_localctx.b1 = _prevctx;
						_localctx.b1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
						setState(197);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(198);
						match(T__10);
						setState(199);
						((Bool_exprContext)_localctx).b2 = bool_expr(9);


						          
						}
						break;
					}
					} 
				}
				setState(206);
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

	public static class ExprContext extends ParserRuleContext {
		public int id;
		public ExprContext e1;
		public LiteralContext literal;
		public Token Ident;
		public ExprContext e2;
		public Token CondOp;
		public Token RelOp;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CondOp() { return getToken(Cmpt379CompilerParser.CondOp, 0); }
		public TerminalNode RelOp() { return getToken(Cmpt379CompilerParser.RelOp, 0); }
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(208);
				((ExprContext)_localctx).literal = literal();

					((ExprContext)_localctx).id =  ((ExprContext)_localctx).literal.id;

				}
				break;
			case 2:
				{
				setState(211);
				((ExprContext)_localctx).Ident = match(Ident);

					((ExprContext)_localctx).id =  s.Find((((ExprContext)_localctx).Ident!=null?((ExprContext)_localctx).Ident.getText():null));

				}
				break;
			case 3:
				{
				setState(213);
				((ExprContext)_localctx).Ident = match(Ident);
				setState(214);
				match(T__4);
				setState(215);
				((ExprContext)_localctx).e1 = expr(0);
				setState(216);
				match(T__5);

					int id1 = -1;
					int id2 = -1;
					int id3 = -1;

					int identIndex = s.Find((((ExprContext)_localctx).Ident!=null?((ExprContext)_localctx).Ident.getText():null));
					DataType identType = s.GetType(identIndex);

					DataType exprType = s.GetType(((ExprContext)_localctx).e1.id);

					id1 = s.Add(s.GetType(((ExprContext)_localctx).e1.id));

					id2 = identType == DataType.INT ? s.insert("4", exprType) : s.insert("1", exprType);
					//Add a new symbol t_ to hold a[1]
					id3 = s.Add(s.GetType(((ExprContext)_localctx).e1.id));


					//add a new quad entry t_0 = 4*1
					q.Add(id1, id2, ((ExprContext)_localctx).e1.id, "*");

					//add a new symbol a[t_1] to the symbol table
					String newSymbol = new String((((ExprContext)_localctx).Ident!=null?((ExprContext)_localctx).Ident.getText():null) + "[ " + s.GetName(id1) + " ]");
					((ExprContext)_localctx).id =  s.insert(newSymbol, DataType.ARRAY);

					q.Add(id3, _localctx.id, -1, "="); //t_2 = a[t_1]
					((ExprContext)_localctx).id =  id3;

				}
				break;
			case 4:
				{
				setState(219);
				match(T__6);
				setState(220);
				((ExprContext)_localctx).e1 = expr(0);
				setState(221);
				match(T__7);

					((ExprContext)_localctx).id =  ((ExprContext)_localctx).e1.id;

				}
				break;
			case 5:
				{
				setState(224);
				match(Minus);
				setState(225);
				((ExprContext)_localctx).e1 = expr(8);

					int id = s.insert("0", s.GetType(((ExprContext)_localctx).e1.id));
					((ExprContext)_localctx).id =  s.Add(s.GetType(((ExprContext)_localctx).e1.id));
					q.Add(_localctx.id, id, ((ExprContext)_localctx).e1.id, "-");

				}
				break;
			case 6:
				{
				setState(228);
				match(T__11);
				setState(229);
				((ExprContext)_localctx).e1 = expr(1);

					// TODO: need modification
					((ExprContext)_localctx).id =  s.Add(s.GetType(((ExprContext)_localctx).e1.id));
					q.Add(_localctx.id, ((ExprContext)_localctx).e1.id, -1, "!");

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(264);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(235);
						match(T__14);
						setState(236);
						((ExprContext)_localctx).e2 = expr(8);

						          	((ExprContext)_localctx).id =  s.Add(s.GetType(((ExprContext)_localctx).e1.id));
						          	q.Add(_localctx.id, ((ExprContext)_localctx).e1.id, ((ExprContext)_localctx).e2.id, "*");
						          
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(240);
						match(T__15);
						setState(241);
						((ExprContext)_localctx).e2 = expr(7);

						          	((ExprContext)_localctx).id =  s.Add(s.GetType(((ExprContext)_localctx).e1.id));
						          	q.Add(_localctx.id, ((ExprContext)_localctx).e1.id, ((ExprContext)_localctx).e2.id, "/");
						          
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(245);
						match(T__16);
						setState(246);
						((ExprContext)_localctx).e2 = expr(6);

						          	((ExprContext)_localctx).id =  s.Add(s.GetType(((ExprContext)_localctx).e1.id));
						          	q.Add(_localctx.id, ((ExprContext)_localctx).e1.id, ((ExprContext)_localctx).e2.id, "+");
						          
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(250);
						match(Minus);
						setState(251);
						((ExprContext)_localctx).e2 = expr(5);

						          	((ExprContext)_localctx).id =  s.Add(s.GetType(((ExprContext)_localctx).e1.id));
						          	q.Add(_localctx.id, ((ExprContext)_localctx).e1.id, ((ExprContext)_localctx).e2.id, "-");
						          
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(255);
						((ExprContext)_localctx).CondOp = match(CondOp);
						setState(256);
						((ExprContext)_localctx).e2 = expr(4);

						          	((ExprContext)_localctx).id =  s.Add(s.GetType(((ExprContext)_localctx).e1.id));
						          	q.Add(_localctx.id, ((ExprContext)_localctx).e1.id, ((ExprContext)_localctx).e2.id, (((ExprContext)_localctx).CondOp!=null?((ExprContext)_localctx).CondOp.getText():null));
						          
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(260);
						((ExprContext)_localctx).RelOp = match(RelOp);
						setState(261);
						((ExprContext)_localctx).e2 = expr(3);

						          	((ExprContext)_localctx).id =  s.Add(s.GetType(((ExprContext)_localctx).e1.id));
						          	q.Add(_localctx.id, ((ExprContext)_localctx).e1.id, ((ExprContext)_localctx).e2.id, (((ExprContext)_localctx).RelOp!=null?((ExprContext)_localctx).RelOp.getText():null));
						          
						}
						break;
					}
					} 
				}
				setState(268);
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
		enterRule(_localctx, 26, RULE_location);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				((LocationContext)_localctx).Ident = match(Ident);

					((LocationContext)_localctx).id =  s.Find((((LocationContext)_localctx).Ident!=null?((LocationContext)_localctx).Ident.getText():null));

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				((LocationContext)_localctx).Ident = match(Ident);
				setState(272);
				match(T__4);
				setState(273);
				((LocationContext)_localctx).expr = expr(0);
				setState(274);
				match(T__5);

					int identIndex = s.Find((((LocationContext)_localctx).Ident!=null?((LocationContext)_localctx).Ident.getText():null));
					DataType identType = s.GetType(identIndex);
					int exprId = ((LocationContext)_localctx).expr.id;
					DataType exprType = s.GetType(exprId);

					int id1 = -1;
					int id2 = -1;
					// Add T_ to symtab
					id1 = s.Add(s.GetType(((LocationContext)_localctx).expr.id));
					//Add a new symbol
					id2 = identType == DataType.INT ? s.insert("4", exprType) : s.insert("1", exprType);

					q.Add(id1, id2, exprId, "*");

					String newSym = (((LocationContext)_localctx).Ident!=null?((LocationContext)_localctx).Ident.getText():null) + "[ " + s.GetName(id1) + " ]";
					((LocationContext)_localctx).id =  s.insert(newSym, DataType.ARRAY);

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
		public TerminalNode DecNum() { return getToken(Cmpt379CompilerParser.DecNum, 0); }
		public TerminalNode HexNum() { return getToken(Cmpt379CompilerParser.HexNum, 0); }
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
		enterRule(_localctx, 28, RULE_intLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !(_la==DecNum || _la==HexNum) ) {
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
		public int id;
		public IntLitContext intLit;
		public Token Char;
		public Token BoolLit;
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
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
		enterRule(_localctx, 30, RULE_literal);
		try {
			setState(288);
			switch (_input.LA(1)) {
			case DecNum:
			case HexNum:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				((LiteralContext)_localctx).intLit = intLit();

					((LiteralContext)_localctx).id =  s.insert((((LiteralContext)_localctx).intLit!=null?_input.getText(((LiteralContext)_localctx).intLit.start,((LiteralContext)_localctx).intLit.stop):null), DataType.INT);

				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				((LiteralContext)_localctx).Char = match(Char);

					((LiteralContext)_localctx).id =  s.insert((((LiteralContext)_localctx).Char!=null?((LiteralContext)_localctx).Char.getText():null), DataType.CHAR);

				}
				break;
			case BoolLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				((LiteralContext)_localctx).BoolLit = match(BoolLit);

					((LiteralContext)_localctx).id =  s.insert((((LiteralContext)_localctx).BoolLit!=null?((LiteralContext)_localctx).BoolLit.getText():null), DataType.BOOLEAN);

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
		enterRule(_localctx, 32, RULE_eqOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==AssignOp) ) {
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

	public static class MathOpContext extends ParserRuleContext {
		public TerminalNode SecondOp() { return getToken(Cmpt379CompilerParser.SecondOp, 0); }
		public TerminalNode ThirdOp() { return getToken(Cmpt379CompilerParser.ThirdOp, 0); }
		public MathOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterMathOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitMathOp(this);
		}
	}

	public final MathOpContext mathOp() throws RecognitionException {
		MathOpContext _localctx = new MathOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mathOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !(_la==SecondOp || _la==ThirdOp) ) {
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

	public static class BoolOpContext extends ParserRuleContext {
		public TerminalNode CondOp() { return getToken(Cmpt379CompilerParser.CondOp, 0); }
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitBoolOp(this);
		}
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==CondOp) ) {
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
		public MathOpContext mathOp() {
			return getRuleContext(MathOpContext.class,0);
		}
		public TerminalNode RelOp() { return getToken(Cmpt379CompilerParser.RelOp, 0); }
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
		enterRule(_localctx, 38, RULE_binOp);
		try {
			setState(299);
			switch (_input.LA(1)) {
			case SecondOp:
			case ThirdOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				mathOp();
				}
				break;
			case RelOp:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(RelOp);
				}
				break;
			case CondOp:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				match(CondOp);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return field_decls_sempred((Field_declsContext)_localctx, predIndex);
		case 2:
			return field_decl_sempred((Field_declContext)_localctx, predIndex);
		case 5:
			return var_decls_sempred((Var_declsContext)_localctx, predIndex);
		case 6:
			return var_decl_sempred((Var_declContext)_localctx, predIndex);
		case 11:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean field_decls_sempred(Field_declsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean field_decl_sempred(Field_declContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean var_decls_sempred(Var_declsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean var_decl_sempred(Var_declContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0130\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4H\n\4\3\4\3\4\3\4\3\4\7\4N\n\4\f\4\16\4Q\13\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5a\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\t\3\t\3\t\3\t\5\t\u0084\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a3\n\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c1\n\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u00cd\n\r\f\r\16\r\u00d0\13\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00eb\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u010b\n\16\f\16\16\16\u010e\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0118\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0123\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\5\25\u012e\n"+
		"\25\3\25\2\b\4\6\f\16\30\32\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(\2\6\3\2$%\4\2\13\13**\3\2,-\4\2\16\16..\u013d\2*\3\2\2\2\4\62\3"+
		"\2\2\2\6G\3\2\2\2\b`\3\2\2\2\nb\3\2\2\2\fg\3\2\2\2\16q\3\2\2\2\20\u0083"+
		"\3\2\2\2\22\u00a2\3\2\2\2\24\u00a4\3\2\2\2\26\u00a6\3\2\2\2\30\u00c0\3"+
		"\2\2\2\32\u00ea\3\2\2\2\34\u0117\3\2\2\2\36\u0119\3\2\2\2 \u0122\3\2\2"+
		"\2\"\u0124\3\2\2\2$\u0126\3\2\2\2&\u0128\3\2\2\2(\u012d\3\2\2\2*+\7\27"+
		"\2\2+,\7\30\2\2,-\7\3\2\2-.\5\4\3\2./\5\b\5\2/\60\7\4\2\2\60\61\b\2\1"+
		"\2\61\3\3\2\2\2\629\b\3\1\2\63\64\f\4\2\2\64\65\5\6\4\2\65\66\7\5\2\2"+
		"\668\3\2\2\2\67\63\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\5\3\2\2\2"+
		";9\3\2\2\2<=\b\4\1\2=>\7\'\2\2>?\7(\2\2?H\b\4\1\2@A\7\'\2\2AB\7(\2\2B"+
		"C\7\7\2\2CD\5\36\20\2DE\7\b\2\2EF\b\4\1\2FH\3\2\2\2G<\3\2\2\2G@\3\2\2"+
		"\2HO\3\2\2\2IJ\f\5\2\2JK\7\6\2\2KL\7(\2\2LN\b\4\1\2MI\3\2\2\2NQ\3\2\2"+
		"\2OM\3\2\2\2OP\3\2\2\2P\7\3\2\2\2QO\3\2\2\2RS\7\'\2\2ST\7(\2\2TU\7\t\2"+
		"\2UV\7\n\2\2VW\5\n\6\2WX\b\5\1\2Xa\3\2\2\2YZ\7\31\2\2Z[\7(\2\2[\\\7\t"+
		"\2\2\\]\7\n\2\2]^\5\n\6\2^_\b\5\1\2_a\3\2\2\2`R\3\2\2\2`Y\3\2\2\2a\t\3"+
		"\2\2\2bc\7\3\2\2cd\5\f\7\2de\5\20\t\2ef\7\4\2\2f\13\3\2\2\2gn\b\7\1\2"+
		"hi\f\4\2\2ij\5\16\b\2jk\7\5\2\2km\3\2\2\2lh\3\2\2\2mp\3\2\2\2nl\3\2\2"+
		"\2no\3\2\2\2o\r\3\2\2\2pn\3\2\2\2qr\b\b\1\2rs\7\'\2\2st\7(\2\2tu\b\b\1"+
		"\2u|\3\2\2\2vw\f\4\2\2wx\7\6\2\2xy\7(\2\2y{\b\b\1\2zv\3\2\2\2{~\3\2\2"+
		"\2|z\3\2\2\2|}\3\2\2\2}\17\3\2\2\2~|\3\2\2\2\177\u0080\5\22\n\2\u0080"+
		"\u0081\5\20\t\2\u0081\u0084\3\2\2\2\u0082\u0084\3\2\2\2\u0083\177\3\2"+
		"\2\2\u0083\u0082\3\2\2\2\u0084\21\3\2\2\2\u0085\u0086\5\34\17\2\u0086"+
		"\u0087\7\13\2\2\u0087\u0088\5\32\16\2\u0088\u0089\7\5\2\2\u0089\u008a"+
		"\b\n\1\2\u008a\u00a3\3\2\2\2\u008b\u008c\5\n\6\2\u008c\u008d\b\n\1\2\u008d"+
		"\u00a3\3\2\2\2\u008e\u008f\7\35\2\2\u008f\u0090\7\t\2\2\u0090\u0091\5"+
		"\30\r\2\u0091\u0092\7\n\2\2\u0092\u0093\5\24\13\2\u0093\u0094\5\n\6\2"+
		"\u0094\u0095\b\n\1\2\u0095\u00a3\3\2\2\2\u0096\u0097\7\35\2\2\u0097\u0098"+
		"\7\t\2\2\u0098\u0099\5\30\r\2\u0099\u009a\7\n\2\2\u009a\u009b\5\24\13"+
		"\2\u009b\u009c\5\n\6\2\u009c\u009d\5\26\f\2\u009d\u009e\7\36\2\2\u009e"+
		"\u009f\5\24\13\2\u009f\u00a0\5\n\6\2\u00a0\u00a1\b\n\1\2\u00a1\u00a3\3"+
		"\2\2\2\u00a2\u0085\3\2\2\2\u00a2\u008b\3\2\2\2\u00a2\u008e\3\2\2\2\u00a2"+
		"\u0096\3\2\2\2\u00a3\23\3\2\2\2\u00a4\u00a5\b\13\1\2\u00a5\25\3\2\2\2"+
		"\u00a6\u00a7\b\f\1\2\u00a7\27\3\2\2\2\u00a8\u00a9\b\r\1\2\u00a9\u00aa"+
		"\7\16\2\2\u00aa\u00ab\5\30\r\t\u00ab\u00ac\b\r\1\2\u00ac\u00c1\3\2\2\2"+
		"\u00ad\u00ae\7\t\2\2\u00ae\u00af\5\30\r\2\u00af\u00b0\7\n\2\2\u00b0\u00b1"+
		"\b\r\1\2\u00b1\u00c1\3\2\2\2\u00b2\u00b3\5\32\16\2\u00b3\u00b4\7)\2\2"+
		"\u00b4\u00b5\5\32\16\2\u00b5\u00b6\b\r\1\2\u00b6\u00c1\3\2\2\2\u00b7\u00b8"+
		"\7\17\2\2\u00b8\u00c1\b\r\1\2\u00b9\u00ba\7\20\2\2\u00ba\u00c1\b\r\1\2"+
		"\u00bb\u00bc\5\36\20\2\u00bc\u00bd\b\r\1\2\u00bd\u00c1\3\2\2\2\u00be\u00bf"+
		"\7(\2\2\u00bf\u00c1\b\r\1\2\u00c0\u00a8\3\2\2\2\u00c0\u00ad\3\2\2\2\u00c0"+
		"\u00b2\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c0\u00bb\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c1\u00ce\3\2\2\2\u00c2\u00c3\f\13\2\2\u00c3"+
		"\u00c4\7\f\2\2\u00c4\u00c5\5\30\r\f\u00c5\u00c6\b\r\1\2\u00c6\u00cd\3"+
		"\2\2\2\u00c7\u00c8\f\n\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00ca\5\30\r\13\u00ca"+
		"\u00cb\b\r\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc\u00c7\3\2"+
		"\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\31\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\b\16\1\2\u00d2\u00d3\5 \21"+
		"\2\u00d3\u00d4\b\16\1\2\u00d4\u00eb\3\2\2\2\u00d5\u00d6\7(\2\2\u00d6\u00eb"+
		"\b\16\1\2\u00d7\u00d8\7(\2\2\u00d8\u00d9\7\7\2\2\u00d9\u00da\5\32\16\2"+
		"\u00da\u00db\7\b\2\2\u00db\u00dc\b\16\1\2\u00dc\u00eb\3\2\2\2\u00dd\u00de"+
		"\7\t\2\2\u00de\u00df\5\32\16\2\u00df\u00e0\7\n\2\2\u00e0\u00e1\b\16\1"+
		"\2\u00e1\u00eb\3\2\2\2\u00e2\u00e3\7+\2\2\u00e3\u00e4\5\32\16\n\u00e4"+
		"\u00e5\b\16\1\2\u00e5\u00eb\3\2\2\2\u00e6\u00e7\7\16\2\2\u00e7\u00e8\5"+
		"\32\16\3\u00e8\u00e9\b\16\1\2\u00e9\u00eb\3\2\2\2\u00ea\u00d1\3\2\2\2"+
		"\u00ea\u00d5\3\2\2\2\u00ea\u00d7\3\2\2\2\u00ea\u00dd\3\2\2\2\u00ea\u00e2"+
		"\3\2\2\2\u00ea\u00e6\3\2\2\2\u00eb\u010c\3\2\2\2\u00ec\u00ed\f\t\2\2\u00ed"+
		"\u00ee\7\21\2\2\u00ee\u00ef\5\32\16\n\u00ef\u00f0\b\16\1\2\u00f0\u010b"+
		"\3\2\2\2\u00f1\u00f2\f\b\2\2\u00f2\u00f3\7\22\2\2\u00f3\u00f4\5\32\16"+
		"\t\u00f4\u00f5\b\16\1\2\u00f5\u010b\3\2\2\2\u00f6\u00f7\f\7\2\2\u00f7"+
		"\u00f8\7\23\2\2\u00f8\u00f9\5\32\16\b\u00f9\u00fa\b\16\1\2\u00fa\u010b"+
		"\3\2\2\2\u00fb\u00fc\f\6\2\2\u00fc\u00fd\7+\2\2\u00fd\u00fe\5\32\16\7"+
		"\u00fe\u00ff\b\16\1\2\u00ff\u010b\3\2\2\2\u0100\u0101\f\5\2\2\u0101\u0102"+
		"\7.\2\2\u0102\u0103\5\32\16\6\u0103\u0104\b\16\1\2\u0104\u010b\3\2\2\2"+
		"\u0105\u0106\f\4\2\2\u0106\u0107\7)\2\2\u0107\u0108\5\32\16\5\u0108\u0109"+
		"\b\16\1\2\u0109\u010b\3\2\2\2\u010a\u00ec\3\2\2\2\u010a\u00f1\3\2\2\2"+
		"\u010a\u00f6\3\2\2\2\u010a\u00fb\3\2\2\2\u010a\u0100\3\2\2\2\u010a\u0105"+
		"\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\33\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7(\2\2\u0110\u0118\b\17\1"+
		"\2\u0111\u0112\7(\2\2\u0112\u0113\7\7\2\2\u0113\u0114\5\32\16\2\u0114"+
		"\u0115\7\b\2\2\u0115\u0116\b\17\1\2\u0116\u0118\3\2\2\2\u0117\u010f\3"+
		"\2\2\2\u0117\u0111\3\2\2\2\u0118\35\3\2\2\2\u0119\u011a\t\2\2\2\u011a"+
		"\37\3\2\2\2\u011b\u011c\5\36\20\2\u011c\u011d\b\21\1\2\u011d\u0123\3\2"+
		"\2\2\u011e\u011f\7\25\2\2\u011f\u0123\b\21\1\2\u0120\u0121\7&\2\2\u0121"+
		"\u0123\b\21\1\2\u0122\u011b\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u0120\3"+
		"\2\2\2\u0123!\3\2\2\2\u0124\u0125\t\3\2\2\u0125#\3\2\2\2\u0126\u0127\t"+
		"\4\2\2\u0127%\3\2\2\2\u0128\u0129\t\5\2\2\u0129\'\3\2\2\2\u012a\u012e"+
		"\5$\23\2\u012b\u012e\7)\2\2\u012c\u012e\7.\2\2\u012d\u012a\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e)\3\2\2\2\239GO`n|\u0083\u00a2"+
		"\u00c0\u00cc\u00ce\u00ea\u010a\u010c\u0117\u0122\u012d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}