package training12;

public class Operatorss {

	public static void main(String[] args) {
		// TODO Auto-ed method stub
		int a=20;
		int b= 10;
		//Arithmetic Operators
		System.out.println("Addition =" + (a+b));
		System.out.println("Substraction =" + (a-b));
		System.out.println("Modulus =" + (a%b));
		System.out.println("Division =" + (a/b));
		System.out.println("Multiplication =" + (a*b));
 
		//Assignment Operators
		int c=10;
		c+=5;
		System.out.println("+= :" + c);
		c-=5;
		System.out.println("-= :" + c);
		c*=5;
		System.out.println("*= :" + c);
		c/=5;
		System.out.println("/= :" + c);
		c%=5;
		System.out.println("%= :" + c);
		
		//Relational Operators
		System.out.println("a>b :" + (a>b));
		System.out.println("a<b :" + (a<b));
		System.out.println("a>=b :" + (a>=b));
		System.out.println("a<=b :" + (a<=b));
		System.out.println("a==b :" + (a==b));
		System.out.println("a!=b :" + (a!=b));
		
		//Logical Operators
		System.out.println("AND: " + (a > 5 && b > 0));
        System.out.println("OR: " + (a > 5 || b < 0));
        System.out.println("NOT: " + !(a > b));
        
        //Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Maximum: " + max);
        
        //Unary Operator
        System.out.println("Pre-increment: " + (++a));
        System.out.println("Post-increment: " + (a++));
        System.out.println("Pre-decrement: " + (--b));
        System.out.println("Post-decrement: " + (b--));
	}

}
