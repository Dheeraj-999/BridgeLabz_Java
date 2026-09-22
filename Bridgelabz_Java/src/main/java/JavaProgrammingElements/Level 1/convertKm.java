/*
 * Problem 8 - GCR Java Programming elements Level 1
Create a program to convert distance in kilometers to miles.
Hint => 
Create a variable km and assign type as double as in double km;
Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
Use Scanner Object to take user input for km as in km = input.nextInt();
Use 1 mile = 1.6 km formulae to calculate miles and show the output


 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class convertKm {
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);


  
  System.out.print("Enter distance in km: ");
  
  double km = sc.nextDouble();

  double miles = km / 1.6;

  System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
 sc.close();
}
}