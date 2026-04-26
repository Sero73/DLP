package codegen;

import ast.Type;
import ast.expressions.*;
import ast.types.FunctionType;
import ast.types.IntType;

public class ValueCGVisitor extends AbstractCGVisitor<Void,Void> {
    private CodeGenerator codeGenerator;
    private AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    public void setAddressCGVisitor(AddressCGVisitor addressCGVisitor){
        this.addressCGVisitor = addressCGVisitor;
    }

    @Override
    public Void visit(Variable variable, Void param) {
        variable.accept(addressCGVisitor, param);
        codeGenerator.load(variable.getType());
        return null;
    }

    @Override
    public Void visit(IntLiteral intLiteral, Void param) {
        codeGenerator.push(intLiteral.getValue());
        return null;
    }

    @Override
    public Void visit(NumberLiteral numberLiteral, Void param) {
        codeGenerator.push(numberLiteral.getValue());
        return null;
    }

    @Override
    public Void visit(CharLiteral charLiteral, Void param) {
        codeGenerator.push(charLiteral.getValue());
        return null;
    }

    @Override
    public Void visit(Arithmetic arithmetic, Void param) {
        arithmetic.getLeft().accept(this, param);
        codeGenerator.convertTo(arithmetic.getLeft().getType(), arithmetic.getType());
        arithmetic.getRight().accept(this, param);
        codeGenerator.convertTo(arithmetic.getRight().getType(), arithmetic.getType());
        codeGenerator.arithmetic(arithmetic.getOperator(),arithmetic.getType());
        return null;
    }

    @Override
    public Void visit(Logical logical, Void param) {
        logical.getLeft().accept(this, param);
        logical.getRight().accept(this, param);
        codeGenerator.logical(logical.getOperator());
        return null;
    }

    @Override
    public Void visit(Comparison comparison, Void param) {
//        comparison.getLeft().accept(this, param);
//        codeGenerator.convertTo(comparison.getLeft().getType(), comparison.getType());
//        comparison.getRight().accept(this, param);
//        codeGenerator.convertTo(comparison.getRight().getType(), comparison.getType());
//        codeGenerator.comparison(comparison.getOperator(),comparison.getType());
        Type comparisonType = comparison.getLeft().getType();
        comparison.getLeft().accept(this, param);
        comparison.getRight().accept(this, param);
        codeGenerator.convertTo(comparison.getRight().getType(), comparisonType);
        codeGenerator.comparison(comparison.getOperator(), comparisonType);
        return null;
    }

    @Override
    public Void visit(Cast cast, Void param) {
        cast.getExpression().accept(this, param);
        codeGenerator.convertTo(cast.getExpression().getType(), cast.getType());
        return null;
    }

    @Override
    public Void visit(UnaryMinus unaryMinus, Void param) {
        unaryMinus.getExpression().accept(this, param);
        codeGenerator.convertTo(unaryMinus.getExpression().getType(), unaryMinus.getType());
        if(unaryMinus.getType() == IntType.getInstance()){
            codeGenerator.neg();
        }else{
            codeGenerator.negf();
        }
       return null;
    }


    @Override
    public Void visit(UnaryNot unaryNot, Void param){
        unaryNot.getExpression().accept(this, param);
        codeGenerator.logical("!");
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param){
        for(int i = 0; i < functionInvocation.getArguments().size(); i++){
            functionInvocation.getArguments().get(i).accept(this, param);
            codeGenerator.convertTo(functionInvocation.getArguments().get(i).getType(), ((FunctionType)functionInvocation.getVariable().getDefinition()).getParameters().get(i).getType());
        }
        codeGenerator.call(functionInvocation.getVariable().getName());
        return null;
    }


}
