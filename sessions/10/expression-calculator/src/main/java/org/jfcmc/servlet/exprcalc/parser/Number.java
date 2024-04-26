package org.jfcmc.servlet.exprcalc.parser;

import java.util.Map;

public class Number extends Expr {

    public Number(Token token) {
        super(token);
    }

    public int eval(Map<String,Integer> context) {
        return Integer.parseInt(token.getValue());
    }
}
