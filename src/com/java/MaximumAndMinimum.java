package com.java;

public class MaximumAndMinimum {
    public static void maxAndMin(int num[]){
        int max =num[0];
        int min = num[0];
        int n = num.length;
        for(int i=0;i<n;i++){
            if(num[i]>max){
                max= num[i];
            }else if(num[i]<min){
                min = num[i];
            }
        }
        System.out.println("Maximum number is : "+max);
        System.out.println("Minimum number is : "+min);


    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        maxAndMin(arr);


    }

}
