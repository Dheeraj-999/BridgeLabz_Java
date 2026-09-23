/*
 * Problem 10 - GCR Java arrays Level 2
 * Create a program to take a number as input find the frequency of each digit
 * in the number using an array and display the frequency of each digit
 * Hint =>
 * Take the input for a number
 * Find the count of digits in the number
 * Find the digits in the number and save them in an array
 * Find the frequency of each digit in the number. For this define a frequency
 * array of size 10, Loop through the digits array, and increase the frequency
 * of each digit
 * Display the frequency of each digit in the number
 * 
 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;

        int count = 0;

        while (temp != 0) {

            count++;

            temp = temp / 10;
        }

        int[] digits = new int[count];

        temp = number;

        for (int i = 0; i < count; i++) {

            digits[i] = temp % 10;

            temp = temp / 10;

        }

        int[] frequency = new int[10];

        for (int i = 0; i < count; i++) {

            frequency[digits[i]]++;
        }

        for (int i = 0; i < 10; i++) {

            if (frequency[i] > 0)

                System.out.println(i + " occurs " + frequency[i] + " time(s)");
        }

        sc.close();
    }
}