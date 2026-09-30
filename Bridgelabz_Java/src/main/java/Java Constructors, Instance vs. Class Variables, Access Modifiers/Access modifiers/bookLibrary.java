/*
 * Problem 2: Book Library System
 
Author:Dheeraj Buchhha
Date: 29 sept
*/

class Book {

    public String ISBN;
    protected String title;
    private String author;

    // Method to set author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to get author
    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {

        Book book = new Book();

        book.ISBN = "978-1234567890";
        book.title = "Atomic Habits";
        book.setAuthor("James Clear");

        System.out.println("ISBN: " + book.ISBN);
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.getAuthor());

        // Subclass
        class EBook extends Book {

            void displayDetails() {
                System.out.println();

                System.out.println("Inside EBook:");
                System.out.println("ISBN: " + ISBN);
                System.out.println("Title: " + title);
            }
        }

        EBook ebook = new EBook();

        ebook.ISBN = "978-9876543210";
        ebook.title = "Java Programming";

        ebook.displayDetails();
    }
}