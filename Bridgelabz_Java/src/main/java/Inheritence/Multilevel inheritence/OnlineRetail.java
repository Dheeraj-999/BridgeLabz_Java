/*
Sample Problem 1: Online Retail Order Management
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.

Date:3 oct
*/

class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
}

class ShippedOrder extends Order {
    int trackingNumber;

    ShippedOrder(int orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String DeliveryDate;

    DeliveredOrder(int orderId, String orderDate, int trackingNumber, String DeliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.DeliveryDate = DeliveryDate;
    }

    void getOrderStatus() {
        System.out.println("Order ID: " + super.orderId);
        System.out.println("Order Date: " + super.orderDate);
        System.out.println("Tracking Number : " + super.trackingNumber);
        System.out.println("Delivered Date: " + this.DeliveryDate);

    }
}

public class OnlineRetail {
    public static void main(String[] args) {
        DeliveredOrder d1 = new DeliveredOrder(101, "25 sept,2026", 89567302, "1 oct");
        d1.getOrderStatus();
    }
}