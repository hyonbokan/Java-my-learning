package org.example;

public class RewardSavingsAccount extends SavingsAccount implements Notification, Rewardable {
    private int rewardPoints;

    public RewardSavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
        this.rewardPoints = 0;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent: " + message);
    }

    @Override
    public void addRewardPoints(double transactionAmount) {
        int points = (int) (transactionAmount / 10); // Earn 1 point per $10 spent
        rewardPoints += points;
        sendNotification("You've earned " + points + " reward points!");
    }

    @Override
    public int getRewardPoints() {
        return rewardPoints;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        addRewardPoints(amount);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        addRewardPoints(amount);
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Reward Points: " + rewardPoints);
    }
}
