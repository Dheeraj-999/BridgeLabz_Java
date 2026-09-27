
/*
 * Problem -4 GCR Java strings Level 3
 * Write a program to find the frequency of characters in a string using the
 * charAt() method and display the result
 * Hint =>
 * Create a method to find the frequency of characters in a string using the
 * charAt() method and return the characters and their frequencies in a 2D
 * array. The logic used here is as follows:
 * Create an array to store the frequency of characters in the text. ASCII
 * values of characters are used as indexes in the array to store the frequency
 * of each character. There are 256 ASCII characters
 * Loop through the text to find the frequency of characters in the text
 * Create an array to store the characters and their frequencies
 * Loop through the characters in the text and store the characters and their
 * frequencies
 * In the main function take user inputs, call user-defined methods, and
 * displays result.
 * 
 * 
 * Author: Dheeraj Buchha
 * Date: 27-09-2026
 */

import java.util.Scanner;

public class frequency {

    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];

        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[index][0] = String.valueOf(text.charAt(i));
                result[index][1] = String.valueOf(frequency[text.charAt(i)]);
                index++;
            }
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