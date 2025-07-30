package basicprograms;

import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the two integers:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		int and= a&b;
		int or= a|b;
		int xor=a^b;
		int leftShift=a<<1;
		int rightshift=a>>1;
		
		System.out.println("a&b: "+and+"("+Integer.toBinaryString(and)+")");
		System.out.println("a|b: "+or+"("+Integer.toBinaryString(or)+")");
		System.out.println("a^b: "+xor+"("+Integer.toBinaryString(xor)+")");
		System.out.println("leftshifter: "+leftShift+"("+Integer.toBinaryString(leftShift)+")");
		System.out.println("rightshifter: "+rightshift+"("+Integer.toBinaryString(rightshift)+")");
		
		scan.close();

	}

}
