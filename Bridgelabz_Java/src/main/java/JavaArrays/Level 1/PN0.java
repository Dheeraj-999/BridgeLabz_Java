/*
 * Problem 2 - GCR Java Arrays Level 1
 Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less

 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;
public class PN0{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number[] = new int[5];

        for(int i=0;i<5;i++){
            System.out.println("Enter number "+ (i+1) );
            number[i] = sc.nextInt();
        }

        for(int i=0;i<number.length;i++){
            if(number[i]>0){
              if(number[i] %2==0){
                    System.out.println("Number "+number[i] +" is positive and" );
                     System.out.println("Number is even" );
              }else{
                   System.out.println("Number "+number[i] +" is positive and"  );
                    System.out.println("Number is odd" );

              }

            } else if(number[i]<0){
             System.out.println("Number "+number[i] +" is negative"  );

            }else{
             System.out.println("Number "+number[i] +" is zero ");
      
            }
        }

        if(number[0]==number[number.length-1]){
              System.out.println("First and last element are equal" );
        }else if(number[0]>number[number.length-1]){
              System.out.println("First element is greater than last element" );
        }else{
              System.out.println("First element is lesser than last element" );
        }
        sc.close();
    }
}