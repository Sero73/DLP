package ast.statements;

import ast.AbstractLocatable;
import ast.Expression;
import ast.Statement;

import java.util.List;

public class While extends AbstractLocatable implements Statement {
    private Expression condition;
    private List<Statement> body;

    public While(int line, int column, Expression condition, List<Statement> body) {
        super(line, column);
        this.condition = condition;
        this.body = body;
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Statement> getBody() {
        return body;
    }
}
