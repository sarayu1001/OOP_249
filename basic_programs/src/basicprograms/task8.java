package basicprograms;

import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ener the two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("The addition of the 2 numbers: "+(a+b));
		System.out.println("The subtraction of the 2 numbers: "+(a-b));
		System.out.println("The multiplication of the 2 numbers: "+(a*b));
		System.out.println("The division of the 2 numbers: "+(a/b));
		System.out.println("The modulus of the 2 numbers: "+(a%b));
		
		sc.close();

	}

}
