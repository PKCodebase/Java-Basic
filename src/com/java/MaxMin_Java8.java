package com.java;

import java.util.Arrays;
import java.util.List;

public class MaxMin_Java8 {
    public static void main(String[] args) {
      List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
      Integer max = list.stream()
              .max(Integer::compare)
              .get();
        System.out.println("Max: " + max);

      Integer min = list.stream()
              .min(Integer::compare)
              .get();

      System.out.println("Min: " + min);

      Integer sum = list.stream()
              .reduce(0, Integer::sum);
      System.out.println("Sum: " + sum);

      Integer sum1 = list.stream()
              .reduce(0, (a, b) -> a + b);
      System.out.println("Sum1: " + sum1);

    }
}
