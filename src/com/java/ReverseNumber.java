package com.java;
import java.util.Scanner;

public class ReverseNumber {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        for(int i=number;i>=1;i--){
            System.out.println(i);
        }
    }
}
