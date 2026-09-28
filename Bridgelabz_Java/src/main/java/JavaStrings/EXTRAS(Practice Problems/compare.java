
/*
 * Problem -8 GCR Java strings Extras
 * 8. Compare Two Strings
 * 
 * Problem:
 * Write a Java program to compare two strings lexicographically (dictionary
 * order) without
 * using built-in compare methods.
 * 
 * Author: Dheeraj Buchha
 * Date: 28-09-2026
 */

import java.util.Scanner;

public class compare {

    static int compareStrings(String str1, String str2) {

        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {

            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 < ch2) {
                return -1;
            }

            if (ch1 > ch2) {
                return 1;
            }
        }

        if (str1.length() < str2.length()) { // if the characters are equal...
            return -1;
        }

        if (str1.length() > str2.length()) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String str1 = sc.nextLine();

        System.out.print("Enter string 2: ");
        String str2 = sc.nextLine();

        int result = compareStrings(str1, str2); // calling the method and checking

        if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else if (result > 0) {
            System.out.println(str1 + " comes after " + str2);
        } else {
            System.out.println("Both strings are equal");
        }
    }
}
