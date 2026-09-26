/*
Problem 7- GCR Java strings Level 2
Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result


* Author: Dheeraj Buchha
 * Date: 26-09-2026
*/

import java.util.Scanner;

public class trimPart {

    public static int[] trimming(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[] { start, end };
    }

    public static String createSubbstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) { // main function

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        int arr[] = new int[2];

        arr = trimming(str);

        String result = createSubbstring(str, arr[0], arr[1]);

        System.out.println(result);
        sc.close();
    }

}