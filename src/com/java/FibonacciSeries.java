package com.java;

public class FibonacciSeries {
    public static int fibonacciSeries(int  num){
        int a = 0;
        int b =1;
        int c = 0;
        for(int i =1;i<num;i++){
            c = a+b;
            a=b;
            b=c;
        }
        return c;

    }
    public static void main(String[] args) {
        System.out.println(fibonacciSeries(5));
    }
}
