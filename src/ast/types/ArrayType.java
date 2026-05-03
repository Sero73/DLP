package ast.types;

import ast.Locatable;
import ast.Type;
import visitor.Visitor;

public class ArrayType extends AbstractType  {
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

    @Override
    public Type squareBrackets(Type type,Locatable locatable){
        if(type instanceof IntType || type instanceof CharType ){
            return this.type;
        }
        return  super.squareBrackets(type,locatable);
    }

    @Override
    public String toString(){
        return "ArrayType[of:" + type.toString() + ",size:" + size + "]";
    }

    @Override
    public int getNumberOfBytes() {
        return type.getNumberOfBytes() * size;
    }
}
