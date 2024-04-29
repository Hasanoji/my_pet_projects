package outside;
import banking_system.Bank;
import banking_system.ATM;

public class Customer {
    Bank bank;
    ATM atm;   
    int accNum = -1;

    public Customer(Bank bank, ATM atm) {
        this.bank = bank;
        this.atm = atm;
        this.accNum = -1;
    }

    void openAccount() {
        accNum = bank.createAccount();
    }

    void depositMoney(int amount) {
        atm.loginToAccount(accNum);

        atm.deposit(amount);
        atm.logout();
    }

    void withdrawMoney(int amount) {
        atm.loginToAccount(accNum);
        atm.withdraw(amount);
        atm.logout();
    }

    public int checkBalance() {
        atm.loginToAccount(accNum);
        int n = atm.getBalance();
        atm.logout();
        return n;
    }
}
