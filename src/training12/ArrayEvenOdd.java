package training12;
import java.util.Scanner;
public class ArrayEvenOdd {




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is Even");
            } else {
                System.out.println(arr[i] + " is Odd");
            }
        }

       
}

}
