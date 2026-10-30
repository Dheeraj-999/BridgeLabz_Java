package main.java.Patterns;

/*
22. Template Method Pattern – Steps
1. Create abstract OrderProcess class.
2. Define template method.
3. Create subclasses overriding steps.
4. Execute template method.

Dheeraj Buchha
*/

abstract class OrderProcess {

    final void processOrder() {
        selectItem();
        makePayment();
        deliverOrder();
    }

    abstract void selectItem();

    abstract void makePayment();

    void deliverOrder() {
        System.out.println("Order delivered");
    }
}

class OnlineOrder extends OrderProcess {
    void selectItem() {
        System.out.println("Item selected online");
    }

    void makePayment() {
        System.out.println("Online payment completed");
    }
}

class StoreOrder extends OrderProcess {
    void selectItem() {
        System.out.println("Item selected in store");
    }

    void makePayment() {
        System.out.println("Cash payment completed");
    }
}

public class TemplateMethod {
    public static void main(String[] args) {
        OrderProcess order = new OnlineOrder();
        order.processOrder();
    }
}
