package com.java;

import java.util.Scanner;

public class ArrayInput {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the size of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
    
}
