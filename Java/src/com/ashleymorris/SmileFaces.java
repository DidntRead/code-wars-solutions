package com.ashleymorris;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ashley.morris on 17/05/2017.
 *
 * best solution : return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();
 */
class SmileFaces {
    static int countSmileys(List<String> smiles) {

        int result = 0;
        String[] validFeatures = {":", ";", "-", "~", ")", "D",};

        for (String face : smiles) {

            int count = 0;

            boolean eyes = false;
            boolean nose = false;
            boolean mouth = false;

            for (int i = 0; i < face.length(); i++) {

                String feature = String.valueOf(face.charAt(i));

                if (Arrays.asList(validFeatures).contains(feature)) {
                    if (count == 0 && (feature.equals(":") || feature.equals(";"))) {
                        eyes = true;
                        count = 1;
                    }
                    if ((eyes && count == 1) && (feature.equals("-") || feature.equals("~"))) {
                        nose = true;
                        count = 2;
                    }
                    if ((eyes && count == 1 || eyes && nose && count == 2) && (feature.equals("D") || feature.equals(")"))) {
                        mouth = true;
                        count++;
                    }
                } else {
                    count = 0;
                }

                if (eyes && mouth && face.length() == 2 || eyes && nose && mouth && face.length() == 3) {
                    result++;
                }
            }
        }

        return result;
    }
}
