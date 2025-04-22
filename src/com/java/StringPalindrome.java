package com.java;

import java.util.Scanner;

public class StringPalindrome {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string to check if it's a palindrome:");
            String str = scanner.nextLine(); // Input the string

            String reversed = "";

            int n = str.length() - 1;
            
            for (int i = n; i >= 0; i--) {
                reversed += str.charAt(i);
            }

            if (str.equalsIgnoreCase(reversed)) {
                System.out.println("The string is a palindrome!");
            } else {
                System.out.println("The string is not a palindrome.");
            }
            scanner.close();
        }

}
