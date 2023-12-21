package com.jay4tech;

public class DecimalComparator {
    /*
    DecimalComparator
        Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
        The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
     */
    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2) {
        value1 = (int) (value1 * 1000);
        value2 = (int) (value2 * 1000);
        if (value1 == value2) {
            return true;
        } else {
            return false;
        }
    }
}
