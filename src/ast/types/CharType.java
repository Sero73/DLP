package ast.types;

import ast.Locatable;
import ast.Type;
import visitor.Visitor;

public class CharType extends AbstractType {
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

    @Override
    public void mustBeBuiltIn(Locatable locatable) {
        //CharType is a built-in type
    }

    @Override
    public void mustBeLogical(Locatable locatable) {
        //Char es un tipo logico porque promociona a int
    }

    @Override
    public boolean isBuiltIn() {
        return true;
    }

    @Override
    public Type arithmetic(Locatable locatable){
        return IntType.getInstance();
    }

    @Override
    public Type arithmetic(Type other, Locatable locatable){
        if(other == this || other == IntType.getInstance())
            return IntType.getInstance();
        if(other == NumberType.getInstance())
            return NumberType.getInstance();

        return super.arithmetic(other,locatable);
    }

    @Override
    public Type logic(Locatable locatable) {
        return IntType.getInstance();
    }

    @Override
    public Type logic(Type other, Locatable locatable){
        if(other == IntType.getInstance() || other == this)
            return IntType.getInstance();

        return super.logic(other,locatable);
    }

    @Override
    public Type comparison(Type other,Locatable locatable) {
        if(other == IntType.getInstance() || other == NumberType.getInstance() || other == this)
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
        if(other == IntType.getInstance() || other == NumberType.getInstance() || other == this ){
            return;
        }
        super.mustPromotesTo(other,locatable);
    }

    @Override
    public String toString() {
        return "char";
    }

    @Override
    public int getNumberOfBytes() {
        return 1;
    }

    @Override
    public String suffix(){
        return "b";
    }
}
