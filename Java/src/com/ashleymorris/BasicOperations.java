package com.ashleymorris;

import java.util.Objects;

/**
 * Created by ashley.morris on 09/05/2017.
 */
public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2){

        int result = 0;

        if(Objects.equals(op, "*")){
            result = v1 * v2;
        }
        if(Objects.equals(op, "+")){
            result = v1 + v2;
        }
        if(Objects.equals(op, "-")){
            result = v1 - v2;
        }
        if(Objects.equals(op, "/")){
            result = v1 / v2;
        }
        return result;
    }
}
