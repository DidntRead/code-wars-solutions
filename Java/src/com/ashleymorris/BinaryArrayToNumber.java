package com.ashleymorris;

import java.util.List;

/**
 * Created by brown-bear on 07/05/17.
 */
public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        String binaryString = "";

        for (int i : binary) {
              binaryString += i;
        }

        return Integer.parseInt(binaryString, 2);
    }

}
