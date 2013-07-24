package com.lolcode;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/24/13
 * Time: 8:01 PM
 */
public class ArgParser {
    public ArrayList<String> inputFiles;
    private static final String help = "Usage:\n" +
            "lolc.jar [options] <list of input files ...>\n" +
            "OPTIONS:\n" +
            "\t -h, --help\t\tShow this help\n";

    public ArgParser() {
        inputFiles = new ArrayList<>();
    }

    public int parse(String[] args) {
        if (args.length == 0) {
            System.out.print(help);
            return 1;
        }
        for (String str : args) {
            switch (str) {
                case "--help":
                case "-h":
                    System.out.print(help);
                    return 1;
                default:
                    inputFiles.add(str);
            }
        }
        return 0;
    }
}
