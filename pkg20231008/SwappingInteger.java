/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20231008;

/**
 *
 *
 * @author acer
 */
//write a java program to take integers from user using constructor and then swipe the object values
import java.util.Scanner;

 class IntegerPair {

    private int first;
    private int second;

    public IntegerPair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public void swap() {
        int temp = first;
        first = second;
        second = temp;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}

public class SwappingInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int firstInt = scanner.nextInt();

        System.out.println("Enter the second integer: ");
        int secondInt = scanner.nextInt();

        // Create an IntegerPair object with user input
        IntegerPair pair = new IntegerPair(firstInt, secondInt);

        // Display the original values
        System.out.println("Original values: ");
        System.out.println("First integer: " + pair.getFirst());
        System.out.println("Second integer: " + pair.getSecond());

        // Swap the values using the swap method
        pair.swap();

        // Display the swapped values
        System.out.println("\nAfter swapping: ");
        System.out.println("First integer: " + pair.getFirst());
        System.out.println("Second integer: " + pair.getSecond());

        scanner.close();
    }
}
