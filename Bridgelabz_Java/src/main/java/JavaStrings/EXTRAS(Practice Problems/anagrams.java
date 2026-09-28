/*
 * Problem -11 GCR Java strings Extras
 * Write a Java program that accepts two strings from the user and checks if the
 * two
 * strings are anagrams of each other (i.e., whether they contain the same
 * characters in any
 * order).
 * 
 * 
 * Author: Dheeraj Buchha
 * Date: 28-09-2026
 */

import java.util.Scanner;

public class anagrams {
    public static boolean anagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("the strings are not anagram");
        }
        int[] freq = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter string 1: ");
        String str1 = sc.next();

        System.out.println("enter string 1: ");
        String str2 = sc.next();

        boolean result = anagram(str1, str2);
        if (anagram(str1, str2)) {
            System.out.println("the strings are anagram");
        } else {
            System.out.println("the strings are not anagram");

        }
    }
}
