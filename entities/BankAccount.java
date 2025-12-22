package entities;

public class BankAccount {
    public int account;
    public String holder;
    public double balance;

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

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return String.format("Account: %d, Holder: %s, Balance: $ %.2f\n", getAccont(), getHolder(), getBalance());
    }

    public String sake(double value) {
        
        int tax = 5;
        double operation = getBalance() - (value + tax);

        if (operation >= 0 && value > 0) {
            setBalance(operation);
            return "Updated account data:\n" + toString();

        } else {
            return "Invalid Value!";
        }
    }

    public String deposit(double value) {
        if (value > 0) {
            setBalance(value + getBalance());
            return "Updated account data:\n" + toString();
        } else {
            return "Invalid Value!";
        }
    }



}
