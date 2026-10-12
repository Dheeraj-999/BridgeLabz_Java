/*
4. Quick Sort - Sort Product Prices
Problem Statement:
An e-commerce company wants to display product prices in ascending order. Implement Quick Sort to sort the product prices.
Hint:
Pick a pivot element (first, last, or random).
Partition the array such that elements smaller than the pivot are on the left and larger ones are on the right.
Recursively apply Quick Sort on left and right partitions.

Author: Dheeraj Buchha
*/

public class Quicksort {
    static void quicksort(int[] arr, int st, int end) {
        if (st < end) {
            int pivIdx = partition(arr, st, end);
            quicksort(arr, st, pivIdx - 1); // left half
            quicksort(arr, pivIdx + 1, end); // right half
        }
    }

    static int partition(int[] arr, int st, int end) {
        int idx = st - 1;
        int pivot = arr[end];

        for (int j = st; j < end; j++) {
            if (pivot >= arr[j]) {
                idx++;
                int temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp;
            }
        }
        idx++;
        int temp = arr[idx];
        arr[idx] = arr[end];
        arr[end] = temp;

        return idx;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 4, 3 };

        quicksort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
