package codegen;

import ast.definitions.VariableDefinition;
import ast.expressions.ArrayAccess;
import ast.expressions.FieldAccess;
import ast.expressions.Variable;
import ast.types.IntType;
import ast.types.RecordType;

public class AddressCGVisitor extends AbstractCGVisitor<Void,Void> {
    private  CodeGenerator codeGenerator;
    private ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor(CodeGenerator codeGenerator) {
        this.codeGenerator = codeGenerator;
    }

    public void setValueCGVisitor(ValueCGVisitor valueCGVisitor) {
        this.valueCGVisitor = valueCGVisitor;
    }

    /**
     * address[[Variable: expression -> ID]]()=
     *      if(expression.definition.scope == 0){
     *          <pusha> expression.definition.offset
     *      }else{
     *          <push bp>
     *          <pushi> expression.definition.offset
     *          <addi>
     *      }
     */
    @Override
    public Void visit(Variable variable, Void param) {
        if(variable.getDefinition().getScope() == 0) {
            codeGenerator.pusha(((VariableDefinition)variable.getDefinition()).getOffset());
        }else{
            codeGenerator.pushBP();
            codeGenerator.push(((VariableDefinition)variable.getDefinition()).getOffset());
            codeGenerator.add(IntType.getInstance());
        }
        return null;
    }

    /**
     * value[[FieldAccess: expression1 -> expression2 ID]]()=
     *      value[[expression2]]()
     *      <pushi> expression2.type.getField(expression1.getName()).offset
     *      <addi>
     */
    @Override
    public Void visit(FieldAccess fieldAccess, Void param) {
        fieldAccess.getExpression().accept(this,param);
        codeGenerator.push(((RecordType)fieldAccess.getExpression().getType()).getField(fieldAccess.getName()).getOffset());
        codeGenerator.add(IntType.getInstance());
        return null;
    }

    /**
     * value[[ArrayAccess: expression1 -> expression2 expression3]]()=
     *      address[[expression2]]()
     *      value[[expression3]]()
     *      cg.convertTo(expression3.type, IntType.getInstance())
     *      <pushi> expression1.type.numberOfBytes()
     *      <muli>
     *      <addi>
     */
    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        arrayAccess.getLeft().accept(this,param);
        arrayAccess.getRight().accept(valueCGVisitor,param);
        codeGenerator.convertTo(arrayAccess.getRight().getType(), IntType.getInstance());
        codeGenerator.push(arrayAccess.getType().getNumberOfBytes());
        codeGenerator.mul(IntType.getInstance());
        codeGenerator.add(IntType.getInstance());
        return null;
    }
}
