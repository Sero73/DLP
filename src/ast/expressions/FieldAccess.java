package ast.expressions;

import ast.Expression;
import visitor.Visitor;

public class FieldAccess extends AbstractExpression implements Expression {
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


    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
