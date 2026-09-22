/*
Problem 14 - GCR Java Programming elements Level 1
Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___


 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;
public class Distance {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter distance in feet: ");
  double distanceInFeet = sc.nextDouble();

  double yards = distanceInFeet / 3;

  double miles = yards / 1760;

  System.out.println("The distance in feet is " + distanceInFeet + " while in yards is " + yards + " and miles is " + miles);
  
  
  
  sc.close();
 }
}