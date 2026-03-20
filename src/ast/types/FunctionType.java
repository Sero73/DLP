package ast.types;

import ast.Type;
import ast.definitions.VariableDefinition;
import visitor.Visitor;

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


    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this,param);
    }
}
