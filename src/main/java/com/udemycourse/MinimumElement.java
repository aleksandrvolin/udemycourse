package com.udemycourse;

import java.util.Scanner;

public class MinimumElement {


    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        return size;
    }


    private static int[] readElements(int size) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
