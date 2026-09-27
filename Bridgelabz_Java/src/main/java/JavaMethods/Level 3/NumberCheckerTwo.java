/*
 * Problem 3- GCR Java Methods Level 3
 * 1. Extend or Create a ***NumberChecker*** utility class and perform following
 * task. Call from main() method the different methods and display results. Make
 * sure all are static methods
 ** 
 * Hint => **
 * 
 * 1. Method to find the count of digits in the number and a Method to Store the
 * digits of the number in a digits array
 * 2. Method to find the sum of the digits of a number using the digits array
 * 3. Method to find the sum of the squares of the digits of a number using the
 * digits array. Use ***Math.pow()*** method
 * 4. Method to Check if a number is a harshad number using a digits array. A
 * number is called a Harshad number if it is divisible by the sum of its
 * digits. For e.g. 21
 * 5. Method to find the frequency of each digit in the number. Create a 2D
 * array to store the frequency with digit in the first column and frequency in
 * the second column.
 * Author: Dheeraj Buchha
 * Date: 25-09-2026
 */

import java.util.Scanner;

public class NumberCheckerTwo {

    // Method to find the count of digits
    public static int countDigits(int number) {
        int count = 0;

        if (number == 0) {
            return 1;
        }

        while (number > 0) {
            count++;
            number = number / 10;
        }

        return count;
    }

    // Method to store digits in an array
    public static int[] getDigits(int number, int count) {
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }

        return digits;
    }

    // Method to find the sum of digits
    public static int findSum(int[] digits) {
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum = sum + digits[i];
        }

        return sum;
    }

    // Method to find the sum of squares of digits
    public static double findSumOfSquares(int[] digits) {
        double sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum = sum + Math.pow(digits[i], 2);
        }

        return sum;
    }

    // Method to check if the number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = findSum(digits);

        return number % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] findFrequency(int[] digits) {
        int[][] result = new int[10][2];

        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = 0;
        }

        for (int i = 0; i < digits.length; i++) {
            result[digits[i]][1]++;
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = countDigits(number);

        int[] digits = getDigits(number, count);

        int sum = findSum(digits);

        double sumOfSquares = findSumOfSquares(digits);

        boolean harshad = isHarshadNumber(number, digits);

        int[][] frequency = findFrequency(digits);

        System.out.println("Number of digits: " + count);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares: " + sumOfSquares);
        System.out.println("Harshad number: " + harshad);

        System.out.println("Digit Frequency");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(
                        frequency[i][0] + "       " + frequency[i][1]);
            }
        }
    }
}