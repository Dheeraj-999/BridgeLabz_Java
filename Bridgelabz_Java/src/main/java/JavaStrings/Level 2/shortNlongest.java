/*
 * Problem -4 GCR Java strings Level 2
 * Write a program to split the text into words and find the shortest and
 * longest strings in a given text
 * Hint =>
 * Take user input using the Scanner nextLine() method
 * Create a Method to split the text into words using the charAt() method
 * without using the String built-in split() method and return the words.
 * Create a method to find and return a string's length without using the
 * length() method.
 * Create a method to take the word array and return a 2D String array of the
 * word and its corresponding length. Use String built-in function
 * String.valueOf() to generate the String value for the number
 * Create a Method that takes the 2D array of word and corresponding length as
 * parameters, find the shortest and longest string and return them in an 1D int
 * array.
 * The main function calls the user-defined methods and displays the result.
 * 
 * 
 * Author: Dheeraj Buchha
 * Date: 26-09-2026
 */

import java.util.Arrays;
import java.util.Scanner;

public class shortNlongest {

    public static int findLength(String str) {

        int count = 0; // finding all the characters including space
        try {
            while (true) {
                str.charAt(count); // charAt takes each character in string and make it count++
                count++;
            }
        } catch (RuntimeException e) { // it will return runtime exception after count is more than the length
            System.out.println("Runtime Exception occurred"); // printing if error comes
        }
        return count;
    }

    public static String[] splitingText(String str) {

        int len = findLength(str); // finding number of words
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int storeIndex[] = new int[wordCount - 1]; // making a array to store gaps index form the sentence
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                storeIndex[index] = i;
                index++;
            }
        }

        String[] words = new String[wordCount]; // making another array to store substring i.e each word in the sentence
        int start = 0;
        for (int i = 0; i < storeIndex.length; i++) {
            int end = storeIndex[i];

            words[i] = str.substring(start, end);
            start = end + 1;
        }
        words[wordCount - 1] = str.substring(start, len);
        return words;
    }

    public static String[][] wordAndLength(String[] words) { // making 2d string array
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];

            int length = findLength(words[i]);

            result[i][1] = String.valueOf(length);
        }
        return result;
    }

    // calculating small and longest number
    public static int[] calsmallNlargest(String[][] result) {
        int[] arr = new int[2];

        for (int i = 0; i < result.length - 1; i++) {
            int shortest = Integer.parseInt(result[i][1]);
            if (Integer.parseInt(result[i + 1][1]) < Integer.parseInt(result[i][1])) {
                shortest = Integer.parseInt(result[i + 1][1]);
            }
            arr[0] = shortest;

        }

        for (int i = 0; i < result.length - 1; i++) {
            int largest = Integer.parseInt(result[i][1]);
            if (Integer.parseInt(result[i + 1][1]) > Integer.parseInt(result[i][1])) {
                largest = Integer.parseInt(result[i + 1][1]);
            }
            arr[1] = largest;

        }
        return arr;
    }

    public static void main(String[] args) { // main function

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        String[] result1 = splitingText(str); // by user method

        String[][] result = wordAndLength(result1);

        int arr[] = new int[2];
        arr = calsmallNlargest(result);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}