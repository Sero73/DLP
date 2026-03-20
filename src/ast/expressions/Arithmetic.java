package ast.expressions;

import ast.Expression;
import visitor.Visitor;

public class Arithmetic extends BinaryOperation {
    public Arithmetic(int line, int column, Expression left, Expression right, String operator) {
        super(line, column, left, right, operator);
    }


    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
