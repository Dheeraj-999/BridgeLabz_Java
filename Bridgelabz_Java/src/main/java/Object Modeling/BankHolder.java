// Problem 1: Library and Books (Aggregation)
//
// Create a Library class that contains multiple Book objects.
// The relationship between Library and Book is aggregation.
//
// A Library can have many Books,
// but a Book can exist independently without a Library.
//

import java.util.Scanner;
import java.util.ArrayList;

class Account {

    int accountNumber;
    double balance;
    Bank bank;

    Account(int accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }
}

class Customer {

    String name;
    ArrayList<Account> accounts = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void viewBalance() {

        System.out.println("Customer: " + name);

        for (Account account : accounts) {
            System.out.println(
                    "Account: " + account.accountNumber +
                            " | Balance: " + account.balance);
        }
    }
}

class Bank {

    String name;

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer customer,
            int accountNumber,
            double balance) {

        Account account = new Account(accountNumber, balance, this);

        customer.accounts.add(account);

        System.out.println(
                "Account " + accountNumber +
                        " opened in " + name);
    }
}

public class BankHolder {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Dheeraj");
        Customer customer2 = new Customer("Rahul");

        Bank bank1 = new Bank("SBI");

        bank1.openAccount(customer1, 101, 5000);
        bank1.openAccount(customer1, 102, 10000);

        bank1.openAccount(customer2, 103, 7500);

        System.out.println();

        customer1.viewBalance();

        System.out.println();

        customer2.viewBalance();
    }
}