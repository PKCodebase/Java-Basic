package com.java;

import java.util.Scanner;

public class ReverseStringUsingStringBuffer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        StringBuffer sb = new StringBuffer(name);
        sb.reverse();
        System.out.println(sb);
    }
}
