/*
 * Problem -10 GCR Java strings Extras
 * 10. Remove a Specific Character from a String
 * 
 * Author: Dheeraj Buchha
 * Date: 28-09-2026
 */

import java.util.Scanner;

public class removeSpecificChar {

    static String removeCharacter(String str, char remove) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != remove) {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char remove = sc.next().charAt(0);

        String result = removeCharacter(str, remove);

        System.out.println("Modified String: " + result);
    }
}