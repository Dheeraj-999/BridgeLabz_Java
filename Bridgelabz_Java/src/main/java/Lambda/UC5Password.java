package main.java.Lambda;

/*
 * As a User need to
 * follow pre
 * 
 * -defined
 * 
 * Password rules.
 * Rule1
 * 
 * – minimum 8
 * 
 * Characters - NOTE – All rules must be passed
 * 
 * Author: Dheeraj
 */

import java.util.*;
import java.util.function.Predicate;

public class UC5Password {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        Predicate<String> validPassword = p -> p.length() >= 8;

        // Check whether the password passes Rule 1
        if (validPassword.test(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        sc.close();
    }
}