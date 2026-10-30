package main.java.Patterns;

/*
 * Strategy Pattern – Steps
 * 1. Create PaymentStrategy interface.
 * 2. Implement CashPayment, CardPayment, UPIPayment.
 * 3. Create PaymentContext.
 * 4. Select strategy at runtime.
 * 
 * Dheeraj Buchha
 */

interface PaymentStrategy {
    void pay(int amount);
}

class CashPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}

class CardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}

class UPIPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class PaymentContext {
    PaymentStrategy strategy;

    PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    void executePayment(int amount) {
        strategy.pay(amount);
    }
}

public class Strategy {
    public static void main(String[] args) {
        PaymentContext payment = new PaymentContext(new UPIPayment());

        payment.executePayment(1000);

        payment = new PaymentContext(new CardPayment());
        payment.executePayment(2000);
    }
}
