/*
10. Facade Pattern – Steps
1. Create AccountService, BalanceService, TransactionService.
2. Create BankFacade class.
3. BankFacade calls internal services.
4. Client calls only facade method.

Dheeraj Buchha
*/

package main.java.Patterns;

class AccountService {
    void checkAccount() {
        System.out.println("Account verified");
    }
}

class BalanceService {
    void checkBalance() {
        System.out.println("Balance checked");
    }
}

class TransactionService {
    void transfer() {
        System.out.println("Money transferred");
    }
}

class BankFacade {
    AccountService account = new AccountService();
    BalanceService balance = new BalanceService();
    TransactionService transaction = new TransactionService();

    void transferMoney() {
        account.checkAccount();
        balance.checkBalance();
        transaction.transfer();
    }
}

public class Facade {
    public static void main(String[] args) {
        BankFacade bank = new BankFacade();
        bank.transferMoney();
    }
}
