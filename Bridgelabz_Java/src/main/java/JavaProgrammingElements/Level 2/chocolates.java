/*
Problem 10- GCR Java Programming elements Level 2
ACreate a program to divide N number of chocolates among M children.
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Find the number of chocolates each child gets and number of remaining chocolates
Display the results
I/P => numberOfchocolates, numberOfChildren
O/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are ___

* Author: Dheeraj Buchha
 * Date: 22-09-2026
*/

import java.util.Scanner;
public class chocolates {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter number of chocolates: ");
  
int numberOfChocolates = sc.nextInt();

System.out.print("Enter number of children: ");
  int numberOfChildren = sc.nextInt();

  int chocolatesEach = numberOfChocolates / numberOfChildren;
  
int remaining = numberOfChocolates % numberOfChildren;

  System.out.println("The number of chocolates each child gets is "+ chocolatesEach + " and the number of remaining chocolates are " + remaining);
  sc.close();
 }
}