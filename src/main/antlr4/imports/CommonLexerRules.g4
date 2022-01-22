lexer grammar CommonLexerRules;

ID : [a-zA-Z_][a-zA-Z0-9_-]*;
INT : [0-9]+;
NEWLINE : '\r'? '\n';
WS : [ \t]+ -> skip;