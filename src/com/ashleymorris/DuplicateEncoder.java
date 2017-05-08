package com.ashleymorris;

import java.util.HashMap;

/**
 * Created by ashley.morris on 08/05/2017.
 */
public class DuplicateEncoder {
    static String encode(String word){

        String newWord = word.toLowerCase();
        HashMap<Character, Integer> count = new HashMap<>();

        for(char character : newWord.toCharArray()){
            if (character != '(' || character != ')' || character != '[' || character != ']') {
                if (!count.containsKey(character)) {
                    count.put(character, 1);
                } else {
                    int curentCount = count.get(character);
                    curentCount++;
                    count.put(character, curentCount);
                }
            }
        }

        for(char character : newWord.toCharArray()){
           if(count.containsKey(character)) {
               if (count.get(character) == 1) {
                   newWord = newWord.replace(character, '(');
               } else {
                   newWord = newWord.replace(character, ')');
               }
           }
        }
        return newWord;
    }
}
