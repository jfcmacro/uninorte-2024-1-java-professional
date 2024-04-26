package org.jfcmc.servlet.exprcalc.parser;

import java.util.Map;

public class Identifier extends Expr {

    public Identifier(Token token) {
        super(token);
    }

    public int eval(Map<String,Integer> context) {
        return context.get(token.getValue());
    }
}
