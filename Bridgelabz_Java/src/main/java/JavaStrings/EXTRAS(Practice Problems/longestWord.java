
/*
 * Problem -5 GCR Java strings Extras
 5. Find the Longest Word in a Sentence
Problem:
Write a Java program that takes a sentence as input and returns the longest word in the
sentence.

 * Author: Dheeraj Buchha
 * Date: 28-09-2026
 */

import java.util.Scanner;

public class longestWord {

    static String findLongestWord(String str) {
        String[] words = str.split(" "); // gives all the strings from thhe text

        String longest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i]; // update longest
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String result = findLongestWord(str);

        System.out.println("Longest word: " + result);
    }
}