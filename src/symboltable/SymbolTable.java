package symboltable;

import java.util.*;
import ast.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String,Definition>> table;
	public SymbolTable()  {
		table=new ArrayList<Map<String, Definition>>();
		table.add(new HashMap<String, Definition>());
	}

	public void set() {
		this.scope = scope+1;
		table.add(new HashMap<String, Definition>());
	}
	
	public void reset() {
		this.scope=0;
		table.remove(1);
	}
	
	public boolean insert(Definition definition) {
		if(findInCurrentScope(definition.getName())){
			return false;
		}
		table.get(scope).put(definition.getName(), definition);
		definition.setScope(scope);
		return true;
	}
	
	public Definition find(String id) {
		for(int i=scope;i>=0;i--) {
			if(table.get(i).containsKey(id)) {
				return table.get(i).get(id);
			}
		}
		return null;
	}

	//package-protected for testing pourposes
	boolean findInCurrentScope(String id) {
		if(table.get(scope).containsKey(id)) {
			return true;
		}
		return false;
	}
}
