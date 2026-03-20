package ast;

import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Program implements ASTNode {
    private List<Definition> definitions;

    public Program(List<Definition> definitions) {
        this.definitions = definitions;
    }
    public List<Definition> getDefinitions() {
        return new ArrayList<>(definitions);
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
