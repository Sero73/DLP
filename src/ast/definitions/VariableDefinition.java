package ast.definitions;

import ast.AbstractLocatable;
import ast.Definition;
import ast.Statement;
import ast.Type;

import java.util.List;

public class VariableDefinition extends AbstractDefinition implements Statement, Definition {

    public VariableDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }

}
