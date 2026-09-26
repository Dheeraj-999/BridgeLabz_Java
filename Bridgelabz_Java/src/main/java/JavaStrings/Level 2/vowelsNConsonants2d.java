/*
 * Problem -6 GCR Java strings Level 2
 * Write a program to find vowels and consonants in a string and display the
 * character type - Vowel, Consonant, or Not a Letter
 * Hint =>
 * Create a method to check if the character is a vowel or consonant and return
 * the result. The logic used here is as follows:
 * Convert the character to lowercase if it is an uppercase letter using the
 * ASCII values of the characters
 * Check if the character is a vowel or consonant and return Vowel, Consonant,
 * or Not a Letter
 * Create a Method to find vowels and consonants in a string using charAt()
 * method and return the character and vowel or consonant in a 2D array
 * Create a Method to display the 2D Array of Strings in a Tabular Format
 * Finally, the main function takes user inputs, calls the user-defined methods,
 * and displays the result.
 * 
 * Author: Dheeraj Buchha
 * Date: 26-09-2026
 */

import java.util.Arrays;
import java.util.Scanner;

public class vowelsNConsonants2d {

    public static String checkChar(char ch) {

        if (ch >= 'A' && ch <= 'Z') { // method to check weather a character is vowel , conson,or not a letter...
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "vowels";
            } else {
                return "consonants";
            }
        } else {
            return "Not a letter";
        }
    }

    public static int countlength(String str) {
        int index = 0;
        try {
            while (true) {
                str.charAt(index); // to find the lengthh of a string
                index++;
            }
        } catch (RuntimeException e) {
            System.out.println("runtime error occured");

        }
        return index;
    }

    public static String[][] checkCharType(String str) {
        int length = countlength(str);
        String result[][] = new String[length][2];

        for (int i = 0; i < length; i++) {

            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            String check = checkChar(ch);
            if (check.equals("vowels")) {
                result[i][1] = "vowel";
            } else if (check.equals("consonants")) {
                result[i][1] = "consonant";

            } else {
                result[i][1] = "Not a letter";
            }

        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.next();
        int length = countlength(str);

        String arr[][] = new String[length][2];

        arr = checkCharType(str);
        System.out.println(Arrays.deepToString(arr));
        sc.close();
    }
}