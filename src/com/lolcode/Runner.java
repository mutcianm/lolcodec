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
 * To change this template use File | Settings | File Templates.
 */
public class Runner {
    private String filename;

    public void setInputFile(String file){
        filename = file;
    }

    public void test(){
        try {
            CharStream cs = new ANTLRFileStream(filename);
            lolcodeLexer lexer = new lolcodeLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            lolcodeParser parser = new lolcodeParser(tokens);
            ParseTree tree = parser.file();
            lolcodeVisitor visitor = new LolcodeVisitorImpl();
            visitor.visit(tree);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
