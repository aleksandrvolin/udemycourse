package com.udemycourse;

import com.udemycourse.Car;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
        return ("Engine "+getName()+" is starting");
    }

    public String  accelerate() {
        return ("com.udemycourse.Car "+getName()+" is accelerating");
    }

    public String brake() {
        return ("com.udemycourse.Car "+getName()+" is braking");
    }
}
