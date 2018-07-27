grammar Cmpt379Compiler;



@header {

import java.io.*;
}



@parser::members {

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

}


// s is a SymTab
// q is a QuadTab
//---------------------------------------------------------------------------

prog
: Class Program '{' field_decls method_decl '}'
{
	s.Print();
	System.out.println("------------------------------------");
	q.Print();
}
;

field_decls
: f=field_decls field_decl ';'
|
;


field_decl returns [DataType t]
: f=field_decl ',' Ident
{
	$t = $f.t;
	s.insert($Ident.text, $t);
}
| Type Ident
{
	$t = DataType.valueOf($Type.text.toUpperCase());
	s.insert($Ident.text, $t);
}
| Type Ident '[' intLit ']'
{
	$t = DataType.valueOf($Type.text.toUpperCase());
	s.insert($Ident.text, $t);
}
;

method_decl
: Type Ident '('  ')' block
{
	s.insert($Ident.text, DataType.valueOf($Type.text.toUpperCase()));
}
| Void Ident '('  ')' block
{
	s.insert($Ident.text, DataType.valueOf($Void.text.toUpperCase()));
}
;

block
: '{' var_decls statements '}'
;

var_decls
: v=var_decls var_decl ';'
|
;


var_decl returns [DataType t]
: v=var_decl ',' Ident
{
	$t = $v.t;
	s.insert($Ident.text, $t);
}
| Type Ident
{
	$t = DataType.valueOf($Type.text.toUpperCase());
	s.insert($Ident.text, $t);

}
;



statements
: statement t=statements
|
;


statement
: location '=' expr ';'
{
	q.Add($location.id, $expr.id, -1, "=");
}
| block
{

}
| If '(' bool_expr ')' m block
{
	if($bool_expr.is.truelist[0] != -1) {
		int trueId = (($bool_expr.is).truelist)[0];
		q.PatchSrc2(trueId, $m.id);
		/* System.out.println("trueId is : " + trueId);
		System.out.println("$m.id is : " + $m.id); */
	}

	//-3 means iffalse goto qaud entry
	if($bool_expr.is.falselist[0] != -1) {
		int falseId = (($bool_expr.is).falselist)[0];
		q.PatchSrc2(falseId, q.size);
		/* System.out.println("q.size is : " + q.size); */
		/* System.out.println("falseId is : " + falseId); */
	}
}
| If '(' b=bool_expr ')' m1=m b1=block n Else m2=m b2=block
{

	for (int i = 0; i < $b.is.sizet; i++) {
		if ($b.is.truelist[i] != -1) {
			q.PatchSrc2($b.is.truelist[i], $m1.id);
		}
	}

	for (int i = 0; i < $b.is.sizef; i++) {
		if ($b.is.falselist[i] != -1) {
			q.PatchSrc2($b.is.falselist[i], $m2.id);
		}
	}

	//Patch goto L_7 after c = t_1

	int nid = $n.id;
	System.out.println("nid : " + nid);
	q.PatchSrc2(nid, q.size);
}
| While m1=m '(' bool_expr ')' m2=m block
{

}
;

m returns [int id]
:
{
	$id = q.size;
}
;

n returns [int id]
:
{
	// add goto L_ before else statement
	$id = q.size;
	q.Add(-1, -1, -1, "goto");
}
;

bool_expr returns [InstructionSet is]
: b1=bool_expr '&&' b2=bool_expr
{

}
| b1=bool_expr '||' b2=bool_expr
{

}
| '!' b1=bool_expr
{

}
| '(' b1=bool_expr ')'
{

}
| e1=expr RelOp e2=expr
{
	//add t_0 to symbol table
	int id = s.Add(DataType.INT);
	//t_0 = a > 0
	q.Add(id, $e1.id, $e2.id, $RelOp.text);
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

	$is = instructionSet;
}
| 'true'
{
	InstructionSet instructionSet = new InstructionSet();
	instructionSet.AddToTrueList(q.size);
	instructionSet.valid = -1;
	$is = instructionSet;
	q.Add(-1, -1, -1, "goto");
}
| 'false'
{
	InstructionSet instructionSet = new InstructionSet();
	instructionSet.AddToFalseList(q.size);
	$is = instructionSet;
	q.Add(-1, -1, -1, "goto");
}
| intLit
{
	InstructionSet instructionSet = new InstructionSet();
	System.out.println("intLit.text is : " + $intLit.text);
	if($intLit.text.equals("0")) {
		instructionSet.AddToFalseList(q.size);
	} else {
		instructionSet.AddToTrueList(q.size);
	}
	$is = instructionSet;
	q.Add(-1, -1, -1, "goto");
}
| Ident
{
	int id = s.Add(DataType.INT);
	int identId = s.Find($Ident.text);
	q.Add(id, identId, -1, "");
	InstructionSet instructionSet = new InstructionSet();

	instructionSet.AddToTrueList(q.size);
	q.Add(-2, id, -1, "goto");
	instructionSet.AddToFalseList(q.size);
	q.Add(-3, id, -1, "goto");
	$is = instructionSet;
}
;

