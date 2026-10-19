package main.java.Lambda;

/*
 * Rule2
 * 
 * – Should
 * have at least 1
 * Upper Case - NOTE – All rules must be passed
 * 
 * Author: Dheeraj Buchha
 */

import java.util.*;
import java.util.function.Predicate;

public class UC6UpperCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Lambda checks minimum 8 characters and 1 uppercase letter
        Predicate<String> validPassword = p -> p.length() >= 8 && p.matches(".*[A-Z].*");

        // Both rules must pass
        if (validPassword.test(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        sc.close();
    }
}
