/*
Problem Statement: Design an undo/redo functionality for a text editor using a doubly linked list. Each node represents a state of the text content (e.g., after typing a word or performing a command). Implement the following:
Add a new text state at the end of the list every time the user types or performs an action.
Implement the undo functionality (revert to the previous state).
Implement the redo functionality (revert back to the next state after undo).
Display the current state of the text.
Limit the undo/redo history to a fixed size (e.g., last 10 states).
Hint:
Use a doubly linked list where each node represents a state of the text.
The next pointer will represent the forward history (redo), and the prev pointer will represent the backward history (undo).
Keep track of the current state and adjust the next and prev pointers for undo/redo operations.

Author: Dheeraj Buchha
*/
class Node {
    String text;
    Node prev;
    Node next;

    Node(String text) {
        this.text = text;
    }
}

class TextEditor {
    Node head;
    Node tail;
    Node current;

    int count = 0;
    int maxHistory = 10;

    // Add new text state
    void addState(String text) {

        Node newNode = new Node(text);

        // First state
        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
            count++;
            return;
        }

        // If we are after undo,
        // remove the redo history
        current.next = null;
        tail = current;

        // Add new state
        current.next = newNode;
        newNode.prev = current;

        current = newNode;
        tail = newNode;

        count++;

        // Keep only last 10 states
        if (count > maxHistory) {
            head = head.next;
            head.prev = null;
            count--;
        }
    }

    // Undo
    void undo() {
        if (current == head) {
            System.out.println("Nothing to undo");
            return;
        }

        current = current.prev;
        System.out.println("Undo performed");
    }

    // Redo
    void redo() {
        if (current == tail || current.next == null) {
            System.out.println("Nothing to redo");
            return;
        }

        current = current.next;
        System.out.println("Redo performed");
    }

    // Display current text
    void displayCurrent() {
        System.out.println("Current Text: " + current.text);
    }

    // Display all history
    void displayHistory() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.text);
            temp = temp.next;
        }
    }
}

public class UndoRedoEditor {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World Java");
        editor.addState("Hello World Java Programming");

        editor.displayCurrent();

        System.out.println("\n--- Undo ---");
        editor.undo();
        editor.displayCurrent();

        System.out.println("\n--- Undo ---");
        editor.undo();
        editor.displayCurrent();

        System.out.println("\n--- Redo ---");
        editor.redo();
        editor.displayCurrent();

        System.out.println("\n--- Add New State After Undo ---");
        editor.addState("Hello World Java Developer");
        editor.displayCurrent();

        System.out.println("\n--- History ---");
        editor.displayHistory();
    }
}
