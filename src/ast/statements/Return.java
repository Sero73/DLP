package ast.statements;

import ast.AbstractLocatable;
import ast.Expression;
import ast.Statement;

public class Return extends AbstractLocatable implements Statement {
    private Expression expression;
    public Return(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}
