/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Create a class “Money” having two attributes “rupee” and “paisa” of type int and three
methods: setMoney() - to set the values , displayMoney() – to display the values and
addMoney(). The method addMoney() should have two parameters of type Money and it
should compute the sum of those. Create another class “MoneyTest” having main
method. Now create three objects of Money class inside main , initialize two of them
using setMoney(), call addMoney() by passing those two objects and display the values
of all three methods. [Result of addition should be like: 5 Rupee,75 Paisa + 7 Rupee ,30
Paisa = 13 Rupee 5 Paisa ]
*/
package pkg20231003;

/**
 *
 * @author acer
 */
import java.util.Scanner;

public class Money {
    int rupee;
    int paisa;

    // Method to set the values
    void setMoney(int rupee, int paisa) {
        this.rupee = rupee;
        this.paisa = paisa;
    }

    // Method to display the values
    void displayMoney() {
        System.out.println(rupee + " Rupee, " + paisa + " Paisa");
    }

    // Method to add two Money objects and return the result
    Money addMoney(Money m) {
        Money result = new Money();
        result.rupee = this.rupee + m.rupee;
        result.paisa = this.paisa + m.paisa;

        // Check if paisa exceeds 100, and adjust rupee accordingly
        if (result.paisa >= 100) {
            result.rupee += result.paisa / 100;
            result.paisa %= 100;
        }

        return result;
    }
}

public class MoneyTest {
    public static void main(String[] args) {
        Money money1 = new Money();
        Money money2 = new Money();
        Money money3;

        Scanner scanner = new Scanner(System.in);

        // Initialize the first Money object using user input
        System.out.print("Enter the rupees for the first amount: ");
        int rupee1 = scanner.nextInt();
        System.out.print("Enter the paisa for the first amount: ");
        int paisa1 = scanner.nextInt();
        money1.setMoney(rupee1, paisa1);

        // Initialize the second Money object using user input
        System.out.print("Enter the rupees for the second amount: ");
        int rupee2 = scanner.nextInt();
        System.out.print("Enter the paisa for the second amount: ");
        int paisa2 = scanner.nextInt();
        money2.setMoney(rupee2, paisa2);

        // Calculate the sum of money1 and money2
        money3 = money1.addMoney(money2);

        // Display the values of all three Money objects
        System.out.println("\nResult of addition:");
        System.out.print("Money 1: ");
        money1.displayMoney();
        System.out.print("Money 2: ");
        money2.displayMoney();
        System.out.print("Sum: ");
        money3.displayMoney();

        scanner.close();
    }
}
