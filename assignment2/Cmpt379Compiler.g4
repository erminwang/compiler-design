grammar Cmpt379Compiler;

// Session 1: ANTLR tree plotting API

@header {

import java.io.*;
}



@parser::members {
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





}

// Session 2: Fill the Grammer definition
/* <program>
-> class Program { <field_decl> * <method_decl> * } */
prog
: Class Program '{' field_decls method_decls '}'
{
	int id = PrintNode("Program");

	if ($field_decls.s.size > 0) {
		int id2 = PrintNode("Field_decls");
		PrintEdges(id2, $field_decls.s);
		PrintEdge(id, id2);
	}

	if ($method_decls.s.size > 0) {
		int id2 = PrintNode("Method_decls");
		PrintEdges(id2, $method_decls.s);
		PrintEdge(id, id2);
	}

	try {PrintGraph();} catch(IOException e) {}
}
;

/* <field_decl>
-> <type> (<id> | <id> [ int_literal ] ) ( , <id> | <id>[int_literal ] ) * ;
| <type> <id> = <literal> ; */
field_decls returns [MySet s]
: f=field_decls field_decl ';'
{
	$s = $f.s;
	$s.ExtendArray($field_decl.id);
}
| f=field_decls inited_field_decl ';'
{
	$s = $f.s;
	$s.ExtendArray($inited_field_decl.id);
}
|
{
	$s = new MySet();
}
;

field_decl returns [int id]
: f=field_decl ',' Ident
{
	$id = $f.id;

	PrintEdge($id, PrintNode($Ident.text));
}
| f=field_decl ',' Ident '[' intLit ']'
{
	$id = $f.id;

	PrintEdge($id, PrintNode($Ident.text));
	PrintEdge($id, PrintNode($intLit.text));
}
| Type Ident
{
	$id = PrintNode("FieldDecl");

	PrintEdge($id, PrintNode($Type.text));
	PrintEdge($id, PrintNode($Ident.text));
}
| Type Ident '[' intLit ']'
{
	$id = PrintNode("FieldDecl");

	PrintEdge($id, PrintNode($Type.text));
	PrintEdge($id, PrintNode($Ident.text));
	PrintEdge($id, PrintNode($intLit.text));
}
;

inited_field_decl returns [int id]
: Type Ident '=' literal
{
	$id = PrintNode("InitedFieldDecl");

	PrintEdge($id, PrintNode($Type.text));
	PrintEdge($id, PrintNode($Ident.text));
	PrintEdge($id, PrintNode($literal.text));
}
;

/* <method_decl>
-> ( <type> | void ) <id> (( (<type> <id>) ( , <type> <id>) * ) ? ) <block> */
method_decls returns [MySet s]
: m=method_decls method_decl
{
	$s = $m.s;
	$s.ExtendArray($method_decl.id);
}
|
{
	$s = new MySet();
}
;

method_decl returns [int id]
: Type Ident '(' params ')' block
{
	$id = PrintNode("MethodDecl");

	PrintEdge($id, PrintNode($Type.text));
	PrintEdge($id, PrintNode($Ident.text));
	PrintEdge($id, $params.id);
	PrintEdge($id, $block.id);
}
| Void Ident '(' params ')' block
{
	$id = PrintNode("MethodDecl");

	PrintEdge($id, PrintNode("void"));
	PrintEdge($id, PrintNode($Ident.text));
	PrintEdge($id, $params.id);
	PrintEdge($id, $block.id);

}
;

/* method parameters */
params returns [int id]
: Type Ident nextParams
{
	$id = PrintNode("MethodArg");

	PrintEdge($id, PrintNode($Type.text));
	PrintEdge($id, PrintNode($Ident.text));

	PrintEdges($id, $nextParams.s);
}
|
{
	$id = -1;
}
;

nextParams returns [MySet s]
: n=nextParams ',' Type Ident
{
	$s = $n.s;

	$s.ExtendArray(PrintNode($Type.text));
	$s.ExtendArray(PrintNode($Ident.text));
}
|
{
	$s = new MySet();
}
;

