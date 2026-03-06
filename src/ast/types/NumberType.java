package ast.types;

import ast.Type;

public class NumberType implements Type {

    //private static NumberType instance = new NumberType();
    private static NumberType instance = new NumberType();

    public static NumberType getInstance(){
        if(instance == null){
            instance = new NumberType();
        }
        return instance;
    }
}
