package com.java;

import java.util.Arrays;

public class CheckEqualArray {
    public static void main(String[]args){
        int arr [] = {10,20,30,40,50};
        int arr1 [] = {50,40,3,20,10};

        Arrays.sort(arr);
        Arrays.sort(arr1);

        boolean isEqual=Arrays.equals(arr,arr1);
        if(isEqual){
            System.out.println("Both are equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
