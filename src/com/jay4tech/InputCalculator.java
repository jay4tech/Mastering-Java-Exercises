package com.jay4tech;

import java.util.Scanner;

public class InputCalculator {
    /*
    Input Calculator
        Write a method called inputThenPrintSumAndAverage that does not have any parameters.
        The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
        When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
        XX represents the sum of all entered numbers of type int.
        YY represents the calculated average of all numbers of type long.
     */
    // write code here
    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        long average = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int num = scanner.nextInt();
                counter++;
                sum += num;
                average = Math.round((double) sum / counter);
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}