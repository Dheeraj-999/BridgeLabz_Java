/*
 * Problem 11 - GCR Java Programming elements Level 1
WWrite a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number 2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___

 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class calculator {
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.print("Enter number1: ");
  double number1 = sc.nextDouble();

  System.out.print("Enter number2: ");

  double number2 = sc.nextDouble();

  double addition = number1 + number2;

  double subtraction = number1 - number2;

  double multiplication = number1 * number2;

  double division = number1 / number2;

  System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
          + number1 + " and " + number2 + " is "
          + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
         
         
         
          sc.close();
 }
}