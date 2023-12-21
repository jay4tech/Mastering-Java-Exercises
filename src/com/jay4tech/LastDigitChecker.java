package com.jay4tech;

public class LastDigitChecker {

    /*
    Last Digit Checker
        Write a method named hasSameLastDigit with three parameters of type int.
        Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
        The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
     */
    // write code here
    public static boolean hasSameLastDigit(int fDigit, int sDigit, int lDigit) {

        if((isValid(fDigit) && isValid(sDigit) && isValid(lDigit))) {

            if(fDigit % 10 == sDigit % 10 || fDigit % 10 == lDigit % 10 || sDigit % 10 == lDigit % 10 ) {
                return true;
            }
        }
        return false;

    }
    public static boolean isValid(int number) {

        return(number >= 10 && number <= 1000);

    }

}
