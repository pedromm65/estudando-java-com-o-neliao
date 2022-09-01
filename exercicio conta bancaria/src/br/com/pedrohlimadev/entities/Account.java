package br.com.pedrohlimadev.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account() {
        
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
        this.balance = 0;
    }

    public Account(int number, String holder, double initalDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initalDeposit);
    }

    public int getNumber() {
        return this.number;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double quantity) {
        this.balance += quantity;
    }

    public void withdraw(double quantity) {
        this.balance = this.balance - quantity - 5;
    }

    @Override
    public String toString() {
        return 
        "Account data: "
        + "Account: "
        + number
        + ", Holder: "
        + holder
        + ", Balance: "
        + " $ "
        + balance; 
    }

    
}
