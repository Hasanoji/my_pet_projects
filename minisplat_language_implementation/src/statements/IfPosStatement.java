package statements;

import expressions.*;
import java.util.List;
import java.util.Map;

import mini_splat.RunException;

public class IfPosStatement extends Statement{
    Expression condExpr;
    List<Statement> ifbody;

     public IfPosStatement(Expression condExpr, List<Statement> ifbody) {
        this.condExpr = condExpr;
        this.ifbody = ifbody;
    }

    @Override
    public void execute(Map<String, Integer> varMap, List<Integer> output) throws RunException {
        int exp = condExpr.computeValue(varMap);
        if(exp > 0) {
            for (Statement s : ifbody) {
                s.execute(varMap, output);
            }
        }
    }

    @Override
    public String toString() {
        return "If " +  String.valueOf(condExpr) + "\n";
    }
    
}
