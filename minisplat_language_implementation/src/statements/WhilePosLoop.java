package statements;

import expressions.*;
import java.util.List;
import java.util.Map;

import mini_splat.RunException;

public class WhilePosLoop extends Statement {
    Expression condExpr;
    List<Statement> whilebody;

    public WhilePosLoop(Expression condExpr, List<Statement> whilebody) {
        this.condExpr = condExpr;
        this.whilebody = whilebody;
    }

    @Override
    public void execute(Map<String, Integer> varMap, List<Integer> output) throws RunException {
        int exp = condExpr.computeValue(varMap);
        while (exp > 0) {
            for (Statement s : whilebody) {
                s.execute(varMap, output);
            }
        }
    }

    @Override
    public String toString() {
        return "While " +  String.valueOf(condExpr) + "\n";
    }
    
}
