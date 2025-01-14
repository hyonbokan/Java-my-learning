package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // Create an array of Vehicles (Polymorphism in action)
//        Vehicle[] vehicles = {
//                new Car("Toyota", "Corolla", 2022),
//                new Motorcycle("Honda", "CBR500R", 2023),
//                new Car("Ford", "Mustang", 2021),
//                new Motorcycle("Yamaha", "MT-07", 2022)
//        };
//
//        // Demonstrate polymorphism: iterate and call methods dynamically
//        for (Vehicle v : vehicles) {
//            v.displayDetails(); // Common behavior
//            v.startEngine();    // Polymorphic behavior
//            v.honk();           // Polymorphic behavior
//            System.out.println(); // Separate each vehicle's output
//        }

        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        while (true) {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Add Savings Account");
            System.out.println("2. Add Current Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. View Account Details");
            System.out.println("6. Apply Interest/Maintenance Fee");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String saNumber = scanner.next();
                    System.out.print("Enter Account Holder Name: ");
                    String saName = scanner.next();
                    System.out.print("Enter Initial Balance: ");
                    double saBalance = scanner.nextDouble();

                    double updatedIntRate = 0.03;
                    accounts.add(new SavingsAccount(saNumber, saName, saBalance, updatedIntRate));
                    System.out.print("The interest rate is changed to " + updatedIntRate);

                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String caNumber = scanner.next();
                    System.out.print("Enter Account Holder Name: ");
                    String caName = scanner.next();
                    System.out.print("Enter Initial Balance: ");
                    double caBalance = scanner.nextDouble();
                    accounts.add(new CurrentAccount(caNumber, caName, caBalance));
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    String depAccount = scanner.next();
                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber().equals(depAccount)) {
                            System.out.print("Enter Deposit Amount: ");
                            double depAmount = scanner.nextDouble();
                            account.deposit(depAmount);
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    String withAccount = scanner.next();
                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber().equals(withAccount)) {
                            System.out.print("Enter Withdraw Amount: ");
                            double withAmount = scanner.nextDouble();
                            account.withdraw(withAmount);
                            break;
                        }
                    }
                    break;

                case 5:
                    for (BankAccount account : accounts) {
                        account.displayAccountDetails();
                    }
                    break;

                case 6:
                    for (BankAccount account : accounts) {
                        account.calculateInterest();
                    }
                    break;

                case 7:
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }
}