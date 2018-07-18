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
        pins.add(observed);

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


        char[] characters = observed.toCharArray();

        for (int i = 0; i < characters.length; i++) {

            char currentCharacter = characters[i];

            String[] possibleValues = keyPad.get(String.valueOf(currentCharacter)); //get all possible alternative values for current character

            StringBuilder pinBuilder = new StringBuilder(observed);


            for (String value : possibleValues) {

                String newPin;


                pinBuilder.setCharAt(i, value.charAt(0));
                newPin = pinBuilder.toString();

                if (pins.indexOf(newPin) == -1) {
                    pins.add(newPin);
                }

            }

        }


        return pins;
    }

} // ObservedPin
