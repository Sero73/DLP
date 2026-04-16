package ast;

public interface Expression extends Locatable {
    public void setLValue(boolean lValue);
    public boolean getLValue();
    public Type getType();
    public void setType(Type type);
}
