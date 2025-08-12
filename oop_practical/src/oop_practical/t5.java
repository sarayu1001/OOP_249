package oop_practical;

import java.util.Scanner;

interface Payment {
    void pay(String name, double amount);
}

class PayPal implements Payment {
    @Override
    public void pay(String name, double amount) {
        System.out.println(name + " paid ₹" + amount + " using PayPal.");
    }
}

class RazorPay implements Payment {
    @Override
    public void pay(String name, double amount) {
        System.out.println(name + " paid ₹" + amount + " using RazorPay.");
    }
}

public class t5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String customerName = sc.nextLine();

        System.out.println("Select Payment Method:");
        System.out.println("1. PayPal");
        System.out.println("2. RazorPay");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount to pay: ₹");
        double amount = sc.nextDouble();

        Payment paymentMethod;
        if (choice == 1) {
            paymentMethod = new PayPal();
        } else if (choice == 2) {
            paymentMethod = new RazorPay();
        } else {
            System.out.println("Invalid choice. Exiting...");
            sc.close();
            return;
        }

        paymentMethod.pay(customerName, amount);

        sc.close();
    }
}
