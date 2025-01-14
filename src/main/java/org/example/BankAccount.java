package org.example;

abstract class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("The depositing amount MUST be more than 0");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public abstract void displayAccountDetails();
    public abstract void calculateInterest();

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public  String getAccountHolderName(){
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate = 0.05;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Savings Account - " +
                "Account Number: " + getAccountNumber() +
                ", Name:" + getAccountHolderName() +
                ", Balance: $" + getBalance());
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * interestRate;
        double balance = getBalance() + interest;
        setBalance(balance);
        System.out.println("Interest added: $" + interest);
    }
}

class CurrentAccount extends BankAccount {
    private double maintenanceFee = 10.0;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    public CurrentAccount(String accountNumber, String accountHolderName, double balance, double maintenanceFee) {
        super(accountNumber, accountHolderName, balance);
        this.maintenanceFee = maintenanceFee;
    }

    public double getMaintenanceFee() {
        return maintenanceFee;
    }

    public void setMaintenanceFee(double maintenanceFee) {
        this.maintenanceFee = maintenanceFee;
    }


    @Override
    public void displayAccountDetails() {

    }

    @Override
    public void calculateInterest() {
        double balance = getBalance() - maintenanceFee;
        setBalance(balance);
        System.out.println("Maintenance fee deducted: $" + maintenanceFee);
    }
}


