package org.jfcmc.servlet.exprcalc.parser;

import java.util.Map;
import java.util.function.BinaryOperator;

public class Operator extends Expr {

    private Expr left, right;
    private BinaryOperator<Integer> operator;

    public Operator(Token token, Expr left, Expr right) {
        super(token);
        this.left = left;
        this.right = right;
        operator = getOperator();
    }

    private BinaryOperator<Integer> getOperator() {
        switch(token.getTokenType()) {
        case ADD:
            return (x,y) -> x + y;
        case SUB:
            return (x,y) -> x - y;
        case TIMES:
            return (x,y) -> x * y;
        case DIV:
            return (x,y) -> x / y;
        }
        return null;
    }

    public int eval(Map<String, Integer> context) {
        return operator.apply(left.eval(context), right.eval(context));
    }
}
