class Node {

    String bookTitle;
    String author;
    String genre;
    int bookId;
    boolean available;

    Node prev;
    Node next;

    Node(String bookTitle, String author, String genre,
         int bookId, boolean available) {

        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.available = available;
    }
}


class Library {

    Node head = null;
    Node tail = null;


    // 1. Add at beginning
    void addFirst(String bookTitle, String author, String genre,
                  int bookId, boolean available) {

        Node newNode = new Node(bookTitle, author, genre,
                                bookId, available);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        newNode.prev = null;

        head.prev = newNode;
        head = newNode;
    }


    // 2. Add at end
    void addLast(String bookTitle, String author, String genre,
                 int bookId, boolean available) {

        Node newNode = new Node(bookTitle, author, genre,
                                bookId, available);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;

        tail = newNode;
    }


    // 3. Add at specific position
    void addMiddle(int position, String bookTitle, String author,
                   String genre, int bookId, boolean available) {

        if (position == 1) {
            addFirst(bookTitle, author, genre, bookId, available);
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

        Node newNode = new Node(bookTitle, author, genre,
                                bookId, available);

        Node temp = current.next;

        current.next = newNode;
        newNode.prev = current;

        newNode.next = temp;

        if (temp != null) {
            temp.prev = newNode;
        } else {
            tail = newNode;
        }
    }


    // 4. Remove book by Book ID
    void removeBook(int bookId) {

        Node current = head;

        while (current != null) {

            if (current.bookId == bookId) {

                // If removing head
                if (current == head) {

                    head = current.next;

                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null;
                    }

                    return;
                }

                // If removing tail
                if (current == tail) {

                    tail = current.prev;
                    tail.next = null;

                    return;
                }

                // Removing middle node
                current.prev.next = current.next;
                current.next.prev = current.prev;

                return;
            }

            current = current.next;
        }

        System.out.println("Book not found");
    }


    // 5. Search by Book Title or Author
    void searchBook(String title, String author) {

        Node current = head;

        while (current != null) {

            if (current.bookTitle.equals(title) ||
                current.author.equals(author)) {

                System.out.println("Book Found:");
                displayBook(current);
            }

            current = current.next;
        }
    }


    // 6. Update Availability Status
    void updateAvailability(int bookId, boolean status) {

        Node current = head;

        while (current != null) {

            if (current.bookId == bookId) {

                current.available = status;

                System.out.println("Availability updated");
                return;
            }

            current = current.next;
        }

        System.out.println("Book not found");
    }


    // Display one book
    void displayBook(Node current) {

        System.out.println("Book ID: " + current.bookId);
        System.out.println("Title: " + current.bookTitle);
        System.out.println("Author: " + current.author);
        System.out.println("Genre: " + current.genre);
        System.out.println("Available: " + current.available);
        System.out.println();
    }


    // 7. Display Forward
    void displayForward() {

        Node current = head;

        while (current != null) {

            displayBook(current);

            current = current.next;
        }
    }


    // 8. Display Reverse
    void displayBackward() {

        Node current = tail;

        while (current != null) {

            displayBook(current);

            current = current.prev;
        }
    }


    // 9. Count total books
    int countBooks() {

        int count = 0;

        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
}


public class LibraryManagement {

    public static void main(String[] args) {

        Library library = new Library();


        // Add books
        library.addFirst(
                "Harry Potter",
                "J.K Rowling",
                "Fantasy",
                101,
                true
        );

        library.addLast(
                "Atomic Habits",
                "James Clear",
                "Self Help",
                102,
                true
        );

        library.addLast(
                "The Alchemist",
                "Paulo Coelho",
                "Fiction",
                103,
                false
        );

        library.addMiddle(
                2,
                "Clean Code",
                "Robert Martin",
                "Programming",
                104,
                true
        );


        System.out.println("===== FORWARD =====");
        library.displayForward();


        System.out.println("===== BACKWARD =====");
        library.displayBackward();


        System.out.println("===== SEARCH =====");
        library.searchBook("Clean Code", "Robert Martin");


        System.out.println("===== UPDATE =====");
        library.updateAvailability(103, true);


        System.out.println("===== REMOVE =====");
        library.removeBook(102);


        System.out.println("===== AFTER REMOVE =====");
        library.displayForward();


        System.out.println("Total Books: " + library.countBooks());
    }
}