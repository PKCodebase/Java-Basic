package com.java;

public class SumOfDigits {
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        int result = sumOfDigits(123);
        System.out.println("Sum : " + result);
    }
}