/* <block> -> { <var_decl> * <statement> * } */
block returns [int id]
: '{' var_decls statements '}'
{
	$id = -1;
	if ($var_decls.s.size > 0) {
		$id = PrintNode("Block");
		int id2 = PrintNode("VarDecl");
		PrintEdges(id2, $var_decls.s);
		PrintEdge($id, id2);
	}
	if ($statements.id != -1) {
		if ($id == -1) $id = PrintNode("Block");
		PrintEdge($id, $statements.id);
	}
}
;

/* <var_decl> -> <type> <id> ( , <id>) * ; */
var_decls returns [MySet s]
: v=var_decls var_decl ';'
{
	$s = $v.s;
	$s.ExtendArray($var_decl.id);
}
|
{
	$s = new MySet();
}
;

var_decl returns [int id]
: v=var_decl ',' Ident
{
	$id = $v.id;

	PrintEdge($id, PrintNode($Ident.text));
}
| Type Ident
{
	$id = PrintNode("VarDecl");

	PrintEdge($id, PrintNode($Type.text));
	PrintEdge($id, PrintNode($Ident.text));
}
;

statements returns [int id]
: statement t=statements
{
	if ($t.id != -1) {
		$id = PrintNode("Seq");
		PrintEdge($id, $statement.id);
		PrintEdge($id, $t.id);
	} else {
		$id = $statement.id;
	}
}
|
{
	$id = -1;
}
;

/* <statement>
-> <location> <assign_op> <expr> ;
| <method_call> ;
| if ( <expr> ) <block> ( else <block> ) ?
| switch <expr> {(case <literal> : <statement> * ) + }
| while ( <expr> ) <statement>
| return ( <expr> ) ? ;
| break ;
| continue ;
| <block> */
statement returns [int id]
: location AssignOp expr ';'
{
	$id = PrintNode("Assign");
	PrintEdge($id, $location.id);
	PrintEdge($id, PrintNode($AssignOp.text));
	PrintEdge($id, $expr.id);
}
| method_call ';'
{
	$id = PrintNode("CallExpr");
	PrintEdge($id, $method_call.id);
}
| If '(' expr ')' b1=block Else b2=block
{
	$id = PrintNode("IfElse");
	$id2 = PrintNode("If");
	$id3 = PrintNode("Else");
	PrintEdge($id2, $expr.id);
	PrintEdge($id2, $b1.id);
	PrintEdge($id3, $b2.id);
	PrintEdge($id, $id2);
	PrintEdge($id, $id3);
}
| If '(' expr ')' block
{
	$id = PrintNode("IfElse");
	$id2 = PrintNode("If");
	PrintEdge($id2, $expr.id);
	PrintEdge($id2, $block.id);
	PrintEdge($id, $id2);
}
| Switch expr '{' cases '}'
{
	$id = PrintNode("Switch");
	$id2 = PrintNode("CaseSeq");
	PrintEdge($id, $expr.id);
	PrintEdges($id2, $cases.s);
	PrintEdge($id, $id2);
}
| While '(' expr ')' statement
{
	$id = PrintNode("While");
	PrintEdge($id, $expr.id);
	PrintEdge($id, $statement.id);
}
| Ret expr ';'
{
	$id = PrintNode("Ret");
	PrintEdge($id, $expr.id);
}
| Ret ';'
{
	PrintNode("Ret");
}
| Brk ';'
{
	PrintNode("Brk");
}
| Cnt ';'
{
	PrintNode("Cnt");
}
| block
{
	$id = $block.id;
}
;

/* <method_call> -> <method_name> ( (<expr> ( , <expr> ) * ) ? ) */
method_call returns [int id]
: Ident '(' arguments ')'
{
	$id = PrintNode("Call");
	PrintEdge($id, $Ident.text);
	PrintEdges($id, $arguments.id);
}
| Callout '(' Str nextCalloutArgs ')'
{
    $id = PrintNode("Callout");
    PrintEdge($id, PrintNode("StringArg"));
    PrintEdges($id, $nextCalloutArgs.s);
}
;

