package com.java;

import java.util.Arrays;

public class EvenOddNumber_JAVA8 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Even Numbers: ");
        Arrays.stream(numbers)
                .filter(num -> num % 2 == 0)
                .forEach(num -> System.out.print(num + " "));

        System.out.println();


         System.out.print("Odd Numbers: ");
        Arrays.stream(numbers)
                .filter(nums -> nums%2 !=0)
                .forEach(nums->System.out.print(nums+" "));
    }
}
