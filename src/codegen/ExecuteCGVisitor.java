package codegen;

import ast.Definition;
import ast.Program;
import ast.Statement;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.Cast;
import ast.expressions.FunctionInvocation;
import ast.statements.*;
import ast.types.FunctionType;
import ast.types.IntType;
import ast.types.VoidType;
import visitor.AbstractVisitor;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void,FunctionDefinition> {
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

    /**
     * execute[[Assignment: statement -> expression1 expression2]]()=
     *      address[[expression1]]()
     *      value[[expression2]]()
     *      cg.convertTo(exporession2.type, expression1.type)
     *      <store> expression1.type.suffix()
     */
    @Override
    public Void visit(Assignment a, FunctionDefinition param) {
        codeGenerator.commentLine(a.getLine());
        codeGenerator.comment("Assignment");
        a.getLeft().accept(addressCGVisitor, null);
        a.getRight().accept(valueCGVisitor, null);
        codeGenerator.convertTo(a.getRight().getType(), a.getLeft().getType());
        codeGenerator.store(a.getLeft().getType());
        return null;
    }

    /**
     * execute[[Input: statement -> expression]]()=
     *      value[[expression]]()
     *      <in> expression.type.suffix()
     *      <store> expression.type.suffix()
     */
    @Override
    public Void visit(Input input, FunctionDefinition param) {
        codeGenerator.commentLine(input.getLine());
        codeGenerator.comment("Read");
        input.getExpression().accept(addressCGVisitor, null);
        codeGenerator.in(input.getExpression().getType());
        codeGenerator.store(input.getExpression().getType());
        return null;

    }

    /**
     * execute[[Log: statement -> expression]]()=
     *      value[[expression]]()
     *      <out> expression.type.suffix()
     */
    @Override
    public Void visit(Log log, FunctionDefinition param) {
        codeGenerator.commentLine(log.getLine());
        codeGenerator.comment("Write");
        log.getExpression().accept(valueCGVisitor, null);
        codeGenerator.out(log.getExpression().getType());
        return null;
    }

    /**
     * execute[[VariableDefinition: definition -> type ID]]()=
     *      ' * type ID (offset definition.offset)
     */
    @Override
    public Void visit(VariableDefinition variableDefinition, FunctionDefinition param) {
        codeGenerator.comment(variableDefinition.getType().toString() + " " + variableDefinition.getName() +
                " (offset " + variableDefinition.getOffset() +")");
        return null;
    }

    /**
     * execute[[FunctionDefinition: definition -> ID type statement*]]()=
     *      ID<:>
     *      ' * Parameters:
     *      execute[[type]]()
     *      ' * Local variables:
     *      for(Statement stmt :  statement*){
     *          if(stmt instanceof VariableDefinition){
     *              execute[[stmt]]()
     *          }
     *      }
     *      <enter> definition.localBytes
     *      ' * function body:
     *      fot(Statement stmt : statement*{
     *          if(!(stmt instanceof VariableDefinition)){
     *              execute[[stmt]](definition)
     *          }
     *      }
     *      if(type.returnType == VoidType.getInstance())
     *          <ret> 0<,> definition.localBytes <,> type.parameters.map(p->p.type.numberOfBytes).sum()
     *
     */
    @Override
    public Void visit(FunctionDefinition functionDefinition, FunctionDefinition param) {

        codeGenerator.commentLine(functionDefinition.getLine());
        codeGenerator.printFunctionName(functionDefinition.getName());
        codeGenerator.comment("Parameters:");
        functionDefinition.getType().accept(this, param);
        codeGenerator.comment("Local variables:");
        for (Statement st : functionDefinition.getStatements()){
            if(st instanceof VariableDefinition){
                st.accept(this, param);
            }
        }

        FunctionType functionType = (FunctionType)functionDefinition.getType();
        codeGenerator.enter(functionDefinition.getLocalBytes());

       codeGenerator.comment("Function body:");
        for(Statement st : functionDefinition.getStatements()){
            if(!(st instanceof VariableDefinition)){
                st.accept(this, functionDefinition);
            }
        }

        if(functionType.getReturnType() == VoidType.getInstance()){
            codeGenerator.ret(0, functionDefinition.getLocalBytes(), functionType.getParameters().stream().mapToInt(p-> p.getType().getNumberOfBytes()).sum());
        }
        return null;
    }


    /**
     * execute[[FunctionType: type -> VariableDefinition* type]]() =
     *      VariableDefinition*.foreach(vDef -> execute[[vDef]]())
     */
    @Override
    public Void visit(FunctionType functionType, FunctionDefinition param) {
        functionType.getParameters().forEach(vDef -> vDef.accept(this, param));
        return null;
    }



    /**
     * execute [[Program: definition -> definition*]]()=
     *      for(Definition def: definition*){
     *          if(def instanceof VariableDefinition){
     *              execute[[def]]()
     *          }
     *      }
     *      <call main>
     *      <halt>
     *      for(Definition def : definition*){
     *          if(def instanceof FunctionDefinition){
     *              execute[[def]]()
     *          }
     *      }
     */
    @Override
    public Void visit(Program program, FunctionDefinition param) {
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

    /**
     * execute[[While: statement1 -> expression statement2*]]()=
     *      String condition = cg.getLabel();
     *      String end = cg.getLabel();
     *      condition<:>
     *      value[[expression]]()
     *      cg.convertTo(expression.type, IntType.getInstance())
     *      <jz> end
     *      statement2*.foreach(stmt -> execute[[stmt]]())
     *      <jmp> condition
     *      end<:>

     */
    @Override
    public Void visit(While while_, FunctionDefinition param){
        codeGenerator.commentLine(while_.getLine());
        codeGenerator.comment("While");
        String condition = codeGenerator.getLabel();
        String end = codeGenerator.getLabel();
        codeGenerator.label(condition);
        while_.getCondition().accept(valueCGVisitor, null);
        codeGenerator.convertTo(while_.getCondition().getType(), IntType.getInstance());
        codeGenerator.jz(end);
        codeGenerator.comment("While body");
        while_.getBody().forEach(s-> s.accept(this,param));
        codeGenerator.jmp(condition);
        codeGenerator.label(end);
        return null;
    }

    /**
     * execute[IfElse: statement1 -> expression statement2* statement3*]]()=
     *      String else = cg.getLabel()
     *      String end = cg.getLabel()
     *      value[[expression]]()
     *      cg.convertTo(expression.type, IntType.getInstance())
     *      <jz> else
     *      statement2*.foreach(stmt -> execute[[stmt]]())
     *      <jmp> end
     *      else<:>
     *      statement3*.foreach(stmt -> execute[[stmt]]())
     *      end<:>
     */
    @Override
    public Void visit(IfElse ifElse, FunctionDefinition param) {
        codeGenerator.commentLine(ifElse.getLine());
        codeGenerator.comment("If");
        codeGenerator.commentLine(ifElse.getLine());
        String else_ = codeGenerator.getLabel();
        String end = codeGenerator.getLabel();
        ifElse.getCondition().accept(valueCGVisitor, null);
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

    /**
     * execute [[FunctionInvocation: statement -> expression1 expression2*]]()=
     *      value[[expression1]]()
     *      if(expression1.type.returnType != VoidType.getInsance()){
     *          <pop> expression1.type.returnType.suffix()
     *      }
     */
    @Override
    public Void visit(FunctionInvocation functionInvocation, FunctionDefinition param) {
        codeGenerator.commentLine(functionInvocation.getLine());
        codeGenerator.comment("Invocation to " + functionInvocation.getVariable().getName());
        functionInvocation.accept(valueCGVisitor,null);
        if(((FunctionType)functionInvocation.getVariable().getType()).getReturnType() != VoidType.getInstance()){
            codeGenerator.pop(((FunctionType)functionInvocation.getVariable().getType()).getReturnType());
        }
        return null;
    }

    /**
     * execute[[Return: statement -> expression]](FunctionDefinition fDef)=
     *      value[[expression]]()
     *      cg.convertTo(expression.type, fDef.type.returnType)
     *      <ret> fDef.type.returnType.numberOfBytes() <,>
     *            fDef.localBytes<,>
     *            fDef.type.parameters.map(p -> p.type.numberOfBytes()).sum()
     */
    @Override
    public Void visit(Return returnStmt, FunctionDefinition param) {
        codeGenerator.commentLine(returnStmt.getLine());
        codeGenerator.comment("Return");
        returnStmt.getExpression().accept(valueCGVisitor, null);
        FunctionType functionType = (FunctionType) param.getType();
        codeGenerator.convertTo(returnStmt.getExpression().getType(), functionType.getReturnType());
        int returnBytes = functionType.getReturnType().getNumberOfBytes();
        int localBytes = param.getLocalBytes();
        int paramsSize = functionType.getParameters().stream().mapToInt(p-> p.getType().getNumberOfBytes()).sum();
        codeGenerator.ret(returnBytes, localBytes, paramsSize);
        return null;
    }


}
