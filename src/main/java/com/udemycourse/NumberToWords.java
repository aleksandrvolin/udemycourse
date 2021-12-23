package com.udemycourse;

public class NumberToWords {

    public static void numberToWords(int number) {
        int count = getDigitCount(number);

        if (number < 0 || count == -1) {
            System.out.println("Invalid Value");
        } else {
            int[] array = new int[count];
            while (number != 0) {
                array[count - 1] = number % 10;
                number /= 10;
                count--;
            }

            for (int i = 0; i < array.length; i++) {

                switch (array[i]) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 0:
                        System.out.println("Zero");
                        break;
                }
                number /= 10;
            }
        }
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        } else if(number == 0) {
            return 1;
        } else {
            while (number != 0) {
                count++;
                number = number / 10;
            }
        }
        return count;
    }

    public static int reverse(int number) {
        int buffer = 0;
        int lastDigit = 0;

        while (number != 0) {
            lastDigit = number % 10;
            buffer = (buffer * 10) + lastDigit;
            number /= 10;
        }
        return buffer;
    }

}
