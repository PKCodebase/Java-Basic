package com.java;

import java.util.Arrays;

public class RemoveDuplicateNumbers {
    public static void main(String[]args){
        int arr[] = {10,10,20,32,32,30};
        int result[] = Arrays.stream(arr)
                .distinct()
                .toArray();

        for(int num:result){
            System.out.print(num+" ");
        }


    }
}
