/*Sample Program 1: Bank Account System
Create a BankAccount class with the following features:
Static:
A static variable bankName shared across all accounts.
A static method getTotalAccounts() to display the total number of accounts.
This:
Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
Final:
Use a final variable accountNumber to ensure it cannot be changed once assigned.
Instanceof:
Check if an account object is an instance of the BankAccount class before displaying its details.

 * Author: Dheeraj Buchhha
 * Date: 30 september
 * 
 */

class BankAccount {

    static String bankName = "State Bank";
    final String accountNumber;
    String accountHolderName;
    static int TotalAccounts = 0;

    BankAccount(String accountNumber, String accountHolderName) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        TotalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("total accounts " + TotalAccounts);
    }

    void displayDetails() {

        System.out.println("Bank Name " + bankName);
        System.out.println("account Number " + accountNumber);
        System.out.println("account hholder name" + accountHolderName);
        System.out.println("total accounts " + BankAccount.TotalAccounts);

    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("ABC1245", "Dheeraj");
        BankAccount account2 = new BankAccount("Agh897", "Samyak");

        if (account1 instanceof BankAccount) {
            account1.displayDetails();
        }

        System.out.println();

        if (account2 instanceof BankAccount) {
            account2.displayDetails();
        }

        System.out.println();

    }
}