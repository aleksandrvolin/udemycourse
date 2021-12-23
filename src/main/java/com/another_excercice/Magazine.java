package com.another_excercice;

import java.util.ArrayList;
import java.util.Objects;

public class Magazine implements Printable{
    private String name;
    private int year;
    ArrayList<Printable> printables;


    public Magazine(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("Print book " + getName());
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return year == magazine.year && Objects.equals(name, magazine.name) && Objects.equals(printables, magazine.printables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, printables);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
