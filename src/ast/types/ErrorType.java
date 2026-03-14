package ast.types;

import ast.Locatable;
import ast.Type;
import errorhandler.ErrorHandler;

public class ErrorType implements Type {
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
}
