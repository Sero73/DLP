package ast.statements;

import ast.AbstractLocatable;
import ast.Expression;
import ast.Statement;
import visitor.Visitor;

public class Log  extends AbstractLocatable implements Statement {
    private Expression expression;

    public Log(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this,param);
    }
}
