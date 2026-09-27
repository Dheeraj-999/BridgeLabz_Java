/*
 * Problem 5- GCR Java Methods Level 3
 1. Extend or Create a ***NumberChecker*** utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods

**Hint => **

1. Method to Check if a number is prime number. A prime number is a number greater than 1 that has no positive divisors other than 1 and itself. 
2. Method to Check if a number is a neon number. A neon number is a number where the sum of digits of the square of the number is equal to the number itself 
3. Method to Check if a number is a spy number. A number is called a spy number if the sum of its digits is equal to the product of its digits
4. Method to Check if a number is an automorphic number. An automorphic number is a number whose square ends with the number itself. E.g. 5 is an automorphic number
5. Method to Check if a number is a buzz number. A buzz number is a number that is either divisible by 7 or ends with 7
 * 
 * Author: Dheeraj Buchha
 * Date: 25-09-2026
 */

import java.util.Scanner;

public class prime {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {

                return false;
            }
        }

        return true;
    }

    // Method to check if a number is neon
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;

        while (square > 0) {

            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }

        return sum == number;
    }

    // Method to check if a number is spy
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            product = product * digit;
            number = number / 10;
        }

        return sum == product;
    }

    // Method to check if a number is automorphic
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int temp = number;

        while (temp > 0) {
            if (square % 10 != temp % 10) {
                return false;
            }

            square = square / 10;
            temp = temp / 10;
        }

        return true;
    }

    // Method to check if a number is buzz
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Prime Number: " + isPrime(number));
        System.out.println("Neon Number: " + isNeon(number));
        System.out.println("Spy Number: " + isSpy(number));
        System.out.println("Automorphic Number: " + isAutomorphic(number));
        System.out.println("Buzz Number: " + isBuzz(number));
    }
}