package org.jfcmc.servlet.exprcalc.parser;

public class Token {
    private String value;
    private TokenType tokenType;

    public Token(char value, TokenType tokenType) {
        this.value = "" + value;
        this.tokenType = tokenType;
    }

    public String getValue() {
        return value;
    }

    public TokenType getTokenType() {
        return tokenType;
    }

    @Override
    public String toString() {
        return "" + tokenType.name() + " " + value;
    }
}
