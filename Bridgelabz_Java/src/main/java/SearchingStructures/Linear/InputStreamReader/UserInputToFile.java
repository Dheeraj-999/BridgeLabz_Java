/*
InputStreamReader Problem 2: Read User Input and Write to File Using InputStreamReader
Problem:
Write a program that uses InputStreamReader to read user input from the console and write the input to a file. Each input should be written as a new line in the file.
Approach:
Create an InputStreamReader to read from System.in (the console).
Wrap the InputStreamReader in a BufferedReader for efficient reading.
Create a FileWriter to write to the file.
Read user input using readLine() and write the input to the file.
Repeat the process until the user enters "exit" to stop inputting.
Close the file after the input is finished.

Author: Dheeraj Buchha
*/

package main.java.SearchingStructures.Linear.InputStreamReader;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        FileWriter fw = new FileWriter("output.txt");

        String line;

        System.out.println("Enter text (type exit to stop):");

        while ((line = br.readLine()) != null) {

            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            fw.write(line + "\n");
        }

        fw.close();
        System.out.println("Input saved to output.txt");
    }
}
