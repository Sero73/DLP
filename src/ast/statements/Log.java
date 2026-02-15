package ast.statements;

import ast.AbstractLocatable;
import ast.Expression;

public class Log  extends AbstractLocatable implements Expression {
    private Expression expression;

    public Log(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}
