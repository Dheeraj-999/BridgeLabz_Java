/*
 * Problem 6- GCR Java Methods Level 3
 * 1. Extend or Create a ***NumberChecker*** utility class and perform following
 * task. Call from main() method the different methods and display results. Make
 * sure all are static methods
 ** 
 * Hint => **
 * 
 * 1. Method to find factors of a number and return them as an array. Note there
 * are 2 for loops one for the count and another for finding the factor and
 * storing in the array
 * 2. Method to find the greates factor of a Number using the factors array
 * 3. Method to find the sum of the factors using factors array and return the
 * sum
 * 4. Method to find the product of the factors using factors array and return
 * the product
 * 5. Method to find product of cube of the factors using the factors array. Use
 * ***Math.pow()*** 
 * 6. Method to Check if a number is a perfect number. Perfect numbers are
 * positive integers that are equal to the sum of their proper divisors
 * 7. Method to find the number is a abundant number. A number is called an
 * abundant number if the sum of its proper divisors is greater than the number
 * itself
 * 8. Method to find the number is a deficient number. A number is called a
 * deficient number if the sum of its proper divisors is less than the number
 * itself
 * 9. Method to Check if a number is a strong number. A number is called a
 * strong number if the sum of the factorial of its digits is equal to the
 * number itself
 * 
 * Author: Dheeraj Buchha
 * Date: 25-09-2026
 */

import java.util.Scanner;

public class numberCheck {

    // Method to find all factors of a number
    public static int[] findFactors(int number) {

        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find the greatest factor
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    // Method to find the sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum = sum + factors[i];
        }

        return sum;
    }

    // Method to find the product of factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;

        for (int i = 0; i < factors.length; i++) {
            product = product * factors[i];
        }

        return product;
    }

    // Method to find the product of cubes of factors
    public static double findProductOfCubeOfFactors(int[] factors) {
        double product = 1;

        for (int i = 0; i < factors.length; i++) {
            product = product * Math.pow(factors[i], 3);
        }

        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        return sum < number;
    }

    // Method to find factorial of a digit
    public static int factorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + factorial(digit);
            number = number / 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println();

        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + findProductOfCubeOfFactors(factors));

        System.out.println("Perfect Number: " + isPerfectNumber(number));
        System.out.println("Abundant Number: " + isAbundantNumber(number));
        System.out.println("Deficient Number: " + isDeficientNumber(number));
        System.out.println("Strong Number: " + isStrongNumber(number));
    }
}