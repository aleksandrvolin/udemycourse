package com.udemycourse;

public abstract class Books implements Izdanie{

    @Override
    public void getIzdanie() {
        System.out.println("This book have a this izdanie");
    }

    @Override
    public int setCountPaper(int papers) {
        return papers;
    }
}
