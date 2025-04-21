package com.java;

import java.util.Scanner;

public class StringPalindrome2 {
    public static void main (String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the name : ");
       String str = sc.nextLine();

       StringBuilder sb = new StringBuilder(str);
       sb.reverse();

       if(str.equalsIgnoreCase(sb.toString())){
           System.out.println("yes");
       }else
           System.out.println("No");

    }
}
