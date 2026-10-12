/*
Binary Search Problem 1: Find the Rotation Point in a Rotated Sorted Array
Problem:
You are given a rotated sorted array. Write a program that performs Binary Search to find the index of the smallest element in the array (the rotation point).
Approach:
Initialize left as 0 and right as n - 1.
Perform a binary search:
Find the middle element mid = (left + right) / 2.
If arr[mid] > arr[right], then the smallest element is in the right half, so update left = mid + 1.
If arr[mid] < arr[right], the smallest element is in the left half, so update right = mid.
Continue until left equals right, and then return arr[left] (the rotation point).

Author: Dheeraj Buchha
*/
public class smallestNum {

    static int findSmall(int[] arr) {

        int st = 0;
        int end = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] >= arr[st]) {
                ans = Math.min(ans, arr[st]);
                st = mid + 1;
            } else {
                ans = Math.min(ans, arr[mid]);
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2 };

        System.out.print(findSmall(arr));

    }
}