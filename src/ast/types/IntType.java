package ast.types;

import ast.Type;

public class IntType implements Type {
    //private static IntType instance = new IntType();
    private static IntType instance;

    public static IntType getInstance(){
        if(instance == null){
            instance = new IntType();
        }
        return instance;
    }
}
