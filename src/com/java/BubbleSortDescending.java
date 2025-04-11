package com.java;

public class BubbleSortDescending {
    public static void sort(int arr[]){
        int temp  = 0;
        int n = arr.length;
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1] >arr[j]){
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,2,30,4,5};
        sort(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
