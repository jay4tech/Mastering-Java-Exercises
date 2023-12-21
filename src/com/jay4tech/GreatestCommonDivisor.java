package com.jay4tech;

public class GreatestCommonDivisor {
    /*
    Greatest Common Divisor
        Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
        If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
        The method should return the greatest common divisor of the two numbers (int).
        The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).
     */

    // write code here

    // write code here
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10)
            return -1;
        while(first != second) {
            if(first > second)
                first -= second;
            else second -= first;
        }
        return first;
    }

}
