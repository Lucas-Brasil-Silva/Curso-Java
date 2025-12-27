package section14.model.entities;

import section14.model.exceptions.DomainException;

public class Account {
    private double number;
    private String name;
    private double balance;
    private double withdrawLimit;

    public Account() {

    }

    public Account(double number, String name, double balance, double withdrawLimit) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public double getNumber() {
        return number;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount) {
        
        if (amount > 0) {
            balance += amount;
        } else {
            throw new DomainException("Deposit err: The deposit amount cannot be equal to or less than zero.");
        }
    }

    public void withdraw(double amount) {
        
        if (amount <= withdrawLimit && amount <= balance) {
            balance -= amount;
        } else if (amount > withdrawLimit) {
            throw new DomainException(String.format("Withdraw err: The amount exceeds withdraw limit. Withdraw Limit: $ %.2f", withdrawLimit));

        } else {
            throw new DomainException(String.format("Withdraw err: Not enough balance. Balance: $ %.2f", balance));
        }
    }

    @Override
    public String toString() {
        return String.format("New balance: $ %.2f", balance);
    }
    

}