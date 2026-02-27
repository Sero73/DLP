grammar TSmm;	

program: function_main definition* EOF
         | definition* function_main EOF
       ;

expression: INT_CONSTANT
           | REAL_CONSTANT
           | CHAR_CONSTANT
           | IDENTIFIERS
           |function
           | '('expression')'
           | expression '[' expression ']'
           | expression '.' expression
           | '(' expression 'as' simple_type ')'
           | '-' expression
           | '!' expression
           | expression ('*'|'%' | '/') expression
           | expression ('+' | '-') expression
           | expression ('>' | '>=' | '<' | '<=' | '!=' | '==') expression
           | expression ('&&' | '||') expression
           |
           ;

expressions: expression
           | expression ',' expressions
           ;

statement: 'input' expressions ';'
         | expression '=' expression ';'
         | 'log' expressions ';'
         |'while' '(' expression ')' body
         | 'if' '(' expression ')' body ('else' body)?
         | 'return' expression ';'
         | function ';'
         ;

function: IDENTIFIERS '(' expressions ')'
        | IDENTIFIERS '(' ')'
        ;


definition: function_definition
          | variable_definition
          ;

function_definition: 'function' IDENTIFIERS '(' parameters? ')' ':' simple_type '{'  (variable_definition)* statement*'}'
                   ;

function_main: 'function' 'main' '(' ')' ':' simple_type '{'  (variable_definition)* statement*'}'
             ;

parameter: IDENTIFIERS ':' simple_type ;

parameters: parameter (',' parameter)* ;

variable_definition: 'let' variables ':' type ';'
              ;
variables:  IDENTIFIERS
         |  IDENTIFIERS ',' variables
         ;

body: statement
    | '{' statement* '}'
    ;

simple_type: simple_type_parameter
    | 'void'
    ;

simple_type_parameter: 'int'
                     | 'number'
                     | 'char'
                     ;

type: simple_type
    | '['  variable_definition+ ']'
    | '[' INT_CONSTANT ']'  type
    ;



//Se pueden comprobar tipos simples en sintaxis o semantico o en ambos
//Void es un tipo simple, pero no puede usarse para parametros, solo para el tipo retorno
//Main se puede comprobar en sintactico y semantico
//campos registro pueden ser lo que quieran


//-----------------------------------------------------------------


//Fragmentos
fragment DIGITO: [0-9]
               ;
fragment BASE:
             INT_CONSTANT '.' DIGITO*
             | '.' DIGITO+
             ;

fragment EXPONENTE: [Ee][+-]? INT_CONSTANT
             ;

//Espacios
WHITES: [ \n\t\r]+ -> skip
      ;

//Comentarios
SINGLE_LINE_COMMENT: '//' ~[\r\n]* -> skip
                   ;

MULTILINE_COMMENT: '/*' .*? '*/' -> skip
                 ;

//Constantes
INT_CONSTANT: [1-9][0-9]*
            | '0'
            ;

REAL_CONSTANT: BASE EXPONENTE
                | INT_CONSTANT EXPONENTE
                | BASE
               ;

CHAR_CONSTANT: '\''(.|'\\'(DIGITO+|[nt]))'\''
             ;

//Identificadores
IDENTIFIERS: [a-zA-Z_] [a-zA-Z0-9_]*
           ;