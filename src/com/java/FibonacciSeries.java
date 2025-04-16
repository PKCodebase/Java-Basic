package com.java;

public class FibonacciSeries {
    public static void fibonacciSeries(int  num){
        int a = 0;
        int b =1;
        int c = 0;
        for(int i =1;i<=num;i++){
            c = a+b;
            System.out.println(i + " :"+c);
            a=b;
            b=c;
        }


    }
    public static void main(String[] args) {
        fibonacciSeries(10);
    }
}
