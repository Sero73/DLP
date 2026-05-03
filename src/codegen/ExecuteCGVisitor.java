package codegen;

import ast.Definition;
import ast.Program;
import ast.Statement;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.Cast;
import ast.statements.*;
import ast.types.FunctionType;
import ast.types.IntType;
import visitor.AbstractVisitor;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void,Void> {
    private AddressCGVisitor addressCGVisitor;
    private ValueCGVisitor valueCGVisitor;
    private CodeGenerator codeGenerator;
    public ExecuteCGVisitor(CodeGenerator codeGenerator) {
        this.codeGenerator = codeGenerator;
        this.addressCGVisitor = new AddressCGVisitor(codeGenerator);
        this.valueCGVisitor = new ValueCGVisitor(codeGenerator);
        this.addressCGVisitor.setValueCGVisitor(valueCGVisitor);
        this.valueCGVisitor.setAddressCGVisitor(addressCGVisitor);
    }

    @Override
    public Void visit(Assignment a, Void param) {
        codeGenerator.commentLine(a.getLine());
        codeGenerator.comment("Assignment");
        a.getLeft().accept(addressCGVisitor, param);
        a.getRight().accept(valueCGVisitor, param);
        codeGenerator.convertTo(a.getRight().getType(), a.getLeft().getType());
        codeGenerator.store(a.getLeft().getType());
        return null;
    }

    @Override
    public Void visit(Input input, Void param) {
        codeGenerator.commentLine(input.getLine());
        codeGenerator.comment("Read");
        input.getExpression().accept(addressCGVisitor, param);
        codeGenerator.in(input.getExpression().getType());
        codeGenerator.store(input.getExpression().getType());
        return null;

    }

    @Override
    public Void visit(Log log, Void param) {
        codeGenerator.commentLine(log.getLine());
        codeGenerator.comment("Write");
        log.getExpression().accept(valueCGVisitor, param);
        codeGenerator.out(log.getExpression().getType());
        return null;
    }

    @Override
    public Void visit(VariableDefinition variableDefinition, Void param) {
        codeGenerator.comment(variableDefinition.getType().toString() + " " + variableDefinition.getName() +
                " (offset " + variableDefinition.getOffset() +")");
        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition, Void param) {

        codeGenerator.commentLine(functionDefinition.getLine());
        codeGenerator.printFunctionName(functionDefinition.getName());
        codeGenerator.comment("Parameters");
        int paramSize = 0;
        for(VariableDefinition varDef : ((FunctionType)functionDefinition.getType()).getParameters()){
            varDef.accept(this, param);
            paramSize += varDef.getType().getNumberOfBytes();
        }

        codeGenerator.comment("Local variables");
        for (Statement st : functionDefinition.getStatements()){
            if(st instanceof VariableDefinition){
                st.accept(this, param);
            }
        }

        FunctionType functionType = (FunctionType)functionDefinition.getType();
        //functionType.setReturnBytes(functionType.getReturnType().getNumberOfBytes());
        codeGenerator.enter(functionDefinition.getLocalBytes());

       // codeGenerator.comment("Function body");
        for(Statement st : functionDefinition.getStatements()){
            if(!(st instanceof VariableDefinition)){
                st.accept(this, param);
            }
        }

       // if(functionType.getReturnType().getNumberOfBytes() == 0){
            codeGenerator.ret(0,functionDefinition.getLocalBytes(),0);
        //}
        return null;
    }

    @Override
    public Void visit(FunctionType functionType, Void param) {
        for(VariableDefinition p : functionType.getParameters()){
            codeGenerator.comment(p.getType().toString() + " " + p.getName() + " (offset: " + p.getOffset() +")");
        }
        return null;
    }

    @Override
    public Void visit(Program program, Void param) {
        for(Definition def : program.getDefinitions()){
            if(def instanceof VariableDefinition){
                def.accept(this, param);
            }
        }
        codeGenerator.callMain();
        codeGenerator.halt();
        for(Definition def : program.getDefinitions()){
            if(def instanceof FunctionDefinition){
                def.accept(this, param);
            }
        }
        return null;
    }

    @Override
    public Void visit(While while_, Void param){
        codeGenerator.commentLine(while_.getLine());
        codeGenerator.comment("While");
        String condition = codeGenerator.getLabel();
        String end = codeGenerator.getLabel();
        codeGenerator.label(condition);
        while_.getCondition().accept(valueCGVisitor,param);
        codeGenerator.convertTo(while_.getCondition().getType(), IntType.getInstance());
        codeGenerator.jz(end);
        codeGenerator.comment("While body");
        while_.getBody().forEach(s-> s.accept(this,param));
        codeGenerator.jmp(condition);
        codeGenerator.label(end);
        return null;
    }

    @Override
    public Void visit(IfElse ifElse, Void param) {
        codeGenerator.commentLine(ifElse.getLine());
        codeGenerator.comment("If");
        codeGenerator.commentLine(ifElse.getLine());
        String else_ = codeGenerator.getLabel();
        String end = codeGenerator.getLabel();
        ifElse.getCondition().accept(valueCGVisitor,param);
        codeGenerator.convertTo(ifElse.getCondition().getType(),IntType.getInstance());
        codeGenerator.jz(else_);
        codeGenerator.comment("If body");
        ifElse.getIfBody().forEach(s-> s.accept(this,param));
        codeGenerator.jmp(end);
        codeGenerator.label(else_);
        codeGenerator.comment("Else body");
        ifElse.getElseBody().forEach(s-> s.accept(this,param));
        codeGenerator.label(end);
        return null;
    }


}
