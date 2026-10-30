package training12;
import java.util.Scanner;

public class Employeedetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Department: ");
        String empDept = sc.nextLine();

        System.out.print("Enter Years of Experience: ");
        int empYoe = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Designation: ");
        String empDesignation = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double pf = basicSalary * 0.12;

        double grossPay = basicSalary + hra + da;
        double netPay = grossPay - pf;

        System.out.println("Employee Details");
        System.out.println("Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Department: " + empDept);
        System.out.println("Experience: " + empYoe + " years");
        System.out.println("Designation: " + empDesignation);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("PF: " + pf);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Net Pay: " + netPay);

	}

}
