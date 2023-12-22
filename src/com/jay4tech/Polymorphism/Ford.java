package com.jay4tech.Polymorphism;

public class Ford extends Car {

    // write code here
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return ("Ford Car Engine " + super.getName() + " is starting");
    }

    @Override
    public String accelerate() {
        return ("Ford Car " + super.getName() + " is accelerating");
    }

    @Override
    public String brake() {
        return ("Ford Car " + super.getName() + " is braking");
    }

}