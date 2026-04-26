package semantic;

import ast.Definition;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.Variable;
import ast.types.ErrorType;
import ast.types.RecordField;
import ast.types.RecordType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

import java.util.HashMap;
import java.util.Map;

public class IdentificationVisitor extends AbstractVisitor<Void,Void> {
    private SymbolTable symbolTable;
    public IdentificationVisitor() {
         this.symbolTable = new SymbolTable();
    }
    @Override
    public Void visit(VariableDefinition vDef, Void param){
        super.visit(vDef, param);
        if(!symbolTable.insert(vDef)){
            new ErrorType("Variable: '" + vDef.getName() +  "' already defined in this scope ",vDef);
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinition fDef, Void param){
        if(!symbolTable.insert(fDef)){
            new ErrorType("Variable: '" + fDef.getName() + "' already defined in this scope",fDef);
        }
        symbolTable.set();
        super.visit(fDef, param);
        symbolTable.reset();
        return null;
    }

    @Override
    public Void visit(Variable var, Void param){
        super.visit(var, param);
        Definition varDef = symbolTable.find(var.getName());
        if(varDef == null){
            varDef = new VariableDefinition(var.getLine(), var.getColumn(),var.getName(),
                     new ErrorType("Variable: '" + var.getName() + "' is not defined",var));
        }
        var.setDefinition(varDef);
        return null;
    }

    @Override
    public Void visit(RecordType recordType, Void param){
        Map<String, RecordField> recordFields = new HashMap<>();
        for(RecordField field : recordType.getRecordFields()) {
            if(recordFields.containsKey(field.getName())){
                new ErrorType("Duplicated field: '" + field.getName() + "' in the record", field);
            }else{
                recordFields.put(field.getName(), field);
            }
        }
        return null;
    }
}
