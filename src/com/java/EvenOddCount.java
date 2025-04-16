package com.java;

public class EvenOddCount {
    public static  void main(String args[]){
        int arr[] = {10,4,20,34,55,43,27};
        int even = 0;
        int odd = 0;
        for(int value:arr){
            if(value%2==0){
                even++;
            }else{
              odd++;
            }
        }
        System.out.println("Even Number: "+even);
        System.out.println("Odd Number: "+odd);
    }
}
