/*
 * Problem -5 GCR Java strings Level 3
 * Write a program to find the frequency of characters in a string using unique
 * characters and display the result
 * Hint =>
 * Create a method to Find unique characters in a string using the charAt()
 * method and return them as a 1D array. Use Nested Loops to find the unique
 * characters in the text
 * Create a method to find the frequency of characters in a string and return
 * the characters and their frequencies in a 2D array. The logic used here is as
 * follows:
 * Create an array to store the frequency of characters in the text. ASCII
 * values of characters are used as indexes in the array to store the frequency
 * of each character. There are 256 ASCII characters
 * Loop through the text to find the frequency of characters in the text
 * Call the uniqueCharacters() method to find the unique characters in the text
 * Create a 2D String array to store the unique characters and their
 * frequencies.
 * Loop through the unique characters and store the characters and their
 * frequencies
 * In the main function take user inputs, call user-defined methods, and
 * displays result.
 * 
 * 
 * Author: Dheeraj Buchha
 * Date: 27-09-2026
 */

import java.util.Scanner;

public class CharacterFrequency {

    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            int count = 0;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }

            if (count == 0) {
                temp[uniqueCount] = text.charAt(i); // storing into temp whose unique count is 0
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(text);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(frequency[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        System.out.println("Character\tFrequency");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }
}
