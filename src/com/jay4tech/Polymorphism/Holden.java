package com.jay4tech.Polymorphism;

public class Holden extends Car {

    // write code here
    public Holden(int cylinders,String name){
        super(cylinders,name);
    }
    @Override
    public String startEngine(){
        return ("Holden Car Engine "+super.getName()+" is starting");
    }

    @Override
    public String accelerate(){
        return ("Holden Car "+super.getName()+" is accelerating");
    }

    @Override
    public String brake(){
        return ("Holden Car "+super.getName()+" is braking");
    }

}