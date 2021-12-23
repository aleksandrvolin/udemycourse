package com.udemycourse;

public class Point {

    private int x;
    private int y;

    public double distance (int x, int y) {
        Point point = new Point();
        this.x = x;
        this.y = y;

        return Math.sqrt(((x - point.getX()) * (x - point.x)) + ((y - point.getY())*(y - point.getY())));
    }

    public double distance (Point point) {


        return Math.sqrt(((point.getX() - x) * (point.getX() - x)) + ((point.getY()- y)*(point.getY()- y)));
    }


    public double distance () {

        return Math.sqrt(((x - 0) * (x - 0)) + ((y -0 )*(y - 0)));
    }




    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


}
