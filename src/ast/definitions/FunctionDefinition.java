package ast.definitions;

import ast.AbstractLocatable;
import ast.Definition;
import ast.Statement;
import ast.Type;
import visitor.Visitor;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition implements Definition {
    private List<Statement> statements;

    public FunctionDefinition(int line, int column, List<Statement> statements, String name, Type type) {
        super(line, column, name, type);
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this,param);
    }
}
