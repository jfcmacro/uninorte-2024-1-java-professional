package org.jfcmc.servlet.exprcalc;

import java.util.Map;
import java.util.HashMap;
import org.jfcmc.servlet.exprcalc.parser.Expr;
import org.jfcmc.servlet.exprcalc.parser.Scanner;
import org.jfcmc.servlet.exprcalc.parser.Parser;
import org.jfcmc.servlet.exprcalc.parser.Token;
import org.jfcmc.servlet.exprcalc.parser.TokenType;

public class Main {

    public static void main(String...args) {

        String expression = (args.length == 1) ? args[0] : "1 + 2 * 3";

        Scanner scan = new Scanner(expression);
        Token tkn = scan.getNextToken();

        while (tkn.getTokenType() != TokenType.EOF) {
            System.out.println("Token " + tkn);
            tkn = scan.getNextToken();
        }

        try {
            Parser parser = new Parser(new Scanner(expression));
            Expr expr = parser.parse();
            Map<String, Integer> ctx = new HashMap<>() {
                    { put("a", 10);
                      put("b", 20);
                      put("c", 34);
                    }};
            System.out.println("Expression: " + expression +
                               " = " + expr.eval(ctx));
        }
        catch (Parser.ParserException pe) {
            pe.printStackTrace();
        }
    }
}
