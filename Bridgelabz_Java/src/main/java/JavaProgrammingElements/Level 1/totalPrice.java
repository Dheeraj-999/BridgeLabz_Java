/*
Problem 15 - GCR Java Programming elements Level 1
Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___


 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;
public class totalPrice {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter unit price: ");

  double unitPrice = sc.nextDouble();

  System.out.print("Enter quantity: ");

  int quantity = sc.nextInt();

  double totalPrice = unitPrice * quantity;

  
  System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
 

sc.close();
}
}