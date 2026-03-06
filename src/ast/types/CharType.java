package ast.types;

import ast.Type;

public class CharType implements Type {
    //private  static  CharType instance = new CharType();
    private static CharType instance;

    public static CharType getInstance(){
        if(instance == null){
            instance = new CharType();
        }
        return instance;
    }


}
