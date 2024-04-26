package org.jfcmc.servlet.exprcalc.parser;

import java.util.Map;

public abstract class Expr {

    protected Token token;

    public Expr(Token token) {
        this.token = token;
    }

    public abstract int eval(Map<String, Integer> context);
}
