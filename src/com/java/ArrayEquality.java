package com.java;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {1, 6,2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5,6};
        Arrays.sort(array1);
        Arrays.sort(array2);
        boolean isEqual = Arrays.equals(array1, array2);
        if (isEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }

    }
}