expr returns [int id]
: literal
{
	$id = $literal.id;
}
| Ident
{
	$id = s.Find($Ident.text);
}
| Ident '[' e1=expr ']'
{
	int id1 = -1;
	int id2 = -1;
	int id3 = -1;

	int identIndex = s.Find($Ident.text);
	DataType identType = s.GetType(identIndex);

	DataType exprType = s.GetType($e1.id);

	id1 = s.Add(s.GetType($e1.id));

	id2 = identType == DataType.INT ? s.insert("4", exprType) : s.insert("1", exprType);
	//Add a new symbol t_ to hold a[1]
	id3 = s.Add(s.GetType($e1.id));


	//add a new quad entry t_0 = 4*1
	q.Add(id1, id2, $e1.id, "*");

	//add a new symbol a[t_1] to the symbol table
	String newSymbol = new String($Ident.text + "[ " + s.GetName(id1) + " ]");
	$id = s.insert(newSymbol, DataType.ARRAY);

	q.Add(id3, $id, -1, "="); //t_2 = a[t_1]
	$id = id3;
}
| '(' e1=expr ')'
{
	$id = $e1.id;
}
| '-' e1=expr
{
	int id = s.insert("0", s.GetType($e1.id));
	$id = s.Add(s.GetType($e1.id));
	q.Add($id, id, $e1.id, "-");
}
| e1=expr '*' e2=expr
{
	$id = s.Add(s.GetType($e1.id));
	q.Add($id, $e1.id, $e2.id, "*");
}
| e1=expr '/' e2=expr
{
	$id = s.Add(s.GetType($e1.id));
	q.Add($id, $e1.id, $e2.id, "/");
}
| e1=expr '+' e2=expr
{
	$id = s.Add(s.GetType($e1.id));
	q.Add($id, $e1.id, $e2.id, "+");
}
| e1=expr '-' e2=expr
{
	$id = s.Add(s.GetType($e1.id));
	q.Add($id, $e1.id, $e2.id, "-");
}
| e1=expr CondOp e2=expr
{
	$id = s.Add(s.GetType($e1.id));
	q.Add($id, $e1.id, $e2.id, $CondOp.text);
}
| e1=expr RelOp e2=expr
{
	$id = s.Add(s.GetType($e1.id));
	q.Add($id, $e1.id, $e2.id, $RelOp.text);
}
| '!' e1=expr
{
	// TODO: need modification
	$id = s.Add(s.GetType($e1.id));
	q.Add($id, $e1.id, -1, "!");
}
/* | methodCall
{
	$id = $methodCall.id;
} */
;


location returns [int id]
:Ident
{
	$id = s.Find($Ident.text);
}
| Ident '[' expr ']'
{
	int identIndex = s.Find($Ident.text);
	DataType identType = s.GetType(identIndex);
	int exprId = $expr.id;
	DataType exprType = s.GetType(exprId);

	int id1 = -1;
	int id2 = -1;
	// Add T_ to symtab
	id1 = s.Add(s.GetType($expr.id));
	//Add a new symbol
	id2 = identType == DataType.INT ? s.insert("4", exprType) : s.insert("1", exprType);

	q.Add(id1, id2, exprId, "*");

	String newSym = $Ident.text + "[ " + s.GetName(id1) + " ]";
	$id = s.insert(newSym, DataType.ARRAY);
}
;

intLit
: DecNum
| HexNum
;

// create symtab entry (IDENT, DataType)
literal returns [int id]
: intLit
{
	$id = s.insert($intLit.text, DataType.INT);
}
| Char
{
	$id = s.insert($Char.text, DataType.CHAR);
}
| BoolLit
{
	$id = s.insert($BoolLit.text, DataType.BOOLEAN);
}
;

//----------------------------------------section 3--------------------------

eqOp
: '='
| AssignOp
;

mathOp
: SecondOp
| ThirdOp
;

boolOp
: '!'
| CondOp
;

binOp
: mathOp
| RelOp
| CondOp
;

fragment Delim
: ' '
| '\t'
| '\n'
;

fragment Letter
: [a-zA-Z]
;

fragment Digit
: [0-9]
;

fragment HexDigit
: Digit
| [a-f]
| [A-F]
;

fragment Alpha
: Letter
| '_'
;

fragment AlphaNum
: Alpha
| Digit
;


WhiteSpace
: Delim+ -> skip
;

Char
: '\'' ~('\\') '\''
| '\'\\' . '\''
;

Str
: '"' ((~('\\' | '"')) | ('\\'.))* '"'
;

Class
: 'class'
;

Program
: 'Program'
;

Void
: 'void'
;

While
: 'while'
;

Switch
: 'switch'
;

Case
: 'case'
;

If
: 'if'
;

Else
: 'else'
;

For
: 'for'
;

Ret
: 'return'
;

Brk
: 'break'
;

Cnt
: 'continue'
;

Callout
: 'callout'
;

DecNum
: Digit+
;


HexNum
: '0x'HexDigit+
;

BoolLit
: 'true'
| 'false'
;

Type
: 'int'
| 'boolean'
;

Ident
: Alpha AlphaNum*
;

RelOp
: '<='
| '>='
| '<'
| '>'
| '=='
| '!='
;

AssignOp
: '+='
| '-='
;

Minus
: '-'
;

SecondOp
: '*'
| '/'
| '%'
;

ThirdOp
: '+'
| Minus
;

CondOp
: '&&'
| '||'
;
