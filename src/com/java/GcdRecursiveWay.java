package com.java;

public class GcdRecursiveWay {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("GCD is: " + gcd(36, 60));  // Output: 12
    }
}
