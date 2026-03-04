package ast.expressions;

import ast.AbstractLocatable;
import ast.Expression;

public class FieldAccess extends AbstractLocatable implements Expression {
    private Expression expression;
    private String name;

    public FieldAccess(int line, int column, Expression expression, String name) {
        super(line, column);
        this.name = name;
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public String getName() {
        return name;
    }
}
