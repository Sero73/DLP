grammar TSmm;	

program: (INT_CONSTANT | REAL_CONSTANT | IDENTIFIERS)*
       ;

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