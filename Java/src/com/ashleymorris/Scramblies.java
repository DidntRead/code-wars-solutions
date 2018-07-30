package com.ashleymorris;

import java.util.HashMap;

/**
 * Created by ashley.morris on 27/07/2018.
 */
public class Scramblies {
    public static boolean scramble(String str1, String str2) {

        HashMap<String, Integer> wordCount = new HashMap<>();

        //Count the words in string two
        for (char ch : str2.toCharArray()) {

            String currentCharacter = String.valueOf(ch);
            int currentCount = 0;

            if (wordCount.containsKey(currentCharacter)) {
                currentCount = wordCount.get(currentCharacter);
            }

            currentCount++;
            wordCount.put(currentCharacter, currentCount);
        }

        for (char ch : str1.toCharArray()) {

            String currentCharacter = String.valueOf(ch);
            int currentCount = 0;

            if (wordCount.containsKey(currentCharacter)) {
                currentCount = wordCount.get(currentCharacter);

                currentCount--;
                if (currentCount == 0) {
                    wordCount.remove(currentCharacter);
                } else {
                    wordCount.put(currentCharacter, currentCount);
                }
            }
        }

        return wordCount.size() == 0;
    }
}