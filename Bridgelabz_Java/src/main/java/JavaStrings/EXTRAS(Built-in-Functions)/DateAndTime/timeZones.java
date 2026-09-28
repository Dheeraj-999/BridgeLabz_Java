/*
 * Problem -1 GCR Built-in-function practice problem
 * Write a Java program that accepts two strings from the user and checks if the
 * two
 * strings are anagrams of each other (i.e., whether they contain the same
 * characters in any
 * order).
 * 
 * 
 * Author: Dheeraj Buchha
 * Date: 28-09-2026
 */

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class timeZones {

    public static void main(String[] args) {

        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("GMT: " + gmt);
        System.out.println("IST: " + ist);
        System.out.println("PST: " + pst);
    }
}