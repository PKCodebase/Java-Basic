package com.java;

public class SelectionSortAscending {

    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i; // fix: initialize min as i
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }


            // swap if needed
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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

