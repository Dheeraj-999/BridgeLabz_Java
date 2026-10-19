package main.java.Lambda;

/*
 * Should clear all
 * email samples
 * provided separately
 * 
 * Author: Dheeraj Buchha
 */

import java.util.*;

public class UC9emailSamples {
    public static void main(String[] args) {

        List<String> emails = new ArrayList<>();

        emails.add("abc.xyz@bl.co.in");
        emails.add("john@gmail.com");
        emails.add("test@yahoo.com");

        System.out.println("Email samples: " + emails);

        emails.clear(); // Removes all email samples

        System.out.println("After clearing: " + emails);
    }
}
