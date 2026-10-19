/*
As a User need to
enter a valid First
Name
- First name starts with Cap and has
minimum 3 characters

Author: Dheeraj Buchha
*/

import java.util.*;
import java.util.function.Predicate;

public class UC1FirstName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String name = sc.nextLine();

        // Lambda to validate first name
        Predicate<String> validName = n -> n.matches("[A-Z][a-zA-Z]{2,}");

        // Check whether the name is valid
        if (validName.test(name)) {
            System.out.println("Valid First Name");
        } else {
            System.out.println("Invalid First Name");
        }

        sc.close();
    }
}