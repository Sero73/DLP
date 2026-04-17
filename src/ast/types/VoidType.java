package ast.types;

import ast.Type;
import visitor.Visitor;

public class VoidType extends AbstractType {
    //private static VoidType instance = new VoidType();
    private static VoidType instance;

    public static VoidType getInstance(){
        if(instance == null){
            instance = new VoidType();
        }
        return instance;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this,param);
    }

    @Override
    public String toString(){
        return "void";
    }

}
