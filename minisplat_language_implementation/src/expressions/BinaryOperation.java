package expressions;

import java.util.Map;

import mini_splat.RunException;

public class BinaryOperation extends Expression {
    private Expression a;
    private Expression b;
    private char op;

    public BinaryOperation(Expression a, char op, Expression b) {
        this.a = a;
        this.b = b;
        this.op = op;
    }

    public int computeValue(Map<String, Integer> varMap) throws RunException {
        int vala = a.computeValue(varMap);
        int valb = b.computeValue(varMap);

        if(op == '+') return vala + valb;
        if(op == '-') return vala - valb;
        if(op == '*') return vala * valb;
        if(op == '/') {
            if(valb == 0) {
                throw new RunException("Cannot divide by zero");
            }
        }
        return vala / valb;
    }
    public String toString() {
        String ans = String.valueOf(a) + " " + op + " " + String.valueOf(b);
        return ans + "\n";
    }
}
