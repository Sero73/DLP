grammar TSmm;	
@header{
import ast.*;
import ast.types.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import ast.definitions.*;
}

program returns [Program ast] locals [List<Definition> definitions = new ArrayList<>()] :
         (definition {$definitions.addAll($definition.ast);})* function_main {$definitions.add($function_main.ast);} {$ast = new Program($definitions);} EOF
       ;

//Expresiones
expression returns [Expression ast]:
           INT_CONSTANT {$ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt($INT_CONSTANT.text));}
           | REAL_CONSTANT {$ast = new NumberLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
           | CHAR_CONSTANT {$ast = new CharLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
           | ID {$ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1 ,$ID.text);}
           |function {$ast = $function.ast;}
           | '('e1=expression')' {$ast = $e1.ast;}
           | e1=expression '[' e2=expression ']' {$ast = new ArrayAccess($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast);}
           | e1=expression '.' ID {$ast = new FieldAccess($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $ID.text);}
           | '(' e1=expression 'as' t=simple_type ')' {$ast = new Cast($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $t.ast);}
           | '-' e1=expression {$ast = new UnaryMinus($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast);}
           | '!' e1=expression {$ast = new UnaryNot($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast);}
           | e1=expression OP=('*'|'%' | '/') e2=expression {$ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast, $OP.text);}
           | e1=expression OP=('+' | '-') e2=expression {$ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast, $OP.text);}
           | e1=expression OP=('>' | '>=' | '<' | '<=' | '!=' | '==') e2=expression {$ast = new Comparison($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast, $OP.text);}
           | e1=expression OP=('&&' | '||') e2=expression {$ast = new Logical($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast, $OP.text);}
           ;

expressions returns [List<Expression> ast = new ArrayList<>()]:
           e1=expression {$ast.add($e1.ast);}
           | e1=expression {$ast.add($e1.ast);} ',' e2=expressions {$ast.addAll($e2.ast);}
           ;


//Statements
statement returns [List<Statement> ast = new ArrayList<>()] locals [List<Statement> elseBody = new ArrayList<>()]:
         e='input' expressions ';' {for(Expression expression : $expressions.ast){
                                    $ast.add(new Input($e.getLine(), $e.getCharPositionInLine()+1, expression));
                                   }
                                 }
         | e1=expression '=' e2=expression ';' {$ast.add(new Assignment($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast));}
         | e= 'log' expressions ';'  {for(Expression expression : $expressions.ast){
                                    $ast.add(new Log($e.getLine(), $e.getCharPositionInLine()+1, expression));
                                    }
                                }
         |'while' '(' e1=expression ')' b1=body {$ast.add(new While($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast, $b1.ast));}
         | 'if' '(' e1=expression ')' b1=body ('else' b2=body {$elseBody.addAll($b2.ast);})? {$ast.add(new IfElse($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $b1.ast, $elseBody ));}
         | 'return' e1=expression ';' {$ast.add(new Return($e1.ast.getLine(), $e1.ast.getColumn(),$e1.ast));}
         | function ';' {$ast.add($function.ast);}
         ;

body returns[List<Statement> ast = new ArrayList<Statement>()]:
    st1=statement {$ast.addAll($st1.ast);}
    | '{' ( st2=statement {$ast.addAll($st2.ast);})+ '}'
    ;

//Functions
function returns[FunctionInvocation ast] locals [List<Expression> arguments = new ArrayList<Expression>()]:

        ID '(' (expressions {$arguments.addAll($expressions.ast);})? ')'
        {$ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1, $arguments,new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text));}
        ;

function_main returns [FunctionDefinition ast] locals [List<Statement> statements = new ArrayList<Statement>(), List<VariableDefinition> varDefs = new ArrayList<VariableDefinition>()]:
             f='function' 'main' '(' ')' ':' 'void' '{'  (variable_definition {$statements.addAll($variable_definition.ast);})* (statement{$statements.addAll($statement.ast);})* '}'
             {$ast = new FunctionDefinition($f.getLine(), $f.getCharPositionInLine()+1, $statements, "main", new FunctionType(VoidType.getInstance(), new ArrayList<VariableDefinition>())); }
             ;


definition returns [List<Definition> ast = new ArrayList<>()]:
          function_definition {$ast.add($function_definition.ast);}
          | variable_definition {$ast.addAll($variable_definition.ast);}
          ;

