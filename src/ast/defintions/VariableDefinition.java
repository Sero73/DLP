package ast.defintions;

import ast.AbstractLocatable;
import ast.Definition;
import ast.Statement;
import ast.Type;

import java.util.List;

public class VariableDefinition extends AbstractLocatable implements Statement, Definition {
    private List<Statement> statements;
    private String name;
    private Type type;

    public VariableDefinition(int line, int column, List<Statement> statements,  String name, Type type) {
        super(line, column);
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }
}
