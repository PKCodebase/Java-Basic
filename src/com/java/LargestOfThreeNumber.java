package com.java;

public class LargestOfThreeNumber {
    public static int largestOfThreeNumber(int a, int b, int c) {
      int max = 0;
      if(a>b && a>c){
          max = a;
      }else if(b>a && b>c){
          max = b;
      }else{
          max = c;
      }
      return max;
    }
    public static void main(String[] args) {
int a = 10;
int b =40;
        int c =25;
        int maxValue = largestOfThreeNumber(a,b,c);
        System.out.println("Max : " + maxValue);
    }
}
