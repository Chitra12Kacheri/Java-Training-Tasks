package training12;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number");
				int n = sc.nextInt();
				int count=0;
				for(int i=1;i<=n;i++) {
					if(n%i==0) {
						count++;
					}
				
				}
				if(n>1&&count==2) {
					System.out.println("Prime number");
				} else {
					System.out.println("Not a Prime number");
				}
	}

}
