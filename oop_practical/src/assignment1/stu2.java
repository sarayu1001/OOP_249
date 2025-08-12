package assignment1;

import java.util.Scanner;

public class stu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // clear newline

        String[] names = new String[numStudents];
        int[][] marks = new int[numStudents][3]; 

        for (int i = 0; i < numStudents; i++) {
            System.out.print("\nEnter name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter marks: ");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }

        System.out.println("\nStudents who passed all subjects:");
        for (int i = 0; i < numStudents; i++) {
            boolean passed = true;
            for (int j = 0; j < 3; j++) {
                if (marks[i][j] < 35) {
                    passed = false;
                    break;
                }
            }
            if (passed) {
                System.out.println(names[i]);
            }
        }

        scanner.close();
    }
}
