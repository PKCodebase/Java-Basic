package com.java;

public class ReverseWord1 {
    public static void main(String args[]){
        String str = "My name is kaushik";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word); // step 1: word to StringBuilder
            sb.reverse();                               // step 2: reverse it
            result.append(sb);                          // step 3: append reversed word
            result.append(" ");                         // step 4: add space
        }

        System.out.println(result.toString().trim());
    }
}
