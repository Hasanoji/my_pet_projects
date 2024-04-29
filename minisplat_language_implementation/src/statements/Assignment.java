package statements;

import expressions.Expression;
import java.util.List;
import java.util.Map;

import mini_splat.RunException;

public class Assignment extends Statement {
    String var;
    Expression exp;

    public Assignment(String var, Expression exp) {
        this.var = var;
        this.exp = exp;
    }

    public void execute(Map<String, Integer> varMap, List<Integer> output) throws RunException {
        int a = exp.computeValue(varMap);
        if(a == 0) throw new RunException("cannot divide by zero");
        varMap.put(var, a);
    }

    @Override
    public String toString() {
        String ans = var + "=" + String.valueOf(exp);
        return ans + "\n";
    }
    
}
