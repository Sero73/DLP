package ast.types;

import ast.Locatable;
import ast.Type;
import visitor.Visitor;

public class NumberType extends AbstractType {

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

    @Override
    public void mustBeBuiltIn(Locatable locatable) {
        //NumberType is a built-in type
    }

    @Override
    public boolean isBuiltIn() {
        return true;
    }

    @Override
    public Type arithmetic(Locatable locatable){
        return this;
    }

    @Override
    public Type arithmetic(Type other, Locatable locatable){
        if(other == this || other == IntType.getInstance() || other == CharType.getInstance())
            return NumberType.getInstance();

        return super.arithmetic(other,locatable);
    }

    @Override
    public Type comparison(Type other,Locatable locatable) {
        if(other == this || other == IntType.getInstance() || other == CharType.getInstance())
            return IntType.getInstance();

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
        if(other == this){
            return;
        }

        super.mustPromotesTo(other,locatable);
    }

    @Override
    public String toString() {
        return "number";
    }

    @Override
    public int getNumberOfBytes() {
        return 4;
    }
}
