package ast.expressions;

import ast.AbstractLocatable;
import ast.Expression;

public class IntLiteral extends AbstractLocatable implements Expression {

    private int value;

    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
