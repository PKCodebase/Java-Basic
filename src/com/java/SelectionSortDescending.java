package com.java;

public class SelectionSortDescending {
    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int max = i; // fix: initialize min as i
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }


            // swap if needed
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

    }
    public static void main(String[] args) {
        int arr[] = {10, 30, 40,  5,15};
        sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
