package ast.types;

import ast.Type;
import visitor.Visitor;

import java.util.List;

public class RecordType implements Type {
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
}
