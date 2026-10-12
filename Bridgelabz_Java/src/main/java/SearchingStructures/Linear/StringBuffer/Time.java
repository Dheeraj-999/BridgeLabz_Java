/*
StringBuffer Problem 2: Compare StringBuffer with StringBuilder for String Concatenation
Problem:
Write a program that compares the performance of StringBuffer and StringBuilder for concatenating strings. For large datasets (e.g., concatenating 1 million strings), compare the execution time of both classes.
Approach:
Initialize two StringBuffer and StringBuilder objects.
Perform string concatenation in both objects, appending 1 million strings (e.g., "hello").
Measure the time taken to complete the concatenation using System.nanoTime() for both StringBuffer and StringBuilder.
Output the time taken by both classes for comparison.

Author: Dheeraj Buchha
*/

import java.util.*;

public class Time {
    public static void main(String[] args) {
        int n = 100000;

        StringBuffer sb = new StringBuffer();
        long start1 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            System.out.println("hello");
        }
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // StringBuilder
        StringBuffer sbu = new StringBuffer();
        long start2 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            System.out.println("hello");
        }
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        System.out.println("String buffer time(in nanosec): " + time1);
        System.out.println("String builder time: " + time2);

    }
}