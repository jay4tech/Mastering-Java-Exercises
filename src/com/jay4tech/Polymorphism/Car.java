package com.jay4tech.Polymorphism;

public class Car {

    // write code here
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine(){
        return ("Car Engine "+this.name+" is starting");
    }

    public String accelerate(){
        return ("Car "+this.name+" is accelerating");
    }

    public String brake(){
        return ("Car "+this.name+" is braking");
    }

    public String getName(){
        return this.name;
    }

    public int getCylinders(){
        return this.cylinders;
    }

}