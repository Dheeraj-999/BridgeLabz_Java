/*
As a User need to
enter a valid Last
Name
- Last name starts with Cap and has
minimum 3 characters

Author:Dheeraj Buchha

*/

import java.util.*;
import java.util.function.Predicate;

public class UC2LastName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Name: ");
        String name = sc.nextLine();

        // Lambda to validate last name
        Predicate<String> validName = n -> n.matches("[A-Z][a-zA-Z]{2,}");

        // Check whether the last name is valid
        if (validName.test(name)) {
            System.out.println("Valid Last Name");
        } else {
            System.out.println("Invalid Last Name");
        }

        sc.close();
    }
}