
/*
2. Insertion Sort - Sort Employee IDs
Problem Statement:
A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.
Hint:
Divide the array into sorted and unsorted parts.
Pick an element from the unsorted part and insert it into its correct position in the sorted part.
Repeat for all elements.

Author: Dheeraj Buchha
*/
import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {

        int[] empIds = { 105, 102, 108, 101, 104 };

        for (int i = 1; i < empIds.length; i++) {

            int current = empIds[i];
            int j = i - 1;

            while (j >= 0 && empIds[j] > current) {
                empIds[j + 1] = empIds[j];
                j--;
            }

            empIds[j + 1] = current;
        }

        System.out.println(Arrays.toString(empIds));
    }
}