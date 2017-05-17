package com.ashleymorris;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BasicEncrypt basicEncrypt = new BasicEncrypt();
        System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 1))));
        System.out.println(DuplicateEncoder.encode("Prespecialized"));
        System.out.println(BasicOperations.basicMath("+", 4, 7));
        System.out.println(basicEncrypt.encrypt("aqpszduomudxnrzb ", 239 )); // = [P`_biSd^\dSg]aiQ]

        String[] inputs = new String[] {
                "u",
                "you",
                "Youuuuu",
                "youtube",
                "I miss you!",
                "u want to go to the movies?",
                "You should come over Friday night",
                "You u youville utube you youyouyou uuu raiyou united youuuu u you"
        };

        for (String input : inputs) {
            System.out.println(AutoCorrect.autocorrect(input));
        }

        List<String> a = new ArrayList<String>();
        a.add(":))("); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");a.add(":~D");
        System.out.println(SmileFaces.countSmileys(a));
    }
}
