package com.another_excercice;

import java.util.ArrayList;
import java.util.Objects;

public class Book implements Printable{
    private String name;
    private int year;
    ArrayList<Printable> printables;

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

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }



    @Override
    public void print() {
        System.out.println("Print book " + getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(printables, book.printables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, printables);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
