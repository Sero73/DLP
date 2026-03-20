package ast.expressions;

import ast.AbstractLocatable;
import ast.Expression;

public abstract class BinaryOperation extends AbstractExpression implements Expression {
    protected Expression left;
    protected Expression right;
    protected String operator;

    public BinaryOperation(int line, int column, Expression left, Expression right, String operator) {
        super(line, column);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }
    public Expression getLeft() {
        return left;
    }
   public  Expression getRight() {
        return right;
   }

   public String getOperator() {
        return operator;
   }
}
