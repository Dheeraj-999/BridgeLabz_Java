/*
 * Problem 3 - GCR Java Methods level 1
Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.

 * 
 * Author: Dheeraj Buchha
 * Date: 23-09-2026
 */

import java.util.Scanner;

public class handshakestwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of students: ");
        int n = sc.nextInt();

        int maximumHandshakes = (n * (n - 1)) / 2;

        System.out.print("The max Handshakes are " + maximumHandshakes);
        sc.close();
    }

}