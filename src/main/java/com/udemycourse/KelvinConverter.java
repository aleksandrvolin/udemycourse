package com.udemycourse;

public class KelvinConverter implements Converter{
    @Override
    public double getConverted(double baseValue) {
        return baseValue+273.15;
    }
}
