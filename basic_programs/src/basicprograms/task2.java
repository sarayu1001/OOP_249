package basicprograms;

import java.util.Scanner;

public class task2 {
	public static void main(String[] agrs) {
		Scanner input= new Scanner(System.in);
		
		
		System.out.println("Enter student name ");
		String name= input.nextLine();
	
		
		System.out.println("Enter roll number: ");
		int rollno= input.nextInt();
		
		System.out.println("Enter age: ");
		int age= input.nextInt();
		
		System.out.println("Enter gender: ");
		char gender= input.next().charAt(0);
		
		System.out.println("Enter percentile: ");
		float percentage= input.nextFloat();
		
		System.out.println("Name: "+name);
		System.out.println("rollno: "+rollno);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Percentage: "+percentage+"%");
		
		input.close();
		
		
	}

}
