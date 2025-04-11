package com.java;

public class SecondHighest {

    public static int secondHighest(int[]arr) {

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (
                int num : arr) {
            if (num > max) {
                smax = max;
                max = num;
            }else if (num > smax && num != max) {
                smax = num;
            }
        }
        return (smax==Integer.MIN_VALUE)? -1 : smax;
    }

    public static void main(String[] args) {
        int arr[] = {76};
       System.out.println(secondHighest(arr));
    }
}


//Time =	O(n)
//Space =  O(1)
