package ast.expressions;

import ast.AbstractLocatable;
import ast.Expression;

public class RecordAccess extends AbstractLocatable implements Expression {
    private Expression expression;
    private String name;

    public RecordAccess(int line, int column, Expression expression, String name) {
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