nextCalloutArgs returns [MySet s]
: c=nextCalloutArgs ',' calloutArg
{
    $s = $c.s;
    $s.ExtendArray($calloutArg.id);
}
|
{
    $s = new MySet();
}
;

calloutArg returns [int id]
: expr
{
    $id = PrintNode("CalloutExpr");
    PrintEdge($id, $expr.id);
}
| Str
{
    $id = PrintNode("CalloutString");
    PrintEdge($id, PrintNode("StringArg"));
}
;

arguments returns [int id]
: expr nextArgs
{
	$id = PrintNode("ExprArg");
	PrintEdge($id, $expr.id);
	PrintEdges($id, $nextArgs.s);
}
|
{
	$id = -1;
}
;

nextArgs returns [MySet s]
: a=nextArgs ',' expr
{
    $s = $a.s;
    $s.ExtendArray($expr.id);
}
|
{
    $s = new MySet();
}
;

cases returns [MySet s]
: c=cases case
{
	$s = $c.s;
	$s.ExtendArray($case.id);
}
| case
{
    $s = new Myset();
    $s.ExtendArray($case.id);
}
;

case returns [int id]
: Case literal ':' statements
{
	$id = PrintNode("Case");
	PrintEdge($id, $literal.text);
	if($statements.id != -1) {
	    PrintEdge($id, $statements.id);
	}
}
;

/* <expr>
-> <location>
| <method_call>
| <literal>
| <expr> <bin_op> <expr>
| - <expr>
| ! <expr>
| ( <expr> ) */
expr returns [int id]
: location
{
	$id = PrintNode("LocExpr");
	PrintEdge($id, $location.id);
}
| method_call
{
    $id = PrintNode("CallExpr");
    PrintEdge($id, $method_call.id);
}
| literal
{
	$id = PrintNode("ConstExpr");
	PrintEdge($id, PrintNode($literal.text));
}
| e1=expr binOp e2=expr
{
	$id = PrintNode("Bin_expr");
	PrintEdge($id, $e1.id);
	PrintEdge($id, PrintNode($binOp.text));
	PrintEdge($id, $e2.id);
}
| '-' expr
{
    $id = PrintNode("NegExpr");
    PrintEdge($id, $expr.id);
}
| '!' expr
{
    $id = PrintNode("NotExpr");
    PrintEdge($id, $expr.id);
}
| '(' expr ')'
{
    $id = PrintNode("ExprArg");
    PrintEdge($id, $expr.id);
}
;


/* <location>
-> <id>
| <id> [ <expr> ] */
location returns [int id]
: Ident
{
    $id = PrintNode("Loc");
	PrintEdge($id, PrintNode($Ident.text));
}
| Ident '[' expr ']'
{
    $id = PrintNode("LocExpr2");
    PrintEdge($id, $Ident.id);
    PrintEdge($id, $expr.id);
}
;

// Session 3: Lexical definition

intLit
: DecLit
| HexLit
;

literal
: Char
| intLit
| BoolLit
;

binOp
: ArithOp
| Relop
| EqOp
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
:'"' ((~('\\' | '"')) | ('\\'.))* '"'
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

Switch
: 'switch'
;

Case
: 'case'
;

DecLit
: Digit+
;

HexLit
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

While
: 'while'
;

EqOp
: '=='
| '!='
;

Relop
: '<='
| '>='
| '<'
| '>'
;

AssignOp
: '='
| '+='
| '-='
;

ArithOp
: '+'
| '-'
| '*'
| '/'
| '%'
;

CondOp
: '&&'
| '||'
;

OParen
: '('
;

CParen
: ')'
;

OBrace
: '{'
;

CBrace
: '}'
;

OBracket
: '['
;

CBracket
: ']'
;

SemiColon
: ';'
;

Comma
: ','
;
