package com.java;

public class CountDigits {
    public static void main(String[]args){
        String str = "887kann";
        char ch[] = str.toCharArray();
        int count = 0;

        for(char chs:ch){
            if(Character.isDigit(chs)){
                count++;
            }
        }
        System.out.println("Count " + " = "  +count);
    }
}
