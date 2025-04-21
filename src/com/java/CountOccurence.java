package com.java;

public class CountOccurence {
    public static void main(String[] args) {
        String str = "Kaushik";

        // Convert the string to lowercase to ignore case
        str = str.toLowerCase();

        // Create an array to store character frequencies (size 26 for lowercase English letters)
        int[] freq = new int[26];

        // Count each character's occurrence
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        // Print occurrences of each character
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + freq[i]);
            }
        }
    }
}
