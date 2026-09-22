/*
 * Problem 13- GCR Java Programming elements Level 1
Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____


 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;
public class square {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter perimeter of square: ");
  
  double perimeter = sc.nextDouble();

  double side = perimeter / 4;

  System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
  sc.close();
 }
}