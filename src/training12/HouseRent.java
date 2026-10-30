package training12;
import java.util.Scanner;

public class HouseRent {
	
	

	    // Method to calculate rent (monthly * months)
	    double calculateRent(double monthlyRent, int months) {
	        return monthlyRent * months;
	    }

	    // Method to calculate lease amount
	    double calculateLease(double leaseAmount) {
	        return leaseAmount;
	    }

	    // Method to display house details
	    void display(String name, String type, double amount) {
	        System.out.println("\nOwner Name: " + name);
	        System.out.println("Type: " + type);
	        System.out.println("Total Amount: " + amount);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        HouseRent h = new HouseRent();

	        System.out.print("Enter number of houses: ");
	        int n = sc.nextInt();

	        String[] owner = new String[n];
	        String[] type = new String[n];   // Rent or Lease
	        double[] amount = new double[n];

	        // Input using for loop
	        for(int i = 0; i < n; i++) {

	            System.out.println("\n--- House " + (i+1) + " ---");

	            System.out.print("Enter owner name: ");
	            owner[i] = sc.next();

	            System.out.print("Enter type (rent/lease): ");
	            type[i] = sc.next();

	            if(type[i].equalsIgnoreCase("rent")) {

	                System.out.print("Enter monthly rent: ");
	                double rent = sc.nextDouble();

	                System.out.print("Enter number of months: ");
	                int months = sc.nextInt();

	                amount[i] = h.calculateRent(rent, months);

	            } else if(type[i].equalsIgnoreCase("lease")) {

	                System.out.print("Enter lease amount: ");
	                double lease = sc.nextDouble();

	                amount[i] = h.calculateLease(lease);

	            } else {
	                System.out.println("Invalid type!");
	                i--; // repeat same index
	            }
	        }

	        // Display all data
	        System.out.println("\n===== HOUSE REPORT =====");

	        for(int i = 0; i < n; i++) {
	            h.display(owner[i], type[i], amount[i]);
	        }
	    }
	}

