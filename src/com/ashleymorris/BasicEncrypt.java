package com.ashleymorris;

/**
 * Created by ashley.morris on 11/05/2017.
 */
public class BasicEncrypt {

    public String encrypt(String text, int rule) {

        StringBuilder newWord = new StringBuilder(text);

        if(rule >  0){
            for(int i = 0; i < text.length(); i++){
                char newChar = (char) (text.charAt(i) + rule);
                newWord.setCharAt(i, newChar);
            }
        }

        return newWord.toString();
    }
}