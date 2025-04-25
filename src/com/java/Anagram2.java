package com.java;

import java.util.Arrays;

public class Anagram2 {
    public static void main(String[]args){
        String str = "      kaushik";
        String str1 = "kasu   iihk      ";

        str= str.replaceAll("\\s","");
        str1 = str1.replaceAll("\\s","");

        char ch[] = str.toCharArray();
        char ch1[] = str1.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        boolean result = Arrays.equals(ch,ch1);
        System.out.println(result);


    }
}
