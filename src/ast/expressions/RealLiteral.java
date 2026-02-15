package ast.expressions;

import ast.AbstractLocatable;
import ast.Expression;

public class RealLiteral extends AbstractLocatable implements Expression {

    private double value;
    public RealLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
