package banking_system;

import java.util.HashSet;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    private ArrayList<ATM> atms;
    private HashSet <Integer> accountNumbers;
    public Bank() {
        accounts = new ArrayList<>();
        atms = new ArrayList<>();
        accountNumbers = new HashSet<>();
    }

    ArrayList<Account> getAccounts() {
        return accounts;
    }

    public int createAccount() {
        int accountNumber;
        while(true) {
            accountNumber = (int)(Math.random() * 100 + 1);
            int sz = accountNumbers.size();
            accountNumbers.add(accountNumber);
            if(sz != accountNumbers.size()) break;
        }
        Account newAccount = new Account(accountNumber, 0);
        accounts.add(newAccount);
        return accountNumber;
    }

    void attachATM(ATM atm) {
        atms.add(atm);
        atm.setBank(this);
    }

    int accessAcctInfo(int acctNum) throws Exception {
        for(int i = 0; i < accounts.size(); ++i) {
            if(accounts.get(i).getAccountNumber() == acctNum) return accounts.get(i).getAccountBalance();
        }
        throw new Exception("Account was not found");
    }

    boolean updateAcctBal(int acctNum, int diff) throws Exception {
        for(int i = 0; i < accounts.size(); ++i) {
            if(accounts.get(i).getAccountNumber() == acctNum) {
                if(accounts.get(i).getAccountBalance() + diff < 0) {
                    //throw an exception
                    throw new Exception("Negative Value");
                }

                else {
                    accounts.get(i).setAccountBalance(accounts.get(i).getAccountBalance() + diff);
                    return true;
                }
            }
        }
        throw new Exception("No account found");
    }
}