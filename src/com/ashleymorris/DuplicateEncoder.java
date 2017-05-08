package com.ashleymorris;

import java.util.HashMap;

/**
 * Created by ashley.morris on 08/05/2017.
 */
public class DuplicateEncoder {
    static String encode(String word){

        String newWord = word.toLowerCase();
        StringBuilder sbNewWord = new StringBuilder(newWord);

        HashMap<Character, Integer> count = new HashMap<>();

        for(char character : newWord.toCharArray()){
                if (!count.containsKey(character)) {
                    count.put(character, 1);
                } else {
                    int currentCount = count.get(character);
                    currentCount++;
                    count.put(character, currentCount);
                }
        }

        for(int i = 0; i < newWord.length(); i ++){
            char character = newWord.charAt(i);
           if(count.containsKey(character)) {
               if (count.get(character) == 1) {
                   sbNewWord.setCharAt(i, '(');
               } else {
                   sbNewWord.setCharAt(i, ')');
               }
           }
        }
        return sbNewWord.toString();
    }
}
