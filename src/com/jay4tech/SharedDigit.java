package com.jay4tech;

public class SharedDigit {
    /*
    Shared Digit
        Write a method named hasSharedDigit with two parameters of type int.
        Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
        The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
     */
    // write code here
    public static boolean hasSharedDigit(int fNumber, int sNumber) {

        if (fNumber >= 10 && fNumber <= 99 && sNumber >= 10 && sNumber <= 99) {
            if ((fNumber / 10 == sNumber / 10 || fNumber % 10 == sNumber % 10) || (fNumber / 10 == sNumber % 10 || fNumber % 10 == sNumber / 10))
                return true;
        }
        return false;
    }
}
