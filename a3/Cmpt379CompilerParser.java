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
		T__17=18, WhiteSpace=19, Char=20, Str=21, Class=22, Program=23, Void=24, 
		While=25, Switch=26, Case=27, If=28, Else=29, For=30, Ret=31, Brk=32, 
		Cnt=33, Callout=34, DecNum=35, HexNum=36, BoolLit=37, Type=38, Ident=39, 
		RelOp=40, AssignOp=41, Minus=42, SecondOp=43, ThirdOp=44, CondOp=45;
	public static final int
		RULE_prog = 0, RULE_field_decls = 1, RULE_field_decl = 2, RULE_inited_field_decl = 3, 
		RULE_method_decls = 4, RULE_method_decl = 5, RULE_functionLabel = 6, RULE_params = 7, 
		RULE_nextParams = 8, RULE_block = 9, RULE_var_decls = 10, RULE_var_decl = 11, 
		RULE_statements = 12, RULE_statement = 13, RULE_switch_expr = 14, RULE_cases = 15, 
		RULE_switchLit = 16, RULE_baseSwitchLit = 17, RULE_m = 18, RULE_n = 19, 
		RULE_bool_expr = 20, RULE_expr = 21, RULE_methodCall = 22, RULE_arguments = 23, 
		RULE_nextArgs = 24, RULE_nextCalloutArgs = 25, RULE_location = 26, RULE_intLit = 27, 
		RULE_literal = 28, RULE_eqOp = 29, RULE_mathOp = 30, RULE_boolOp = 31, 
		RULE_binOp = 32;
	public static final String[] ruleNames = {
		"prog", "field_decls", "field_decl", "inited_field_decl", "method_decls", 
		"method_decl", "functionLabel", "params", "nextParams", "block", "var_decls", 
		"var_decl", "statements", "statement", "switch_expr", "cases", "switchLit", 
		"baseSwitchLit", "m", "n", "bool_expr", "expr", "methodCall", "arguments", 
		"nextArgs", "nextCalloutArgs", "location", "intLit", "literal", "eqOp", 
		"mathOp", "boolOp", "binOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", "'['", "']'", "'='", "'('", "')'", "':'", 
		"'&&'", "'||'", "'!'", "'true'", "'false'", "'*'", "'/'", "'+'", null, 
		null, null, "'class'", "'Program'", "'void'", "'while'", "'switch'", "'case'", 
		"'if'", "'else'", "'for'", "'return'", "'break'", "'continue'", "'callout'", 
		null, null, null, null, null, null, null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "WhiteSpace", "Char", "Str", 
		"Class", "Program", "Void", "While", "Switch", "Case", "If", "Else", "For", 
		"Ret", "Brk", "Cnt", "Callout", "DecNum", "HexNum", "BoolLit", "Type", 
		"Ident", "RelOp", "AssignOp", "Minus", "SecondOp", "ThirdOp", "CondOp"
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
			}else if (src1 == -4) { //print t_6 = fun call 0
				System.out.println("L_" + label + ": " + s.GetName(dst) + " = "
				   + op + " call " + src2);
			}else if (dst == -6) {//dst = -6 means callout function---= "printf" call 2
				System.out.println("L_" + label + ":  = " + op  + " call " + src2);
			}else if (dst == -7) {//-7 means function param---t_6 param
				System.out.println("L_" + label + ": " + s.GetName(src1) + " param");
			}else if (dst == -8) {//-8 means string param when printing--"a = %d\n" param
				System.out.println("L_" + label + ": " + op + " param");
			}else if (src1 == -9 && op.equals("function")) { //print fucntion name
				System.out.println(s.GetName(src2) + ":");
			}else if (src1 == -1 && dst == -1) { // goto L_  instruction
				System.out.println("L_" + label + ": " + " goto " + "L_" + src2);
			}else if (src2 == -4 && dst == -1) {
				System.out.println("L_" + label + ":  = " + s.GetName(src1) + " ret");
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

		void MergeTrueList(InstructionSet iset) {
			for(int i = 0; i < iset.sizet; i++) {
				this.truelist[sizet] = iset.truelist[i];
				this.sizet++;
			}
		}

		void MergeFalseList(InstructionSet iset) {
			for(int i = 0; i < iset.sizef; i++) {
				this.falselist[sizef] = iset.falselist[i];
				this.sizef++;
			}
		}

		void AddToBothList(int trueInst, int falseInst) {
			truelist[sizet] = trueInst;
			falselist[sizef] = falseInst;
			sizet++;
			sizef++;
		}
	}

	public class LoopList{
		int[] breakList;
		int[] continueList;
		int sizeb;
		int sizec;

		LoopList(int arraySize) {
			breakList = new int[arraySize];
			continueList = new int[arraySize];
			sizeb = 0;
			sizec = 0;
			for(int i = 0; i < arraySize; i++) {
				breakList[i] = -1;
				continueList[i] = -1;
			}
		}

		void AddToBreakList(int id) {
			breakList[sizeb] = id;
			sizeb++;
		}

		void AddToContinueList(int id) {
			continueList[sizec] = id;
			sizec++;
		}

		void reinitialize(int arraySize) {
			breakList = new int[arraySize];
			continueList = new int[arraySize];
			sizeb = 0;
			sizec = 0;
			for(int i = 0; i < arraySize; i++) {
				breakList[i] = -1;
				continueList[i] = -1;
			}
		}
	}

	LoopList l = new LoopList(100);


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
			setState(66);
			match(Class);
			setState(67);
			match(Program);
			setState(68);
			match(T__0);
			setState(69);
			field_decls(0);
			setState(70);
			method_decls(0);
			setState(71);
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
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(87);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new Field_declsContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decls);
						setState(77);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(78);
						field_decl(0);
						setState(79);
						match(T__2);


						          
						}
						break;
					case 2:
						{
						_localctx = new Field_declsContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decls);
						setState(82);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(83);
						inited_field_decl();
						setState(84);
						match(T__2);


						          
						}
						break;
					}
					} 
				}
				setState(91);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(93);
				((Field_declContext)_localctx).Type = match(Type);
				setState(94);
				((Field_declContext)_localctx).Ident = match(Ident);

					((Field_declContext)_localctx).t =  DataType.valueOf((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null).toUpperCase());
					s.insert((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null), _localctx.t);

				}
				break;
			case 2:
				{
				setState(96);
				((Field_declContext)_localctx).Type = match(Type);
				setState(97);
				((Field_declContext)_localctx).Ident = match(Ident);
				setState(98);
				match(T__4);
				setState(99);
				intLit();
				setState(100);
				match(T__5);

					((Field_declContext)_localctx).t =  DataType.valueOf((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null).toUpperCase());
					s.insert((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null), _localctx.t);

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Field_declContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decl);
						setState(105);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(106);
						match(T__3);
						setState(107);
						((Field_declContext)_localctx).Ident = match(Ident);

						          	((Field_declContext)_localctx).t =  ((Field_declContext)_localctx).f.t;
						          	s.insert((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null), _localctx.t);
						          
						}
						break;
					case 2:
						{
						_localctx = new Field_declContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decl);
						setState(109);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(110);
						match(T__3);
						setState(111);
						((Field_declContext)_localctx).Ident = match(Ident);
						setState(112);
						match(T__4);
						setState(113);
						intLit();
						setState(114);
						match(T__5);

						          	((Field_declContext)_localctx).t =  ((Field_declContext)_localctx).f.t;
						          	s.insert((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null), _localctx.t);
						          
						}
						break;
					}
					} 
				}
				setState(121);
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
		public DataType t;
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
			setState(122);
			((Inited_field_declContext)_localctx).Type = match(Type);
			setState(123);
			((Inited_field_declContext)_localctx).Ident = match(Ident);
			setState(124);
			match(T__6);
			setState(125);
			((Inited_field_declContext)_localctx).literal = literal();

				((Inited_field_declContext)_localctx).t =  DataType.valueOf((((Inited_field_declContext)_localctx).Type!=null?((Inited_field_declContext)_localctx).Type.getText():null).toUpperCase());
				int id = s.insert((((Inited_field_declContext)_localctx).Ident!=null?((Inited_field_declContext)_localctx).Ident.getText():null), _localctx.t);
				q.Add(id, ((Inited_field_declContext)_localctx).literal.id, -1, "=");

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
		public Method_declsContext method_decls() {
			return getRuleContext(Method_declsContext.class,0);
		}
		public Method_declContext method_decl() {
			return getRuleContext(Method_declContext.class,0);
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
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Method_declsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_method_decls);
					setState(131);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(132);
					method_decl();


					          
					}
					} 
				}
				setState(139);
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
		public Token Type;
		public Token Ident;
		public FunctionLabelContext functionLabel;
		public Token Void;
		public TerminalNode Type() { return getToken(Cmpt379CompilerParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
		public FunctionLabelContext functionLabel() {
			return getRuleContext(FunctionLabelContext.class,0);
		}
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
			setState(158);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				((Method_declContext)_localctx).Type = match(Type);
				setState(141);
				((Method_declContext)_localctx).Ident = match(Ident);
				setState(142);
				((Method_declContext)_localctx).functionLabel = functionLabel();
				setState(143);
				match(T__7);
				setState(144);
				params();
				setState(145);
				match(T__8);
				setState(146);
				block();

					int id = s.insert((((Method_declContext)_localctx).Ident!=null?((Method_declContext)_localctx).Ident.getText():null), DataType.valueOf((((Method_declContext)_localctx).Type!=null?((Method_declContext)_localctx).Type.getText():null).toUpperCase()));
					q.PatchSrc2(((Method_declContext)_localctx).functionLabel.id, id);

				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				((Method_declContext)_localctx).Void = match(Void);
				setState(150);
				((Method_declContext)_localctx).Ident = match(Ident);
				setState(151);
				((Method_declContext)_localctx).functionLabel = functionLabel();
				setState(152);
				match(T__7);
				setState(153);
				params();
				setState(154);
				match(T__8);
				setState(155);
				block();

					int id = s.insert((((Method_declContext)_localctx).Ident!=null?((Method_declContext)_localctx).Ident.getText():null), DataType.valueOf((((Method_declContext)_localctx).Void!=null?((Method_declContext)_localctx).Void.getText():null).toUpperCase()));
					q.PatchSrc2(((Method_declContext)_localctx).functionLabel.id, id);

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

	public static class FunctionLabelContext extends ParserRuleContext {
		public int id;
		public FunctionLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterFunctionLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitFunctionLabel(this);
		}
	}

	public final FunctionLabelContext functionLabel() throws RecognitionException {
		FunctionLabelContext _localctx = new FunctionLabelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{

				((FunctionLabelContext)_localctx).id =  q.Add(-1, -9, -1, "function");
				System.out.println("+++++ functionLabel id : " + _localctx.id);

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
		public Token Type;
		public Token Ident;
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
		enterRule(_localctx, 14, RULE_params);
		try {
			setState(168);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				((ParamsContext)_localctx).Type = match(Type);
				setState(163);
				((ParamsContext)_localctx).Ident = match(Ident);
				setState(164);
				nextParams(0);

					s.insert((((ParamsContext)_localctx).Ident!=null?((ParamsContext)_localctx).Ident.getText():null), DataType.valueOf((((ParamsContext)_localctx).Type!=null?((ParamsContext)_localctx).Type.getText():null).toUpperCase()));

				}
				break;
			case T__8:
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

	public static class NextParamsContext extends ParserRuleContext {
		public Token Type;
		public Token Ident;
		public NextParamsContext nextParams() {
			return getRuleContext(NextParamsContext.class,0);
		}
		public TerminalNode Type() { return getToken(Cmpt379CompilerParser.Type, 0); }
		public TerminalNode Ident() { return getToken(Cmpt379CompilerParser.Ident, 0); }
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_nextParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{



			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NextParamsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_nextParams);
					setState(173);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(174);
					match(T__3);
					setState(175);
					((NextParamsContext)_localctx).Type = match(Type);
					setState(176);
					((NextParamsContext)_localctx).Ident = match(Ident);

					          	s.insert((((NextParamsContext)_localctx).Ident!=null?((NextParamsContext)_localctx).Ident.getText():null), DataType.valueOf((((NextParamsContext)_localctx).Type!=null?((NextParamsContext)_localctx).Type.getText():null).toUpperCase()));
					          
					}
					} 
				}
				setState(182);
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
		enterRule(_localctx, 18, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__0);
			setState(184);
			var_decls(0);
			setState(185);
			statements();
			setState(186);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_var_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
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
					setState(190);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(191);
					var_decl(0);
					setState(192);
					match(T__2);
					}
					} 
				}
				setState(198);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_var_decl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(200);
			((Var_declContext)_localctx).Type = match(Type);
			setState(201);
			((Var_declContext)_localctx).Ident = match(Ident);

				((Var_declContext)_localctx).t =  DataType.valueOf((((Var_declContext)_localctx).Type!=null?((Var_declContext)_localctx).Type.getText():null).toUpperCase());
				s.insert((((Var_declContext)_localctx).Ident!=null?((Var_declContext)_localctx).Ident.getText():null), _localctx.t);


			}
			_ctx.stop = _input.LT(-1);
			setState(210);
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
					setState(204);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(205);
					match(T__3);
					setState(206);
					((Var_declContext)_localctx).Ident = match(Ident);

					          	((Var_declContext)_localctx).t =  ((Var_declContext)_localctx).v.t;
					          	s.insert((((Var_declContext)_localctx).Ident!=null?((Var_declContext)_localctx).Ident.getText():null), _localctx.t);
					          
					}
					} 
				}
				setState(212);
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
		enterRule(_localctx, 24, RULE_statements);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				statement();
				setState(214);
				((StatementsContext)_localctx).t = statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		public LocationContext location;
		public ExprContext expr;
		public Bool_exprContext b;
		public MContext m;
		public MContext m1;
		public BlockContext b1;
		public NContext n;
		public MContext m2;
		public BlockContext b2;
		public Bool_exprContext bool_expr;
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
		public List<MContext> m() {
			return getRuleContexts(MContext.class);
		}
		public MContext m(int i) {
			return getRuleContext(MContext.class,i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public TerminalNode Else() { return getToken(Cmpt379CompilerParser.Else, 0); }
		public TerminalNode Switch() { return getToken(Cmpt379CompilerParser.Switch, 0); }
		public Switch_exprContext switch_expr() {
			return getRuleContext(Switch_exprContext.class,0);
		}
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public TerminalNode While() { return getToken(Cmpt379CompilerParser.While, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
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
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				((StatementContext)_localctx).location = location();
				setState(220);
				match(T__6);
				setState(221);
				((StatementContext)_localctx).expr = expr(0);
				setState(222);
				match(T__2);

					q.Add(((StatementContext)_localctx).location.id, ((StatementContext)_localctx).expr.id, -1, "=");

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				block();



				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(If);
				setState(229);
				match(T__7);
				setState(230);
				((StatementContext)_localctx).b = bool_expr(0);
				setState(231);
				match(T__8);
				setState(232);
				((StatementContext)_localctx).m = m();
				setState(233);
				block();

					for (int i = 0; i < ((StatementContext)_localctx).b.is.sizet; i++) {
						q.PatchSrc2(((StatementContext)_localctx).b.is.truelist[i], ((StatementContext)_localctx).m.id);
						/* System.out.println("trueId is : " + trueId);
						System.out.println("((StatementContext)_localctx).m.id is : " + ((StatementContext)_localctx).m.id); */
					}

					for (int i = 0; i < ((StatementContext)_localctx).b.is.sizef; i++) {
						q.PatchSrc2(((StatementContext)_localctx).b.is.falselist[i], q.size);
						/* System.out.println("q.size is : " + q.size); */
						/* System.out.println("falseId is : " + falseId); */
					}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(If);
				setState(237);
				match(T__7);
				setState(238);
				((StatementContext)_localctx).b = bool_expr(0);
				setState(239);
				match(T__8);
				setState(240);
				((StatementContext)_localctx).m1 = m();
				setState(241);
				((StatementContext)_localctx).b1 = block();
				setState(242);
				((StatementContext)_localctx).n = n();
				setState(243);
				match(Else);
				setState(244);
				((StatementContext)_localctx).m2 = m();
				setState(245);
				((StatementContext)_localctx).b2 = block();


					for (int i = 0; i < ((StatementContext)_localctx).b.is.sizet; i++) {
						q.PatchSrc2(((StatementContext)_localctx).b.is.truelist[i], ((StatementContext)_localctx).m1.id);
					}

					for (int i = 0; i < ((StatementContext)_localctx).b.is.sizef; i++) {
						q.PatchSrc2(((StatementContext)_localctx).b.is.falselist[i], ((StatementContext)_localctx).m2.id);
					}

					int nid = ((StatementContext)_localctx).n.id;
					System.out.println("nid : " + nid);
					q.PatchSrc2(nid, q.size);

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				match(Switch);
				setState(249);
				switch_expr();
				setState(250);
				match(T__0);
				setState(251);
				cases(0);
				setState(252);
				match(T__1);

					for(int i = 0; i < l.sizeb; i++) {
						q.PatchSrc2(l.breakList[i], q.size);
					}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				match(While);
				setState(256);
				((StatementContext)_localctx).m1 = m();
				setState(257);
				match(T__7);
				setState(258);
				((StatementContext)_localctx).bool_expr = bool_expr(0);
				setState(259);
				match(T__8);
				setState(260);
				((StatementContext)_localctx).m2 = m();
				setState(261);
				block();

					/* System.out.println("((StatementContext)_localctx).m1.id is : " + ((StatementContext)_localctx).m1.id); */
					if(((StatementContext)_localctx).bool_expr.is.truelist[0] != -1) {
						int trueId = ((((StatementContext)_localctx).bool_expr.is).truelist)[0];
						q.PatchSrc2(trueId, ((StatementContext)_localctx).m2.id);
					}

					if(((StatementContext)_localctx).bool_expr.is.falselist[0] != -1) {
						int falseId = ((((StatementContext)_localctx).bool_expr.is).falselist)[0];
						q.PatchSrc2(falseId, q.size + 1);
					}
					for(int i = 0; i < l.sizeb; i++) {
						q.PatchSrc2(l.breakList[i], q.size + 1);
					}
					for(int i = 0; i < l.sizec; i++) {
						q.PatchSrc2(l.continueList[i], q.size);
					}
					q.Add(-1, -1, ((StatementContext)_localctx).m1.id, "goto");
					//l.reinitialize(100);

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				methodCall();
				setState(265);
				match(T__2);



				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(268);
				match(Ret);
				setState(269);
				match(T__2);

					q.Add(-1, -1, -4, "ret");

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(271);
				match(Ret);
				setState(272);
				((StatementContext)_localctx).expr = expr(0);
				setState(273);
				match(T__2);

					int id = ((StatementContext)_localctx).expr.id;
					q.Add(-1, id, -4, "ret");

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(276);
				match(Brk);
				setState(277);
				match(T__2);

					// add goto L_15 to QuadTab
					int breakId = q.Add(-1, -1, -1, "break");
					l.AddToBreakList(breakId);


				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(279);
				match(Cnt);
				setState(280);
				match(T__2);

					// add goto L_ to QuadTab
					int continueId = q.Add(-1, -1, -1, "continue");
					System.out.println("*************continueId : " + continueId);
					l.AddToContinueList(continueId);

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

	public static class Switch_exprContext extends ParserRuleContext {
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Switch_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterSwitch_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitSwitch_expr(this);
		}
	}

	public final Switch_exprContext switch_expr() throws RecognitionException {
		Switch_exprContext _localctx = new Switch_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_switch_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			((Switch_exprContext)_localctx).expr = expr(0);

				int id = s.Add(DataType.INT);
				q.Add(id, ((Switch_exprContext)_localctx).expr.id, -1, "=");

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
		public int id;
		public int base;
		public CasesContext c1;
		public BaseSwitchLitContext baseSwitchLit;
		public SwitchLitContext switchLit;
		public TerminalNode Case() { return getToken(Cmpt379CompilerParser.Case, 0); }
		public BaseSwitchLitContext baseSwitchLit() {
			return getRuleContext(BaseSwitchLitContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public SwitchLitContext switchLit() {
			return getRuleContext(SwitchLitContext.class,0);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_cases, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(288);
			match(Case);
			setState(289);
			((CasesContext)_localctx).baseSwitchLit = baseSwitchLit();
			setState(290);
			match(T__9);
			setState(291);
			statements();

				int id = ((CasesContext)_localctx).baseSwitchLit.id;
				q.PatchSrc2(id, q.size);
				((CasesContext)_localctx).base =  ((CasesContext)_localctx).baseSwitchLit.base;

			}
			_ctx.stop = _input.LT(-1);
			setState(303);
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
					setState(294);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(295);
					match(Case);
					setState(296);
					((CasesContext)_localctx).switchLit = switchLit();
					setState(297);
					match(T__9);
					setState(298);
					statements();

					          	int baseid = ((CasesContext)_localctx).switchLit.baseid;
					          	int id = ((CasesContext)_localctx).switchLit.id;
					          	q.PatchSrc2(baseid, ((CasesContext)_localctx).c1.base);
					          	q.PatchSrc2(id, q.size);
					          
					}
					} 
				}
				setState(305);
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

	public static class SwitchLitContext extends ParserRuleContext {
		public int baseid;
		public int id;
		public LiteralContext literal;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SwitchLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterSwitchLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitSwitchLit(this);
		}
	}

	public final SwitchLitContext switchLit() throws RecognitionException {
		SwitchLitContext _localctx = new SwitchLitContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switchLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			((SwitchLitContext)_localctx).literal = literal();

				int id2 = s.Add(DataType.INT);
				((SwitchLitContext)_localctx).baseid =  q.Add(id2, ((SwitchLitContext)_localctx).literal.id, -1, "==");
				q.Add(-2, id2, q.size + 2, "goto");
				((SwitchLitContext)_localctx).id =  q.Add(-3, id2, -1, "goto");

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

	public static class BaseSwitchLitContext extends ParserRuleContext {
		public int id;
		public int base;
		public LiteralContext literal;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public BaseSwitchLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseSwitchLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).enterBaseSwitchLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cmpt379CompilerListener ) ((Cmpt379CompilerListener)listener).exitBaseSwitchLit(this);
		}
	}

	public final BaseSwitchLitContext baseSwitchLit() throws RecognitionException {
		BaseSwitchLitContext _localctx = new BaseSwitchLitContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_baseSwitchLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			((BaseSwitchLitContext)_localctx).literal = literal();

				int id2 = s.Add(DataType.INT);
				((BaseSwitchLitContext)_localctx).base =  id2-2;
				q.Add(id2, ((BaseSwitchLitContext)_localctx).literal.id, _localctx.base, "==");
				q.Add(-2, id2, q.size + 2, "goto");
				((BaseSwitchLitContext)_localctx).id =  q.Add(-3, id2, -1, "goto");

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
		enterRule(_localctx, 36, RULE_m);
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
		enterRule(_localctx, 38, RULE_n);
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
		public Bool_exprContext b;
		public ExprContext e1;
		public Token RelOp;
		public ExprContext e2;
		public IntLitContext intLit;
		public Token Ident;
		public MContext m;
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
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_bool_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(317);
				match(T__12);
				setState(318);
				((Bool_exprContext)_localctx).b = bool_expr(7);

					InstructionSet instructionSet = new InstructionSet();
					instructionSet.truelist = ((Bool_exprContext)_localctx).b.is.falselist;
					instructionSet.sizet = ((Bool_exprContext)_localctx).b.is.sizet;

					instructionSet.falselist = ((Bool_exprContext)_localctx).b.is.truelist;
					instructionSet.sizef = ((Bool_exprContext)_localctx).b.is.sizef;
					((Bool_exprContext)_localctx).is =  instructionSet;

				}
				break;
			case 2:
				{
				setState(321);
				match(T__7);
				setState(322);
				((Bool_exprContext)_localctx).b = bool_expr(0);
				setState(323);
				match(T__8);

					((Bool_exprContext)_localctx).is =  ((Bool_exprContext)_localctx).b.is;

				}
				break;
			case 3:
				{
				setState(326);
				((Bool_exprContext)_localctx).e1 = expr(0);
				setState(327);
				((Bool_exprContext)_localctx).RelOp = match(RelOp);
				setState(328);
				((Bool_exprContext)_localctx).e2 = expr(0);

					//add t_0 to symbol table
					int id = s.Add(DataType.INT);
					//t_0 = a > 0
					q.Add(id, ((Bool_exprContext)_localctx).e1.id, ((Bool_exprContext)_localctx).e2.id, (((Bool_exprContext)_localctx).RelOp!=null?((Bool_exprContext)_localctx).RelOp.getText():null));
					InstructionSet instructionSet = new InstructionSet();

					// TODO: change to use "AddToBothList"
					instructionSet.AddToTrueList(q.size);

					//q.PrintQT();
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
				setState(331);
				match(T__13);

					InstructionSet instructionSet = new InstructionSet();
					instructionSet.AddToTrueList(q.size);
					instructionSet.valid = -1;
					((Bool_exprContext)_localctx).is =  instructionSet;
					q.Add(-1, -1, -1, "goto");

				}
				break;
			case 5:
				{
				setState(333);
				match(T__14);

					InstructionSet instructionSet = new InstructionSet();
					instructionSet.AddToFalseList(q.size);
					((Bool_exprContext)_localctx).is =  instructionSet;
					q.Add(-1, -1, -1, "goto");

				}
				break;
			case 6:
				{
				setState(335);
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
				setState(338);
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
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(354);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new Bool_exprContext(_parentctx, _parentState);
						_localctx.b1 = _prevctx;
						_localctx.b1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
						setState(342);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(343);
						match(T__10);
						setState(344);
						((Bool_exprContext)_localctx).m = m();
						setState(345);
						((Bool_exprContext)_localctx).b2 = bool_expr(10);

						          	InstructionSet instructionSet = new InstructionSet();

						          	for (int i = 0; i<((Bool_exprContext)_localctx).b1.is.sizet; i++) {
						          		q.PatchSrc2(((Bool_exprContext)_localctx).b1.is.truelist[i], ((Bool_exprContext)_localctx).m.id);
						          	}

						          	instructionSet.MergeFalseList(((Bool_exprContext)_localctx).b1.is);
						          	instructionSet.MergeFalseList(((Bool_exprContext)_localctx).b2.is);

						          	instructionSet.MergeTrueList(((Bool_exprContext)_localctx).b2.is);
						          	((Bool_exprContext)_localctx).is =  instructionSet;
						          
						}
						break;
					case 2:
						{
						_localctx = new Bool_exprContext(_parentctx, _parentState);
						_localctx.b1 = _prevctx;
						_localctx.b1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
						setState(348);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(349);
						match(T__11);
						setState(350);
						((Bool_exprContext)_localctx).m = m();
						setState(351);
						((Bool_exprContext)_localctx).b2 = bool_expr(9);

						          	InstructionSet instructionSet = new InstructionSet();

						          	for (int i = 0; i<((Bool_exprContext)_localctx).b1.is.sizef; i++) {
						          		q.PatchSrc2(((Bool_exprContext)_localctx).b1.is.falselist[i], ((Bool_exprContext)_localctx).m.id);
						          	}
						          	instructionSet.MergeTrueList(((Bool_exprContext)_localctx).b1.is);
						          	instructionSet.MergeTrueList(((Bool_exprContext)_localctx).b2.is);

						          	instructionSet.MergeFalseList(((Bool_exprContext)_localctx).b2.is);
						          	((Bool_exprContext)_localctx).is =  instructionSet;
						          	// System.out.println("_localctx.is.falselist is : " + _localctx.is.falselist[0]);
						          
						}
						break;
					}
					} 
				}
				setState(358);
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

	public static class ExprContext extends ParserRuleContext {
		public int id;
		public ExprContext e1;
		public LiteralContext literal;
		public Token Ident;
		public MethodCallContext methodCall;
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
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(360);
				((ExprContext)_localctx).literal = literal();

					((ExprContext)_localctx).id =  ((ExprContext)_localctx).literal.id;

				}
				break;
			case 2:
				{
				setState(363);
				((ExprContext)_localctx).Ident = match(Ident);

					((ExprContext)_localctx).id =  s.Find((((ExprContext)_localctx).Ident!=null?((ExprContext)_localctx).Ident.getText():null));

				}
				break;
			case 3:
				{
				setState(365);
				((ExprContext)_localctx).Ident = match(Ident);
				setState(366);
				match(T__4);
				setState(367);
				((ExprContext)_localctx).e1 = expr(0);
				setState(368);
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
				setState(371);
				match(T__7);
				setState(372);
				((ExprContext)_localctx).e1 = expr(0);
				setState(373);
				match(T__8);

					((ExprContext)_localctx).id =  ((ExprContext)_localctx).e1.id;

				}
				break;
			case 5:
				{
				setState(376);
				match(Minus);
				setState(377);
				((ExprContext)_localctx).e1 = expr(9);

					int id = s.insert("0", s.GetType(((ExprContext)_localctx).e1.id));
					((ExprContext)_localctx).id =  s.Add(s.GetType(((ExprContext)_localctx).e1.id));
					q.Add(_localctx.id, id, ((ExprContext)_localctx).e1.id, "-");

				}
				break;
			case 6:
				{
				setState(380);
				match(T__12);
				setState(381);
				((ExprContext)_localctx).e1 = expr(2);

					// TODO: need modification
					// ((ExprContext)_localctx).id =  s.Add(s.GetType(((ExprContext)_localctx).e1.id));
					// q.Add(_localctx.id, ((ExprContext)_localctx).e1.id, -1, "!");

				}
				break;
			case 7:
				{
				setState(384);
				((ExprContext)_localctx).methodCall = methodCall();

					((ExprContext)_localctx).id =  ((ExprContext)_localctx).methodCall.id;

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(419);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(389);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(390);
						match(T__15);
						setState(391);
						((ExprContext)_localctx).e2 = expr(9);

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
						setState(394);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(395);
						match(T__16);
						setState(396);
						((ExprContext)_localctx).e2 = expr(8);

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
						setState(399);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(400);
						match(T__17);
						setState(401);
						((ExprContext)_localctx).e2 = expr(7);

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
						setState(404);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(405);
						match(Minus);
						setState(406);
						((ExprContext)_localctx).e2 = expr(6);

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
						setState(409);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(410);
						((ExprContext)_localctx).CondOp = match(CondOp);
						setState(411);
						((ExprContext)_localctx).e2 = expr(5);

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
						setState(414);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(415);
						((ExprContext)_localctx).RelOp = match(RelOp);
						setState(416);
						((ExprContext)_localctx).e2 = expr(4);

						          	((ExprContext)_localctx).id =  s.Add(s.GetType(((ExprContext)_localctx).e1.id));
						          	q.Add(_localctx.id, ((ExprContext)_localctx).e1.id, ((ExprContext)_localctx).e2.id, (((ExprContext)_localctx).RelOp!=null?((ExprContext)_localctx).RelOp.getText():null));
						          
						}
						break;
					}
					} 
				}
				setState(423);
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

	public static class MethodCallContext extends ParserRuleContext {
		public int id;
		public Token Ident;
		public ArgumentsContext arguments;
		public Token Str;
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
		enterRule(_localctx, 44, RULE_methodCall);
		try {
			setState(437);
			switch (_input.LA(1)) {
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				((MethodCallContext)_localctx).Ident = match(Ident);
				setState(425);
				match(T__7);
				setState(426);
				((MethodCallContext)_localctx).arguments = arguments();
				setState(427);
				match(T__8);

					((MethodCallContext)_localctx).id =  s.Add(DataType.INT);   //make a t_
					q.Add(_localctx.id, -4, ((MethodCallContext)_localctx).arguments.count, (((MethodCallContext)_localctx).Ident!=null?((MethodCallContext)_localctx).Ident.getText():null));

				}
				break;
			case Callout:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(Callout);
				setState(431);
				match(T__7);
				setState(432);
				((MethodCallContext)_localctx).Str = match(Str);
				setState(433);
				((MethodCallContext)_localctx).nextCalloutArgs = nextCalloutArgs(0);
				setState(434);
				match(T__8);

					((MethodCallContext)_localctx).id =  s.insert((((MethodCallContext)_localctx).Str!=null?((MethodCallContext)_localctx).Str.getText():null), DataType.INT);
					q.Add(-6, -1, ((MethodCallContext)_localctx).nextCalloutArgs.count, (((MethodCallContext)_localctx).Str!=null?((MethodCallContext)_localctx).Str.getText():null));

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
		public int count;
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
		enterRule(_localctx, 46, RULE_arguments);
		try {
			setState(444);
			switch (_input.LA(1)) {
			case T__7:
			case T__12:
			case Char:
			case Callout:
			case DecNum:
			case HexNum:
			case BoolLit:
			case Ident:
			case Minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				((ArgumentsContext)_localctx).expr = expr(0);
				setState(440);
				((ArgumentsContext)_localctx).nextArgs = nextArgs(0);

					((ArgumentsContext)_localctx).count =  ((ArgumentsContext)_localctx).nextArgs.count + 1;
					int id = ((ArgumentsContext)_localctx).expr.id;
					q.Add(-7, id, -1, "param");
					System.out.println("^^^^^^^^^^ param id is : " + id);

				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{

					((ArgumentsContext)_localctx).count =  0;

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
		public int count;
		public NextArgsContext nexta;
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_nextArgs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{

			  ((NextArgsContext)_localctx).count =  0;

			}
			_ctx.stop = _input.LT(-1);
			setState(456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NextArgsContext(_parentctx, _parentState);
					_localctx.nexta = _prevctx;
					_localctx.nexta = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_nextArgs);
					setState(449);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(450);
					match(T__3);
					setState(451);
					((NextArgsContext)_localctx).expr = expr(0);

					          	((NextArgsContext)_localctx).count =  ((NextArgsContext)_localctx).nexta.count + 1;
					          	int id = ((NextArgsContext)_localctx).expr.id;
					          	q.Add(-7, id, -1, "param");
					          	System.out.println("^^^^^^^^^^ param id is : " + id);
					          
					}
					} 
				}
				setState(458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class NextCalloutArgsContext extends ParserRuleContext {
		public int count;
		public NextCalloutArgsContext nextc;
		public ExprContext expr;
		public Token Str;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NextCalloutArgsContext nextCalloutArgs() {
			return getRuleContext(NextCalloutArgsContext.class,0);
		}
		public TerminalNode Str() { return getToken(Cmpt379CompilerParser.Str, 0); }
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_nextCalloutArgs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{

				((NextCalloutArgsContext)_localctx).count =  0;

			}
			_ctx.stop = _input.LT(-1);
			setState(473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(471);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new NextCalloutArgsContext(_parentctx, _parentState);
						_localctx.nextc = _prevctx;
						_localctx.nextc = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_nextCalloutArgs);
						setState(462);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(463);
						match(T__3);
						setState(464);
						((NextCalloutArgsContext)_localctx).expr = expr(0);

						          	q.Add(-7, ((NextCalloutArgsContext)_localctx).expr.id, -1, "param");
						          	((NextCalloutArgsContext)_localctx).count =  ((NextCalloutArgsContext)_localctx).nextc.count + 1;
						          
						}
						break;
					case 2:
						{
						_localctx = new NextCalloutArgsContext(_parentctx, _parentState);
						_localctx.nextc = _prevctx;
						_localctx.nextc = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_nextCalloutArgs);
						setState(467);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(468);
						match(T__3);
						setState(469);
						((NextCalloutArgsContext)_localctx).Str = match(Str);

						          	q.Add(-8, -1, -1, (((NextCalloutArgsContext)_localctx).Str!=null?((NextCalloutArgsContext)_localctx).Str.getText():null));
						          	((NextCalloutArgsContext)_localctx).count =  ((NextCalloutArgsContext)_localctx).nextc.count + 1;
						          
						}
						break;
					}
					} 
				}
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 52, RULE_location);
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				((LocationContext)_localctx).Ident = match(Ident);

					((LocationContext)_localctx).id =  s.Find((((LocationContext)_localctx).Ident!=null?((LocationContext)_localctx).Ident.getText():null));

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				((LocationContext)_localctx).Ident = match(Ident);
				setState(479);
				match(T__4);
				setState(480);
				((LocationContext)_localctx).expr = expr(0);
				setState(481);
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
		enterRule(_localctx, 54, RULE_intLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
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
		enterRule(_localctx, 56, RULE_literal);
		try {
			setState(495);
			switch (_input.LA(1)) {
			case DecNum:
			case HexNum:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				((LiteralContext)_localctx).intLit = intLit();

					((LiteralContext)_localctx).id =  s.insert((((LiteralContext)_localctx).intLit!=null?_input.getText(((LiteralContext)_localctx).intLit.start,((LiteralContext)_localctx).intLit.stop):null), DataType.INT);

				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				((LiteralContext)_localctx).Char = match(Char);

					((LiteralContext)_localctx).id =  s.insert((((LiteralContext)_localctx).Char!=null?((LiteralContext)_localctx).Char.getText():null), DataType.CHAR);

				}
				break;
			case BoolLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
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
		enterRule(_localctx, 58, RULE_eqOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
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
		enterRule(_localctx, 60, RULE_mathOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
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
		enterRule(_localctx, 62, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==CondOp) ) {
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
		enterRule(_localctx, 64, RULE_binOp);
		try {
			setState(506);
			switch (_input.LA(1)) {
			case SecondOp:
			case ThirdOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				mathOp();
				}
				break;
			case RelOp:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				match(RelOp);
				}
				break;
			case CondOp:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
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
		case 4:
			return method_decls_sempred((Method_declsContext)_localctx, predIndex);
		case 8:
			return nextParams_sempred((NextParamsContext)_localctx, predIndex);
		case 10:
			return var_decls_sempred((Var_declsContext)_localctx, predIndex);
		case 11:
			return var_decl_sempred((Var_declContext)_localctx, predIndex);
		case 15:
			return cases_sempred((CasesContext)_localctx, predIndex);
		case 20:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 21:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 24:
			return nextArgs_sempred((NextArgsContext)_localctx, predIndex);
		case 25:
			return nextCalloutArgs_sempred((NextCalloutArgsContext)_localctx, predIndex);
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
	private boolean cases_sempred(CasesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 6);
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean nextArgs_sempred(NextArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean nextCalloutArgs_sempred(NextCalloutArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 3);
		case 19:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u01ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4j\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\7\4x\n\4\f\4\16\4{\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6\u008a\n\6\f\6\16\6\u008d\13\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a1\n\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ab\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u00b5\n\n\f\n\16\n\u00b8\13\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u00c5\n\f\f\f\16\f\u00c8\13\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u00d3\n\r\f\r\16\r\u00d6\13\r\3\16\3\16\3\16"+
		"\3\16\5\16\u00dc\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u011d\n\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u0130\n\21\f\21\16\21\u0133\13\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0157\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u0165\n\26\f\26\16\26\u0168\13\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0186"+
		"\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\7\27\u01a6\n\27\f\27\16\27\u01a9\13\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01b8\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u01bf\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\7\32\u01c9\n\32\f\32\16\32\u01cc\13\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u01da\n\33\f\33\16\33\u01dd\13"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01e7\n\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01f2\n\36\3\37\3\37\3 \3 \3"+
		"!\3!\3\"\3\"\3\"\5\"\u01fd\n\"\3\"\2\r\4\6\n\22\26\30 *,\62\64#\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\6\3\2%"+
		"&\4\2\t\t++\3\2-.\4\2\17\17//\u0212\2D\3\2\2\2\4L\3\2\2\2\6i\3\2\2\2\b"+
		"|\3\2\2\2\n\u0082\3\2\2\2\f\u00a0\3\2\2\2\16\u00a2\3\2\2\2\20\u00aa\3"+
		"\2\2\2\22\u00ac\3\2\2\2\24\u00b9\3\2\2\2\26\u00bf\3\2\2\2\30\u00c9\3\2"+
		"\2\2\32\u00db\3\2\2\2\34\u011c\3\2\2\2\36\u011e\3\2\2\2 \u0121\3\2\2\2"+
		"\"\u0134\3\2\2\2$\u0137\3\2\2\2&\u013a\3\2\2\2(\u013c\3\2\2\2*\u0156\3"+
		"\2\2\2,\u0185\3\2\2\2.\u01b7\3\2\2\2\60\u01be\3\2\2\2\62\u01c0\3\2\2\2"+
		"\64\u01cd\3\2\2\2\66\u01e6\3\2\2\28\u01e8\3\2\2\2:\u01f1\3\2\2\2<\u01f3"+
		"\3\2\2\2>\u01f5\3\2\2\2@\u01f7\3\2\2\2B\u01fc\3\2\2\2DE\7\30\2\2EF\7\31"+
		"\2\2FG\7\3\2\2GH\5\4\3\2HI\5\n\6\2IJ\7\4\2\2JK\b\2\1\2K\3\3\2\2\2LM\b"+
		"\3\1\2MN\b\3\1\2N[\3\2\2\2OP\f\5\2\2PQ\5\6\4\2QR\7\5\2\2RS\b\3\1\2SZ\3"+
		"\2\2\2TU\f\4\2\2UV\5\b\5\2VW\7\5\2\2WX\b\3\1\2XZ\3\2\2\2YO\3\2\2\2YT\3"+
		"\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\5\3\2\2\2][\3\2\2\2^_\b\4\1\2"+
		"_`\7(\2\2`a\7)\2\2aj\b\4\1\2bc\7(\2\2cd\7)\2\2de\7\7\2\2ef\58\35\2fg\7"+
		"\b\2\2gh\b\4\1\2hj\3\2\2\2i^\3\2\2\2ib\3\2\2\2jy\3\2\2\2kl\f\6\2\2lm\7"+
		"\6\2\2mn\7)\2\2nx\b\4\1\2op\f\5\2\2pq\7\6\2\2qr\7)\2\2rs\7\7\2\2st\58"+
		"\35\2tu\7\b\2\2uv\b\4\1\2vx\3\2\2\2wk\3\2\2\2wo\3\2\2\2x{\3\2\2\2yw\3"+
		"\2\2\2yz\3\2\2\2z\7\3\2\2\2{y\3\2\2\2|}\7(\2\2}~\7)\2\2~\177\7\t\2\2\177"+
		"\u0080\5:\36\2\u0080\u0081\b\5\1\2\u0081\t\3\2\2\2\u0082\u0083\b\6\1\2"+
		"\u0083\u0084\b\6\1\2\u0084\u008b\3\2\2\2\u0085\u0086\f\4\2\2\u0086\u0087"+
		"\5\f\7\2\u0087\u0088\b\6\1\2\u0088\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\13\3\2\2"+
		"\2\u008d\u008b\3\2\2\2\u008e\u008f\7(\2\2\u008f\u0090\7)\2\2\u0090\u0091"+
		"\5\16\b\2\u0091\u0092\7\n\2\2\u0092\u0093\5\20\t\2\u0093\u0094\7\13\2"+
		"\2\u0094\u0095\5\24\13\2\u0095\u0096\b\7\1\2\u0096\u00a1\3\2\2\2\u0097"+
		"\u0098\7\32\2\2\u0098\u0099\7)\2\2\u0099\u009a\5\16\b\2\u009a\u009b\7"+
		"\n\2\2\u009b\u009c\5\20\t\2\u009c\u009d\7\13\2\2\u009d\u009e\5\24\13\2"+
		"\u009e\u009f\b\7\1\2\u009f\u00a1\3\2\2\2\u00a0\u008e\3\2\2\2\u00a0\u0097"+
		"\3\2\2\2\u00a1\r\3\2\2\2\u00a2\u00a3\b\b\1\2\u00a3\17\3\2\2\2\u00a4\u00a5"+
		"\7(\2\2\u00a5\u00a6\7)\2\2\u00a6\u00a7\5\22\n\2\u00a7\u00a8\b\t\1\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00ab\b\t\1\2\u00aa\u00a4\3\2\2\2\u00aa\u00a9\3\2"+
		"\2\2\u00ab\21\3\2\2\2\u00ac\u00ad\b\n\1\2\u00ad\u00ae\b\n\1\2\u00ae\u00b6"+
		"\3\2\2\2\u00af\u00b0\f\4\2\2\u00b0\u00b1\7\6\2\2\u00b1\u00b2\7(\2\2\u00b2"+
		"\u00b3\7)\2\2\u00b3\u00b5\b\n\1\2\u00b4\u00af\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\23\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00ba\7\3\2\2\u00ba\u00bb\5\26\f\2\u00bb\u00bc\5\32\16"+
		"\2\u00bc\u00bd\7\4\2\2\u00bd\u00be\b\13\1\2\u00be\25\3\2\2\2\u00bf\u00c6"+
		"\b\f\1\2\u00c0\u00c1\f\4\2\2\u00c1\u00c2\5\30\r\2\u00c2\u00c3\7\5\2\2"+
		"\u00c3\u00c5\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\27\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ca\b\r\1\2\u00ca\u00cb\7(\2\2\u00cb\u00cc\7)\2\2\u00cc\u00cd\b\r\1"+
		"\2\u00cd\u00d4\3\2\2\2\u00ce\u00cf\f\4\2\2\u00cf\u00d0\7\6\2\2\u00d0\u00d1"+
		"\7)\2\2\u00d1\u00d3\b\r\1\2\u00d2\u00ce\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\31\3\2\2\2\u00d6\u00d4\3\2\2"+
		"\2\u00d7\u00d8\5\34\17\2\u00d8\u00d9\5\32\16\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00d7\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\33\3\2\2"+
		"\2\u00dd\u00de\5\66\34\2\u00de\u00df\7\t\2\2\u00df\u00e0\5,\27\2\u00e0"+
		"\u00e1\7\5\2\2\u00e1\u00e2\b\17\1\2\u00e2\u011d\3\2\2\2\u00e3\u00e4\5"+
		"\24\13\2\u00e4\u00e5\b\17\1\2\u00e5\u011d\3\2\2\2\u00e6\u00e7\7\36\2\2"+
		"\u00e7\u00e8\7\n\2\2\u00e8\u00e9\5*\26\2\u00e9\u00ea\7\13\2\2\u00ea\u00eb"+
		"\5&\24\2\u00eb\u00ec\5\24\13\2\u00ec\u00ed\b\17\1\2\u00ed\u011d\3\2\2"+
		"\2\u00ee\u00ef\7\36\2\2\u00ef\u00f0\7\n\2\2\u00f0\u00f1\5*\26\2\u00f1"+
		"\u00f2\7\13\2\2\u00f2\u00f3\5&\24\2\u00f3\u00f4\5\24\13\2\u00f4\u00f5"+
		"\5(\25\2\u00f5\u00f6\7\37\2\2\u00f6\u00f7\5&\24\2\u00f7\u00f8\5\24\13"+
		"\2\u00f8\u00f9\b\17\1\2\u00f9\u011d\3\2\2\2\u00fa\u00fb\7\34\2\2\u00fb"+
		"\u00fc\5\36\20\2\u00fc\u00fd\7\3\2\2\u00fd\u00fe\5 \21\2\u00fe\u00ff\7"+
		"\4\2\2\u00ff\u0100\b\17\1\2\u0100\u011d\3\2\2\2\u0101\u0102\7\33\2\2\u0102"+
		"\u0103\5&\24\2\u0103\u0104\7\n\2\2\u0104\u0105\5*\26\2\u0105\u0106\7\13"+
		"\2\2\u0106\u0107\5&\24\2\u0107\u0108\5\24\13\2\u0108\u0109\b\17\1\2\u0109"+
		"\u011d\3\2\2\2\u010a\u010b\5.\30\2\u010b\u010c\7\5\2\2\u010c\u010d\b\17"+
		"\1\2\u010d\u011d\3\2\2\2\u010e\u010f\7!\2\2\u010f\u0110\7\5\2\2\u0110"+
		"\u011d\b\17\1\2\u0111\u0112\7!\2\2\u0112\u0113\5,\27\2\u0113\u0114\7\5"+
		"\2\2\u0114\u0115\b\17\1\2\u0115\u011d\3\2\2\2\u0116\u0117\7\"\2\2\u0117"+
		"\u0118\7\5\2\2\u0118\u011d\b\17\1\2\u0119\u011a\7#\2\2\u011a\u011b\7\5"+
		"\2\2\u011b\u011d\b\17\1\2\u011c\u00dd\3\2\2\2\u011c\u00e3\3\2\2\2\u011c"+
		"\u00e6\3\2\2\2\u011c\u00ee\3\2\2\2\u011c\u00fa\3\2\2\2\u011c\u0101\3\2"+
		"\2\2\u011c\u010a\3\2\2\2\u011c\u010e\3\2\2\2\u011c\u0111\3\2\2\2\u011c"+
		"\u0116\3\2\2\2\u011c\u0119\3\2\2\2\u011d\35\3\2\2\2\u011e\u011f\5,\27"+
		"\2\u011f\u0120\b\20\1\2\u0120\37\3\2\2\2\u0121\u0122\b\21\1\2\u0122\u0123"+
		"\7\35\2\2\u0123\u0124\5$\23\2\u0124\u0125\7\f\2\2\u0125\u0126\5\32\16"+
		"\2\u0126\u0127\b\21\1\2\u0127\u0131\3\2\2\2\u0128\u0129\f\4\2\2\u0129"+
		"\u012a\7\35\2\2\u012a\u012b\5\"\22\2\u012b\u012c\7\f\2\2\u012c\u012d\5"+
		"\32\16\2\u012d\u012e\b\21\1\2\u012e\u0130\3\2\2\2\u012f\u0128\3\2\2\2"+
		"\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132!\3"+
		"\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\5:\36\2\u0135\u0136\b\22\1\2\u0136"+
		"#\3\2\2\2\u0137\u0138\5:\36\2\u0138\u0139\b\23\1\2\u0139%\3\2\2\2\u013a"+
		"\u013b\b\24\1\2\u013b\'\3\2\2\2\u013c\u013d\b\25\1\2\u013d)\3\2\2\2\u013e"+
		"\u013f\b\26\1\2\u013f\u0140\7\17\2\2\u0140\u0141\5*\26\t\u0141\u0142\b"+
		"\26\1\2\u0142\u0157\3\2\2\2\u0143\u0144\7\n\2\2\u0144\u0145\5*\26\2\u0145"+
		"\u0146\7\13\2\2\u0146\u0147\b\26\1\2\u0147\u0157\3\2\2\2\u0148\u0149\5"+
		",\27\2\u0149\u014a\7*\2\2\u014a\u014b\5,\27\2\u014b\u014c\b\26\1\2\u014c"+
		"\u0157\3\2\2\2\u014d\u014e\7\20\2\2\u014e\u0157\b\26\1\2\u014f\u0150\7"+
		"\21\2\2\u0150\u0157\b\26\1\2\u0151\u0152\58\35\2\u0152\u0153\b\26\1\2"+
		"\u0153\u0157\3\2\2\2\u0154\u0155\7)\2\2\u0155\u0157\b\26\1\2\u0156\u013e"+
		"\3\2\2\2\u0156\u0143\3\2\2\2\u0156\u0148\3\2\2\2\u0156\u014d\3\2\2\2\u0156"+
		"\u014f\3\2\2\2\u0156\u0151\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0166\3\2"+
		"\2\2\u0158\u0159\f\13\2\2\u0159\u015a\7\r\2\2\u015a\u015b\5&\24\2\u015b"+
		"\u015c\5*\26\f\u015c\u015d\b\26\1\2\u015d\u0165\3\2\2\2\u015e\u015f\f"+
		"\n\2\2\u015f\u0160\7\16\2\2\u0160\u0161\5&\24\2\u0161\u0162\5*\26\13\u0162"+
		"\u0163\b\26\1\2\u0163\u0165\3\2\2\2\u0164\u0158\3\2\2\2\u0164\u015e\3"+
		"\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"+\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\b\27\1\2\u016a\u016b\5:\36\2"+
		"\u016b\u016c\b\27\1\2\u016c\u0186\3\2\2\2\u016d\u016e\7)\2\2\u016e\u0186"+
		"\b\27\1\2\u016f\u0170\7)\2\2\u0170\u0171\7\7\2\2\u0171\u0172\5,\27\2\u0172"+
		"\u0173\7\b\2\2\u0173\u0174\b\27\1\2\u0174\u0186\3\2\2\2\u0175\u0176\7"+
		"\n\2\2\u0176\u0177\5,\27\2\u0177\u0178\7\13\2\2\u0178\u0179\b\27\1\2\u0179"+
		"\u0186\3\2\2\2\u017a\u017b\7,\2\2\u017b\u017c\5,\27\13\u017c\u017d\b\27"+
		"\1\2\u017d\u0186\3\2\2\2\u017e\u017f\7\17\2\2\u017f\u0180\5,\27\4\u0180"+
		"\u0181\b\27\1\2\u0181\u0186\3\2\2\2\u0182\u0183\5.\30\2\u0183\u0184\b"+
		"\27\1\2\u0184\u0186\3\2\2\2\u0185\u0169\3\2\2\2\u0185\u016d\3\2\2\2\u0185"+
		"\u016f\3\2\2\2\u0185\u0175\3\2\2\2\u0185\u017a\3\2\2\2\u0185\u017e\3\2"+
		"\2\2\u0185\u0182\3\2\2\2\u0186\u01a7\3\2\2\2\u0187\u0188\f\n\2\2\u0188"+
		"\u0189\7\22\2\2\u0189\u018a\5,\27\13\u018a\u018b\b\27\1\2\u018b\u01a6"+
		"\3\2\2\2\u018c\u018d\f\t\2\2\u018d\u018e\7\23\2\2\u018e\u018f\5,\27\n"+
		"\u018f\u0190\b\27\1\2\u0190\u01a6\3\2\2\2\u0191\u0192\f\b\2\2\u0192\u0193"+
		"\7\24\2\2\u0193\u0194\5,\27\t\u0194\u0195\b\27\1\2\u0195\u01a6\3\2\2\2"+
		"\u0196\u0197\f\7\2\2\u0197\u0198\7,\2\2\u0198\u0199\5,\27\b\u0199\u019a"+
		"\b\27\1\2\u019a\u01a6\3\2\2\2\u019b\u019c\f\6\2\2\u019c\u019d\7/\2\2\u019d"+
		"\u019e\5,\27\7\u019e\u019f\b\27\1\2\u019f\u01a6\3\2\2\2\u01a0\u01a1\f"+
		"\5\2\2\u01a1\u01a2\7*\2\2\u01a2\u01a3\5,\27\6\u01a3\u01a4\b\27\1\2\u01a4"+
		"\u01a6\3\2\2\2\u01a5\u0187\3\2\2\2\u01a5\u018c\3\2\2\2\u01a5\u0191\3\2"+
		"\2\2\u01a5\u0196\3\2\2\2\u01a5\u019b\3\2\2\2\u01a5\u01a0\3\2\2\2\u01a6"+
		"\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8-\3\2\2\2"+
		"\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7)\2\2\u01ab\u01ac\7\n\2\2\u01ac\u01ad"+
		"\5\60\31\2\u01ad\u01ae\7\13\2\2\u01ae\u01af\b\30\1\2\u01af\u01b8\3\2\2"+
		"\2\u01b0\u01b1\7$\2\2\u01b1\u01b2\7\n\2\2\u01b2\u01b3\7\27\2\2\u01b3\u01b4"+
		"\5\64\33\2\u01b4\u01b5\7\13\2\2\u01b5\u01b6\b\30\1\2\u01b6\u01b8\3\2\2"+
		"\2\u01b7\u01aa\3\2\2\2\u01b7\u01b0\3\2\2\2\u01b8/\3\2\2\2\u01b9\u01ba"+
		"\5,\27\2\u01ba\u01bb\5\62\32\2\u01bb\u01bc\b\31\1\2\u01bc\u01bf\3\2\2"+
		"\2\u01bd\u01bf\b\31\1\2\u01be\u01b9\3\2\2\2\u01be\u01bd\3\2\2\2\u01bf"+
		"\61\3\2\2\2\u01c0\u01c1\b\32\1\2\u01c1\u01c2\b\32\1\2\u01c2\u01ca\3\2"+
		"\2\2\u01c3\u01c4\f\4\2\2\u01c4\u01c5\7\6\2\2\u01c5\u01c6\5,\27\2\u01c6"+
		"\u01c7\b\32\1\2\u01c7\u01c9\3\2\2\2\u01c8\u01c3\3\2\2\2\u01c9\u01cc\3"+
		"\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\63\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\u01ce\b\33\1\2\u01ce\u01cf\b\33\1\2\u01cf\u01db\3"+
		"\2\2\2\u01d0\u01d1\f\5\2\2\u01d1\u01d2\7\6\2\2\u01d2\u01d3\5,\27\2\u01d3"+
		"\u01d4\b\33\1\2\u01d4\u01da\3\2\2\2\u01d5\u01d6\f\4\2\2\u01d6\u01d7\7"+
		"\6\2\2\u01d7\u01d8\7\27\2\2\u01d8\u01da\b\33\1\2\u01d9\u01d0\3\2\2\2\u01d9"+
		"\u01d5\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2"+
		"\2\2\u01dc\65\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\7)\2\2\u01df\u01e7"+
		"\b\34\1\2\u01e0\u01e1\7)\2\2\u01e1\u01e2\7\7\2\2\u01e2\u01e3\5,\27\2\u01e3"+
		"\u01e4\7\b\2\2\u01e4\u01e5\b\34\1\2\u01e5\u01e7\3\2\2\2\u01e6\u01de\3"+
		"\2\2\2\u01e6\u01e0\3\2\2\2\u01e7\67\3\2\2\2\u01e8\u01e9\t\2\2\2\u01e9"+
		"9\3\2\2\2\u01ea\u01eb\58\35\2\u01eb\u01ec\b\36\1\2\u01ec\u01f2\3\2\2\2"+
		"\u01ed\u01ee\7\26\2\2\u01ee\u01f2\b\36\1\2\u01ef\u01f0\7\'\2\2\u01f0\u01f2"+
		"\b\36\1\2\u01f1\u01ea\3\2\2\2\u01f1\u01ed\3\2\2\2\u01f1\u01ef\3\2\2\2"+
		"\u01f2;\3\2\2\2\u01f3\u01f4\t\3\2\2\u01f4=\3\2\2\2\u01f5\u01f6\t\4\2\2"+
		"\u01f6?\3\2\2\2\u01f7\u01f8\t\5\2\2\u01f8A\3\2\2\2\u01f9\u01fd\5> \2\u01fa"+
		"\u01fd\7*\2\2\u01fb\u01fd\7/\2\2\u01fc\u01f9\3\2\2\2\u01fc\u01fa\3\2\2"+
		"\2\u01fc\u01fb\3\2\2\2\u01fdC\3\2\2\2\36Y[iwy\u008b\u00a0\u00aa\u00b6"+
		"\u00c6\u00d4\u00db\u011c\u0131\u0156\u0164\u0166\u0185\u01a5\u01a7\u01b7"+
		"\u01be\u01ca\u01d9\u01db\u01e6\u01f1\u01fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}