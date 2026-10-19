/*
 * As a User need to
 * follow pre-defined
 * Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10
 * digit number
 * 
 * Author: Dheeraj Buchha
 */

import java.util.*;
import java.util.function.Predicate;

public class UC4MobileFormat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mobile Number (91 9919819801): ");
        String mobile = sc.nextLine();

        // Lambda to validate country code and 10-digit number
        Predicate<String> validMobile = m -> m.matches("91 [0-9]{10}");

        // Check whether the mobile format is valid
        if (validMobile.test(mobile)) {
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }

        sc.close();
    }
}
