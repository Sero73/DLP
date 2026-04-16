package ast.types;

import ast.Locatable;
import ast.Type;
import errorhandler.ErrorHandler;
import visitor.Visitor;

public class ErrorType extends AbstractType {
    private String cause;
    private Locatable location;

    public ErrorType(String cause, Locatable location){
        this.cause = cause;
        this.location = location;
        ErrorHandler.getInstance().addError(this);
    }

    public String getCause() {
        return cause;
    }

    @Override
    public String toString() {
        return "ErrorType{" +
                "cause='" + cause + '\'' +
                ", line=" + location.getLine() +
                ", column=" + location.getColumn() +
                '}';
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this,param);
    }
}
