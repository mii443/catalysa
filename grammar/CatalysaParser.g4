parser grammar CatalysaParser;
options { tokenVocab = CatalysaLexer; }

catalysa_file: program*;

program: if
    | f_call
    | function
    | expr
    | let
    | block
    ;

f_call: IDENT LPAREN (program COMMA?)* RPAREN ;

block: LCURL program* RCURL ;
function: F IDENT LPAREN ( IDENT COMMA? )* RPAREN ARROW program ;
let: LET IDENT (EQ program)? ;
if: IF relational program (ELSE program)* ;

expr: assign | relational ;
assign: IDENT EQ relational ;
relational: add (LE add | LT add | BE add | BT add | EQEQ add | NE add | CONJ add | OR add)* ;
add: mul (ADD mul | SUB mul | SUB_ASSIGNMENT mul | ADD_ASSIGNMENT mul)* ;
mul: unary (MUL unary | DIV unary | DIV_ASSIGNMENT unary | MUL_ASSIGNMENT unary)* ;

primary: LPAREN expr RPAREN | IDENT | TEXT | function_call  | NUM ;
function_call: IDENT LPAREN (unary COMMA?)* RPAREN ;

unary: ADD primary
    | SUB primary
    | primary
    ;
