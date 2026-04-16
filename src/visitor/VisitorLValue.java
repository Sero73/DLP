package visitor;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public class VisitorLValue extends AbstractVisitor<Void,Void> {

    @Override
    public Void visit(Arithmetic arithmetic, Void param) {
        super.visit(arithmetic, param);
        arithmetic.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Logical logical, Void param) {
       super.visit(logical, param);
       logical.setLValue(false);
       return null;
    }

    @Override
    public Void visit(Comparison comparison, Void param) {
        super.visit(comparison, param);
        comparison.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Variable variable, Void param) {
        super.visit(variable, param);
        variable.setLValue(true);
        return null;
    }

    @Override
    public Void visit(UnaryNot unaryNot, Void param) {
        super.visit(unaryNot, param);
        unaryNot.setLValue(false);
        return null;
    }

    @Override
    public Void visit(UnaryMinus unaryMinus, Void param) {
        super.visit(unaryMinus, param);
        unaryMinus.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Cast cast, Void param) {
       super.visit(cast, param);
        cast.setLValue(false);
        return null;
    }

    @Override
    public Void visit(IntLiteral intLiteral, Void param) {
        intLiteral.setLValue(false);
        return null;
    }

    @Override
    public Void visit(NumberLiteral numberLiteral, Void param) {
        numberLiteral.setLValue(false);
        return null;
    }

    @Override
    public Void visit(CharLiteral charLiteral, Void param) {
        charLiteral.setLValue(false);
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
       super.visit(functionInvocation, param);
        functionInvocation.setLValue(false);
        return null;
    }

    @Override
    public Void visit(FieldAccess fieldAccess, Void param) {
       super.visit(fieldAccess, param);
        fieldAccess.setLValue(true);
        return null;
    }

    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        super.visit(arrayAccess, param);
        arrayAccess.setLValue(true);
        return null;
    }

    @Override
    public Void visit(Assignment assignment, Void param) {
      super.visit(assignment, param);
        if(!assignment.getLeft().getLValue()){
            new ErrorType("Left side of assignment is not an lValue",assignment.getLeft());
        }
        return null;
    }

    @Override
    public Void visit(Input input, Void param) {
        input.getExpression().accept(this, param);
        if(!input.getExpression().getLValue()){
            new ErrorType("Expression provided is not an lValue",input.getExpression());
        }
        return null;
    }
}
