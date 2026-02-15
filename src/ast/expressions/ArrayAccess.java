package ast.expressions;

import ast.AbstractLocatable;
import ast.Expression;

public class ArrayAccess extends AbstractLocatable implements Expression {

    private Expression left;
    private Expression right;

    public ArrayAccess(int line, int column, Expression left, Expression right) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
}
