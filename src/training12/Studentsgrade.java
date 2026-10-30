package training12;

import java.util.Scanner;

public class Studentsgrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter class: ");
        int Class = sc.nextInt();

        System.out.print("Enter marks in 3 Subjects : ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        float avg = total /3.0f;
        String Grade;
        
        if(avg>90) {
        	      Grade="O";
        	      
        } else if(avg>75 && avg<=90) {
        	       Grade="A";
        	       
        }else if(avg>50 && avg<=75) {
        	Grade="B";
  	      
        } else if(avg>=35) {
  	      Grade="Pass";
        }else {
        	Grade="Fail";
        }
System.out.printf("---------------------*--------------------%n");
System.out.printf("|%-20s |%10s |%n","Details","Values");
System.out.printf("---------------------*--------------------%n");
System.out.printf("|%-20s |%10d |%n","Subject 1",m1);
System.out.printf("|%-20s |%10d |%n","Subject 1",m2);
System.out.printf("|%-20s |%10d |%n","Subject 1",m3);
System.out.printf("|%-20s |%10f |%n","Avarage",avg);
System.out.printf("|%-20s |%10s |%n","Grade",Grade);
System.out.printf("---------------------*--------------------%n");
	}

}
