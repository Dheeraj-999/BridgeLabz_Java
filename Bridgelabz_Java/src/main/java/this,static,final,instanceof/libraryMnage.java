/*
 * Sample Program 2: Library Management System
 * Create a Book class to manage library books with the following features:
 * Static:
 * A static variable libraryName shared across all books.
 * A static method displayLibraryName() to print the library name.
 * This:
 * Use this to initialize title, author, and isbn in the constructor.
 * Final:
 * Use a final variable isbn to ensure the unique identifier of a book cannot be
 * changed.
 * Instanceof:
 * Verify if an object is an instance of the Book class before displaying its
 * details.
 * 
 * Author: Dheeraj Buchhha
 * Date: 30 september
 * 
 */

class Book {

    static String libraryName;
    String title;
    String author;
    final String ISBN;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    static void displayLibraryName() {
        libraryName = "SRM Central";
    }

    void DisplayDetails() {
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("ISBN: " + ISBN);

    }

    public static void main(String[] args) {
        Book b1 = new Book("hindi", "babu", "32rewsr");
        Book b2 = new Book("telugu", "arjun", "45tr34d65");

        System.out.println("b1 details");
        if (b1 instanceof Book) {
            b1.DisplayDetails();
            b1.displayLibraryName();
        }

        if (b1 instanceof Book) {

            System.out.println("b2 details");
            b2.DisplayDetails();
            b2.displayLibraryName();
        }
    }

}