/*
Problem 12- GCR Java Programming elements Level 2
Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => Simple Interest = Principal * Rate * Time / 100
I/P => principal, rate, time
O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___
/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are ___

* Author: Dheeraj Buchha
 * Date: 22-09-2026
*/

import java.util.Scanner;
public class convertWeight {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

  System.out.print("Enter weight in pound: ");

  double weight = sc.nextDouble();
  double kg = weight / 2.2;

System.out.println("The weight of the person in pound is " + weight + " and in kg is " + kg);
sc.close();
}
}