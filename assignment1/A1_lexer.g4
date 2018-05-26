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

WhiteSpace
: Delim+ -> skip
;

Class
: 'class'
;

Program
: 'program'
;

If
: 'if'
;

LPar
: '('
;

RPar
: ')'
;

LBra
: '['
;

RBra
: ']'
;

LCur
: '{'
;

RCur
: '}'
;

Id
: Alpha Alpha_num*
;

Alpha
: [a-zA-Z] '_'
;

Alpha_num
: Alpha
| Digit
;

Digit
: [0-9]
;

Hex_digit
: Digit
| [a-fA-F]
;

Int_literal
: Hex_literal
| Decimal_literal
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

Char_literal
: '\''  Char '\''
;

String_literal
: '\"' (Char)*? '\"'
;
