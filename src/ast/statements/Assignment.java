package ast.statements;

import ast.AbstractLocatable;
import ast.Expression;
import ast.Statement;
import visitor.Visitor;

public class Assignment extends AbstractLocatable implements Statement {
    private Expression left;
    private Expression right;

    public Assignment(int line, int column, Expression left, Expression right) {
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
        return v.visit(this,param);
    }
}
