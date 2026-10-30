package training12;



import java.util.Scanner;

// Base class
class Customer {
    String customerName;
    double distance;

    Customer(String customerName, double distance) {
        this.customerName = customerName;
        this.distance = distance;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Distance: " + distance + " KM");
    }
}

// First Interface
interface MiniCab {
    void bookRide();
    double calculateFare();
}

// Second Interface
interface AutoCab {
    void bookRide();
    double calculateFare();
}

// Third Interface
interface SedanCab {
    void bookRide();
    double calculateFare();
}

// MiniCab implementation
class Mini extends Customer implements MiniCab {

    Mini(String name, double distance) {
        super(name, distance);
    }

    public void bookRide() {
        System.out.println("Mini Cab Booked Successfully!");
    }

    public double calculateFare() {
        return distance * 10;
    }
}

// AutoCab implementation
class Auto extends Customer implements AutoCab {

    Auto(String name, double distance) {
        super(name, distance);
    }

    public void bookRide() {
        System.out.println("Auto Cab Booked Successfully!");
    }

    public double calculateFare() {
        return distance * 15;
    }
}

// SedanCab implementation
class Sedan extends Customer implements SedanCab {

    Sedan(String name, double distance) {
        super(name, distance);
    }

    public void bookRide() {
        System.out.println("Sedan Cab Booked Successfully!");
    }

    public double calculateFare() {
        return distance * 20;
    }
}

// Main class
public class CabBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Distance in KM: ");
        double distance = sc.nextDouble();

        System.out.println("\nChoose Cab Type:");
        System.out.println("1. Mini Cab");
        System.out.println("2. Auto Cab");
        System.out.println("3. Sedan Cab");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                Mini mini = new Mini(name, distance);
                mini.displayCustomer();
                mini.bookRide();
                System.out.println("Total Fare: Rs." + mini.calculateFare());
                break;

            case 2:
                Auto auto = new Auto(name, distance);
                auto.displayCustomer();
                auto.bookRide();
                System.out.println("Total Fare: Rs." + auto.calculateFare());
                break;

            case 3:
                Sedan sedan = new Sedan(name, distance);
                sedan.displayCustomer();
                sedan.bookRide();
                System.out.println("Total Fare: Rs." + sedan.calculateFare());
                break;

            default:
                System.out.println("Invalid Cab Choice!");
        }

        
}

}
