package ast;

import java.util.List;

public interface Type extends ASTNode {
    boolean isBuiltIn();
    void mustBeLogical(Locatable locatable);
    void mustPromotesTo(Type other, Locatable locatable);
    void mustBeBuiltIn(Locatable locatable);
    Type arithmetic(Locatable locatable);
    Type arithmetic(Type other, Locatable locatable);
    Type logic(Locatable locatable);
    Type logic(Type other, Locatable locatable);
    Type comparison(Type other,Locatable locatable);
    Type canBeCastTo(Type other, Locatable locatable);
    Type squareBrackets(Type type,Locatable locatable);
    Type dot(String name,Locatable locatable);
    Type parenthesis(List<Type> arguments,Locatable locatable);
    int getNumberOfBytes();
    String suffix();
}
