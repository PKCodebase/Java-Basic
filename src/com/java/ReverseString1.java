package com.java;
import java.util.Scanner;
import java.util.*;




public class ReverseString1 {
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name:");
        String name = sc.nextLine();
        StringBuilder sb   = new StringBuilder(name);
        System.out.print(sb.reverse()); ;

//        for(int i=name.length()-1;i>=0;i--){
//          reverse.append(name.charAt(i));
//        }
//        System.out.print(reverse);

    }
}
