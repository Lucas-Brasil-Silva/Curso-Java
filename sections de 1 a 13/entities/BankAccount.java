package entities;

public class BankAccount {
    private int account;
    private String holder;
    private double balance;

    public BankAccount(int account, String holder, double balance) {
        this.account = account;
        this.holder = holder;
        this.balance = balance;
    }

    public int getAccont() {
        return account;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
       return balance; 
    }

    public String toString() {
        return String.format("Account: %d, Holder: %s, Balance: $ %.2f\n", getAccont(), getHolder(), getBalance());
    }

    public String sake(double value) {
        
        int tax = 5;
        double operation = getBalance() - (value + tax);

        if (operation >= 0 && value > 0) {
            balance = operation;
            return "Updated account data:\n" + toString();

        } else {
            return "Invalid Value!";
        }
    }

    public String deposit(double value) {
        if (value > 0) {
            balance += value;
            return "Updated account data:\n" + toString();
        } else {
            return "Invalid Value!";
        }
    }



}
