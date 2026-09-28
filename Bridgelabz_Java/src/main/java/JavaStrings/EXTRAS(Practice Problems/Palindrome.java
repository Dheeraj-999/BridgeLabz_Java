/*
 * Problem -3 GCR Java strings Extras
 * 3. Palindrome String Check
 * Problem:
 * Write a Java program to check if a given string is a palindrome (a string
 * that reads the
 * same forward and backward).
 * 
 * Author: Dheeraj Buchha
 * Date: 28-09-2026
 */

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1; // going withh 2 pointer approach

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++; // going with next characters
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}