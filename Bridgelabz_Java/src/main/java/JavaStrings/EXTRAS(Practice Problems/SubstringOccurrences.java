/*
 * Problem -6 GCR Java strings Extras
 * 6. Find Substring Occurrences
 * Problem:
 * Write a Java program to count how many times a given substring occurs in a
 * string.
 * 
 * Author: Dheeraj Buchha
 * Date: 28-09-2026
 */

import java.util.Scanner;

public class SubstringOccurrences {

    static int countOccurrences(String str, String sub) {
        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) { // becoz the last iteration should not exceed the
                                                                 // string length

            String part = str.substring(i, i + sub.length()); // checking for substrings in the string..

            if (part.equals(sub)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String str = sc.nextLine();

        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        int result = countOccurrences(str, sub);

        System.out.println("Occurrences: " + result);
    }
}