package ast.statements;

import ast.AbstractLocatable;
import ast.Expression;
import ast.Statement;

import java.util.List;

public class IfElse extends AbstractLocatable implements Statement {
    private Expression condition;
    private List<Statement> ifBody;
    private List<Statement> elseBody;
    public IfElse(int line, int column,Expression condition, List<Statement> ifBody, List<Statement> elseBody) {
        super(line, column);
        this.condition = condition;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Statement> getIfBody() {
        return ifBody;
    }

    public List<Statement> getElseBody() {
        return elseBody;
    }
}
