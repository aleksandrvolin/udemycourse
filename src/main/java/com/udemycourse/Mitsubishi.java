package com.udemycourse;

import com.udemycourse.Car;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders,String name){
        super(cylinders,name);
    }

    public String startEngine(){
        return ("com.udemycourse.Mitsubishi Engine "+getName());
    }

    public String accelerate(){
        return ("com.udemycourse.Mitsubishi com.udemycourse.Car "+getName()+" is accelerating");
    }

    public String brake(){
        return ("com.udemycourse.Mitsubishi com.udemycourse.Car "+getName()+" is braking");
    }
}