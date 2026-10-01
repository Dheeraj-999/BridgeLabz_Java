/*
 * Problem 3: Bank Account Management
 
Author:Dheeraj Buchhha
Date: 29 sept
*/

class BankAccount {

    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Method to set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to get balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.accountNumber = "ACC101";

        account.accountHolder = "Dheeraj";
        account.setBalance(50000);

        System.out.println("Account Number: " + account.accountNumber);

        System.out.println("Account Holder: " + account.accountHolder);
        System.out.println("Balance: " + account.getBalance());

        SavingsAccount savings = new SavingsAccount();

        savings.accountNumber = "SAV101";

        savings.accountHolder = "Rahul";

        savings.displayDetails();
    }
}

class SavingsAccount extends BankAccount {

    void displayDetails() {
        System.out.println();

        System.out.println("Inside SavingsAccount:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}