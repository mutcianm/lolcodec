package com.lolcode;


import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 6/28/13
 * Time: 10:43 PM
 */
public class Runner {
    private String filename;

    public void setInputFile(String file) {
        filename = file;
    }

    public void test() {
        try {
            CharStream cs = new ANTLRFileStream(filename);
            lolcodeLexer lexer = new lolcodeLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            lolcodeParser parser = new lolcodeParser(tokens);
            ParseTree tree = parser.file(); //builds parse tree, do syntax check
            lolcodeVisitor visitor = new LolcodeVisitorImpl();
            visitor.visit(tree); //builds ast
            //visit ast, do semantics check, [optimize]
            //visit ast, generate ir
            //generate bytecode from ir
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
