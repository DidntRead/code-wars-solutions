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

        char[] observedPin = observed.toCharArray();

        StringBuilder pinBuilder = new StringBuilder(observed);


            String[] possibleValues = keyPad.get(String.valueOf(observedPin[0]));

            for (String value1 : possibleValues) {

                System.out.println(value1);
                pinBuilder.setCharAt(0, value1.charAt(0));

                int p = 1;
                int currentVal = 0;

                while (p != observedPin.length) {

                    String[] values = keyPad.get(String.valueOf(observedPin[p]));

                    if (currentVal <= values.length) {

                        if (p == observedPin.length - 1) {

                            for (String val : values) {
                                pinBuilder.setCharAt(p, val.charAt(0));
                                pins.add(pinBuilder.toString());

                                System.out.println(pinBuilder.toString());

                            }

                            p = 0;
                            currentVal++;


                        } else {
                            if(currentVal < values.length) {
                                pinBuilder.setCharAt(p, values[currentVal].charAt(0));
                            }
                        }

                    }

                    p++;
                }

                System.out.println("we are here");

            }



        return pins;
    }

} // ObservedPin
