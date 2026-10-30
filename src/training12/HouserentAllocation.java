package training12;
import java.util.Scanner;
public class HouserentAllocation {





    static void calculateRent(double rent, int months) {
        System.out.println("Total Rent: Rs. " + (rent * months));
    }

    static void leaseHouse(double leaseAmount) {
        System.out.println("Lease Amount: Rs. " + leaseAmount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- House Rent Allocation ---");
            System.out.println("1. 1 BHK House");
            System.out.println("2. 2 BHK House");
            System.out.println("3. Lease House");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter monthly rent for 1 BHK:");
                    double rent1 = sc.nextDouble();

                    System.out.println("Enter number of months:");
                    int months1 = sc.nextInt();

                    if (rent1 > 0 && months1 > 0) {
                        calculateRent(rent1, months1);
                    } else {
                        System.out.println("Enter valid rent and months");
                    }
                    break;

                case 2:
                    System.out.println("Enter monthly rent for 2 BHK:");
                    double rent2 = sc.nextDouble();

                    System.out.println("Enter number of months:");
                    int months2 = sc.nextInt();

                    if (rent2 > 0 && months2 > 0) {
                        calculateRent(rent2, months2);
                    } else {
                        System.out.println("Enter valid rent and months");
                    }
                    break;

                case 3:
                    System.out.println("Enter lease amount:");
                    double lease = sc.nextDouble();

                    if (lease > 0) {
                        leaseHouse(lease);
                    } else {
                        System.out.println("Enter a valid lease amount");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        
}

}
