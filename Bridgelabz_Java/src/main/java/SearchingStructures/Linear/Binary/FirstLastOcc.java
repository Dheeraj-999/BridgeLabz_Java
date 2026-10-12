/*
Binary Search Problem 4: Find the First and Last Occurrence of an Element in a Sorted Array
Problem:
Given a sorted array and a target element, write a program that uses Binary Search to find the first and last occurrence of the target element in the array. If the element is not found, return -1.
Approach:
Use binary search to find the first occurrence:
Perform a regular binary search, but if the target is found, continue searching on the left side (right = mid - 1) to find the first occurrence.
Use binary search to find the last occurrence:
Similar to finding the first occurrence, but once the target is found, continue searching on the right side (left = mid + 1) to find the last occurrence.
Return the indices of the first and last occurrence. If not found, return -1.

Author: Dheeraj Buchha
*/
public class FirstLastOcc {

    static int findFirstOcc(int[] arr, int target) {

        int st = 0;
        int end = arr.length - 1;
        int first = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return first;
    }

    static int findLastOcc(int[] arr, int target) {

        int st = 0;
        int end = arr.length - 1;
        int last = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                last = mid;
                st = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 6, 7 };
        int target = 6;

        System.out.print("First Occ: " + findFirstOcc(arr, target));
        System.out.print("Last Occ: " + findLastOcc(arr, target));

    }
}