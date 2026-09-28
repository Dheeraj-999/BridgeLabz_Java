/*
 * Problem -2 GCR Java strings Extras
 * Reverse a String
 * Problem:
 * Write a Java program to reverse a given string without using any built-in
 * reverse
 * functions.
 * 
 * Author: Dheeraj Buchha
 * Date: 28-09-2026
 */

import java.util.Scanner;

public class reverse {

    static String reverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = reverse(str);

        System.out.println("Reversed string: " + result);
    }
}