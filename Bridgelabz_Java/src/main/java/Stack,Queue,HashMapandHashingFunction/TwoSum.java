/*
Two Sum Problem
Problem: Given an array and a target sum, find two indices such that their values add up to the target.
Hint: Use a hash map to store the index of each element as you iterate. Check if target - current_element exists in the map.

Author: Dheeraj Buchha
*/

import java.util.HashMap;

public class TwoSum {
    static void twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];

            if (m.containsKey(needed)) {
                System.out.println(m.get(needed) + " " + i);
                return;
            }

            m.put(arr[i], i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 17;

        twoSum(arr, target);
    }
}