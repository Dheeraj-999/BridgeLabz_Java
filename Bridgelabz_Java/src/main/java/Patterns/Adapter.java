package main.java.Patterns;
/*
 * 6. Adapter Pattern – Steps
 * 1. Create OldPrinter class with oldPrint().
 * 2. Create NewPrinter interface with print().
 * 3. Create Adapter class implementing NewPrinter.
 * 4. Adapter internally uses OldPrinter.
 * 5. Client calls print() on adapter.
 * 
 * Dheeraj Buchha
 */

class OldPrinter {
    void oldPrint() {
        System.out.println("Printing using old printer");
    }
}

interface NewPrinter {
    void print();
}

class PrinterAdapter implements NewPrinter {
    OldPrinter oldPrinter;

    PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    public void print() {
        oldPrinter.oldPrint();
    }
}

public class Adapter {
    public static void main(String[] args) {
        OldPrinter old = new OldPrinter();

        NewPrinter printer = new PrinterAdapter(old);
        printer.print();
    }
}
