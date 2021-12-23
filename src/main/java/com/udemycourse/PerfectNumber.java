package com.udemycourse;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        int sumDivisor = 0;
        boolean status = false;
        if (number < 1) {
            status = false;
        } else {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sumDivisor = sumDivisor + i;
                    System.out.println(sumDivisor);
                }
            }
            if (number == sumDivisor) {
                System.out.println("Number = " + number + " sum = " + sumDivisor);
                status = true;
            }
        }
        return status;
    }
}
