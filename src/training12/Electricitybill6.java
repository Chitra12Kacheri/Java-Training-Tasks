package training12;

import java.util.Scanner;

public class Electricitybill6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double total=0;
		for(int i=1;i<=6;i++) {
		 System.out.println("Enetr the bill for month"+" "+i+":");
				double bill=sc.nextDouble();
				total=total+bill;
	}
		System.out.println("Total electricity bill for 6 months:"+total);

}
}