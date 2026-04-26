package ast.types;

import ast.Locatable;
import ast.Type;
import visitor.Visitor;

import java.util.List;

public abstract class AbstractType implements Type {


    @Override
    public boolean isBuiltIn() {
        return false;
    }

    @Override
    public void mustBeLogical(Locatable locatable) {
        new ErrorType("Expected a logical type, but found: " + this,locatable);
    }

    @Override
    public Type arithmetic(Locatable locatable) {
        return new ErrorType("Arithmetic operation is not allowed on type: " + this,locatable);
    }

    @Override
    public Type arithmetic(Type other, Locatable locatable) {
        if(other instanceof ErrorType) {
            return other;
        }
        return new ErrorType("Arithmetic operation is not allowed between types: " + this + " and " +  other ,locatable);
    }

    @Override
    public Type logic(Locatable locatable) {
        return new ErrorType("Logical operation is not allowed on type: " + this,locatable);
    }


    @Override
    public Type logic(Type other, Locatable locatable) {
        if(other instanceof ErrorType) {
            return other;
        }
        return new ErrorType("Logical operation is not allowed between types: " + this + " and " + other,locatable);
    }

    @Override
    public Type comparison(Type other, Locatable locatable) {
        if(other instanceof ErrorType) {
            return other;
        }
        return new ErrorType("Comparison is not allowed between types: " + this + " and " + other, locatable);
    }

    @Override
    public Type canBeCastTo(Type other,Locatable locatable) {
        if(other instanceof ErrorType) {
            return other;
        }
        return new ErrorType("cannot cast type: " + this + "to: " + other, locatable);
    }

    @Override
    public void mustPromotesTo(Type other, Locatable locatable) {
        //other (tipo esperado es error)
        if(other instanceof ErrorType) {
            return;
        }

        //this(resultado ya es error)
        if (this instanceof ErrorType) {
            return;
        }

        new ErrorType(this + " cannot promote to: " + other,locatable);
    }

    @Override
    public void mustBeBuiltIn(Locatable locatable) {
        if(this instanceof ErrorType) {
            return;
        }
        new ErrorType("Expected a built-in type, but found: " + this ,locatable);
    }

    @Override
    public Type squareBrackets(Type type,Locatable locatable) {
        if(type instanceof ErrorType) {
            return type;
        }
        return new ErrorType("Indexing not supported for this type: " + this,locatable);
    }

    @Override
    public Type dot(String name, Locatable locatable) {
        return new ErrorType("Field: " + name + " not found in type " + this,locatable);
    }

    @Override
    public Type parenthesis(List<Type> arguments, Locatable locatable) {
        if(this instanceof ErrorType) {
            return this;
        }

        for (Type t : arguments) {
            if (t instanceof ErrorType) {
                return t;
            }
        }

        return new ErrorType("Function call is not suported for: " + this + " type",locatable);
    }

    @Override
    public int getNumberOfBytes() {
        throw new UnsupportedOperationException("Not supported type");
    }

    @Override
    public String suffix(){
        throw new UnsupportedOperationException("Type does not support suffix");
    }
}
