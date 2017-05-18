package com.ashleymorris;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ashley.morris on 18/05/2017.
 *
 * Move-to-front transform
 */
public class MoveToFront {

    private String lookupTable;

    public MoveToFront(String lookupTable) {
        this.lookupTable = lookupTable;
    }

    public List <Integer> encode(String message){

        List <Integer> result = new LinkedList<>();
        StringBuilder output = new StringBuilder(lookupTable);

        for(char c : message.toCharArray()) {

            int index = output.indexOf(String.valueOf(c));

            //Value isn't in the lookup
            if (index == -1){
                throw new IllegalArgumentException("Value not found in the lookup table");
            }

            result.add(index);

            //Move to the front - aha :D
            output.deleteCharAt(index).reverse().append(String.valueOf(c)).reverse();
        }
        return result;
    }

    public String decode(List<Integer> encodedMessage){


        return "";
    }
    
}
