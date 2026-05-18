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

    /**
     * value [[Variable: expression -> ID]]()=
     *      address[[expression]]
     *      <load> expression.type.suffix()
     */
    @Override
    public Void visit(Variable variable, Void param) {
        variable.accept(addressCGVisitor, param);
        codeGenerator.load(variable.getType());
        return null;
    }

    /**
     * value[[IntLiteral: expression -> INT_CONSTANT]() =
     *      <pushi> expression.value
     */
    @Override
    public Void visit(IntLiteral intLiteral, Void param) {
        codeGenerator.push(intLiteral.getValue());
        return null;
    }

    /**
     * value[[NumberLiteral: expression -> NUMBER_CONSTANT]() =
     *      <pushf> expression.value
     */
    @Override
    public Void visit(NumberLiteral numberLiteral, Void param) {
        codeGenerator.push(numberLiteral.getValue());
        return null;
    }

    /**
     * value[[CharLiteral: expression -> CHAR_CONSTANT]() =
     *      <pushb> expression.value
     */
    @Override
    public Void visit(CharLiteral charLiteral, Void param) {
        codeGenerator.push(charLiteral.getValue());
        return null;
    }

    /**
     * value[[Arithmetic: expression1 -> expression2 (+|-|*|/|%) expression3]]() =
     *      value[[expression2]]()
     *      cg.convertTo(expression2.type, expression1.type)
     *      value[[expression3]]()
     *      cg.convertTo(expression3.type, expression1.type)
     *      cg.arithemetic(expression1.operator, expression1.type)
     */
    @Override
    public Void visit(Arithmetic arithmetic, Void param) {
        arithmetic.getLeft().accept(this, param);
        codeGenerator.convertTo(arithmetic.getLeft().getType(), arithmetic.getType());
        arithmetic.getRight().accept(this, param);
        codeGenerator.convertTo(arithmetic.getRight().getType(), arithmetic.getType());
        codeGenerator.arithmetic(arithmetic.getOperator(),arithmetic.getType());
        return null;
    }

    /**
     * value[[Logical: expression1 -> expression2 (&&|||) expression3]]() =
     *      value[[expression2]]()
     *      cg.convertTo(expression2.type, expression1.type)
     *      value[[expression3]]()
     *      cg.convertTo(expression3.type, expression1.type)
     *      cg.arithemetic(expression1.operator, expression1.type)
     */
    @Override
    public Void visit(Logical logical, Void param) {
        logical.getLeft().accept(this, param);
        codeGenerator.convertTo(logical.getLeft().getType(), logical.getType());
        logical.getRight().accept(this, param);
        codeGenerator.convertTo(logical.getRight().getType(), logical.getType());
        codeGenerator.logical(logical.getOperator());
        return null;
    }

    /**
     * value[[Comparison: expression1 -> expression2 (>||>=||<||<=||==||!=) expression3]]() =
     *      Type typeToPromote = cg.getBiggerType(expression2.type, expression3.type)
     *      value[[expression2]]()
     *      cg.convertTo(expression2.type, typeToPromote)
     *      value[[expression3]]()
     *      cg.convertTo(expression3.type, typeToPromote)
     *      cg.arithemetic(expression1.operator, typeToPromote)
     */
    @Override
    public Void visit(Comparison comparison, Void param) {
        Type typeToPromote = codeGenerator.getBiggerType(comparison.getLeft().getType(), comparison.getRight().getType());
        comparison.getLeft().accept(this, param);
        codeGenerator.convertTo(comparison.getLeft().getType(), typeToPromote);
        comparison.getRight().accept(this, param);
        codeGenerator.convertTo(comparison.getRight().getType(), typeToPromote);
        codeGenerator.comparison(comparison.getOperator(), typeToPromote);
        return null;
    }

    /**
     * value[[Cast: expression1 -> type expression2]]() =
     *      value[[expression2]]()
     *      cg.convertTo(expression2.type, type)
     */
    @Override
    public Void visit(Cast cast, Void param) {
        cast.getExpression().accept(this, param);
        codeGenerator.convertTo(cast.getExpression().getType(), cast.getType());
        return null;
    }

    /**
     * value[[UnaryMinus: expression1 -> expression2]]() =
     *      cg.unaryMinus(expression1.type)
     *      value[[expression2]]()
     *      cg.convertTo(expression2.type, expression1.type)
     *      cg.sub(expression1.type)
     *
     */
    @Override
    public Void visit(UnaryMinus unaryMinus, Void param) {
        codeGenerator.unaryMinus(unaryMinus.getType());
        unaryMinus.getExpression().accept(this, param);
        codeGenerator.convertTo(unaryMinus.getExpression().getType(), unaryMinus.getType());
        codeGenerator.sub(unaryMinus.getType());
       return null;
    }

    /**
     * value[[UnaryNot: expression1 -> expression2]]() =
     *      value[[expression2]]()
     *      cg.convertTo(expression2.type, expression1.type)
     *      cg.logical(expression1.operator)
     */
    @Override
    public Void visit(UnaryNot unaryNot, Void param){
        unaryNot.getExpression().accept(this, param);
        codeGenerator.convertTo(unaryNot.getExpression().getType(), unaryNot.getType());
        codeGenerator.logical("!");
        return null;
    }

    /**
     * value[[FunctionInvocation: expression1 -> expression2 expression3*]]() =
     *      for(int i =0; i<expression3*;i++){
     *          value[[expression3*.get(i)]]()
     *          cg.convertTo(expression3*.get(i).type, expression2.type.parameters.get(i).type)
     *      }
     *      <call> expression2.name
     */
    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param){
        for(int i = 0; i < functionInvocation.getArguments().size(); i++){
            functionInvocation.getArguments().get(i).accept(this, param);
            FunctionType functionType = (FunctionType) functionInvocation.getVariable().getDefinition().getType();
            codeGenerator.convertTo(functionInvocation.getArguments().get(i).getType(), functionType.getParameters().get(i).getType());
        }
        codeGenerator.call(functionInvocation.getVariable().getName());
        return null;
    }

    /**
     * value[[FieldAccess: expression1 -> expression2 ID]]()=
     *      address[[expression1]]
     *      <load> expression1.type.suffix()
     */
    @Override
    public Void visit(FieldAccess fieldAccess, Void param) {
        fieldAccess.accept(addressCGVisitor, param);
        codeGenerator.load(fieldAccess.getType());
        return null;
    }

    /**
     * value[[ArrayAccess: expression1 -> expression2 expression3]]()=
     *      address[[expression1]]
     *      <load> expression1.type.suffix()
     */
    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        arrayAccess.accept(addressCGVisitor,param);
        codeGenerator.load(arrayAccess.getType());
        return null;
    }

}
