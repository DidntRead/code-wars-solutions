package com.ashleymorris;

import java.util.HashMap;import java.util.Map;

/**
 * Created by ashley.morris on 08/05/2017.
 *
 * if the character is in the word once, replace with (
 * else replace all instances of it with )
 */
public class DuplicateEncoder {
    static String encode(String word){

        word = word.toLowerCase();
        StringBuilder sbNewWord = new StringBuilder(word);

        Map<Character, Integer> count = new HashMap<>();

        for(int i = 0; i < word.length(); i ++){
            char character = word.charAt(i);
                if (!count.containsKey(character)) {
                    sbNewWord.setCharAt(i, '(');
                    count.put(character, i);
                } else if (count.get(character) >= 0) {
                    int index = count.get(character);
                    sbNewWord.setCharAt(i, ')');
                    sbNewWord.replace(index, index + 1, ")");
                    count.put(character, -1);
                }
                else{
                    sbNewWord.setCharAt(i, ')');
                }
        }

        return sbNewWord.toString();
    }
}
