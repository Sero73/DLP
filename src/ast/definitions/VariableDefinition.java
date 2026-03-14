package ast.definitions;

import ast.AbstractLocatable;
import ast.Definition;
import ast.Statement;
import ast.Type;

import java.util.List;
import java.util.Objects;

public class VariableDefinition extends AbstractDefinition implements Statement, Definition {

    public VariableDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VariableDefinition that = (VariableDefinition) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
