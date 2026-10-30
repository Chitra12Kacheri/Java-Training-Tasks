package training12;



		import java.util.Scanner;

		class Login {

		    void login(String username, int password) {
		        System.out.println("Username login successful");
		    }

		    void login(int id, int password) {
		        System.out.println("ID login successful");
		    }

		    void login(long mobile, int password) {
		        System.out.println("Mobile login successful");
		    }
		}


		public class LoginMethodOverloading {
		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        Login l = new Login();

		        System.out.println("1. Login using Username");
		        System.out.println("2. Login using ID");
		        System.out.println("3. Login using Mobile Number");

		        System.out.print("Enter your choice: ");
		        int choice = sc.nextInt();
		        sc.nextLine();

		        switch (choice) {

		            case 1:
		                System.out.print("Enter username: ");
		                String username = sc.nextLine();

		                System.out.print("Enter password: ");
		                int p1 = sc.nextInt();

		                l.login(username, p1);
		                break;

		            case 2:
		                System.out.print("Enter ID: ");
		                int id = sc.nextInt();

		                System.out.print("Enter password: ");
		                int p2 = sc.nextInt();

		                l.login(id, p2);
		                break;

		            case 3:
		                System.out.print("Enter mobile number: ");
		                long mobile = sc.nextLong();

		                System.out.print("Enter password: ");
		                int p3 = sc.nextInt();

		                l.login(mobile, p3);
		                break;

		            default:
		                System.out.println("Invalid choice");
		        }

		}
	}