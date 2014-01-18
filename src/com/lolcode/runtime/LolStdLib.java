package com.lolcode.runtime;

import java.util.Scanner;

public class LolStdLib {
    private static Scanner scanner = new Scanner(System.in);

    public static void print(LolObject lolObject) {
        System.out.print(lolObject.toLolString().strVal);
    }

    public static LolObject read() {
        String str = scanner.nextLine();
        if (str.equals("true")) {
            return new LolBool(true);
        } else if (str.equals("false")) {
            return new LolBool(false);
        }
        LolObject result;
        try {
            return new LolInt(Integer.parseInt(str));
        } catch (Exception e) {
            try {
                return new LolDouble(Double.parseDouble(str));
            } catch (Exception ex) {
                return new LolString(str);
            }
        }
    }
}
