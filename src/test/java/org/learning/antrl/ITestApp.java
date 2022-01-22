package org.learning.antrl;

import lombok.extern.log4j.Log4j2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test for simple App.
 */
@Log4j2
public class ITestApp {
    static final String EXPR_TESTFILE = "/t.expr";

    private App app;

    @Before
    public void init() {
        app = new App();
    }

    @After
    public void tearDown() {
        app = null;
    }

    @Test
    public void test_Expr_ParseTree_Print() {

        try(InputStream in = this.getClass().getResourceAsStream(EXPR_TESTFILE)){
            String parseTree = app.exprParseTree(in);
            assertNotNull(parseTree);
            assertFalse(parseTree.isBlank());
            log.info("\n{}", parseTree);
        } catch (IOException e) {
            log.error("Error while processing {} , ", EXPR_TESTFILE, e);
        }
    }
}
