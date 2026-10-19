package main.java.Lambda;

/*
 * Rule3
 * 
 * – Should
 * have at least 1
 * numeric number in
 * the password - NOTE – All rules must be passed
 * 
 * Author: Dheeraj Buchha
 */

import java.util.*;
import java.util.function.Predicate;

public class UC7NumericNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Lambda checks all 3 password rules
        Predicate<String> validPassword = p -> p.length() >= 8 &&
                p.matches(".*[A-Z].*") &&
                p.matches(".*[0-9].*");

        // All rules must pass
        if (validPassword.test(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        sc.close();
    }
}
