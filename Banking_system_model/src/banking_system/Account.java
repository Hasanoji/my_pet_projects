package banking_system;

class Account {
    private int accountNumber;
    private int accountBalance;

    Account(int accountNumber, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    } 

    int getAccountNumber() {
        return accountNumber;
    }

    int getAccountBalance() {
        return accountBalance;
    }

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    } 
}
