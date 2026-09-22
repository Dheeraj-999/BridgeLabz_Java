/*
 * Problem 12- GCR Java Programming elements Level 1
Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___


 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class Triangle {
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.print("Enter base in cm: ");

  double base = sc.nextDouble();

  System.out.print("Enter height in cm: ");

  double height = sc.nextDouble();


  double areaCm = 0.5 * base * height;
  
  double areaInches = areaCm / 6.4516;

  System.out.println("The area of triangle is " + areaCm + " square centimeters and " + areaInches + " square inches");
sc.close(); 
}
}