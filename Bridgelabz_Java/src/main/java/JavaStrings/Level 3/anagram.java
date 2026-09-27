/*
 * Problem -8 GCR Java strings Level 3
 * Write a program to check if two texts are anagrams and display the result
 * Hint =>
 * An anagram is a word or phrase formed by rearranging the same letters to form
 * different words or phrases,
 * Write a method to check if two texts are anagrams. The logic used here is as
 * follows:
 * Check if the lengths of the two texts are equal
 * Create an array to store the frequency of characters in the strings for the
 * two text
 * Find the frequency of characters in the two texts using the loop
 * Compare the frequency of characters in the two texts. If the frequencies are
 * not equal, return false
 * In the main function take user inputs, call user-defined methods, and
 * displays result.
 * 
 * 
 * Author: Dheeraj Buchha
 * Date: 27-09-2026
 */

import java.util.Scanner;

public class anagram {

    // Method to check if two texts are anagrams
    public static boolean checkAnagram(String text1, String text2) {

        if (text1.length() != text2.length()) {
            return false;
        }

        // Create frequency arrays for both texts
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
        }

        for (int i = 0; i < text2.length(); i++) {
            frequency2[text2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        boolean result = checkAnagram(text1, text2);

        System.out.println("Are the texts anagrams? " + result);
    }
}