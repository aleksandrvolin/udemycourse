package com.udemycourse;

public class EvenDigitSum {

    public static int getEvenDigitSum (int number){

        int lastDigit = 0;
        int sum = 0;

        if(number < 0) {
            return -1;
        } else {
            while(number != 0){
                lastDigit = number % 10;
                System.out.println(lastDigit);
                number = number / 10;

                if(lastDigit %2 == 0){
                    sum = sum + lastDigit;
                }
            }

            return sum;
        }
    }
}
