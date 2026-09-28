
/*
 * Problem - 9 GCR Java strings Extras
 * Most Frequent character
 * 
 * Author: Dheeraj Buchha
 * Date: 28-09-2026
 */

import java.util.Scanner;

public class mostFrequent {

    static char findMostFrequent(String str) {

        int[] frequency = new int[256];

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        char mostFrequent = str.charAt(0);

        int max = frequency[mostFrequent];

        // Find character with maximum frequency
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (frequency[ch] > max) {
                max = frequency[ch];
                mostFrequent = ch;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char result = findMostFrequent(str);

        System.out.println("Most Frequent Character: " + result);
    }
}