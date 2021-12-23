package com.udemycourse;

public class AirPlane implements TestInterfaces {
    @Override
    public void Propeller() {
        System.out.println("Propeller is moving");
    }

    @Override
    public void Wind() {
        System.out.println("Wind is winding very good");
    }
}
