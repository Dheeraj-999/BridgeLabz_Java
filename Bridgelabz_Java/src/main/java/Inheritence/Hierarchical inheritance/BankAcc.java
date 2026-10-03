/*
Sample Problem 1: Bank Account Types
Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:
Define a base class BankAccount with attributes like accountNumber and balance.
Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
Implement a method displayAccountType() in each subclass to specify the account type.
Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.

Date:3 oct
*/

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("The account type is: Savings Account");
    }

}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("The account type is: Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod;

    FixedDepositAccount(int accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    void displayAccountType() {
        System.out.println("The account type is: Fixed Account");
    }

}

public class BankAcc {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(101, 50000, 6.5);

        CheckingAccount checking = new CheckingAccount(101, 30000, 5);

        FixedDepositAccount fixedDeposit = new FixedDepositAccount(101, 100000, 24);

        savings.displayAccountType();
        checking.displayAccountType();
        fixedDeposit.displayAccountType();
    }
}