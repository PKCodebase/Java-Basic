package com.java;

public class MissingNumber {
    public static int missingNumber(int nums[]){
        int n = nums.length+1;
        int totalSum = n*(n+1)/2;
        int currentSum = 0;
        for(int num :nums){
            currentSum += num;
        }
        return totalSum - currentSum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,10};
        int result = missingNumber(arr);
        System.out.println("Missing Number : "+ result);
    }
}
