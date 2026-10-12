/*
Challenge Problem (for both Linear and Binary Search)
Problem:
You are given a list of integers. Write a program that uses Linear Search to find the first missing positive integer in the list and Binary Search to find the index of a given target number.
Approach:
Linear Search for the first missing positive integer:
Iterate through the list and mark each number in the list as visited (you can use negative marking or a separate array).
Traverse the array again to find the first positive integer that is not marked

Author: Dheeraj Buchha
*/
public class ChallengeProblem {

    static int LinearSer(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int newArr[] = new int[max + 2];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newArr[arr[i]] = 1;
            }
        }

        for (int i = 1; i < newArr.length; i++) {
            if (newArr[i] == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 6, 7 };

        System.out.print("Missing Number : " + LinearSer(arr));

    }
}