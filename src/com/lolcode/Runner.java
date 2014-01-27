package com.lolcode;


import com.lolcode.checker.ErrorHandler;
import com.lolcode.checker.ScopeChecker;
import com.lolcode.checker.TypeGenerator;
import com.lolcode.checker.VariableBinder;
import com.lolcode.jgenerator.CodeGenerator;
import com.lolcode.tree.AstBuilder;
import com.lolcode.tree.TreeModule;
import com.lolcode.tree.exception.BaseAstException;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 6/28/13
 * Time: 10:43 PM
 */
public class Runner {
    private static Logger log = Logger.getLogger(AstBuilder.class.getName());
    private String filename = "";
    private boolean disableWarnings = false;

    public Runner setOption(boolean disableWarnings) {
        ErrorHandler.disableWarnings = disableWarnings;
        return this;
    }

    //Lexer which exits on error insted of recovering
    public static class BailLolcodeLexer extends lolcodeLexer {
        public BailLolcodeLexer(CharStream input) {
            super(input);
        }

        public void recover(LexerNoViableAltException e) {
            throw e; //bail
        }
    }

    public void setInputFile(String file) {
        filename = file;
    }

    public void test() {
        try {
            CharStream cs = new ANTLRFileStream(filename);

            //use BailLexer
            lolcodeLexer lexer = new BailLolcodeLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            lolcodeParser parser = new lolcodeParser(tokens);
            parser.setErrorHandler(new BailErrorStrategy()); //yse bail error strategy

            /*
                parser.file() throws RuntimeException if something wrong now, do we expand on it?
                like catching stuff and printing our errors...
             */
            ParseTree tree = parser.file(); //builds parse tree, do syntax check
            AstBuilder visitor = new AstBuilder(filename);
            TreeModule ast = (TreeModule) visitor.visit(tree); //builds ast
            ScopeChecker scopeChecker = new ScopeChecker();
            scopeChecker.visit(ast);
            VariableBinder binder = new VariableBinder();
            binder.visit(ast);
            TypeGenerator infer = new TypeGenerator();
            infer.visit(ast);
            CodeGenerator gen = new CodeGenerator("Generated");
            gen.visit(ast);
            if (!ErrorHandler.clean) {
                System.err.println("Compilation failed");
                System.exit(-1);
            }
            //visit ast, do semantics check, [optimize]
            //visit ast, generate ir
            //generate bytecode from ir
            System.out.println("Compilation finished successfully");
        } catch (IOException | LexerNoViableAltException e) {
            log.severe(e.toString());
        } catch (BaseAstException e) {
            log.severe(String.valueOf(e));
//            throw new RuntimeException(e);
            System.exit(-1);
        }
    }
}
