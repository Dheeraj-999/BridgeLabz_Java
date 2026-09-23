/*
 * Problem 2 - GCR Java Methods level 1
Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes

 * 
 * Author: Dheeraj Buchha
 * Date: 23-09-2026
 */

import java.util.Scanner;

public class handshakes {

    public static int maxHandshakes(int n) {
        return ((n * (n - 1)) / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of students: ");
        int students = sc.nextInt();

        int maximumHandshakes = maxHandshakes(students);

        System.out.print("The max Handshakes are " + maximumHandshakes);
        sc.close();
    }

}