/*Sample Problem 1: Library Management with Books and Authors
 */

import java.util.Scanner;

class Book {
    String title;
    int pubYear;

    Book(String title, int pubYear) {
        this.title = title;
        this.pubYear = pubYear;
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int pubYear, String name, String bio) {
        super(title, pubYear);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("The Book name is: " + super.title);
        System.out.println("The Author name is " + this.name);
        System.out.println("The Author name is " + super.pubYear);
        System.out.println("bio " + this.bio);

    }
}

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book("Atomic Habits", 2018);

        Author author1 = new Author("Atomic Habits", 2018, "James", "How to be 1 percent better every day");

        author1.displayInfo();
    }
}