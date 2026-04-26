package codegen;

import ast.Statement;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.types.FunctionType;
import ast.types.RecordField;
import ast.types.RecordType;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Void,Void> {
    int localOffsetCount = 0;
    int globalOffsetCount = 0;

    @Override
    public Void visit(VariableDefinition v, Void param) {
        if(v.getScope() == 0){
            v.setOffset(globalOffsetCount);
            globalOffsetCount+= v.getType().getNumberOfBytes();
        }else{
            localOffsetCount -= v.getType().getNumberOfBytes();
            v.setOffset(localOffsetCount);
        }
        v.getType().accept(this, param);
        return null;
    }

    @Override
    public Void visit(RecordType recordType, Void param) {
        int fieldOffsetCount = 0;
        for(RecordField recordField: recordType.getRecordFields()){
            recordField.setOffset(fieldOffsetCount);
            fieldOffsetCount += recordField.getType().getNumberOfBytes();
            recordField.getType().accept(this, param);
        }
        return null;
    }

    @Override
    public Void visit(FunctionType functionType, Void param) {
        int paramsOffset = 4;
        for(int i=functionType.getParameters().size()-1;i>=0;i--){
            functionType.getParameters().get(i).setOffset(paramsOffset);
            paramsOffset +=  functionType.getParameters().get(i).getType().getNumberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition, Void param) {
        this.localOffsetCount = 0;
//        functionDefinition.getType().accept(this, param);
//        for(Statement st : functionDefinition.getStatements())  {
//            st.accept(this, param);
//            functionDefinition.setLocalBytes(-localOffsetCount);
//        }
        super.visit(functionDefinition, param);
        functionDefinition.setLocalBytes(-localOffsetCount);
        return null;
    }
}
