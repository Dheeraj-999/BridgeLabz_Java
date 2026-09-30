/*
 * Java Classes and Objects , Level 2
 * Program to Simulate an ATM
 * Problem Statement: Create a BankAccount class with attributes accountHolder,
 * accountNumber, and balance. Add methods for:
 * Depositing money.
 * Withdrawing money (only if sufficient balance exists).
 * Displaying the current balance.
 * Explanation: The BankAccount class stores bank account details as attributes.
 * The methods allow interaction with these attributes to modify and view the
 * account's state.
 * 
 * Author: Dheeraj Buchhha
 * Date: 28 september
 * 
 */

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void depositMoney(double amount) {
        balance = balance + amount;
        System.out.println("your new balace is: " + balance);
    }

    void withDraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("your new balace is: " + balance);

        } else {
            System.out.println("insufficient balance");

        }
    }

    void balance() {
        System.out.println("your current balace is: " + balance);

    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();

        acc1.accountHolder = "Dheeraj";
        acc1.accountNumber = 12345678;
        acc1.balance = 24500;

        System.out.println("Account Holder: " + acc1.accountHolder);
        System.out.println("Account Number: " + acc1.accountNumber);

        acc1.balance();

        acc1.depositMoney(2000);
        acc1.withDraw(3000);
        acc1.balance();

    }
}