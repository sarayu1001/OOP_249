package basicprograms;
import java.util.Scanner;
public class task4 {
	public static void main(String[] agrs) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the integer:");
		double mydouble=scan.nextDouble();
		
		int myint=(int)mydouble;
		System.out.println("The double value is: "+mydouble);
		System.out.println("The int of double value is: "+myint);
		scan.close();
		
		
	}
	

}
