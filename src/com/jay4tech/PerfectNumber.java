package com.jay4tech;

public class PerfectNumber {
    /*
    Perfect Number
        What is the perfect number?
        A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
        Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
    */
    // write code here
    public static boolean isPerfectNumber(int number) {
        if (number < 1)
            return false;
        int perfect = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                perfect += i;
            if (perfect == number)
                return true;
        }
        return false;
    }
}
