package com.another_excercice;

public class Truba implements Instrument{
    private int diametr;

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public Truba(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("This truba have a " + getDiametr() + " diametr");
    }
}
