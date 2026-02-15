package ast.types;

import ast.Type;

public class ArrayType implements Type  {
    private int  size;
    private Type type;

    public ArrayType(int size, Type type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public Type getType() {
        return type;
    }
}
