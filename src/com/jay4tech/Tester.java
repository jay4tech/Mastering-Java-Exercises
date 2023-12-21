package com.jay4tech;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        PositiveNegativeZero.checkNumber(-10);
        SpeedConverter.printConversion(354);
        MegaBytesConverter.printMegaBytesAndKiloBytes(3465);
        System.out.println(BarkingDog.shouldWakeUp(true,3));
        System.out.println(BarkingDog.shouldWakeUp(false,23));
    }
}