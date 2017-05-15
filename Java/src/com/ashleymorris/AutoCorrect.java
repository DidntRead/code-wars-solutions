package com.ashleymorris;

/**
 * Created by ashley.morris on 15/05/2017.
 */
public class AutoCorrect {
    public static String autocorrect(String input) {
       return input.replaceAll("(?i)\\b(u|you+)\\b", "your sister");
    }

    /*
      (?i) match the remainder of the pattern with the following effective flags: gi
       i modifier: insensitive. Case insensitive match (ignores case of [a-zA-Z])

      \b assert position at a word boundary
      1st Capturing Group (u|you+)

      replace all u or you+ between word boundry
     */
}
