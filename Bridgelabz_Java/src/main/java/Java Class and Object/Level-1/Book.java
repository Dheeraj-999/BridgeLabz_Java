/*
 * Java Classes and Objects , Level 1
 * Program to Handle Book Details
 * Problem Statement: Write a program to create a Book class with attributes
 * title, author, and price. Add a method to display the book details.
 * 
 * Author: Dheeraj Buchhha
 * Date: 28 september
 * 
 */

public class Book {
    String title;
    String author;
    double price;

    public void display() {
        System.out.println("The title of the book is : " + title);
        System.out.println("The author of the book is : " + author);

        System.out.println("The price of the book is : " + price);

    }

    public static void main(String[] args) {
        Book book = new Book();

        book.title = "The nature";
        book.author = "Chetan Bhagat";
        book.price = 799;

        book.display();

    }

}