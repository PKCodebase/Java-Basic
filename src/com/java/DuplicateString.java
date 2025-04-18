package com.java;

public class DuplicateString {
    public static void main(String[] args) {
        String arr[] = {"Java", "Python", "java", "C", "python", "Ruby"};
        System.out.print("Duplicate Strings are : ");
       int n = arr.length;
       for(int i=0;i<n;i++){
           for (int j=i+1;j<n-1;j++){
               if(arr[i].equalsIgnoreCase(arr[j])){
                   System.out.print(arr[i] + " ");
               }
           }
       }
    }

}
