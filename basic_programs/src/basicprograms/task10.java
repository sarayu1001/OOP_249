package basicprograms;

import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num=scan.nextInt();
		
		if(num%3==0 && num%5==0) {
		System.out.println("Yes it is divisible by 3 and 5");
		} else {
			System.out.println("No it is not divisible by 3 and 5");
		}
		scan.close();

	}

}
