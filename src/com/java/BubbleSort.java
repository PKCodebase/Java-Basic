package com.java;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        int temp = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {10,2,30,4,5};
         bubbleSort(arr);
         for(int num:arr){
             System.out.print(num+" ");
         }

    }
}
