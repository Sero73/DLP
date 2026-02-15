package ast.expressions;

import ast.Expression;

public class Logical extends BinaryOperation {
    public Logical(int line, int column, Expression left, Expression right, String operator) {
        super(line, column, left, right, operator);
    }
}
