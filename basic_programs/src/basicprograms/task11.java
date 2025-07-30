package basicprograms;

import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		final double PI=3.14159;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius=scan.nextDouble();
		double circumference=2*PI*radius;
		double area=PI*radius*radius;
		
		System.out.println("The perimeter is: "+circumference);
		System.out.println("The area is: "+area);
		scan.close();

	}

}
