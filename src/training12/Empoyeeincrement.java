package training12;
import java.util.Scanner;
public class Empoyeeincrement {

		
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter employee name: ");
		        String name = sc.nextLine();

		        System.out.print("Enter employee ID: ");
		        int id = sc.nextInt();
		        sc.nextLine();

		        System.out.print("Enter department: ");
		        String dept = sc.nextLine();

		        System.out.print("Enter designation: ");
		        String designation = sc.nextLine();

		        System.out.print("Enter years of experience (YOE): ");
		        int yoe = sc.nextInt();

		        System.out.print("Enter basic salary: ");
		        double basicSalary = sc.nextDouble();

		        double increment = 0;
		        double bonus = 0;
		        double np;

		        // Increment based on YOE and department
		        if (yoe >= 5 && dept.equalsIgnoreCase("HR")) {
		            increment = basicSalary * 0.10;
		        }

		        // Bonus based on designation
		        if (designation.equalsIgnoreCase("Manager")) {
		            bonus = basicSalary * 0.15;
		        } else if (designation.equalsIgnoreCase("Developer")) {
		            bonus = basicSalary * 0.10;
		        } else if (designation.equalsIgnoreCase("Tester")) {
		            bonus = basicSalary * 0.05;
		        }

		        // Net pay
		        np = basicSalary + bonus + increment;

		        // Display employee details in table format
		        System.out.printf("%n+----------------------+----------------+%n");
		        System.out.printf("| %-20s | %14s |%n", "Details", "Values");
		        System.out.printf("+----------------------+----------------+%n");
		        System.out.printf("| %-20s | %14s |%n", "Employee Name", name);
		        System.out.printf("| %-20s | %14d |%n", "Employee ID", id);
		        System.out.printf("| %-20s | %14s |%n", "Department", dept);
		        System.out.printf("| %-20s | %14s |%n", "Designation", designation);
		        System.out.printf("| %-20s | %14d |%n", "YOE", yoe);
		        System.out.printf("| %-20s | %14.2f |%n", "Basic Salary", basicSalary);
		        System.out.printf("| %-20s | %14.2f |%n", "Increment", increment);
		        System.out.printf("| %-20s | %14.2f |%n", "Bonus", bonus);
		        System.out.printf("| %-20s | %14.2f |%n", "Net Pay", np);
		        System.out.printf("+----------------------+----------------+%n");

		       
		    }
		
	}


