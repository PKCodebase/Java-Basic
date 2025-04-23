package com.java;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateNumber_Java8 {
    public static void main (String [] args){
        int arr[] = {10,20,40,20,40,30};
         int result[] =  Arrays.stream(arr)
                   .distinct()
                   .toArray();

                   for(int num :result){
                       System.out.print(num+" ");
                   }
    }
}
