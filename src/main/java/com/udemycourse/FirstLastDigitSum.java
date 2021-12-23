package com.udemycourse;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number){

        int firstDigit;
        int lastDigit;

        if(number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else {

            lastDigit = number % 10;

            int digits = (int)(Math.log10(number));
            firstDigit = (int)(number / (int)(Math.pow(10, digits)));

            return firstDigit+lastDigit;
        }
    }
}
