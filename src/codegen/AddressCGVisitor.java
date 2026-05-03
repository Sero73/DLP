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

    @Override
    public Void visit(FieldAccess fieldAccess, Void param) {
        fieldAccess.getExpression().accept(this,param);
        codeGenerator.push(((RecordType)fieldAccess.getExpression().getType()).getField(fieldAccess.getName()).getOffset());
        codeGenerator.add(IntType.getInstance());
        return null;
    }

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
