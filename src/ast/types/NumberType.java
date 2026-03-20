package ast.types;

import ast.Type;
import visitor.Visitor;

public class NumberType implements Type {

    //private static NumberType instance = new NumberType();
    private static NumberType instance = new NumberType();

    public static NumberType getInstance(){
        if(instance == null){
            instance = new NumberType();
        }
        return instance;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this,param);
    }
}
