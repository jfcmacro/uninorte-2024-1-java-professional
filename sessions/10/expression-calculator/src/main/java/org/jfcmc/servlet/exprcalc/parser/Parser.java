package org.jfcmc.servlet.exprcalc.parser;

public class Parser {

    public class ParserException extends Exception {
        public ParserException() {
            super();
        }
        public ParserException(String message) {
            super(message);
        }
    }

    public Scanner scan;

    public Parser(Scanner scan) {
        this.scan = scan;
    }

    public Parser(String expression) {
        this.scan = new Scanner(expression);
    }

    public Expr parse() throws ParserException {
        Expr expr = expr();

        Token token = scan.getNextToken();

        if (token.getTokenType() != TokenType.EOF) {
            throw new ParserException("Expected EOF " + token);
        }

        return expr;
    }

    // Expr ::= Term Expr'
    private Expr expr() throws ParserException {
        // Expr left = term();
        // return exprp(left);
        return exprp(term());
    }

    // Expr' ::= (+|-) Term Expr' |
    private Expr exprp(Expr left) throws ParserException {
        Token token = scan.getNextToken();

        // Expr' ::=  (+|-) Term Expr'
        if (token.getTokenType() == TokenType.ADD ||
            token.getTokenType() == TokenType.SUB) {
            // Expr right = term(); // Derecho
            // Expr oper = new Operator(token, left, right);
            // return exprp(oper);
            return exprp(new Operator(token, left, term()));
        }

        // Follows() = ), EOF
        // Expr' ::= \epsilon
        if (token.getTokenType() == TokenType.CPAR ||
            token.getTokenType() == TokenType.EOF) {
            scan.pushbackToken(token);
            return left;
        }

        throw new ParserException("Expected: +, - found: " + token);
    }

    // Expr ::= Fact Term'
    private Expr term() throws ParserException {
        return termp(fact());
    }

    // Term' ::= (* | /) Fact Term' | \epsilon
    private Expr termp(Expr left) throws ParserException {
        Token token = scan.getNextToken();

        if (token.getTokenType() == TokenType.TIMES ||
            token.getTokenType() == TokenType.DIV) {

            return termp(new Operator(token, left, fact()));
        }

        // Follows() = +, -, ), EOF
        // Term' ::= \epsilon
        if (token.getTokenType() == TokenType.ADD  ||
            token.getTokenType() == TokenType.SUB  ||
            token.getTokenType() == TokenType.CPAR ||
            token.getTokenType() == TokenType.EOF) {
            scan.pushbackToken(token);
            
            return left;
        }

        throw new ParserException("Expected: *, / found: " + token);
    }

    // Fact  ::= ID | INTEGER | ( Expr )
    private Expr fact() throws ParserException {
        Token token = scan.getNextToken();

        // Fact ::=  ID
        if (token.getTokenType() == TokenType.ID) {
            return new Identifier(token);
        }

        // Fact ::= INTEGER
        if (token.getTokenType() == TokenType.INT) {
            return new Number(token);
        }

        // Fact ::= ( Expr )
        if (token.getTokenType() == TokenType.OPAR) {
            Expr expr = expr();
            token = scan.getNextToken();
            
            if (token.getTokenType() == TokenType.CPAR) {
                return expr;
            }
            
            throw new ParserException("Expected ) found: " + token);
        }

        throw new ParserException("Expected Number, ID, (  found: " + token);
    }

}
