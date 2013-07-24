package com.lolcode;

public class Main {

    public static void main(String[] args) {
        ArgParser parser = new ArgParser();
        if (parser.parse(args) == 0) {
            for (String filename : parser.inputFiles) {
                Runner runner = new Runner();
                runner.setInputFile(filename);
                runner.test();
            }
        }
    }
}
