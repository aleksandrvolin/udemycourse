package com.udemycourse;

public class Magazine implements Printable{
    Printable[] printables;


    @Override
    public void print() {
        System.out.println("This is a magazine");
    }


    public static void printMagazines(Printable[] printable){
        for(int i = 0; i < printable.length; i++){

        }
    }

    public static void printBook (Printable[] printable){
        for(int i = 0; i < printable.length; i++){

        }
    }



}
