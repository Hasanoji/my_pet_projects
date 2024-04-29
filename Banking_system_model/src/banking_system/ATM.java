package banking_system;

public class ATM {
    private Bank bank;

    private int currentAccountNumber = -1;
    private boolean loggedIn = false;

    public ATM(Bank bank) {
        this.bank=bank;
    }

    void setBank(Bank bank) {
        this.bank = bank;
    }

    public boolean loginToAccount(int acctNum) {
        for(Account curAcc : bank.getAccounts()) {
            if(curAcc.getAccountNumber() == acctNum) {
                currentAccountNumber = acctNum;
                loggedIn = true;
                return true;
            }
        }
        System.out.println("Operation failed. Create an account first");
        return false;
    }
    public boolean deposit(int amount) {
        if(loggedIn == false) return false;
        try {
            bank.updateAcctBal(currentAccountNumber, amount);
        } catch (Exception e) {
            System.out.println("The account was not found");
        }
        return true;
    }

    public boolean withdraw(int amount) {
        if(loggedIn == false) return false;
        try {
            bank.updateAcctBal(currentAccountNumber, -amount);
        } catch (Exception e) {
            System.out.println("Not enough money to withdraw");
        }

        return true;
    }

    public int getBalance() {
        if(loggedIn == false) return 0;
        int n = -1;
        try {
            n = bank.accessAcctInfo(currentAccountNumber);
        } catch (Exception e) {
            System.out.println("The account was not found");
        }
        return n;
    }

    public void logout() {
        currentAccountNumber = -1;
        loggedIn = false;
    }
}
