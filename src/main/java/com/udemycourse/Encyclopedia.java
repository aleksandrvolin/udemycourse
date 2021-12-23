package com.udemycourse;

public class Encyclopedia extends Books {

    @Override
    public void getIzdanie() {
        super.getIzdanie();
        System.out.println("askdfjaskujfhhjsdgfbhjsef");
    }

    @Override
    public int setCountPaper(int papers) {
        int halfPaper = papers/2;
        return super.setCountPaper(halfPaper);

    }
}
