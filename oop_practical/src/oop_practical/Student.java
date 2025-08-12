package oop_practical;
import java.util.*;
class Students{
	String name;
	int rollno;
	int[] marks;
	
	void setter(String name,int rollno, int[] marks) {
		
		        this.name=name;
				this.rollno=rollno;
				this.marks=marks;	
	}
	void getter() {
		System.out.println("Name of the student:"+name);
		System.out.println("Rollno of the student:"+rollno);
		System.out.println("Marks of the student:");
		for(int marks:marks) {
			System.out.println(marks +" ");
			
		}
	}
}
public class Student{
	public static void main(String[] agrs) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the student");
		String name=sc.next();
		System.out.println("Enter rollno of the student");
		int rollno=sc.nextInt();
		System.out.println("Enter number of subjects:");
		int n=sc.nextInt();
		int[]marks=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter marks for subject"+(i+1)+": ");
			marks[i]=sc.nextInt();
		}
	Students st=new Students();
	st.setter(name, rollno, marks);
	st.getter();
	sc.close();
		
	}
}