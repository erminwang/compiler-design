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
		RULE_prog = 0, RULE_field_decls = 1, RULE_field_decl = 2, RULE_inited_field_decl = 3, 
		RULE_method_decls = 4, RULE_method_decl = 5, RULE_functionLabel = 6, RULE_params = 7, 
		RULE_nextParams = 8, RULE_block = 9, RULE_var_decls = 10, RULE_var_decl = 11, 
		RULE_statements = 12, RULE_statement = 13, RULE_m = 14, RULE_n = 15, RULE_bool_expr = 16, 
		RULE_expr = 17, RULE_methodCall = 18, RULE_arguments = 19, RULE_nextArgs = 20, 
		RULE_nextCalloutArgs = 21, RULE_location = 22, RULE_intLit = 23, RULE_literal = 24, 
		RULE_eqOp = 25, RULE_mathOp = 26, RULE_boolOp = 27, RULE_binOp = 28;
	public static final String[] ruleNames = {
		"prog", "field_decls", "field_decl", "inited_field_decl", "method_decls", 
		"method_decl", "functionLabel", "params", "nextParams", "block", "var_decls", 
		"var_decl", "statements", "statement", "m", "n", "bool_expr", "expr", 
		"methodCall", "arguments", "nextArgs", "nextCalloutArgs", "location", 
		"intLit", "literal", "eqOp", "mathOp", "boolOp", "binOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", "'['", "']'", "'='", "'('", "')'", "'&&'", 
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
			}else if (src1 == -9 && op.equals("function")) { //print fucntion name
				System.out.println(s.GetName(src2) + ":");
			}else if (src1 == -1 && src2 == -1 && !op.equals("ret")) { // goto L_  instruction
				System.out.println("L_" + label + ": " + " goto " + "L_" + dst);
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
			for(int i = 0; i < breakList.length; i++) {
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
	}

	LoopList l = new LoopList(10);


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
			setState(58);
			match(Class);
			setState(59);
			match(Program);
			setState(60);
			match(T__0);
			setState(61);
			field_decls(0);
			setState(62);
			method_decls(0);
			setState(63);
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
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(79);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new Field_declsContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decls);
						setState(69);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(70);
						field_decl(0);
						setState(71);
						match(T__2);


						          
						}
						break;
					case 2:
						{
						_localctx = new Field_declsContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decls);
						setState(74);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(75);
						inited_field_decl();
						setState(76);
						match(T__2);


						          
						}
						break;
					}
					} 
				}
				setState(83);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(85);
				((Field_declContext)_localctx).Type = match(Type);
				setState(86);
				((Field_declContext)_localctx).Ident = match(Ident);

					((Field_declContext)_localctx).t =  DataType.valueOf((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null).toUpperCase());
					s.insert((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null), _localctx.t);

				}
				break;
			case 2:
				{
				setState(88);
				((Field_declContext)_localctx).Type = match(Type);
				setState(89);
				((Field_declContext)_localctx).Ident = match(Ident);
				setState(90);
				match(T__4);
				setState(91);
				intLit();
				setState(92);
				match(T__5);

					((Field_declContext)_localctx).t =  DataType.valueOf((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null).toUpperCase());
					s.insert((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null), _localctx.t);

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Field_declContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_field_decl);
						setState(97);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(98);
						match(T__3);
						setState(99);
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
						setState(101);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(102);
						match(T__3);
						setState(103);
						((Field_declContext)_localctx).Ident = match(Ident);
						setState(104);
						match(T__4);
						setState(105);
						intLit();
						setState(106);
						match(T__5);

						          	((Field_declContext)_localctx).t =  ((Field_declContext)_localctx).f.t;
						          	s.insert((((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null), _localctx.t);
						          
						}
						break;
					}
					} 
				}
				setState(113);
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
			setState(114);
			((Inited_field_declContext)_localctx).Type = match(Type);
			setState(115);
			((Inited_field_declContext)_localctx).Ident = match(Ident);
			setState(116);
			match(T__6);
			setState(117);
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
			setState(129);
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
					setState(123);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(124);
					method_decl();


					          
					}
					} 
				}
				setState(131);
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
			setState(150);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				((Method_declContext)_localctx).Type = match(Type);
				setState(133);
				((Method_declContext)_localctx).Ident = match(Ident);
				setState(134);
				((Method_declContext)_localctx).functionLabel = functionLabel();
				setState(135);
				match(T__7);
				setState(136);
				params();
				setState(137);
				match(T__8);
				setState(138);
				block();

					int id = s.insert((((Method_declContext)_localctx).Ident!=null?((Method_declContext)_localctx).Ident.getText():null), DataType.valueOf((((Method_declContext)_localctx).Type!=null?((Method_declContext)_localctx).Type.getText():null).toUpperCase()));
					q.PatchSrc2(((Method_declContext)_localctx).functionLabel.id, id);

				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				((Method_declContext)_localctx).Void = match(Void);
				setState(142);
				((Method_declContext)_localctx).Ident = match(Ident);
				setState(143);
				((Method_declContext)_localctx).functionLabel = functionLabel();
				setState(144);
				match(T__7);
				setState(145);
				params();
				setState(146);
				match(T__8);
				setState(147);
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
			setState(160);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				((ParamsContext)_localctx).Type = match(Type);
				setState(155);
				((ParamsContext)_localctx).Ident = match(Ident);
				setState(156);
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
			setState(172);
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
					setState(165);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(166);
					match(T__3);
					setState(167);
					((NextParamsContext)_localctx).Type = match(Type);
					setState(168);
					((NextParamsContext)_localctx).Ident = match(Ident);

					          	s.insert((((NextParamsContext)_localctx).Ident!=null?((NextParamsContext)_localctx).Ident.getText():null), DataType.valueOf((((NextParamsContext)_localctx).Type!=null?((NextParamsContext)_localctx).Type.getText():null).toUpperCase()));
					          
					}
					} 
				}
				setState(174);
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
			setState(175);
			match(T__0);
			setState(176);
			var_decls(0);
			setState(177);
			statements();
			setState(178);
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
			setState(188);
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
					setState(182);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(183);
					var_decl(0);
					setState(184);
					match(T__2);
					}
					} 
				}
				setState(190);
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
			setState(192);
			((Var_declContext)_localctx).Type = match(Type);
			setState(193);
			((Var_declContext)_localctx).Ident = match(Ident);

				((Var_declContext)_localctx).t =  DataType.valueOf((((Var_declContext)_localctx).Type!=null?((Var_declContext)_localctx).Type.getText():null).toUpperCase());
				s.insert((((Var_declContext)_localctx).Ident!=null?((Var_declContext)_localctx).Ident.getText():null), _localctx.t);


			}
			_ctx.stop = _input.LT(-1);
			setState(202);
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
					setState(196);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(197);
					match(T__3);
					setState(198);
					((Var_declContext)_localctx).Ident = match(Ident);

					          	((Var_declContext)_localctx).t =  ((Var_declContext)_localctx).v.t;
					          	s.insert((((Var_declContext)_localctx).Ident!=null?((Var_declContext)_localctx).Ident.getText():null), _localctx.t);
					          
					}
					} 
				}
				setState(204);
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
			setState(209);
			switch (_input.LA(1)) {
			case T__0:
			case While:
			case If:
			case Ret:
			case Brk:
			case Cnt:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				statement();
				setState(206);
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
		public TerminalNode While() { return getToken(Cmpt379CompilerParser.While, 0); }
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
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				((StatementContext)_localctx).location = location();
				setState(212);
				match(T__6);
				setState(213);
				((StatementContext)_localctx).expr = expr(0);
				setState(214);
				match(T__2);

					q.Add(((StatementContext)_localctx).location.id, ((StatementContext)_localctx).expr.id, -1, "=");

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				block();



				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(If);
				setState(221);
				match(T__7);
				setState(222);
				((StatementContext)_localctx).bool_expr = bool_expr(0);
				setState(223);
				match(T__8);
				setState(224);
				((StatementContext)_localctx).m = m();
				setState(225);
				block();

					if(((StatementContext)_localctx).bool_expr.is.truelist[0] != -1) {
						int trueId = ((((StatementContext)_localctx).bool_expr.is).truelist)[0];
						q.PatchSrc2(trueId, ((StatementContext)_localctx).m.id);
						/* System.out.println("trueId is : " + trueId);
						System.out.println("((StatementContext)_localctx).m.id is : " + ((StatementContext)_localctx).m.id); */
					}

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
				setState(228);
				match(If);
				setState(229);
				match(T__7);
				setState(230);
				((StatementContext)_localctx).b = bool_expr(0);
				setState(231);
				match(T__8);
				setState(232);
				((StatementContext)_localctx).m1 = m();
				setState(233);
				((StatementContext)_localctx).b1 = block();
				setState(234);
				((StatementContext)_localctx).n = n();
				setState(235);
				match(Else);
				setState(236);
				((StatementContext)_localctx).m2 = m();
				setState(237);
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

					int nid = ((StatementContext)_localctx).n.id;
					System.out.println("nid : " + nid);
					q.PatchSrc2(nid, q.size);

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				match(While);
				setState(241);
				((StatementContext)_localctx).m1 = ((StatementContext)_localctx).m = m();
				setState(242);
				match(T__7);
				setState(243);
				((StatementContext)_localctx).bool_expr = bool_expr(0);
				setState(244);
				match(T__8);
				setState(245);
				((StatementContext)_localctx).m2 = ((StatementContext)_localctx).m = m();
				setState(246);
				block();

					System.out.println("((StatementContext)_localctx).m1.id is : " + ((StatementContext)_localctx).m1.id);
					if(((StatementContext)_localctx).bool_expr.is.truelist[0] != -1) {
						int trueId = ((((StatementContext)_localctx).bool_expr.is).truelist)[0];
						q.PatchSrc2(trueId, ((StatementContext)_localctx).m2.id);
						/* System.out.println("trueId is : " + trueId);
						System.out.println("((StatementContext)_localctx).m.id is : " + ((StatementContext)_localctx).m.id); */
					}

					if(((StatementContext)_localctx).bool_expr.is.falselist[0] != -1) {
						int falseId = ((((StatementContext)_localctx).bool_expr.is).falselist)[0];
						q.PatchSrc2(falseId, q.size + 1);
						/* System.out.println("q.size is : " + q.size); */
						/* System.out.println("falseId is : " + falseId); */
					}
					for(int i = 0; i < l.sizeb; i++) {
						q.PatchSrc2(l.breakList[i], q.size + 1);
					}
					for(int i = 0; i < l.sizec; i++) {
						q.PatchSrc2(l.continueList[i], q.size + 1);
					}
					q.Add(-1, -1, ((StatementContext)_localctx).m1.id, "goto");

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(249);
				match(Ret);
				setState(250);
				match(T__2);

					q.Add(-1, -1, -4, "ret");

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				match(Ret);
				setState(253);
				match(T__7);
				setState(254);
				((StatementContext)_localctx).expr = expr(0);
				setState(255);
				match(T__8);
				setState(256);
				match(T__2);

					int id = ((StatementContext)_localctx).expr.id;
					q.Add(-1, id, -4, "ret");

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(259);
				match(Brk);
				setState(260);
				match(T__2);

					// add goto L_15 to QuadTab
					int breakId = q.Add(-1, -1, -1, "break");
					l.AddToBreakList(breakId);


				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(262);
				match(Cnt);
				setState(263);
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
		enterRule(_localctx, 28, RULE_m);
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
		enterRule(_localctx, 30, RULE_n);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_bool_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(272);
				match(T__11);
				setState(273);
				((Bool_exprContext)_localctx).b1 = bool_expr(7);



				}
				break;
			case 2:
				{
				setState(276);
				match(T__7);
				setState(277);
				((Bool_exprContext)_localctx).b1 = bool_expr(0);
				setState(278);
				match(T__8);



				}
				break;
			case 3:
				{
				setState(281);
				((Bool_exprContext)_localctx).e1 = expr(0);
				setState(282);
				((Bool_exprContext)_localctx).RelOp = match(RelOp);
				setState(283);
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
				setState(286);
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
				setState(288);
				match(T__13);

					InstructionSet instructionSet = new InstructionSet();
					instructionSet.AddToFalseList(q.size);
					((Bool_exprContext)_localctx).is =  instructionSet;
					q.Add(-1, -1, -1, "goto");

				}
				break;
			case 6:
				{
				setState(290);
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
				setState(293);
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
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(307);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Bool_exprContext(_parentctx, _parentState);
						_localctx.b1 = _prevctx;
						_localctx.b1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
						setState(297);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(298);
						match(T__9);
						setState(299);
						((Bool_exprContext)_localctx).b2 = bool_expr(10);


						          
						}
						break;
					case 2:
						{
						_localctx = new Bool_exprContext(_parentctx, _parentState);
						_localctx.b1 = _prevctx;
						_localctx.b1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
						setState(302);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(303);
						match(T__10);
						setState(304);
						((Bool_exprContext)_localctx).b2 = bool_expr(9);


						          
						}
						break;
					}
					} 
				}
				setState(311);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(313);
				((ExprContext)_localctx).literal = literal();

					((ExprContext)_localctx).id =  ((ExprContext)_localctx).literal.id;

				}
				break;
			case 2:
				{
				setState(316);
				((ExprContext)_localctx).Ident = match(Ident);

					((ExprContext)_localctx).id =  s.Find((((ExprContext)_localctx).Ident!=null?((ExprContext)_localctx).Ident.getText():null));

				}
				break;
			case 3:
				{
				setState(318);
				((ExprContext)_localctx).Ident = match(Ident);
				setState(319);
				match(T__4);
				setState(320);
				((ExprContext)_localctx).e1 = expr(0);
				setState(321);
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
				setState(324);
				match(T__7);
				setState(325);
				((ExprContext)_localctx).e1 = expr(0);
				setState(326);
				match(T__8);

					((ExprContext)_localctx).id =  ((ExprContext)_localctx).e1.id;

				}
				break;
			case 5:
				{
				setState(329);
				match(Minus);
				setState(330);
				((ExprContext)_localctx).e1 = expr(9);

					int id = s.insert("0", s.GetType(((ExprContext)_localctx).e1.id));
					((ExprContext)_localctx).id =  s.Add(s.GetType(((ExprContext)_localctx).e1.id));
					q.Add(_localctx.id, id, ((ExprContext)_localctx).e1.id, "-");

				}
				break;
			case 6:
				{
				setState(333);
				match(T__11);
				setState(334);
				((ExprContext)_localctx).e1 = expr(2);

					// TODO: need modification
					((ExprContext)_localctx).id =  s.Add(s.GetType(((ExprContext)_localctx).e1.id));
					q.Add(_localctx.id, ((ExprContext)_localctx).e1.id, -1, "!");

				}
				break;
			case 7:
				{
				setState(337);
				((ExprContext)_localctx).methodCall = methodCall();

					((ExprContext)_localctx).id =  ((ExprContext)_localctx).methodCall.id;

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(372);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(342);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(343);
						match(T__14);
						setState(344);
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
						setState(347);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(348);
						match(T__15);
						setState(349);
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
						setState(352);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(353);
						match(T__16);
						setState(354);
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
						setState(357);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(358);
						match(Minus);
						setState(359);
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
						setState(362);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(363);
						((ExprContext)_localctx).CondOp = match(CondOp);
						setState(364);
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
						setState(367);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(368);
						((ExprContext)_localctx).RelOp = match(RelOp);
						setState(369);
						((ExprContext)_localctx).e2 = expr(4);

						          	((ExprContext)_localctx).id =  s.Add(s.GetType(((ExprContext)_localctx).e1.id));
						          	q.Add(_localctx.id, ((ExprContext)_localctx).e1.id, ((ExprContext)_localctx).e2.id, (((ExprContext)_localctx).RelOp!=null?((ExprContext)_localctx).RelOp.getText():null));
						          
						}
						break;
					}
					} 
				}
				setState(376);
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
		enterRule(_localctx, 36, RULE_methodCall);
		try {
			setState(390);
			switch (_input.LA(1)) {
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				((MethodCallContext)_localctx).Ident = match(Ident);
				setState(378);
				match(T__7);
				setState(379);
				((MethodCallContext)_localctx).arguments = arguments();
				setState(380);
				match(T__8);

					int id2 = s.Add(DataType.INT);   //make a t_
					((MethodCallContext)_localctx).id =  q.Add(id2, -5, ((MethodCallContext)_localctx).arguments.count, (((MethodCallContext)_localctx).Ident!=null?((MethodCallContext)_localctx).Ident.getText():null));

				}
				break;
			case Callout:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(Callout);
				setState(384);
				match(T__7);
				setState(385);
				((MethodCallContext)_localctx).Str = match(Str);
				setState(386);
				((MethodCallContext)_localctx).nextCalloutArgs = nextCalloutArgs(0);
				setState(387);
				match(T__8);

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
		enterRule(_localctx, 38, RULE_arguments);
		try {
			setState(397);
			switch (_input.LA(1)) {
			case T__7:
			case T__11:
			case Char:
			case Callout:
			case DecNum:
			case HexNum:
			case BoolLit:
			case Ident:
			case Minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				((ArgumentsContext)_localctx).expr = expr(0);
				setState(393);
				((ArgumentsContext)_localctx).nextArgs = nextArgs(0);

					((ArgumentsContext)_localctx).count =  ((ArgumentsContext)_localctx).nextArgs.count + 1;
					int id = ((ArgumentsContext)_localctx).expr.id;
					q.Add(-7, id, -1, "param");

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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_nextArgs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{

			  ((NextArgsContext)_localctx).count =  0;

			}
			_ctx.stop = _input.LT(-1);
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
					setState(402);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(403);
					match(T__3);
					setState(404);
					((NextArgsContext)_localctx).expr = expr(0);

					          	((NextArgsContext)_localctx).count =  ((NextArgsContext)_localctx).nexta.count + 1;
					          	int id = ((NextArgsContext)_localctx).expr.id;
					          	q.Add(-7, id, -1, "param");
					          
					}
					} 
				}
				setState(411);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_nextCalloutArgs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{

				((NextCalloutArgsContext)_localctx).count =  0;

			}
			_ctx.stop = _input.LT(-1);
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(424);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new NextCalloutArgsContext(_parentctx, _parentState);
						_localctx.nextc = _prevctx;
						_localctx.nextc = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_nextCalloutArgs);
						setState(415);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(416);
						match(T__3);
						setState(417);
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
						setState(420);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(421);
						match(T__3);
						setState(422);
						((NextCalloutArgsContext)_localctx).Str = match(Str);

						          	q.Add(-8, -1, -1, (((NextCalloutArgsContext)_localctx).Str!=null?((NextCalloutArgsContext)_localctx).Str.getText():null));
						          	((NextCalloutArgsContext)_localctx).count =  ((NextCalloutArgsContext)_localctx).nextc.count + 1;
						          
						}
						break;
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 44, RULE_location);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				((LocationContext)_localctx).Ident = match(Ident);

					((LocationContext)_localctx).id =  s.Find((((LocationContext)_localctx).Ident!=null?((LocationContext)_localctx).Ident.getText():null));

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				((LocationContext)_localctx).Ident = match(Ident);
				setState(432);
				match(T__4);
				setState(433);
				((LocationContext)_localctx).expr = expr(0);
				setState(434);
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
		enterRule(_localctx, 46, RULE_intLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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
		enterRule(_localctx, 48, RULE_literal);
		try {
			setState(448);
			switch (_input.LA(1)) {
			case DecNum:
			case HexNum:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				((LiteralContext)_localctx).intLit = intLit();

					((LiteralContext)_localctx).id =  s.insert((((LiteralContext)_localctx).intLit!=null?_input.getText(((LiteralContext)_localctx).intLit.start,((LiteralContext)_localctx).intLit.stop):null), DataType.INT);

				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				((LiteralContext)_localctx).Char = match(Char);

					((LiteralContext)_localctx).id =  s.insert((((LiteralContext)_localctx).Char!=null?((LiteralContext)_localctx).Char.getText():null), DataType.CHAR);

				}
				break;
			case BoolLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
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
		enterRule(_localctx, 50, RULE_eqOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
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
		enterRule(_localctx, 52, RULE_mathOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
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
		enterRule(_localctx, 54, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
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
		enterRule(_localctx, 56, RULE_binOp);
		try {
			setState(459);
			switch (_input.LA(1)) {
			case SecondOp:
			case ThirdOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				mathOp();
				}
				break;
			case RelOp:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				match(RelOp);
				}
				break;
			case CondOp:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
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
		case 16:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 20:
			return nextArgs_sempred((NextArgsContext)_localctx, predIndex);
		case 21:
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
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 5);
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean nextArgs_sempred(NextArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean nextCalloutArgs_sempred(NextCalloutArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 3);
		case 18:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u01d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3R"+
		"\n\3\f\3\16\3U\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4b\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4p\n\4\f\4\16\4s"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0082\n"+
		"\6\f\6\16\6\u0085\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0099\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00a3\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ad\n\n\f\n\16\n"+
		"\u00b0\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u00bd"+
		"\n\f\f\f\16\f\u00c0\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00cb"+
		"\n\r\f\r\16\r\u00ce\13\r\3\16\3\16\3\16\3\16\5\16\u00d4\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u010c\n\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u012a\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0136"+
		"\n\22\f\22\16\22\u0139\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u0157\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0177\n\23"+
		"\f\23\16\23\u017a\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u0189\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0190"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u019a\n\26\f\26\16"+
		"\26\u019d\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u01ab\n\27\f\27\16\27\u01ae\13\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u01b8\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u01c3\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\5\36"+
		"\u01ce\n\36\3\36\2\f\4\6\n\22\26\30\"$*,\37\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:\2\6\3\2$%\4\2\t\t**\3\2,-\4\2\16\16"+
		"..\u01e4\2<\3\2\2\2\4D\3\2\2\2\6a\3\2\2\2\bt\3\2\2\2\nz\3\2\2\2\f\u0098"+
		"\3\2\2\2\16\u009a\3\2\2\2\20\u00a2\3\2\2\2\22\u00a4\3\2\2\2\24\u00b1\3"+
		"\2\2\2\26\u00b7\3\2\2\2\30\u00c1\3\2\2\2\32\u00d3\3\2\2\2\34\u010b\3\2"+
		"\2\2\36\u010d\3\2\2\2 \u010f\3\2\2\2\"\u0129\3\2\2\2$\u0156\3\2\2\2&\u0188"+
		"\3\2\2\2(\u018f\3\2\2\2*\u0191\3\2\2\2,\u019e\3\2\2\2.\u01b7\3\2\2\2\60"+
		"\u01b9\3\2\2\2\62\u01c2\3\2\2\2\64\u01c4\3\2\2\2\66\u01c6\3\2\2\28\u01c8"+
		"\3\2\2\2:\u01cd\3\2\2\2<=\7\27\2\2=>\7\30\2\2>?\7\3\2\2?@\5\4\3\2@A\5"+
		"\n\6\2AB\7\4\2\2BC\b\2\1\2C\3\3\2\2\2DE\b\3\1\2EF\b\3\1\2FS\3\2\2\2GH"+
		"\f\5\2\2HI\5\6\4\2IJ\7\5\2\2JK\b\3\1\2KR\3\2\2\2LM\f\4\2\2MN\5\b\5\2N"+
		"O\7\5\2\2OP\b\3\1\2PR\3\2\2\2QG\3\2\2\2QL\3\2\2\2RU\3\2\2\2SQ\3\2\2\2"+
		"ST\3\2\2\2T\5\3\2\2\2US\3\2\2\2VW\b\4\1\2WX\7\'\2\2XY\7(\2\2Yb\b\4\1\2"+
		"Z[\7\'\2\2[\\\7(\2\2\\]\7\7\2\2]^\5\60\31\2^_\7\b\2\2_`\b\4\1\2`b\3\2"+
		"\2\2aV\3\2\2\2aZ\3\2\2\2bq\3\2\2\2cd\f\6\2\2de\7\6\2\2ef\7(\2\2fp\b\4"+
		"\1\2gh\f\5\2\2hi\7\6\2\2ij\7(\2\2jk\7\7\2\2kl\5\60\31\2lm\7\b\2\2mn\b"+
		"\4\1\2np\3\2\2\2oc\3\2\2\2og\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\7"+
		"\3\2\2\2sq\3\2\2\2tu\7\'\2\2uv\7(\2\2vw\7\t\2\2wx\5\62\32\2xy\b\5\1\2"+
		"y\t\3\2\2\2z{\b\6\1\2{|\b\6\1\2|\u0083\3\2\2\2}~\f\4\2\2~\177\5\f\7\2"+
		"\177\u0080\b\6\1\2\u0080\u0082\3\2\2\2\u0081}\3\2\2\2\u0082\u0085\3\2"+
		"\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\13\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\u0087\7\'\2\2\u0087\u0088\7(\2\2\u0088\u0089\5\16\b\2\u0089"+
		"\u008a\7\n\2\2\u008a\u008b\5\20\t\2\u008b\u008c\7\13\2\2\u008c\u008d\5"+
		"\24\13\2\u008d\u008e\b\7\1\2\u008e\u0099\3\2\2\2\u008f\u0090\7\31\2\2"+
		"\u0090\u0091\7(\2\2\u0091\u0092\5\16\b\2\u0092\u0093\7\n\2\2\u0093\u0094"+
		"\5\20\t\2\u0094\u0095\7\13\2\2\u0095\u0096\5\24\13\2\u0096\u0097\b\7\1"+
		"\2\u0097\u0099\3\2\2\2\u0098\u0086\3\2\2\2\u0098\u008f\3\2\2\2\u0099\r"+
		"\3\2\2\2\u009a\u009b\b\b\1\2\u009b\17\3\2\2\2\u009c\u009d\7\'\2\2\u009d"+
		"\u009e\7(\2\2\u009e\u009f\5\22\n\2\u009f\u00a0\b\t\1\2\u00a0\u00a3\3\2"+
		"\2\2\u00a1\u00a3\b\t\1\2\u00a2\u009c\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\21\3\2\2\2\u00a4\u00a5\b\n\1\2\u00a5\u00a6\b\n\1\2\u00a6\u00ae\3\2\2"+
		"\2\u00a7\u00a8\f\4\2\2\u00a8\u00a9\7\6\2\2\u00a9\u00aa\7\'\2\2\u00aa\u00ab"+
		"\7(\2\2\u00ab\u00ad\b\n\1\2\u00ac\u00a7\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\23\3\2\2\2\u00b0\u00ae\3\2\2"+
		"\2\u00b1\u00b2\7\3\2\2\u00b2\u00b3\5\26\f\2\u00b3\u00b4\5\32\16\2\u00b4"+
		"\u00b5\7\4\2\2\u00b5\u00b6\b\13\1\2\u00b6\25\3\2\2\2\u00b7\u00be\b\f\1"+
		"\2\u00b8\u00b9\f\4\2\2\u00b9\u00ba\5\30\r\2\u00ba\u00bb\7\5\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\27\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2"+
		"\b\r\1\2\u00c2\u00c3\7\'\2\2\u00c3\u00c4\7(\2\2\u00c4\u00c5\b\r\1\2\u00c5"+
		"\u00cc\3\2\2\2\u00c6\u00c7\f\4\2\2\u00c7\u00c8\7\6\2\2\u00c8\u00c9\7("+
		"\2\2\u00c9\u00cb\b\r\1\2\u00ca\u00c6\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\31\3\2\2\2\u00ce\u00cc\3\2\2"+
		"\2\u00cf\u00d0\5\34\17\2\u00d0\u00d1\5\32\16\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\33\3\2\2"+
		"\2\u00d5\u00d6\5.\30\2\u00d6\u00d7\7\t\2\2\u00d7\u00d8\5$\23\2\u00d8\u00d9"+
		"\7\5\2\2\u00d9\u00da\b\17\1\2\u00da\u010c\3\2\2\2\u00db\u00dc\5\24\13"+
		"\2\u00dc\u00dd\b\17\1\2\u00dd\u010c\3\2\2\2\u00de\u00df\7\35\2\2\u00df"+
		"\u00e0\7\n\2\2\u00e0\u00e1\5\"\22\2\u00e1\u00e2\7\13\2\2\u00e2\u00e3\5"+
		"\36\20\2\u00e3\u00e4\5\24\13\2\u00e4\u00e5\b\17\1\2\u00e5\u010c\3\2\2"+
		"\2\u00e6\u00e7\7\35\2\2\u00e7\u00e8\7\n\2\2\u00e8\u00e9\5\"\22\2\u00e9"+
		"\u00ea\7\13\2\2\u00ea\u00eb\5\36\20\2\u00eb\u00ec\5\24\13\2\u00ec\u00ed"+
		"\5 \21\2\u00ed\u00ee\7\36\2\2\u00ee\u00ef\5\36\20\2\u00ef\u00f0\5\24\13"+
		"\2\u00f0\u00f1\b\17\1\2\u00f1\u010c\3\2\2\2\u00f2\u00f3\7\32\2\2\u00f3"+
		"\u00f4\5\36\20\2\u00f4\u00f5\7\n\2\2\u00f5\u00f6\5\"\22\2\u00f6\u00f7"+
		"\7\13\2\2\u00f7\u00f8\5\36\20\2\u00f8\u00f9\5\24\13\2\u00f9\u00fa\b\17"+
		"\1\2\u00fa\u010c\3\2\2\2\u00fb\u00fc\7 \2\2\u00fc\u00fd\7\5\2\2\u00fd"+
		"\u010c\b\17\1\2\u00fe\u00ff\7 \2\2\u00ff\u0100\7\n\2\2\u0100\u0101\5$"+
		"\23\2\u0101\u0102\7\13\2\2\u0102\u0103\7\5\2\2\u0103\u0104\b\17\1\2\u0104"+
		"\u010c\3\2\2\2\u0105\u0106\7!\2\2\u0106\u0107\7\5\2\2\u0107\u010c\b\17"+
		"\1\2\u0108\u0109\7\"\2\2\u0109\u010a\7\5\2\2\u010a\u010c\b\17\1\2\u010b"+
		"\u00d5\3\2\2\2\u010b\u00db\3\2\2\2\u010b\u00de\3\2\2\2\u010b\u00e6\3\2"+
		"\2\2\u010b\u00f2\3\2\2\2\u010b\u00fb\3\2\2\2\u010b\u00fe\3\2\2\2\u010b"+
		"\u0105\3\2\2\2\u010b\u0108\3\2\2\2\u010c\35\3\2\2\2\u010d\u010e\b\20\1"+
		"\2\u010e\37\3\2\2\2\u010f\u0110\b\21\1\2\u0110!\3\2\2\2\u0111\u0112\b"+
		"\22\1\2\u0112\u0113\7\16\2\2\u0113\u0114\5\"\22\t\u0114\u0115\b\22\1\2"+
		"\u0115\u012a\3\2\2\2\u0116\u0117\7\n\2\2\u0117\u0118\5\"\22\2\u0118\u0119"+
		"\7\13\2\2\u0119\u011a\b\22\1\2\u011a\u012a\3\2\2\2\u011b\u011c\5$\23\2"+
		"\u011c\u011d\7)\2\2\u011d\u011e\5$\23\2\u011e\u011f\b\22\1\2\u011f\u012a"+
		"\3\2\2\2\u0120\u0121\7\17\2\2\u0121\u012a\b\22\1\2\u0122\u0123\7\20\2"+
		"\2\u0123\u012a\b\22\1\2\u0124\u0125\5\60\31\2\u0125\u0126\b\22\1\2\u0126"+
		"\u012a\3\2\2\2\u0127\u0128\7(\2\2\u0128\u012a\b\22\1\2\u0129\u0111\3\2"+
		"\2\2\u0129\u0116\3\2\2\2\u0129\u011b\3\2\2\2\u0129\u0120\3\2\2\2\u0129"+
		"\u0122\3\2\2\2\u0129\u0124\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u0137\3\2"+
		"\2\2\u012b\u012c\f\13\2\2\u012c\u012d\7\f\2\2\u012d\u012e\5\"\22\f\u012e"+
		"\u012f\b\22\1\2\u012f\u0136\3\2\2\2\u0130\u0131\f\n\2\2\u0131\u0132\7"+
		"\r\2\2\u0132\u0133\5\"\22\13\u0133\u0134\b\22\1\2\u0134\u0136\3\2\2\2"+
		"\u0135\u012b\3\2\2\2\u0135\u0130\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138#\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013b\b\23\1\2\u013b\u013c\5\62\32\2\u013c\u013d\b\23\1\2\u013d\u0157"+
		"\3\2\2\2\u013e\u013f\7(\2\2\u013f\u0157\b\23\1\2\u0140\u0141\7(\2\2\u0141"+
		"\u0142\7\7\2\2\u0142\u0143\5$\23\2\u0143\u0144\7\b\2\2\u0144\u0145\b\23"+
		"\1\2\u0145\u0157\3\2\2\2\u0146\u0147\7\n\2\2\u0147\u0148\5$\23\2\u0148"+
		"\u0149\7\13\2\2\u0149\u014a\b\23\1\2\u014a\u0157\3\2\2\2\u014b\u014c\7"+
		"+\2\2\u014c\u014d\5$\23\13\u014d\u014e\b\23\1\2\u014e\u0157\3\2\2\2\u014f"+
		"\u0150\7\16\2\2\u0150\u0151\5$\23\4\u0151\u0152\b\23\1\2\u0152\u0157\3"+
		"\2\2\2\u0153\u0154\5&\24\2\u0154\u0155\b\23\1\2\u0155\u0157\3\2\2\2\u0156"+
		"\u013a\3\2\2\2\u0156\u013e\3\2\2\2\u0156\u0140\3\2\2\2\u0156\u0146\3\2"+
		"\2\2\u0156\u014b\3\2\2\2\u0156\u014f\3\2\2\2\u0156\u0153\3\2\2\2\u0157"+
		"\u0178\3\2\2\2\u0158\u0159\f\n\2\2\u0159\u015a\7\21\2\2\u015a\u015b\5"+
		"$\23\13\u015b\u015c\b\23\1\2\u015c\u0177\3\2\2\2\u015d\u015e\f\t\2\2\u015e"+
		"\u015f\7\22\2\2\u015f\u0160\5$\23\n\u0160\u0161\b\23\1\2\u0161\u0177\3"+
		"\2\2\2\u0162\u0163\f\b\2\2\u0163\u0164\7\23\2\2\u0164\u0165\5$\23\t\u0165"+
		"\u0166\b\23\1\2\u0166\u0177\3\2\2\2\u0167\u0168\f\7\2\2\u0168\u0169\7"+
		"+\2\2\u0169\u016a\5$\23\b\u016a\u016b\b\23\1\2\u016b\u0177\3\2\2\2\u016c"+
		"\u016d\f\6\2\2\u016d\u016e\7.\2\2\u016e\u016f\5$\23\7\u016f\u0170\b\23"+
		"\1\2\u0170\u0177\3\2\2\2\u0171\u0172\f\5\2\2\u0172\u0173\7)\2\2\u0173"+
		"\u0174\5$\23\6\u0174\u0175\b\23\1\2\u0175\u0177\3\2\2\2\u0176\u0158\3"+
		"\2\2\2\u0176\u015d\3\2\2\2\u0176\u0162\3\2\2\2\u0176\u0167\3\2\2\2\u0176"+
		"\u016c\3\2\2\2\u0176\u0171\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179%\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c"+
		"\7(\2\2\u017c\u017d\7\n\2\2\u017d\u017e\5(\25\2\u017e\u017f\7\13\2\2\u017f"+
		"\u0180\b\24\1\2\u0180\u0189\3\2\2\2\u0181\u0182\7#\2\2\u0182\u0183\7\n"+
		"\2\2\u0183\u0184\7\26\2\2\u0184\u0185\5,\27\2\u0185\u0186\7\13\2\2\u0186"+
		"\u0187\b\24\1\2\u0187\u0189\3\2\2\2\u0188\u017b\3\2\2\2\u0188\u0181\3"+
		"\2\2\2\u0189\'\3\2\2\2\u018a\u018b\5$\23\2\u018b\u018c\5*\26\2\u018c\u018d"+
		"\b\25\1\2\u018d\u0190\3\2\2\2\u018e\u0190\b\25\1\2\u018f\u018a\3\2\2\2"+
		"\u018f\u018e\3\2\2\2\u0190)\3\2\2\2\u0191\u0192\b\26\1\2\u0192\u0193\b"+
		"\26\1\2\u0193\u019b\3\2\2\2\u0194\u0195\f\4\2\2\u0195\u0196\7\6\2\2\u0196"+
		"\u0197\5$\23\2\u0197\u0198\b\26\1\2\u0198\u019a\3\2\2\2\u0199\u0194\3"+
		"\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"+\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\b\27\1\2\u019f\u01a0\b\27\1"+
		"\2\u01a0\u01ac\3\2\2\2\u01a1\u01a2\f\5\2\2\u01a2\u01a3\7\6\2\2\u01a3\u01a4"+
		"\5$\23\2\u01a4\u01a5\b\27\1\2\u01a5\u01ab\3\2\2\2\u01a6\u01a7\f\4\2\2"+
		"\u01a7\u01a8\7\6\2\2\u01a8\u01a9\7\26\2\2\u01a9\u01ab\b\27\1\2\u01aa\u01a1"+
		"\3\2\2\2\u01aa\u01a6\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad-\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\7(\2\2\u01b0"+
		"\u01b8\b\30\1\2\u01b1\u01b2\7(\2\2\u01b2\u01b3\7\7\2\2\u01b3\u01b4\5$"+
		"\23\2\u01b4\u01b5\7\b\2\2\u01b5\u01b6\b\30\1\2\u01b6\u01b8\3\2\2\2\u01b7"+
		"\u01af\3\2\2\2\u01b7\u01b1\3\2\2\2\u01b8/\3\2\2\2\u01b9\u01ba\t\2\2\2"+
		"\u01ba\61\3\2\2\2\u01bb\u01bc\5\60\31\2\u01bc\u01bd\b\32\1\2\u01bd\u01c3"+
		"\3\2\2\2\u01be\u01bf\7\25\2\2\u01bf\u01c3\b\32\1\2\u01c0\u01c1\7&\2\2"+
		"\u01c1\u01c3\b\32\1\2\u01c2\u01bb\3\2\2\2\u01c2\u01be\3\2\2\2\u01c2\u01c0"+
		"\3\2\2\2\u01c3\63\3\2\2\2\u01c4\u01c5\t\3\2\2\u01c5\65\3\2\2\2\u01c6\u01c7"+
		"\t\4\2\2\u01c7\67\3\2\2\2\u01c8\u01c9\t\5\2\2\u01c99\3\2\2\2\u01ca\u01ce"+
		"\5\66\34\2\u01cb\u01ce\7)\2\2\u01cc\u01ce\7.\2\2\u01cd\u01ca\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce;\3\2\2\2\35QSaoq\u0083\u0098"+
		"\u00a2\u00ae\u00be\u00cc\u00d3\u010b\u0129\u0135\u0137\u0156\u0176\u0178"+
		"\u0188\u018f\u019b\u01aa\u01ac\u01b7\u01c2\u01cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}