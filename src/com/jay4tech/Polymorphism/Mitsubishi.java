package com.jay4tech.Polymorphism;

public class Mitsubishi extends Car {

    // write code here
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return ("Mitsubishi Car Engine " + super.getName() + " is starting");
    }

    @Override
    public String accelerate() {
        return ("Mitsubishi Car " + super.getName() + " is accelerating");
    }

    @Override
    public String brake() {
        return ("Mitsubishi Car " + super.getName() + " is braking");
    }

}