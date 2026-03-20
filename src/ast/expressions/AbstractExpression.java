package ast.expressions;

import ast.AbstractLocatable;
import ast.Expression;

public abstract class AbstractExpression extends AbstractLocatable implements Expression {
    private boolean lValue;
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


}
