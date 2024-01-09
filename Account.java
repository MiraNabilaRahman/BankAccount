package Assignment;

// NAME: NUR AMIRA NABILA BINTI MOHD AB RAHMAN
// MATRIC NO : 2220682

import java.util.Scanner;

abstract class Account {
    protected double balance;

    public Account(double init_balance) {
        balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    protected void handleAccountOperations() {
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Balance");
            System.out.println("3. Withdraw");
            System.out.println("4. Return");
            System.out.print("Choose your option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Amount: RM ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Balance: RM " + getBalance());
                    break;
                case 3:
                    System.out.print("Amount: RM ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 4);

    
    }

}


