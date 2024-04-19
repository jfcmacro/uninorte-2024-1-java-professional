---
title: Expression Calculator
---
# Expression Calculator

* Expression Calculator Grammar
* Derivation
* No Ambiguous Grammar LR(1)
* LL(1)
* Compiler Structure    
  * Tokens
  * Scanner
  * Parser
  * Abstract tree
* Tokens
* Scanner
* Abstract tree
* Join all
* Conclusions

---

## Expresssion Calculator Grammar

```grammar
Expr ::= Expr + Expr
      | Expr - Expr
      | Expr * Expr
      | Expr / Expr
      | ID
      | INTEGER
      | ( Expr )
```

* Terminals: `INTEGER`, `ID`, `+`, `-`, `*`, `/`, `(`, `)`
* No-Terminals: `Expr`
* This is a an ambiguous grammar
* Types of Grammars:
    * LR: LR(0), LR(1), ..., LR(N)
    * LL: LL(1), ..., LL(N)

---

## Derivation

* To obtain: `1 + 2 * 3

```derivation
Expr => Expr + Expr
     => Expr + Expr * Expr
     => Expr + Expr * INTEGER(3)
     => Expr + INTEGER(2) * INTEGER(3)
     => INTEGER(1) + INTEGER(2) * INTEGER(3)
```

---

## No ambiguous grammar

```grammar
Expr ::= Expr (+|-) Term | Term
Term ::= Term (*|/) Fact | Fact
Fact ::= ID | INTEGER | ( Expr )
```

* Terminals: `INTEGER`, `ID`, `+`, `-`, `*`, `/`, `(`, `)`
* No-Terminals: `Expr`, `Term`, `Fact`

---

## LL(N) Grammar

```grammar
Expr  ::= Term Expr'
Expr' ::= (+|-) Term Expr' |
Term  ::= Fact Term'
Term' ::= (*|/) Fact Term' |
Fact  ::= ID | INTEGER | ( Expr )
```

* Terminals: `INTEGER`, `ID`, `+`, `-`, `*`, `/`, `(`, `)`
* No-Terminals: `Expr`, `Expr'`, `Term`, `Term'`, `Fact`

---

## Compiler Structure

---

## Compiler Implementation

```java
public Expr expr() {
   Expr left = term();
   return exprp(left);
}

public Expr exprp(Expr left) {
  Token token = scan.getToken();

  if (token.getTokenType == TokenType.ADD ||
      token.getTokenType == TokenType.SUB) {
     return exprp(new Operator(token, left, term());
  }

  if (token.getTokenType == TokenType.CPAR ||
      token.getTokenType == TokenType.EOF) {
      scan.putbackToken(token);
      return left;
  }

  throw new ParserException("Expected +, - found: " + token);
}
```

---

Scanner:: Txt -> Tkn ( No Terminal )

Parser :: [Tkn] -> AbsTree

Eval :: AbsTree -> Context -> Resultado

---

Scanner <-- Parser <-- Eval
\----------------/    \------/
   Front-End           Back-End

---

factorial(int n) {
   // pred: n >= 0
   if (n == 0) { // Base
      return 1;
   }
   else if (n == 1) { // Base
      return 1;
   }
   else n * factorial(n - 1);
}
