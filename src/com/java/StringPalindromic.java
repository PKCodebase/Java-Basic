package com.java;

public class StringPalindromic {
    public static void main(String[]args){
        String str = "kaak";
        String reversed = "";
        int n = str.length()-1;
        for(int i=0;i<=n;i++){
            reversed += str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome");
        }else
            System.out.println("Not");
    }
}
