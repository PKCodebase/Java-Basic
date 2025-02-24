package com.java;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        int temp = 0;
        for(int i=2;i<=number;i++){
            if(number%i==0){
                temp++;
                break;
            }
        }
        if(temp==0){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a Prime number");
        }

    }

}
