package com.java;

import java.util.Arrays;
import java.util.List;

public class SumOfElement_Java8
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(10,20,30,40,50);
        Integer sum = list.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);

        Integer sum1 = list.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum1: " + sum1);
    }
}