//Definitions
function_definition returns  [FunctionDefinition ast] locals [List<Statement> statements = new ArrayList<>(), List<VariableDefinition> params = new ArrayList<>(), Type returnType = VoidType.getInstance() ]:
                   'function' id1=ID '(' (parameters{$params.addAll($parameters.ast);})? ')' ':' (t=simple_type {$returnType = $t.ast;} | 'void') '{'  (variable_definition{$statements.addAll($variable_definition.ast);})* (statement {$statements.addAll($statement.ast);})*'}'
                   {$ast =  new FunctionDefinition($id1.getLine(), $id1.getCharPositionInLine()+1 ,$statements, $id1.text, new FunctionType($returnType, $params));}
                   ;

//parameter: ID ':' simple_type ;

parameters returns[List<VariableDefinition> ast = new ArrayList<>()]:
        id1=ID ':' type1=simple_type {$ast.add(new VariableDefinition($id1.getLine(), $id1.getCharPositionInLine()+1, $id1.text, $type1.ast));}
        (',' id2=ID ':' type2=simple_type {$ast.add(new VariableDefinition($id2.getLine(),$id2.getCharPositionInLine()+1, $id2.text, $type2.ast));})*
        ;
//
//variable returns[Variable ast]:
//          ID {$ast = (new Variable($ID.getLine(), $ID.getCharPositionInLine()+1 ,$ID.text));}
//          ;

variables returns[List<Variable> ast = new ArrayList<>()]:
         id1=ID { $ast.add(new Variable($id1.getLine(), $id1.getCharPositionInLine() + 1, $id1.getText())); }
         (',' id2=ID { $ast.add(new Variable($id2.getLine(), $id2.getCharPositionInLine() + 1, $id2.getText())); } )*
         ;

//variable_definition returns[List<VariableDefinition> ast = new ArrayList<>()] locals [List<Token> vars = new ArrayList<>()]:
//              'let' id1=ID {$vars.add($id1);} (',' id2=ID {$vars.add($id2);})* ':' type ';'
//              {
//                for(Token var : $vars){
//                    VariableDefinition varDef = new VariableDefinition(var.getLine(), var.getCharPositionInLine()+1, var.getText(), $type.ast);
//                    $ast.add(varDef);
//                }
//              }
//              ;

variable_definition returns [ List<VariableDefinition> ast = new ArrayList<VariableDefinition>() ]:
            'let' variables ':' type  ';' {
                for (Variable v: $variables.ast) {
                    //$ast.add( new VariableDefinition(v.getLine(), v.getColumn(), v.getName(), $type.ast));
                       VariableDefinition varDef =  new VariableDefinition(v.getLine(), v.getColumn(), v.getName(), $type.ast);
                       if(!$ast.contains(varDef)){$ast.add(varDef);}
                       else{ new ErrorType("La variable " + v.getName() + " ya se ha declarado.", varDef);}
                }
            };

simple_type returns[Type ast]:
           'int' {$ast = IntType.getInstance();}
           | 'number' {$ast = NumberType.getInstance();}
           | 'char' {$ast = CharType.getInstance();}
           ;

type returns[Type ast] : // locals [List<RecordField> recordFields = new ArrayList<>()]:
    simple_type {$ast = $simple_type.ast;}
    //| '['  (variable_definition {$recordFields.addAll($variable_definition.ast.stream().map(vDef -> new RecordField(vDef.getLine(), vDef.getColumn(), vDef.getName(), vDef.getType())).toList());})+ ']' {$ast = new RecordType($recordFields);}
    ||  | e='[' (record_field{ $ast = new RecordType($e.getLine(), $e.getCharPositionInLine()+1, $record_field.ast); })+ ']'
    | '[' INT_CONSTANT ']'  type {$ast = new ArrayType(LexerHelper.lexemeToInt($INT_CONSTANT.text), $type.ast);}
    ;


record_field returns [ List<RecordField> ast = new ArrayList<RecordField>() ]:
        ('let' variables ':' type ';' {

            for (Variable v: $variables.ast) {
                //$ast.add( new RecordField(v.getLine(), v.getColumn(), v.getName(), $type.ast));
                RecordField recordField = new RecordField(v.getLine(), v.getColumn(), v.getName(), $type.ast);
                if(!$ast.contains(recordField)){$ast.add(recordField);}
                else{new ErrorType("El campo " + v.getName() + " ya se ha declarado", recordField);}
            }
        })+
       ;

//-----------------------------------------------------------------

//Lexico

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
SINGLE_LINE_COMMENT: //'//' ~[\r\n]* -> skip
                    '//' .*? ('\r\n' | '\r' | '\n' | EOF) -> skip //otra forma
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
ID: [a-zA-Z_] [a-zA-Z0-9_]*
   ;