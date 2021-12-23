package com.udemycourse;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int reverseNumber = 0, remainder;
        boolean status = false;
        int originalNum = number;

        while (number != 0) {
            remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;

            number /= 10;

            if (originalNum == reverseNumber) {
                status = true;
            } else {
                status = false;
            }
        }

        return status;
    }
}
