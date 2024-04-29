package expressions;

import java.util.Map;

import mini_splat.RunException;

public class VariableExpr extends Expression {
    String var;

    public VariableExpr(String var) {
        this.var = var;
    }
    @Override
    public int computeValue(Map<String, Integer> varMap) throws RunException {
        if(varMap.containsKey(var)) return varMap.get(var);
        throw new RunException("Does not exist");
    }

    @Override
    public String toString() {
        return String.valueOf(var) + "\n";
    }
    
}
