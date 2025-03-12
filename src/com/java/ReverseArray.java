package com.java;

public class ReverseArray {
    public static void reverserArray(int arr[]){
        int n = arr.length-1;
        for(int i=n;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverserArray(arr);
    }

}
