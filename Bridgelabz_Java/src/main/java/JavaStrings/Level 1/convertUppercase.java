/*
 * Problem 9- GCR Java strings Level 1
 * Write a program to convert the complete text to uppercase and compare the results
 *
 * Author: Dheeraj Buchha
 * Date: 25-09-2026
 */

import java.util.Scanner;

public class convertUppercase {

    public static String convertToUpperCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // diff btween A and a ASCII values is 32..
            }

            result = result + ch; // ..adding uppercase char to the result
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) { // checcking if both methods give same result or not
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String result1 = convertToUpperCase(text); // user metod created by my side..
        String result2 = text.toUpperCase(); // built-in -function

        System.out.println("Uppercase using user-defined method: " + result1);
        System.out.println("Uppercase using built-in method: " + result2);

        boolean result = compareStrings(result1, result2);

        System.out.println("Both results are same: " + result);

        sc.close();
    }
}