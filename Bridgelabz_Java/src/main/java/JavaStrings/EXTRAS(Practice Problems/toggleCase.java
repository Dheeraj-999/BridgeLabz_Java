/*
 * Problem -7 GCR Java strings Extras
 * Toggle Case of Characters
 * Problem:
 * Write a Java program to toggle the case of each character in a given string.
 * Convert
 * uppercase letters to lowercase and vice versa.
 * 
 * Author: Dheeraj Buchha
 * Date: 28-09-2026
 */

import java.util.Scanner;

public class toggleCase {

    static String toggleCase(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') { // upper to lower
                ch = (char) (ch + 32);
            } else if (ch >= 'a' && ch <= 'z') { // lower to upper
                ch = (char) (ch - 32);
            }

            result = result + ch;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = toggleCase(str);

        System.out.println("Toggled string: " + result);
    }
}