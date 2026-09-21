
/*
Problem 9 - GCR Control Flow Level 1
Rewrite program 8 to do the countdown using the for-loop


* Author: Dheeraj Buchha
* Date: 21-09-2026
*/

import java.util.Scanner;

public class forLoopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter counter: ");
        int counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(counter);
            counter--;

        }
        sc.close();
    }

}
