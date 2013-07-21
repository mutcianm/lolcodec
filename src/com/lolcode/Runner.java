package com.lolcode;


import com.lolcode.tree.AstBuilder;
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
//            lolcodeVisitor visitor = new LolcodeVisitorImpl();
            AstBuilder visitor = new AstBuilder(filename);
            visitor.visit(tree); //builds ast
            //visit ast, do semantics check, [optimize]
            //visit ast, generate ir
            //generate bytecode from ir
        } catch (IOException | LexerNoViableAltException e) {
            log.severe(e.toString());
        }
    }
}
