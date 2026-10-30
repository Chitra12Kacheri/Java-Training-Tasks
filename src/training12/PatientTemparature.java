package training12;
import java.util.Scanner;
public class PatientTemparature {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of patients:");
        int n = sc.nextInt();

        double[] temp = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter temperature of patient " + (i + 1) + " in Fahrenheit:");
            temp[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Patient " + (i + 1) +
                    " Temperature: " + temp[i] + " F");

            if (temp[i] >= 100.4) {
                System.out.println("Fever detected - Medical review required");
            } else {
                System.out.println("No fever detected - Continue planned treatment if appropriate");
            }
        }

        
}

}
