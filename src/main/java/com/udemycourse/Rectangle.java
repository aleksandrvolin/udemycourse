package com.udemycourse;

public class Rectangle {

    private double width;
    private double length;

    public double getArea() {
        return this.length * this.width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public Rectangle(double width, double length) {
        if (width < 0 && length < 0 ) {
            this.width = 0;
            this.length = 0;
        } else if (length < 0) {
            this.length = 0;
            this.width = width;
        } else if (width < 0) {
            this.width = 0;
            this.length = length;
        } else {
            this.width = width;
            this.length = length;
        }
    }
}