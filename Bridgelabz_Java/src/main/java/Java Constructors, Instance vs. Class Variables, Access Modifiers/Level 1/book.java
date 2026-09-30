/*
 * Java Constructors, Instance vs. Class Variables, Access Modifiers , Level 1
 * Create a Book class with attributes title, author, and price. Provide both
 * default and parameterized constructors.
 * 
 * Author: Dheeraj Buchhha
 * Date: 28 september
 * 
 */

class Book {

    String title;
    String author;
    double price;

    // Default constructor
    Book() {

    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        // Using default constructor
        Book book1 = new Book();

        // Using parameterized constructor
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 399);

        System.out.println("Book 1:");
        book1.displayDetails();

        System.out.println("\nBook 2:");
        book2.displayDetails();
    }
}