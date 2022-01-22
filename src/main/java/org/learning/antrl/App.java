package org.learning.antrl;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.learning.antlr.expr.ExprLexer;
import org.learning.antlr.expr.ExprParser;

import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    String exprParseTree(InputStream in) throws IOException {
        CharStream charStream = CharStreams.fromStream(in);
        ExprLexer lexer = new ExprLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokenStream);
        ParseTree tree = parser.prog();
        return tree.toStringTree(parser).replace("\\n", "\n\t");
    }
}
