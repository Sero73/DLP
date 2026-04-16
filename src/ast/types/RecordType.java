package ast.types;

import ast.Locatable;
import ast.Type;
import visitor.Visitor;

import java.util.List;

public class RecordType extends AbstractType {
    private List<RecordField> recordFields;
    private int column;
    private int line;

    public RecordType(int columnm, int line,List<RecordField> recordFields) {
        this.recordFields = recordFields;
        this.column = columnm;
        this.line = line;
    }

    public List<RecordField> getRecordFields() {
        return recordFields;
    }
    public int getColumn() {
        return column;
   }

   public int getLine() {
        return line;
   }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this,param);
    }

    @Override
    public Type dot(String name, Locatable locatable) {
        for(RecordField recordField : recordFields){
            if(recordField.getName().equals(name)){
                return recordField.getType();
            }
        }
        return super.dot(name,locatable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("record [");
        for (int i = 0; i < recordFields.size(); i++) {
            RecordField field = recordFields.get(i);
            sb.append(field.getType()).append(" ").append(field.getName());

            if (i < recordFields.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public int numberOfBytes() {
        int nBytes = 0;
        for(RecordField recordField : recordFields){
            nBytes += recordField.getType().numberOfBytes();
        }
        return nBytes;
    }
}
