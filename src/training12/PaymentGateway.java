package training12;



import java.util.Scanner;

// Base class
class Customerr {
    String customerName;
    double amount;

    Customerr(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Payment Amount: Rs." + amount);
    }
}

// First interface
interface UPIPayment {
    void makePayment();
    void validatePayment();
}

// Second interface
interface CardPayment {
    void makePayment();
    void validatePayment();
}

// Third interface
interface NetBanking {
    void makePayment();
    void validatePayment();
}

// UPI implementation
class UPI extends Customerr implements UPIPayment {

    UPI(String name, double amount) {
        super(name, amount);
    }

    public void makePayment() {
        System.out.println("Payment done through UPI");
    }

    public void validatePayment() {
        System.out.println("UPI Payment Validated");
    }
}

// Card implementation
class Card extends Customerr implements CardPayment {

    Card(String name, double amount) {
        super(name, amount);
    }

    public void makePayment() {
        System.out.println("Payment done through Debit/Credit Card");
    }

    public void validatePayment() {
        System.out.println("Card Payment Validated");
    }
}

// Net Banking implementation
class Banking extends Customerr implements NetBanking {

    Banking(String name, double amount) {
        super(name, amount);
    }

    public void makePayment() {
        System.out.println("Payment done through Net Banking");
    }

    public void validatePayment() {
        System.out.println("Net Banking Payment Validated");
    }
}

// Main class
public class PaymentGateway {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        System.out.println("\nSelect Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.println("3. Net Banking");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                UPI upi = new UPI(name, amount);
                upi.displayDetails();
                upi.validatePayment();
                upi.makePayment();
                break;

            case 2:
                Card card = new Card(name, amount);
                card.displayDetails();
                card.validatePayment();
                card.makePayment();
                break;

            case 3:
                Banking bank = new Banking(name, amount);
                bank.displayDetails();
                bank.validatePayment();
                bank.makePayment();
                break;

            default:
                System.out.println("Invalid Payment Method");
        }

       
}

}
