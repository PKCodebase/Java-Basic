package com.java;

import java.util.Scanner;

public class CountVowelAndConsonent {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String str = sc.nextLine().toLowerCase();
        int vowels = 0;
        int consonants = 0;


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if it's an alphabet letter
            if (ch >= 'a' && ch <= 'z') {
                // Check if it's a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

}
