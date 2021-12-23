package com.udemycourse;

public class Candidate {


    private String name;
    private int voice = 0;

    public Candidate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int addVoice(){
        return getVoice()+1;
    }

    public int getVoice() {
        return voice;
    }
}
