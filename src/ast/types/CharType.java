package ast.types;

import ast.Type;
import visitor.Visitor;

public class CharType implements Type {
    //private  static  CharType instance = new CharType();
    private static CharType instance;

    public static CharType getInstance(){
        if(instance == null){
            instance = new CharType();
        }
        return instance;
    }


    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this,param);
    }
}
