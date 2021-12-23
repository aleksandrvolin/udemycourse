package com.udemycourse;

import com.udemycourse.Car;

public class Holden extends Car {
    public Holden(int cylinders,String name){
        super(cylinders,name);
    }

    public String startEngine(){
        return ("com.udemycourse.Holden Engine "+getName());
    }

    public String accelerate(){
        return ("com.udemycourse.Holden com.udemycourse.Car "+getName()+" is accelerating");
    }

    public String brake(){
        return ("com.udemycourse.Holden com.udemycourse.Car "+getName()+" is braking");
    }
}
