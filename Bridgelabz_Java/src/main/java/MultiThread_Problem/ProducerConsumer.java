package main.java.MultiThread_Problem;

/*
 * Problem Statement 2: Producer-Consumer with Shared Resource
 * Background:
 * You are asked to implement a simple producer-consumer program where one
 * thread generates
 * tasks (producers), and another thread processes these tasks (consumers) using
 * a shared
 * resource.
 * Requirements:
 * Task Generation:
 * Create a producer thread that generates tasks, where each task is represented
 * by a simple
 * integer value.
 * Task Processing:
 * Implement a consumer thread that processes tasks by consuming them from a
 * shared resource
 * (e.g., a shared queue).
 * Shared Resource:
 * 
 * Design a shared resource (e.g., a shared queue) that facilitates
 * communication between the
 * producer and consumer threads.
 * Thread Coordination:
 * Ensure proper synchronization between the producer and consumer threads to
 * avoid race
 * conditions or conflicts over the shared resource.
 * Output:
 * Print messages to the console indicating when a task is produced and when it
 * is consumed.
 * Error Handling:
 * Implement basic error handling to handle unexpected issues during execution.
 * Deliverables:
 * Provide a well-documented Java implementation of the producer-consumer
 * program with a
 * shared resource.
 * Include a brief explanation of the program's functionality and any challenges
 * faced during
 * implementation.
 * 
 * Dheeraj Buchha
 */

import java.util.LinkedList;
import java.util.Queue;

class SharedResource {
    Queue<Integer> queue = new LinkedList<>();

    public synchronized void produce(int value) throws InterruptedException {
        queue.add(value);
        System.out.println("Produced: " + value);
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }

        int value = queue.poll();
        System.out.println("Consumed: " + value);
        notifyAll();
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Producer generates five tasks.
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    resource.produce(i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer processes five tasks.
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    resource.consume();
                    Thread.sleep(700);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
