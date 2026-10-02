
// Problem 1: Library and Books (Aggregation)
//
// Create a Library class that contains multiple Book objects.
// The relationship between Library and Book is aggregation.
//
// A Library can have many Books,
// but a Book can exist independently without a Library.
//

import java.util.ArrayList;
import java.util.Scanner;

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    Library(String name) {
        this.name = name;
    }

    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {

        System.out.println("This is library " + name);

        for (Book book : books) {
            book.displayBook();
        }
    }

}

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("title: " + title + "by" + author);
    }

}

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Atomic habits", "James");
        Book book2 = new Book("Love", "Kalin");
        Book book3 = new Book("Chanakya niti", "Chanakya");

        Library library1 = new Library("City Library");
        Library library2 = new Library("Government library");

        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2);
        library2.addBook(book3);

        // displaying books

        library1.displayBooks();
        System.out.println();
        library2.displayBooks();

    }
}