/*
 * Problem 7 - GCR Java arrays Level 1
Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
Hint => 
Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index


 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;
public class oddEven{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a natural number: ");
 int number=sc.nextInt();
        

        int oddArr[] =new int[(number /2) + 1];
        int evenArr[] =new int[(number /2) + 1];
        int oddIndex=0;
        int evenIndex=0;

        for(int i=0;i<number;i++){
            if((i+1) % 2==0){
                evenArr[evenIndex]=i+1;
                evenIndex++;
            }else{
                oddArr[oddIndex]=i+1;
                oddIndex++;
            }
        }

        System.out.println("even numbers:");
        for(int i=0;i<evenIndex;i++){
            System.out.println(evenArr[i]+" ");
        }

        System.out.println("Odd numbers:");
        for(int i=0;i<oddIndex;i++){
            System.out.println(oddArr[i]+" ");
        }

       
sc.close();
    }
}