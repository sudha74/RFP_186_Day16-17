package com.bridgelabz.datastructures;

public class InsertionSort {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        System.out.println("insertion sort");
        printArray(arr);

    }
}
