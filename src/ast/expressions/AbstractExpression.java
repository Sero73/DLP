package ast.expressions;

import ast.AbstractLocatable;
import ast.Expression;
import ast.Type;

public abstract class AbstractExpression extends AbstractLocatable implements Expression {
    private boolean lValue;
    private Type type;
    public AbstractExpression(int line, int column) {
        super(line, column);
        this.lValue = false;
    }

    @Override
    public boolean getLValue(){
        return lValue;
    }

    @Override
    public void setLValue(boolean lValue){
        this.lValue = lValue;
    }

    @Override
    public Type getType(){
        return type;
    }

    @Override
    public void setType(Type type){
        this.type = type;
    }

}
