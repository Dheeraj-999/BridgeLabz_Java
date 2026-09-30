/*
 * Java Constructor, Level 1
 * Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.

 * Author: Dheeraj Buchhha
 * Date: 29 september
 * 
 */

class Book {

    String title;
    String author;
    double price;

    Book() {
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book book1 = new Book();

        Book book2 = new Book("Atomic Habits", "Charlie", 489);

        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.price);

        System.out.println(book2.title);
        System.out.println(book2.author);
        System.out.println(book2.price);
    }

}