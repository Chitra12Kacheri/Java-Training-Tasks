package training12;


	import java.util.Scanner;

	class Bank {

	    // Deposit using cash
	    void deposit(double amount) {
	        System.out.println("Cash Deposit Amount: Rs." + amount);
	    }

	    // Deposit using cheque
	    void deposit(double amount, int chequeNo) {
	        System.out.println("Cheque Number: " + chequeNo);
	        System.out.println("Cheque Deposit Amount: Rs." + amount);
	    }

	    // Deposit using UPI
	    void deposit(double amount, String upiId, String bankName) {
	        System.out.println("UPI ID: " + upiId);
	        System.out.println("Bank Name: " + bankName);
	        System.out.println("UPI Deposit Amount: Rs." + amount);
	    }
	}

	public class BankingProgm {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Bank b = new Bank();

	        System.out.println("1. Cash Deposit");
	        System.out.println("2. Cheque Deposit");
	        System.out.println("3. UPI Deposit");

	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();
	        sc.nextLine();

	        switch (choice) {

	            case 1:
	                System.out.print("Enter amount: ");
	                double amount1 = sc.nextDouble();

	                b.deposit(amount1);
	                break;

	            case 2:
	                System.out.print("Enter amount: ");
	                double amount2 = sc.nextDouble();

	                System.out.print("Enter cheque number: ");
	                int chequeNo = sc.nextInt();

	                b.deposit(amount2, chequeNo);
	                break;

	            case 3:
	                System.out.print("Enter amount: ");
	                double amount3 = sc.nextDouble();
	                sc.nextLine();

	                System.out.print("Enter UPI ID: ");
	                String upiId = sc.nextLine();

	                System.out.print("Enter bank name: ");
	                String bankName = sc.nextLine();

	                b.deposit(amount3, upiId, bankName);
	                break;

	            default:
	                System.out.println("Invalid choice");
	        }

	      
	}
}
