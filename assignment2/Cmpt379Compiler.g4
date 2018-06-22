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

/* <expr>
-> <location>
| <method_call>
| <literal>
| <expr> <bin_op> <expr>
| - <expr>
| ! <expr>
| ( <expr> ) */


/* <location>
-> <id>
| <id> [ <expr> ] */
location returns [int id]
: Ident
| Ident '[' expr ']'
{
	$id = PrintNode("Loc");
	PrintEdge($id, PrintNode($Ident.text));
}
;

// Session 3: Lexical definition

/* intLit
: DecLit
| HexLit
;

literal
: Char
| intLit
| BoolLit
;*/

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
