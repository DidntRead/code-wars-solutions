package com.ashleymorris;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ashley.morris on 18/05/2017.
 * <p>
 * Move-to-front transform
 */
public class MoveToFront {

    private String lookupTable;

    public MoveToFront(String lookupTable) {
        this.lookupTable = lookupTable;
    }

    public List<Integer> encode(String message) {

        List<Integer> result = new LinkedList<>();
        StringBuilder newLookUp = new StringBuilder(lookupTable);

        for (char c : message.toCharArray()) {

            int index = newLookUp.indexOf(String.valueOf(c));

            //Value isn't in the lookup
            if (index == -1) {
                throw new IllegalArgumentException("Value \""+c+"\" not found in the lookup table.");
            }

            result.add(index);

            //Move to the front - aha :D
            newLookUp.deleteCharAt(index).reverse().append(String.valueOf(c)).reverse();
        }

        return result;
    }

    public String decode(List<Integer> encodedMessage) {

        StringBuilder newLookUp = new StringBuilder(lookupTable);
        StringBuilder result = new StringBuilder();

        for (int index : encodedMessage) {
            char character = newLookUp.charAt(index);
            result.append(character);
            newLookUp.deleteCharAt(index).reverse().append(character).reverse();
        }

        return result.toString();
    }

}
