package ast.definitions;

import ast.AbstractLocatable;
import ast.Definition;
import ast.Statement;
import ast.Type;
import ast.types.CharType;

import javax.sound.sampled.Line;
import java.util.List;

public abstract class AbstractDefinition extends AbstractLocatable implements Definition {

    protected String name;
    protected Type type;

    public AbstractDefinition(int line, int column, String name, Type type){
        super(line, column);
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public Type getType() {
        return null;
    }
}
