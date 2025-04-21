package com.java;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "  Java   programming  ";

        // Remove all white spaces using replaceAll with a regular expression
        String result = str.replaceAll("\\s+", " ").trim();

        System.out.println(result);
    }
}
