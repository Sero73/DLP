package ast.expressions;

import ast.Expression;
import visitor.Visitor;

public class Variable extends AbstractExpression implements Expression {
    private String name;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this,param);
    }
}
