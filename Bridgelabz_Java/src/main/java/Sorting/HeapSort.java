/*
Heap Sort - Sort Job Applicants by Salary
Problem Statement:
A company receives job applications with different expected salary demands. Implement Heap Sort to sort these salary demands in ascending order.
Hint:
Build a Max Heap from the array.
Extract the largest element (root) and place it at the end.
Reheapify the remaining elements and repeat until sorted.

Author: Dheeraj Buchha
*/

public class HeapSort {
    static void heapify(int[] arr, int n, int i) { // fix the heap..parent should be greater

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[largest] < arr[left]) {
            largest = left;
        }

        if (right < n && arr[largest] < arr[right]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }

    }

    static void buildHeap(int[] arr, int n) { // buidling max heap from array

        for (int i = (n - 2 / 2); i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) { // extract the highest element from start and swap it with last
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int salaries[] = { 300, 500, 100, 600, 700 };
        int n = 5;

        buildHeap(salaries, n);

        System.out.println("Sorted salaries:");
        for (int i = 0; i < salaries.length; i++) {
            System.out.print(salaries[i] + " ");
        }
    }
}
