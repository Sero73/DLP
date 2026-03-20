package ast.expressions;

import ast.Expression;
import visitor.Visitor;

public class ArrayAccess extends AbstractExpression implements Expression {

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

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
