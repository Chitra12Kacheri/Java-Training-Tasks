package training12;

import java.util.Scanner;

public class PatternProgg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter number of rows:");
				int n = sc.nextInt();
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
	}

}
