package ast.types;

import ast.Type;
import visitor.Visitor;

public class IntType implements Type {
    //private static IntType instance = new IntType();
    private static IntType instance;

    public static IntType getInstance(){
        if(instance == null){
            instance = new IntType();
        }
        return instance;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this,param);
    }
}
