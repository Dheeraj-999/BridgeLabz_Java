/*
 * Java Class and Object, Level 1
 * Library Book System:
 * Create a Book class with attributes title, author, price,
 * and availability. Implement a method to borrow a book.
 *
 * Author: Dheeraj Buchhha
 * Date: 29 September
 */

class Book {

    String title;
    String author;
    double price;
    boolean availability;

    // Constructor
    Book(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow the book
    void borrowBook() {

        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    public static void main(String[] args) {

        Book book = new Book(
                "Atomic Habits",
                "James Clear",
                489,
                true);

        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Price: " + book.price);
        System.out.println("Available: " + book.availability);

        System.out.println();

        book.borrowBook();

        System.out.println("Available after borrowing: " + book.availability);

        System.out.println();
        System.out.println("Available: " + book.availability);

        // Trying to borrow the same book again
        book.borrowBook();
    }
}