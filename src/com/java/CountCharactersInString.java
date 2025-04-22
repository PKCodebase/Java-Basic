package com.java;

import java.util.Scanner;

public class CountCharactersInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String str = sc.nextLine();
        char ch[]  = str.toCharArray();
        int count = 0;

        for(char chs:ch){
            if(Character.isLetter(chs)){
                count++;
            }
        }
        System.out.println(count);
    }
}
