package com.java;

public class SquareOfNumber {
    public static void main(String[]args){
        int n =100;
        int square = 0;
        for(int i=1;i<=n;i++){
            square = i*i;
            System.out.println(i+" : "+square);
        }
    }
}
