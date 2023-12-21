package com.jay4tech;

public class EvenDigtSum {
    /*
        Even Digit Sum
            Write a method named getEvenDigitSum with one parameter of type int called number.
            The method should return the sum of the even digits within the number.
            If the number is negative, the method should return -1 to indicate an invalid value.
     */
    // write code here
    public static int getEvenDigitSum(int number) {
        int sumEvenDigits = 0;
        if (number < 0)
            return -1;

        while (number > 0) {
            int evenDigits = number % 10;
            if (evenDigits % 2 == 0 )
                sumEvenDigits += evenDigits;
            number /= 10;
        }
        return sumEvenDigits;
    }
}
