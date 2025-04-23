package com.java;

public class CubeOfNumber {
    public static void main(String[]args){
        int n = 100;
        int cube = 0;
        for(int i=1;i<=n;i++){
            cube=i*i*i;
            System.out.println(i+ " : " +cube);
        }

    }
}
