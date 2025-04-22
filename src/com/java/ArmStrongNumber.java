package com.java;

public class ArmStrongNumber {
    public static void main(String[]args){
        int n = 153;
        int number = n;
        int sum = 0;
        while(number != 0){
           int  digit = number%10;
            sum += digit*digit*digit;
            number /= 10;
        }
        if(sum == n){
            System.out.println("Armstrong");
        }else
            System.out.println("Not Armstrong");
    }
}
