package assignment1;

import java.util.Scanner;

public class garbage3 {
    private String name;

    public garbage3(String name) {
        this.name = name;
        System.out.println("Object created: " + name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected: " + name);
    }

    public void useLocalVariable() {
        int temp = 42;
        System.out.println(name + " is using temp = " + temp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name for first object: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter name for second object: ");
        String name2 = scanner.nextLine();

        garbage3 g1 = new garbage3(name1);
        garbage3 g2 = new garbage3(name2);

        g1.useLocalVariable();
        g2.useLocalVariable();

        g1 = null;
        g2 = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method.");
        scanner.close();
    }
}