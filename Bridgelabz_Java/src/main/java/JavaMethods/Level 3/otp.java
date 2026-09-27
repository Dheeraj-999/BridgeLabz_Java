/*
 * Problem 7- GCR Java Methods Level 3
 * 1. Write a program to generate a six-digit OTP number using Math.random()
 * method. Validate the numbers are unique by generating the OTP number 10 times
 * and ensuring all the 10 OTPs are not the same
 ** 
 * Hint => **
 * 
 * 1. Write a method to Generate a 6-digit OTP number using Math.random() 
 * 2. Create an array to save the OTP numbers generated 10 times
 * 3. Write a method to ensure that the OTP numbers generated are unique. If
 * unique return true else return false
 * 
 * Author: Dheeraj Buchha
 * Date: 25-09-2026
 */

import java.util.Scanner;

public class otp {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    // Method to check if all OTPs are unique
    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");

        for (int i = 0; i < otps.length; i++) {
            System.out.println(otps[i]);
        }

        boolean result = areUnique(otps);

        System.out.println("Are all OTPs unique? " + result);
    }
}