lexer grammar A1_lexer;

fragment Delim
: ' '
| '\t'
| '\n'
;

fragment Char
: .
| '\\'.
;

fragment Alpha
: [a-zA-Z_]
;

fragment Digit
: [0-9]
;

fragment Alpha_num
: Alpha
| Digit
;

fragment Hex_digit
: Digit
| [a-fA-F]
;

WhiteSpace
: Delim+ -> skip
;

Char_literal
: '\''  Char '\''
;

Str_literal
: '\"' (Char)*? '\"'
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

While
: 'while'
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

Decimal_literal
: Digit+
;

Hex_literal
: '0x'Hex_digit+
;

Boolean_literal
: 'true'
| 'false'
;

Type
: 'int'
| 'boolean'
;

Ident
: Alpha Alpha_num*
;

RelOp
: '<'
| '>'
| '<='
| '>='
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

ConOp
: '&&'
| '||'
;

LParenthesis
: '('
;

RParenthesis
: ')'
;

LCurlyBrace
: '{'
;

RCurlyBrace
: '}'
;

LBracket
: '['
;

RBracket
: ']'
;

SemiColon
: ';'
;

Colon
: ':'
;

Comma
: ','
;

EqOp
: '=='
| '!='
;
