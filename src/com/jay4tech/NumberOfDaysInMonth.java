package com.jay4tech;

public class NumberOfDaysInMonth {
    /*
        Number Of Days In Month
            1. Write a method isLeapYear with a parameter of type int named year.

                The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

                If the parameter is not in that range return false.

                Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.

                A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.


            2. Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.

                If parameter month is < 1 or > 12 return -1. ​

                If parameter year is < 1 or > 9999 then return -1.

                This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).

                You should check if the year is a leap year using the method isLeapYear described above.
     */
    // write code here
    public static boolean isLeapYear(int year) {

        return year > 1 && year < 9999 && ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0));
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 0 || year > 9999) {
            return -1;
        }
        int numDays = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2: {
                if (isLeapYear(year)) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }
            }
        }
        return numDays;
    }

}
