package ast.types;

import ast.Expression;
import ast.Type;
import ast.defintions.VariableDefinition;

import java.util.List;

public class FunctionType implements Type {
    private Type returnType;
    private List<VariableDefinition> variablesDefinitions;

    public FunctionType(Type returnType, List<VariableDefinition> variablesDefinitions) {
        this.returnType = returnType;
        this.variablesDefinitions = variablesDefinitions;
    }

    public Type getReturnType() {
        return returnType;
    }

    public List<VariableDefinition> getVariablesDefinitions() {
        return variablesDefinitions;
    }


}
