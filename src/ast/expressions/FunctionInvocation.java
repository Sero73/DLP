package ast.expressions;

import ast.Expression;
import ast.Statement;
import visitor.Visitor;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Expression, Statement {
    private List<Expression> arguments;
    private Variable variable;

    public FunctionInvocation(int line, int column, List<Expression> arguments, Variable variable) {
        super(line, column);
        this.arguments = arguments;
        this.variable = variable;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public Variable getVariable() {
        return variable;
    }


    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
