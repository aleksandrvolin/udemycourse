package com.udemycourse;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int [] array) {

        System.out.println("Array = " + Arrays.toString(array));
        int temp;
        for(int i = 0; i < array.length/2; i++){
            temp = array[i];
            array[i]=array[(array.length-1)-i];
            array[(array.length-1)-i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
