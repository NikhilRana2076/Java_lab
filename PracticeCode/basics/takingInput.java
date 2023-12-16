package basics;

import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any name");
        String name = scanner.nextLine();
        System.out.println("The name is " + name);

        System.out.println("enter age is");

        try {
            int age = scanner.nextInt();
            System.out.println("The age is " + age);
        } catch (Exception e) {
            System.out.println("number only");
            // e.printStackTrace();
        }

    }
}
