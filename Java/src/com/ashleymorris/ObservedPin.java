package com.ashleymorris;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by ashley.morris on 18/07/2018.
 */

class ObservedPin {

    static List<String> getPINs(String observed) {

        List<String> pins = new ArrayList<>();

        char[] observedPin = observed.toCharArray();

        HashMap<String, String[]> keyPad = new HashMap<>();
        keyPad.put("1", new String[]{"1", "2", "4"});
        keyPad.put("2", new String[]{"1", "2", "3", "5"});
        keyPad.put("3", new String[]{"2", "3", "6"});
        keyPad.put("4", new String[]{"1", "4", "5", "7"});
        keyPad.put("5", new String[]{"2", "4", "5", "6", "8"});
        keyPad.put("6", new String[]{"3", "5", "6", "9"});
        keyPad.put("7", new String[]{"4", "7", "8"});
        keyPad.put("8", new String[]{"5", "7", "8", "9", "0"});
        keyPad.put("9", new String[]{"6", "8", "9"});
        keyPad.put("0", new String[]{"0", "8"});

        StringBuilder pinBuilder = new StringBuilder(observed);
        String[] possibleValues = keyPad.get(String.valueOf(observedPin[0]));

        for (String value : possibleValues) {

            //This outer loop is to set the first value
            pinBuilder.setCharAt(0, value.charAt(0));

            int currentDigit = 1; //Start from the first digit after the first
            int[] currentPermutation = new int[observedPin.length]; //Current value array keeps track of how many potential permutations for a given number

            if (observedPin.length > 1) {

                while (currentDigit != observedPin.length) {

                    //Get all the possible alternative values for the current digit in the pin
                    String[] values = keyPad.get(String.valueOf(observedPin[currentDigit]));

                    if (currentDigit == observedPin.length - 1) {

                        if (currentPermutation[currentDigit] < values.length) {

                            for (String val : values) {

                                pinBuilder.setCharAt(currentDigit, val.charAt(0));

                                if (currentPermutation[currentDigit] < values.length) {
                                    currentPermutation[currentDigit]++;
                                }

                                if (pins.indexOf(pinBuilder.toString()) == -1) {
                                    System.out.println("adding " + pinBuilder.toString());
                                    pins.add(pinBuilder.toString());
                                }

                            }
                        }
                        else {
                            currentPermutation[currentDigit] = 0;
                            currentDigit = currentDigit - 1;
                        }


                    } else {
                        pinBuilder.setCharAt(currentDigit, values[currentPermutation[currentDigit]].charAt(0));
                        currentPermutation[currentDigit]++;
                        currentDigit++;
//                            if (currentPermutation[currentDigit] <= values.length) {
//
//                                currentDigit++;
//                            }
                    }


                }
            }

            if (pins.indexOf(pinBuilder.toString()) == -1) {
                pins.add(pinBuilder.toString());
            }
        }

        return pins;

    }

} // ObservedPin
