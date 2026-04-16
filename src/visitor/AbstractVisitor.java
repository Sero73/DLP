package visitor;

import ast.Definition;
import ast.Expression;
import ast.Program;
import ast.Statement;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public abstract class AbstractVisitor<RT,PT> implements Visitor<RT,PT> {

    @Override
    public RT visit(Program program, PT param) {
        for(Definition def: program.getDefinitions()) {
            def.accept(this, param);
        }
        return null;
    }

    @Override
    public RT visit(Arithmetic arithmetic, PT param) {
        arithmetic.getLeft().accept(this, param);
        arithmetic.getRight().accept(this, param);
        return null;
    }

    @Override
    public RT visit(Logical logical, PT param) {
        logical.getLeft().accept(this, param);
        logical.getRight().accept(this, param);
        return null;
    }

    @Override
    public RT visit(Comparison comparison, PT param) {
        comparison.getLeft().accept(this, param);
        comparison.getRight().accept(this, param);
        return null;
    }

    @Override
    public RT visit(Variable variable, PT param) {
        return null;
    }

    @Override
    public RT visit(UnaryNot unaryNot, PT param) {
        unaryNot.getExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(UnaryMinus unaryMinus, PT param) {
        unaryMinus.getExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(Cast cast, PT param) {
        cast.getExpression().accept(this, param);
        cast.getCastingType().accept(this, param);
        return null;
    }

    @Override
    public RT visit(IntLiteral intLiteral, PT param) {
        return null;
    }

    @Override
    public RT visit(NumberLiteral numberLiteral, PT param) {
        return null;
    }

    @Override
    public RT visit(CharLiteral charLiteral, PT param) {
        return null;
    }

    @Override
    public RT visit(FunctionInvocation functionInvocation, PT param) {
        for(Expression arg: functionInvocation.getArguments()) {
            arg.accept(this, param);
        }
        functionInvocation.getVariable().accept(this, param);
        return null;
    }

    @Override
    public RT visit(FunctionType functionType, PT param) {
        for(VariableDefinition var : functionType.getVariablesDefinitions()){
            var.accept(this, param);
        }
        functionType.getReturnType().accept(this, param);
        return null;
    }

    @Override
    public RT visit(FieldAccess fieldAccess, PT param) {
        fieldAccess.getExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(ArrayAccess arrayAccess, PT param) {
        arrayAccess.getLeft().accept(this, param);
        arrayAccess.getRight().accept(this, param);
        return null;
    }

    @Override
    public RT visit(ArrayType arrayType, PT param) {
        arrayType.getType().accept(this, param);
        return null;
    }

    @Override
    public RT visit(RecordType recordType, PT param) {
        for(RecordField field: recordType.getRecordFields()){
            field.accept(this, param);
        }
        return null;
    }

    @Override
    public RT visit(RecordField recordField, PT param) {
        recordField.getType().accept(this, param);
        return null;
    }

    @Override
    public RT visit(IntType intType, PT param) {
        return null;
    }

    @Override
    public RT visit(NumberType numberType, PT param) {
        return null;
    }

    @Override
    public RT visit(CharType charType, PT param) {
        return null;
    }

    @Override
    public RT visit(VoidType voidType, PT param) {
        return null;
    }

    @Override
    public RT visit(ErrorType voidType, PT param) {
        return null;
    }

    @Override
    public RT visit(Assignment assignment, PT param) {
        assignment.getLeft().accept(this, param);
        assignment.getRight().accept(this, param);
        return null;
    }

    @Override
    public RT visit(IfElse ifElse, PT param) {
        ifElse.getCondition().accept(this, param);
        for(Statement statement: ifElse.getIfBody()){
            statement.accept(this, param);
        }
        if(ifElse.getElseBody() != null) {
            for (Statement statement : ifElse.getElseBody()) {
                statement.accept(this, param);
            }
        }
        return null;
    }

    @Override
    public RT visit(Log log, PT param) {
        log.getExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(Input input, PT param) {
        input.getExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(Return aReturn, PT param) {
        aReturn.getExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(While aWhile, PT param) {
        aWhile.getCondition().accept(this, param);
        for(Statement statement: aWhile.getBody()){
            statement.accept(this, param);
        }
        return null;
    }

    @Override
    public RT visit(FunctionDefinition functionDefinition, PT param) {
        functionDefinition.getType().accept(this, param);
        for(Statement statement: functionDefinition.getStatements()){
            statement.accept(this, param);
        }
        return null;
    }

    @Override
    public RT visit(VariableDefinition variableDefinition, PT param) {
        variableDefinition.getType().accept(this, param);
        return null;
    }
}
