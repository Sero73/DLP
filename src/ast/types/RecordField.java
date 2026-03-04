package ast.types;

import ast.AbstractLocatable;
import ast.Type;

public class RecordField extends AbstractLocatable {
    private String name;
    private Type type;


    public RecordField(int line, int column, String name, Type type) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}
