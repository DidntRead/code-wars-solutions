package com.ashleymorris;

import java.util.ArrayList;
import java.util.Arrays;

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

        for (int i = 0; i < inputs.length; i++) {
            System.out.println(AutoCorrect.autocorrect(inputs[i]));
        }
    }
}
