package assignment1;

import java.util.Scanner;

public class emp1 {
    String name;
    int id;
    static int employeeCount = 0;

    emp1(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    void showDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    static void showTotalEmployees() {
        System.out.println("Total employees hired: " + employeeCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees:  ");
        int n = sc.nextInt();
        sc.nextLine();

        emp1[] list = new emp1[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
           System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            list[i] = new emp1(name, id);
        }

        System.out.println("\nEmployee List");
        for (emp1 e : list) {
            e.showDetails();
        }

        System.out.println("\nSummary");
        emp1.showTotalEmployees();

        sc.close();
    }
}
