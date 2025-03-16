package com.java;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int rem, sum = 0;
        int result = x;
        while (x > 0) {
            rem = x % 10;
            sum = sum * 10 + rem;
            x = x / 10;
        }
        if (result == sum) {
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(121));
    }
}
