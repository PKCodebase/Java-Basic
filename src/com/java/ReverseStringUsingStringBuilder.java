package com.java;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        System.out.println(sb);
    }
}
