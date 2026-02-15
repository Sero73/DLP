package ast.expressions;

import ast.AbstractLocatable;
import ast.Expression;
import ast.Type;

public class Cast extends AbstractLocatable implements Expression {

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
}
