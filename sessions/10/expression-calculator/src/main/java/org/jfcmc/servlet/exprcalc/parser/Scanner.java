package org.jfcmc.servlet.exprcalc.parser;

import java.util.List;
import java.util.Objects;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Scanner {

    private List<Token> tokens;
    private Token lastToken;
    private String expression;
    private Iterator<Token> iterator;

    public Scanner(String expression) {
        this.expression = expression;
        tokens = getTokens();
        lastToken = null;
        iterator = tokens.iterator();
    }

    private Token getEOF() {
        return new Token((char) -1, TokenType.EOF);
    }

    private List<Token> getTokens() {
        List<Token> tkns = expression.chars()
            .filter(i -> (char) i != ' ')
            .mapToObj(i -> {
                    switch(i) {
                    case '(':
                        return new Token((char) i, TokenType.OPAR);
                    case ')':
                        return new Token((char) i, TokenType.CPAR);
                    case '+':
                        return new Token((char) i, TokenType.ADD);
                    case '-':
                        return new Token((char) i, TokenType.SUB);
                    case '*':
                        return new Token((char) i, TokenType.TIMES);
                    case '/':
                        return new Token((char) i, TokenType.DIV);
                    default:
                        if (Character.isDigit(i)) {
                            return new Token((char) i, TokenType.INT);
                        }
                        else {
                            return new Token((char) i, TokenType.ID);
                        }
                    }})
            .collect(Collectors.toList());

        tkns.add(getEOF());

        return tkns;
    }

    public Token getNextToken() {
        if (!Objects.isNull(lastToken)) {
            Token tkn = lastToken;
            lastToken = null;
            return tkn;
        }

        if (iterator.hasNext()) {
            return iterator.next();
        }

        return getEOF();
    }

    public void pushbackToken(Token token) {
        lastToken = token;
    }
}
