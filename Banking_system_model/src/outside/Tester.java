package outside;

import banking_system.Bank;
import banking_system.ATM;

public class Tester {
    
    public static void main(String[] args) {
        Bank Kaspi = new Bank();
        ATM atm1 = new ATM(Kaspi);
        ATM atm2 = new ATM(Kaspi);
        Customer adil = new Customer(Kaspi, atm1);
        Customer batyr = new Customer(Kaspi, atm1);
        Customer carl = new Customer(Kaspi, atm2);
        System.out.println("Adil's accNum before deposit: " + adil.accNum);
        adil.openAccount();
        System.out.println("Adil's balance before deposit: " + adil.checkBalance());
        adil.depositMoney(1000);
        adil.withdrawMoney(501);
        System.out.println("Adil's balance after deposit: " + adil.checkBalance());
        System.out.println("Adil's accNum after deposit: " + adil.accNum);
        System.out.println();

        System.out.println("Batyr's balance: " + batyr.checkBalance());
        batyr.depositMoney(100000);
        System.out.println("Batyr's balance after deposit: " + batyr.checkBalance());
        System.out.println("Batyr's accNum after deposit: " + batyr.accNum);
        System.out.println();

        carl.openAccount();
        System.out.println("Carl's newly created account's number: " + carl.accNum);
        System.out.println("Carl's balance before attempting to withdraw money: " + carl.checkBalance());
        carl.withdrawMoney(499);
        System.out.println("Carl's balance after attempting to withdraw money: " + carl.checkBalance());
        return;
    }

}
