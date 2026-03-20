package ast.types;

import ast.Type;
import visitor.Visitor;

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

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this,param);
    }
}
