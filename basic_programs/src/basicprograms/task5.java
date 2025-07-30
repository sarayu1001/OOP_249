package basicprograms;

import java.util.Scanner;

public class task5 {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the character: ");
		
		char ch=scan.next().charAt(0);
		int ascivalue=(int)ch;
		
		System.out.println("The character: "+ch);
		System.out.println("The ascii value is: "+ascivalue);
		
		scan.close();
		
	}

}
