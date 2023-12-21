package com.jay4tech;

public class LeapYear {
    /*
    Leap Year Calculator
        Write a method isLeapYear with a parameter of type int named year.

        The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false.

        Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.
    */
    // write code here
    public static boolean isLeapYear(int year) {

        return (year > 1 && year < 9999) ? ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)):false;
    }
}
