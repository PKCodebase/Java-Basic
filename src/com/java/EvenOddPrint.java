package com.java;

public class EvenOddPrint {
    public static void main (String [] args){

        int arr[] = {10, 20, 34, 55, 43, 27};

        System.out.print("Even numbers: ");
        for (int value : arr) {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        }

        System.out.print("\nOdd numbers: ");
        for (int value : arr) {
            if (value % 2 != 0) {
                System.out.print(value + " ");
            }
        }
    }

}
