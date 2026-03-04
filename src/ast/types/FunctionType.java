package ast.types;

import ast.Type;
import ast.definitions.VariableDefinition;

import java.util.List;

public class FunctionType implements Type {
    private Type returnType;
    private List<VariableDefinition> paramaters;

    public FunctionType(Type returnType, List<VariableDefinition> parameters) {
        this.returnType = returnType;
        this.paramaters = parameters;
    }

    public Type getReturnType() {
        return returnType;
    }

    public List<VariableDefinition> getVariablesDefinitions() {
        return paramaters;
    }


}
