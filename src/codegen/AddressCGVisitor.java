package codegen;

import ast.definitions.VariableDefinition;
import ast.expressions.Variable;

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
            codeGenerator.add(variable.getType());
        }
        return null;
    }
}
