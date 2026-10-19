/*
As a User need to
enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl
& co) and 2 optional (xyz & in) with
precise @ and . positions

Author: Dheeraj Buchha
*/

package main.java.Lambda;

import java.util.*;
import java.util.function.Predicate;

public class UC3ValidEmail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        // Lambda to validate email format
        Predicate<String> validEmail = e -> e
                .matches("^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$");

        // Check whether the email is valid
        if (validEmail.test(email)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }

        sc.close();
    }
}
