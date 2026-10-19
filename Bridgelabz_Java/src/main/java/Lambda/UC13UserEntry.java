package main.java.Lambda;

/*
 * Refactor the Code to
 * use Lambda Function
 * to validate User Entry
 * - Use Lambda Function to validate First
 * Name, Last Name, Email, Mobile, and
 * Password
 * 
 * Author: Dheeraj Buchha
 */

import java.util.*;
import java.util.function.Predicate;

public class UC13UserEntry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lambda to validate first name and last name

        Predicate<String> validName = n -> n.matches("[A-Z][a-zA-Z]{2,}");

        // Lambda to validate email format
        Predicate<String> validEmail = e -> e
                .matches("^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$");

        // Lambda to validate mobile number
        Predicate<String> validMobile = m -> m.matches("91 [0-9]{10}");

        // Lambda to validate all password rules
        Predicate<String> validPassword = p -> p.length() >= 8 &&
                p.matches(".*[A-Z].*") &&
                p.matches(".*[0-9].*") &&
                p.matches("[A-Za-z0-9]*[^A-Za-z0-9][A-Za-z0-9]*");

        System.out.print("Enter First Name: ");
        System.out.println(validName.test(sc.nextLine()) ? "Valid" : "Invalid");

        System.out.print("Enter Last Name: ");
        System.out.println(validName.test(sc.nextLine()) ? "Valid" : "Invalid");

        System.out.print("Enter Email: ");
        System.out.println(validEmail.test(sc.nextLine()) ? "Valid" : "Invalid");

        System.out.print("Enter Mobile (91 9919819801): ");
        System.out.println(validMobile.test(sc.nextLine()) ? "Valid" : "Invalid");

        System.out.print("Enter Password: ");
        System.out.println(validPassword.test(sc.nextLine()) ? "Valid" : "Invalid");

        sc.close();
    }
}