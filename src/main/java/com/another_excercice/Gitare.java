package com.another_excercice;

public class Gitare implements Instrument{
    private int strune;

    public int getStrune() {
        return strune;
    }

    public void setStrune(int strune) {
        this.strune = strune;
    }

    public Gitare(int strune) {
        this.strune = strune;
    }

    @Override
    public void play() {
        System.out.println("This gitare have a " + getStrune() + " strune");
    }
}
