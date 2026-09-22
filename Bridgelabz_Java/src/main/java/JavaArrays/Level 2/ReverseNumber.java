/*
 * Problem 5 - GCR Java arrays Level 2
 * 1. Create a program to take a number as input and reverse the number. To do
 * this, store the digits of the number in an array and display the array in
 * reverse order
 ** 
 * Hint => **
 * 
 * 1. Take user input for a number. 
 * 2. Find the count of digits in the number. 
 * 3. Find the digits in the number and save them in an array
 * 4. Create an array to store the elements of the digits array in reverse order
 * 5. Finally, display the elements of the array in reverse order 
 * 
 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class ReverseNumber {
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

        System.out.print("Reversed number: ");

        for (int i = 0; i < count; i++) {

            System.out.print(digits[i]);
        }

        sc.close();
    }
}