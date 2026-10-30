package training12;

	class Employee {
	    int empid;
	    String empname;
	    double basicSalary;

	    Employee(int empid, String empname, double basicSalary) {
	        this.empid = empid;
	        this.empname = empname;
	        this.basicSalary = basicSalary;
	    }

	    void display() {
	        System.out.println("Employee ID: " + empid);
	        System.out.println("Employee Name: " + empname);
	        System.out.println("Basic Salary: " + basicSalary);
	    }
	}

	class Manager extends Employee {
	    Manager(int empid, String empname, double basicSalary) {
	        super(empid, empname, basicSalary);
	    }
	}

	class Developer extends Employee {
	    Developer(int empid, String empname, double basicSalary) {
	        super(empid, empname, basicSalary);
	    }
	}

	class Intern extends Employee {
	    Intern(int empid, String empname, double basicSalary) {
	        super(empid, empname, basicSalary);
	    }
	}


public class EmployeeInheritance {
	    public static void main(String[] args) {

	        Manager m = new Manager(101, "Ravi", 60000);
	        Developer d = new Developer(102, "Priya", 45000);
	        Intern i = new Intern(103, "Rahul", 15000);

	        System.out.println("Manager Details:");
	        m.display();

	        System.out.println("\nDeveloper Details:");
	        d.display();

	        System.out.println("\nIntern Details:");
	        i.display();
	    }
	}

