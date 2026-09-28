
/*
 * Problem -1 GCR Java strings Extras
 * 1. Count Vowels and Consonants
 * Problem:
 * Write a Java program to count the number of vowels and consonants in a given
 * string.
 * 
 * Author: Dheeraj Buchha
 * Date: 28-09-2026
 */

import java.util.Scanner;

public class countVowels {

    static void countVowelsConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z')) {

                if (ch == 'a' || ch == 'e' || ch == 'i' || // checking weather all the characters are vowels??
                        ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' ||
                        ch == 'O' || ch == 'U') {

                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        countVowelsConsonants(str);
    }
}