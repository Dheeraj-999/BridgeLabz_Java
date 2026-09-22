/*
 * Problem 9- GCR Java Programming elements Level 1
Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
O/P => The discount amount is INR ___ and final discounted fee is INR ___


 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class studentFee {
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.print("Enter fee: ");

  double fee = sc.nextDouble();

  System.out.print("Enter discount percentage: ");
  
  double discountPercent = sc.nextDouble();

  double discount = (fee * discountPercent) / 100;
  double finalFee = fee - discount;


  System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
sc.close(); 
}
}