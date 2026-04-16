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
    public int scope;

    public AbstractDefinition(int line, int column, String name, Type type){
        super(line, column);
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public int getScope() {
        return scope;
    }

    @Override
    public void setScope(int scope) {
        this.scope = scope;
    }


}
