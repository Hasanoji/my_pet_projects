package expressions;

import java.util.Map;


public class IntegerConstant extends Expression {
    private int val;

    public IntegerConstant(int val) {
        this.val = val;
    }
    public int computeValue(Map<String, Integer> varMap) {
        return val;
    }

    public String toString() {
       return String.valueOf(val) + "\n";
    }
    
}
