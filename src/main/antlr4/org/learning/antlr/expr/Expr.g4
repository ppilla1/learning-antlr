grammar Expr;
import CommonLexerRules;

prog : (stat NEWLINE?)+ EOF;

stat : expr         # printExpr
     | ID '=' expr       # assign
     | NEWLINE              # blank
     ;

expr : expr op=('*' | '/') expr     # MulDiv
     | expr op=('+' | '-') expr     # AddSub
     | INT                          # int
     | ID                           # id
     | '(' expr ')'                 # parens
     ;

MUL : '*';
DIV : '/';
ADD : '+';
SUB : '-';
