package training12;
import java.util.Scanner;
public class Loan {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Person Name: ");
	        String name = sc.nextLine();

	        System.out.print("Are you salaried? (Yes/No): ");
	        String salaried = sc.nextLine();

	        System.out.print("Enter Annual Salary: ");
	        double salary = sc.nextDouble();

	        System.out.print("Enter CIBIL Score: ");
	        int cibil = sc.nextInt();

	        String result;
	        String reason;

	        if (salaried.equalsIgnoreCase("Yes")
	                && salary >= 300000
	                && cibil >= 750
	                && cibil <= 900) {
	            result = "Eligible";
	            reason = "All conditions met";
	        } else {
	            result = "Not Eligible";

	            if (!salaried.equalsIgnoreCase("Yes")) {
	                reason = "Not salaried";
	            } else if (salary < 300000) {
	                reason = "Low salary";
	            } else if (cibil < 750 || cibil > 900) {
	                reason = "CIBIL criteria not met";
	            } else {
	                reason = "Criteria not met";
	            }
	        }

	        System.out.printf("%n+----------------------+----------------------+%n");
	        System.out.printf("| %-20s | %-20s |%n", "Details", "Values");
	        System.out.printf("+----------------------+----------------------+%n");
	        System.out.printf("| %-20s | %-20s |%n", "Name", name);
	        System.out.printf("| %-20s | %-20s |%n", "Salaried", salaried);
	        System.out.printf("| %-20s | %20.2f |%n", "Annual Salary", salary);
	        System.out.printf("| %-20s | %20d |%n", "CIBIL Score", cibil);
	        System.out.printf("| %-20s | %-20s |%n", "Loan Status", result);
	        System.out.printf("| %-20s | %-20s |%n", "Reason", reason);
	        System.out.printf("+----------------------+----------------------+%n");

	}
}
