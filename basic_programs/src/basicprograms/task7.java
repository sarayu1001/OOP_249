package basicprograms;

import java.util.Scanner;

public class task7 {
	public static void main(String[] agrs) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 3 numbers: ");
		int a= scan.nextInt();
		int b= scan.nextInt();
		int c= scan.nextInt();
		
		double average= (a+b+c)/3.0;
		
		System.out.println("The average of the 3 numbers: "+average);
		scan.close();
		
	}

}
