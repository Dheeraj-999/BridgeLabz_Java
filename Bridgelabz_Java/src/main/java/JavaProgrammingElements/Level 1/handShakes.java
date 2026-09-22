/*
 * Problem 16- GCR Java Programming elements Level 1
Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.


 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;
public class handShakes {
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.print("Enter number of students: ");
  
  int numberOfStudents = sc.nextInt();

  int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

  System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + handshakes);
sc.close();


}
}