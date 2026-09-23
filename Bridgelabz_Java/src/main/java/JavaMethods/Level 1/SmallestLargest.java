/*
 * Problem 8 - GCR Java Methods level 1
Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
public static int[] findSmallestAndLargest(int number1, int number2, int number3)

 * 
 * Author: Dheeraj Buchha
 * Date: 23-09-2026
 */

import java.util.Scanner;

public class SmallestLargest {

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }

        if (number2 > largest) {
            largest = number2;
        }

        if (number3 > largest) {
            largest = number3;
        }

        return new int[] { smallest, largest };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = sc.nextInt();

        System.out.print("Enter number 3: ");
        int number3 = sc.nextInt();

        int[] result = findSmallestAndLargest(number1, number2, number3);

        System.out.println("Smallest number is " + result[0]);

        System.out.println("Largest number is " + result[1]);

        sc.close();
    }
}