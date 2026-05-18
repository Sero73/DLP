package semantic;


import ast.Expression;
import ast.Statement;
import ast.Type;
import ast.definitions.FunctionDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import visitor.AbstractVisitor;

import java.util.ArrayList;
import java.util.List;

public class TypeCheckingVisitor extends AbstractVisitor<Void,Type> {
    @Override
    public Void visit(IntLiteral intLiteral, Type param){
        intLiteral.setType(IntType.getInstance());
        return null;
    }

    @Override
    public Void visit(NumberLiteral numberLiteral, Type param){
        numberLiteral.setType(NumberType.getInstance());
        return null;
    }

    @Override
    public Void visit(CharLiteral charLiteral, Type param){
        charLiteral.setType(CharType.getInstance());
        return null;
    }

    @Override
    public Void visit(Variable variable, Type param){

        variable.setType(variable.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit(Arithmetic arithmetic, Type param){
        super.visit(arithmetic, param);
        arithmetic.setType(arithmetic.getLeft().getType().arithmetic(arithmetic.getRight().getType(),arithmetic));
        return null;
    }

    @Override
    public Void visit(Logical logical, Type param){
        super.visit(logical, param);
        logical.setType(logical.getLeft().getType().logic(logical.getRight().getType(),logical));
        return null;
    }

    @Override
    public Void visit(Comparison comparison, Type param){
        super.visit(comparison, param);
        comparison.setType(comparison.getLeft().getType().comparison(comparison.getRight().getType(),comparison));
        return null;
    }

    @Override
    public Void visit(Cast cast, Type param){
        super.visit(cast, param);
        cast.setType(cast.getExpression().getType().canBeCastTo(cast.getCastingType(),cast));
        return null;
    }

    @Override
    public Void visit(ArrayAccess arrayAccess, Type param){
        super.visit(arrayAccess, param);
        arrayAccess.setType(arrayAccess.getLeft().getType().squareBrackets(arrayAccess.getRight().getType(),arrayAccess));
        return null;
    }

    @Override
    public Void visit(FieldAccess fieldAccess, Type param){
        super.visit(fieldAccess, param);
        fieldAccess.setType(fieldAccess.getExpression().getType().dot(fieldAccess.getName(),fieldAccess));
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Type param){
        super.visit(functionInvocation, param);
        List<Type> paramTypes = new ArrayList<Type>();
        for(Expression expr : functionInvocation.getArguments()){
            paramTypes.add(expr.getType());
        }
        functionInvocation.setType(functionInvocation.getVariable().getType().parenthesis(paramTypes,functionInvocation));
        return null;
    }

    @Override
    public Void visit(UnaryMinus unaryMinus, Type param){
        super.visit(unaryMinus, param);
        unaryMinus.setType(unaryMinus.getExpression().getType().arithmetic(unaryMinus));
        return null;
    }

    @Override
    public Void visit(UnaryNot unaryNot, Type param){
        super.visit(unaryNot, param);
        unaryNot.setType(unaryNot.getExpression().getType().logic(unaryNot));
        return null;
    }

    @Override
    public Void visit(While w, Type param){
        super.visit(w, param);
        w.getCondition().getType().mustBeLogical(w);
        return null;
    }

    @Override
    public Void visit(Assignment assignment, Type param){
        super.visit(assignment, param);
        assignment.getRight().getType().mustPromotesTo(assignment.getLeft().getType(),assignment);
        return null;
    }

    @Override
    public Void visit(IfElse ifElse, Type param){
        super.visit(ifElse, param);
        ifElse.getCondition().getType().mustBeLogical(ifElse);
        return null;
    }

    @Override
    public Void visit(Input input, Type param){
        super.visit(input, param);
        input.getExpression().getType().mustBeBuiltIn(input);
        return null;
    }

    @Override
    public Void visit(Log log, Type param){
        super.visit(log, param);
        log.getExpression().getType().mustBeBuiltIn(log);
        return null;
    }

    @Override
    public Void visit(Return r, Type param){
        super.visit(r, param);
        r.getExpression().getType().mustPromotesTo(param, r);
        return null;
    }

    @Override
    public Void visit(FunctionDefinition  functionDefinition, Type param){
       functionDefinition.getType().accept(this, param);
       for(Statement statement: functionDefinition.getStatements()){
           statement.accept(this, ((FunctionType)functionDefinition.getType()).getReturnType());
       }
       return null;
    }

}
