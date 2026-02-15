package ast.expressions;

import ast.AbstractLocatable;
import ast.Expression;
import ast.Statement;

import java.util.List;

public class FunctionInvocation extends AbstractLocatable implements Expression, Statement {
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
}
