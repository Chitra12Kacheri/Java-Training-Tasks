package training12;
import java.util.Scanner;
public class EmployeeArrays {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees:");
        int n = sc.nextInt();

        int[] salary = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter salary of employee " + (i + 1) + ":");
            salary[i] = sc.nextInt();
        }

        int highest = salary[0];
        int lowest = salary[0];
        int highIndex = 0;
        int lowIndex = 0;

        for (int i = 1; i < n; i++) {
            if (salary[i] > highest) {
                highest = salary[i];
                highIndex = i;
            }

            if (salary[i] < lowest) {
                lowest = salary[i];
                lowIndex = i;
            }
        }

        System.out.println("Highest paid employee: Employee " + (highIndex + 1));
        System.out.println("Highest salary: " + highest);

        System.out.println("Lowest paid employee: Employee " + (lowIndex + 1));
        System.out.println("Lowest salary: " + lowest);

       
    }
}


