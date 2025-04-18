package com.java;

import static com.java.MissingNumber.missingNumber;

public class DuplicateNumber {
    public static int findDuplicate(int[] nums){
     int n = nums.length;
     int duplicate=0;
     for(int i=0;i<n;i++){
         for(int j=i+1;j<n-1;j++){
             if(nums[i] == nums[j]){
                 duplicate = nums[j];
             }else{
                 return -1;
             }
         }

     }
        return duplicate;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int result = findDuplicate(arr);
        System.out.println("Duplicate Number : "+ result);
    }
}
