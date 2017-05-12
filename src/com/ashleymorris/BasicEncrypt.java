package com.ashleymorris;

/**
 * Created by ashley.morris on 11/05/2017.
 */
public class BasicEncrypt {

    public String encrypt(String text, int rule) {

        StringBuilder newWord = new StringBuilder(text);

        for(int i = 0; i < text.length(); i++){
           char c = text.charAt(i);
           int ascii = c + rule;

           if (ascii > 255){
                ascii = ascii % 256;
            }

            newWord.setCharAt(i, (char) ascii);
        }

        return newWord.toString();
    }
}