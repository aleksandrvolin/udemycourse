package com.udemycourse;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int one, int two, int three) {

        int secondLastDigit = 0;
        int firstLastDigit = 0;
        int thirdLastDigit = 0;
        boolean status = false;
        if (one > 9 && one < 1001 && two > 9 && two < 1001 && three > 9 && three < 1001) {
            firstLastDigit = one % 10;
            System.out.println(firstLastDigit);

            secondLastDigit = two % 10;
            System.out.println(secondLastDigit);

            thirdLastDigit = three % 10;
            System.out.println(thirdLastDigit);


            if (firstLastDigit == secondLastDigit || secondLastDigit == thirdLastDigit || thirdLastDigit == firstLastDigit) {
                status = true;

            }

        } else {
            status = false;
        }
        return status;
    }

    public static boolean isValid(int value) {
        if (value > 9 && value < 1001) {
            return true;
        } else {
            return false;
        }

    }
}

