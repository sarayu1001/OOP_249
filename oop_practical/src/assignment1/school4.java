package assignment1;

import java.util.Scanner;

public class school4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first student name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter second student name: ");
        String name2 = scanner.nextLine();

        String name3 = new String(name1);

        System.out.println("\nComparison Results");
        System.out.println("name1 == name2: " + (name1 == name2));
        System.out.println("name1.equals(name2): " + name1.equals(name2)); 
        System.out.println("name1.equalsIgnoreCase(name2): " + name1.equalsIgnoreCase(name2)); 

        System.out.println("\nname1 == name3: " + (name1 == name3));
        System.out.println("name1.equals(name3): " + name1.equals(name3));

        scanner.close();
    }
}
