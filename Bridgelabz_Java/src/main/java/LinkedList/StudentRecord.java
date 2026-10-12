/*
Problem Statement: Create a program to manage student records using a singly linked list. Each node will store information about a student, including their Roll Number, Name, Age, and Grade. Implement the following operations:
Add a new student record at the beginning, end, or at a specific position.
Delete a student record by Roll Number.
Search for a student record by Roll Number.
Display all student records.
Update a student's grade based on their Roll Number.
Hint:
Use a singly linked list where each node contains student information and a pointer to the next node.
The head of the list will represent the first student, and the last node’s next pointer will be null.
Update the next pointers when inserting or deleting nodes.

Author:Dheeraj Buchha
*/

import java.util.Scanner;

class Node {
    int roll;
    String name;
    int age;
    char grade;
    Node next;

    Node(int roll, String name, int age, char grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentList {

    Node head = null;

    void addFirst(int roll, String name, int age, char grade) {

        Node newNode = new Node(roll, name, age, grade);

        newNode.next = head;
        head = newNode;
    }

    // adding at last position

    void addLast(int roll, String name, int age, char grade) {

        Node newNode = new Node(roll, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // adding at position

    void addAtPosition(int position, int roll, String name, int age, char grade) {

        Node newNode = new Node(roll, name, age, grade);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    void delete(int roll) { // delete in LL

        if (head == null) {
            return;
        }

        if (head.roll == roll) {
            head = head.next;
            return;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.roll == roll) {
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }

        System.out.println("Student not found");
    }

    void search(int roll) { // search in LL

        Node current = head;

        while (current != null) {

            if (current.roll == roll) {
                System.out.println("Student found: " + current.name);
                return;
            }

            current = current.next;
        }

        System.out.println("Student not found");
    }

    void updateGrade(int roll, char newGrade) { // method to upgrade

        Node current = head;

        while (current != null) {

            if (current.roll == roll) {
                current.grade = newGrade;
                System.out.println("Grade updated");
                return;
            }

            current = current.next;
        }

        System.out.println("Student not found");
    }

    void display() { // too display

        Node current = head;

        while (current != null) {

            System.out.println(
                    current.roll + " " + current.name + " " + current.age + " " + current.grade);

            current = current.next;
        }
    }

}

public class StudentRecord {

    public static void main(String[] args) {

        StudentList list = new StudentList();

        list.addFirst(101, "Rahul", 20, 'A');
        list.addLast(102, "Amit", 21, 'B');
        list.addLast(103, "Ravi", 20, 'C');

        list.display();

        list.search(102);

        list.updateGrade(103, 'A');

        list.delete(102);

        System.out.println("After deletion:");
        list.display();
    }
}