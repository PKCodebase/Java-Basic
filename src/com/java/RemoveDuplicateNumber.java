package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateNumber {
    public static void main(String[]args) {
        List<Integer> list = Arrays.asList(10, 20, 20, 30, 40, 40) ;
        List<Integer> value = list.stream()
                .distinct()
                .collect(Collectors.toList());

        for(int result : value){
            System.out.println(result+" ");
        }


    }

}
