package training12;
import java.util.Scanner;
public class Ebill {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Consumer ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Consumer Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Building Type (Home/Shop): ");
	        String type = sc.nextLine();

	        System.out.print("Enter Previous Reading: ");
	        int previous = sc.nextInt();

	        System.out.print("Enter Current Reading: ");
	        int current = sc.nextInt();

	        int units = current - previous;
	        double rate;
	        double bill;
	        double concession = 0;

	        if (type.equalsIgnoreCase("Home")) {
	            if (units <= 100) {
	                rate = 2;
	            } else if (units <= 200) {
	                rate = 3;
	            } else {
	                rate = 5;
	            }

	            bill = units * rate;
	            concession = bill * 0.10;
	            bill = bill - concession;

	        } else if (type.equalsIgnoreCase("Shop")) {
	            if (units <= 100) {
	                rate = 4;
	            } else if (units <= 200) {
	                rate = 6;
	            } else {
	                rate = 8;
	            }

	            bill = units * rate;

	        } else {
	            System.out.println("Invalid building type!");
	            sc.close();
	            return;
	        }

	        System.out.printf("%n+----------------------+----------------+%n");
	        System.out.printf("| %-20s | %14s |%n", "Details", "Values");
	        System.out.printf("+----------------------+----------------+%n");
	        System.out.printf("| %-20s | %14d |%n", "Consumer ID", id);
	        System.out.printf("| %-20s | %14s |%n", "Consumer Name", name);
	        System.out.printf("| %-20s | %14s |%n", "Building Type", type);
	        System.out.printf("| %-20s | %14d |%n", "Units Consumed", units);
	        System.out.printf("| %-20s | %14.2f |%n", "Concession", concession);
	        System.out.printf("| %-20s | %14.2f |%n", "EB Bill", bill);
	        System.out.printf("+----------------------+----------------+%n");

	        
	    
	}
}
