package visitor;

import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.types.FunctionType;
import ast.types.RecordField;
import ast.types.RecordType;

public class OffsetVisitor extends AbstractVisitor<Void,Void>{
    int offsetCount = 0;

    @Override
    public Void visit(VariableDefinition v, Void param) {
        super.visit(v, param);
        if(v.getScope() == 0){
           v.setOffset(offsetCount);
        }
        offsetCount += v.getType().numberOfBytes();
        return null;
    }

    @Override
    public Void visit(RecordType recordType, Void param) {
        this.offsetCount = 0;
        super.visit(recordType, param);
        for(RecordField recordField: recordType.getRecordFields()){
            recordField.setOffset(offsetCount);
            offsetCount += recordField.getType().numberOfBytes();
        }
        return null;
    }

//    @Override Void visit(FunctionType functionType, Void param) {
//
//        return null;
//    }
}
