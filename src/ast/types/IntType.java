package ast.types;

import ast.Locatable;
import ast.Type;
import visitor.Visitor;

public class IntType extends AbstractType {
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

    @Override
    public void mustBeBuiltIn(Locatable locatable) {
        //IntType is a built-in type
    }

    @Override
    public boolean isBuiltIn() {
        return true;
    }

    @Override
    public void mustBeLogical(Locatable locatable) {
        //IntType is a logical type
    }

    @Override
    public Type arithmetic(Locatable locatable){
        return this;
    }

    @Override
    public Type arithmetic(Type other, Locatable locatable){
        if(other == this || other == CharType.getInstance())
            return this;
        if(other == NumberType.getInstance())
            return NumberType.getInstance();

        return super.arithmetic(other,locatable);
    }

    @Override
    public Type logic(Locatable locatable) {
        return this;
    }

    @Override
    public Type logic(Type other, Locatable locatable){
        if(other == this || other == CharType.getInstance())
            return this;

        return super.logic(other,locatable);
    }

    @Override
    public Type comparison(Type other,Locatable locatable) {
        if(other == CharType.getInstance() || other == NumberType.getInstance()  || other == this)
            return this;

        return super.comparison(other,locatable);
    }

    @Override
    public Type canBeCastTo(Type other, Locatable locatable) {
        if(other.isBuiltIn()){
            return other;
        }
        return super.canBeCastTo(other,locatable);
    }

    @Override
    public void mustPromotesTo(Type other, Locatable locatable){
        if(other == IntType.getInstance() || other == NumberType.getInstance() ){
            return;
        }
        super.mustPromotesTo(other,locatable);
    }

    @Override
    public String toString() {
        return "int";
    }

    @Override
    public int getNumberOfBytes() {
        return 2;
    }
}
