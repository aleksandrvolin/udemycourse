package com.another_excercice;

public class Baraban implements Instrument{
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Baraban(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("This baraban have a " + getSize() + " size");
    }
}
