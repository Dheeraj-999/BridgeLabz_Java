/*
 * Problem -11 GCR Java strings Extras
 * Write a replace method in Java that replaces a given word with another word
 * in a
 * sentence:
 * 
 * Author: Dheeraj Buchha
 * Date: 28-09-2026
 */

import java.util.Scanner;

public class replace {

    static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = sentence.replace(oldWord, newWord);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter replacement word: ");
        String newWord = sc.nextLine();

        String result = replaceWord(sentence, oldWord, newWord);

        System.out.println("Modified sentence: " + result);
    }
}