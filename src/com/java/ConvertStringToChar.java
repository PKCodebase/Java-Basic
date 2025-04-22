package com.java;

public class ConvertStringToChar {
    public static void main(String[]args){
        String str = "kaushik";
        char[] chars = str.toCharArray();

        for(char ch:chars){
            System.out.print(ch+" ");
        }
    }
}
