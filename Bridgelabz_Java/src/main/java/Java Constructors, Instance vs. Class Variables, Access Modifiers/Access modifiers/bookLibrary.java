/*
 * Problem 2: Book Library System
 
Author:Dheeraj Buchhha
Date: 29 sept
*/

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public void setauthor(String author) {
        this.author = author;
    }

    public String getauthor() {
        return author;
    }

    public static void main(String[] args) {
        Book book1 = new Book();

        book1.ISBN = "A89IY67";
        book1.title = "Ayudha";
        book1.setauthor("James");

        System.out.println("ISBN number: " + book1.ISBN);
        System.out.println("Name: " + book1.title);
        System.out.println("CGPA: " + book1.getauthor());

        EBook ebook = new EBook();

        ebook.ISBN = "908rt67";
        ebook.title = "Java";

        System.out.println("Ebook details");
        ebook.displayDetails();
    }
}

class EBook extends Book {

    void displayDetails() {
        System.out.println();
        System.out.println("isbn" + ISBN);
        System.out.println("title" + title);

    }
}