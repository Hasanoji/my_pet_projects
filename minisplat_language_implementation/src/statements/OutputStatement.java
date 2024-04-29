package statements;

import expressions.*;
import java.util.List;
import java.util.Map;

import mini_splat.RunException;

public class OutputStatement extends Statement {

    Expression out;

    public OutputStatement(Expression out) {
        this.out = out;
    }

    public void execute(Map<String, Integer> varMap, List<Integer> output) throws RunException {
        int o = out.computeValue(varMap);
        output.add(o);
    }

    @Override
    public String toString() {
        return out.toString() + "\n";
    }
    
}
