package ast.expressions;

import ast.Expression;
import ast.Type;
import visitor.Visitor;

public class Cast extends AbstractExpression implements Expression {

    private Expression expression;
    private Type castingType;

    public Cast(int line, int column, Expression expression, Type castingType) {
        super(line, column);
        this.expression = expression;
        this.castingType = castingType;
    }

    public Expression getExpression() {
        return expression;
    }

    public Type getCastingType() {
        return castingType;
    }


    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
