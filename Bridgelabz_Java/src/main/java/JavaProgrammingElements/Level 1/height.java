/*
 * Problem 10 - GCR Java Programming elements Level 1
Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___


 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class height {
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter your height in cm: ");
 
  double height = sc.nextDouble();

  double totalInches = height / 2.54;

  int feet = (int)(totalInches / 12);

  double inches = totalInches % 12;

  
  System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + inches);
sc.close(); 
}
}
