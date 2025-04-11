package com.java;

public class CountEvenOdd {
    public static int[] countNumber(int arr[]){
        int even = 0;
        int odd = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }if(arr[i]%2!=0){
                odd++;
            }
        }
        return new int[]{even,odd};
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int result[] = countNumber(arr);
        System.out.println("Even Number: "+result[0]);
        System.out.println("Odd Number: "+result[1]);
    }
}
