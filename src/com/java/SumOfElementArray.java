package com.java;

public class SumOfElementArray {
    public static int  sumOfArray(int arr[]){
        int sum = 0;
//        int n = arr.length;
//        for(int i=0;i<n;i++){
//            sum += arr[i];
//        }
//        return sum;
        for(int value :arr){
            sum += value;
        }
        return sum;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(sumOfArray(arr));
    }
}
