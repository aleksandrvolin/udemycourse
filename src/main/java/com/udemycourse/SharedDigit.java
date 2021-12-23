package com.udemycourse;

public class SharedDigit {

    public static boolean hasSharedDigit(int one, int two) {
        int secondLastDigit = 0;
        int firstLastDigit = 0;
        boolean status = false;
        if (one > 9 && one < 100 && two > 9 && two < 100) {
            firstLastDigit = one % 10;
            System.out.println(firstLastDigit);

            one = one / 10;
            System.out.println(one);

            secondLastDigit = two % 10;
            System.out.println(secondLastDigit);

            two = two / 10;
            System.out.println(two);

            if (firstLastDigit == secondLastDigit ||
                    one == two ||
                    one == secondLastDigit ||
                    two == firstLastDigit) {
                status = true;

            }

        } else {
            status = false;
        }
        return status;
    }
}
