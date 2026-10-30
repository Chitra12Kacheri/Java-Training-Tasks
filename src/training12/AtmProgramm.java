package training12;

import java.util.Scanner;
public class AtmProgramm {


    static double balance = 5000;

    static void checkBalance() {
        System.out.println("Available Balance: " + balance);
    }

    static void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully");
    }

    static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Please collect your cash");
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double amount;

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.println("Enter deposit amount:");
                    amount = sc.nextDouble();
                    if (amount > 0) {
                        deposit(amount);
                    } else {
                        System.out.println("Enter a valid amount");
                    }
                    break;

                case 3:
                    System.out.println("Enter withdrawal amount:");
                    amount = sc.nextDouble();
                    withdraw(amount);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

     
}

}
