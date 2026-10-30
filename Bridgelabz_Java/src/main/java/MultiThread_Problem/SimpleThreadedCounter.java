package main.java.MultiThread_Problem;

/*
Problem Statement 1: "Simple Threaded Counter
Background:
You are tasked with creating a simple threaded counter program that counts from 1 to a
specified limit concurrently using multiple threads.
Requirements:
User Input: Prompt the user to input an integer representing the counting limit.
Threaded Counting: Create a Java program that uses multiple threads to count from 1 to the
specified limit. Each thread should be responsible for counting a portion of the range.
Thread Coordination: Implement a mechanism to ensure that the threads execute in a
synchronized manner to maintain the correct counting order.
Output: Print the count of each thread to the console, and ensure that the overall count from 1
to the specified limit is accurate.
Error Handling: Implement basic error handling to handle invalid user inputs or unexpected
issues during execution.
Deliverables: Provide a well-documented Java implementation of the threaded counter
program. Include a brief explanation of the program's functionality and any challenges faced
during implementation.

Dheeraj Buchha
*/

import java.util.Scanner;

class Counter {
    private int count = 1;
    private int limit;

    Counter(int limit) {
        this.limit = limit;
    }

    public synchronized void printCount() {
        while (count <= limit) {
            System.out.println(Thread.currentThread().getName() + ": " + count);
            count++;
            notifyAll();

            try {
                if (count <= limit) {
                    wait();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        notifyAll();
    }
}

public class SimpleThreadedCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter counting limit: ");
            int limit = sc.nextInt();

            if (limit <= 0) {
                System.out.println("Enter a positive number.");
                return;
            }

            Counter counter = new Counter(limit);

            // Three threads share the same counter.
            Thread t1 = new Thread(counter::printCount, "Thread 1");
            Thread t2 = new Thread(counter::printCount, "Thread 2");
            Thread t3 = new Thread(counter::printCount, "Thread 3");

            t1.start();
            t2.start();
            t3.start();

            t1.join();
            t2.join();
            t3.join();

            System.out.println("Counting completed!");

        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            sc.close();
        }
    }
}
