/*
 * Problem -4 GCR Java strings Extras
 * 4. Remove Duplicates from a String
 * Problem:
 * Write a Java program to remove all duplicate characters from a given string
 * and return
 * the modified string.
 * 
 * Author: Dheeraj Buchha
 * Date: 28-09-2026
 */

import java.util.Scanner;

public class removeDuplicates {

    static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) { // finding position if character is present ...if not it will return -1;
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = removeDuplicates(str);

        System.out.println("After removing duplicates: " + result);
    }
}