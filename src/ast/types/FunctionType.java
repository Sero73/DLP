package ast.types;

import ast.Locatable;
import ast.Type;
import ast.definitions.VariableDefinition;
import visitor.Visitor;

import java.util.List;

public class FunctionType extends AbstractType {
    private Type returnType;
    private List<VariableDefinition> parameters;

    public FunctionType(Type returnType, List<VariableDefinition> parameters) {
        this.returnType = returnType;
        this.parameters = parameters;
    }

    public Type getReturnType() {
        return returnType;
    }

    public List<VariableDefinition> getParameters() {
        return parameters;
    }


    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this,param);
    }

    @Override
    public Type parenthesis(List<Type> arguments, Locatable locatable) {
            if(arguments.size()!=parameters.size()){
                return new ErrorType("Expected: " + parameters.size() + " parameters, but found: " + arguments.size() ,locatable);
            }
            for(int i=0;i<arguments.size();i++){
                if(!arguments.get(i).equals(parameters.get(i).getType())){
                    Type argumentType = arguments.get(i);
                    Type parameterType = this.parameters.get(i).getType();
                    argumentType.mustPromotesTo(parameterType, locatable);
                }
            }
            return returnType;
    }

    @Override
    public void mustPromotesTo(Type type, Locatable locatable) {
        new ErrorType("FunctionType cannot be at the left of an assignment ", locatable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("function(");
        for(int i=0;i<parameters.size();i++){
            sb.append(parameters.get(i).getType());
            if(i<parameters.size()-1){
                sb.append(", ");
            }
        }
        sb.append(") -> ").append(returnType);
        return sb.toString();
    }
}
