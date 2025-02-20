package com.java;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int number = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0 ;
        for(int i =1;i<number;i++ ){
             c= a+b;
             b=c;
             a=b;
        }
        System.out.println(c);
    }
}
