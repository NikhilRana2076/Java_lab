/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;
/*
Create a class â€œMoneyâ€ having two attributes â€œrupeeâ€ and â€œpaisaâ€ of type int and three
methods: setMoney() - to set the values , displayMoney() â€“ to display the values and
addMoney(). The method addMoney() should have two parameters of type Money and it
should compute the sum of those. Create another class â€œMoneyTestâ€ having main
method. Now create three objects of Money class inside main , initialize two of them
using setMoney(), call addMoney() by passing those two objects and display the values
of all three methods. [Result of addition should be like: 5 Rupee,75 Paisa + 7 Rupee ,30
Paisa = 13 Rupee 5 Paisa ]
*/

class Money {
    private int rupee;
    private int paisa;

    // Method to set the values for rupee and paisa
    public void setMoney(int rupee, int paisa) {
        this.rupee = rupee;
        this.paisa = paisa;
    }

    // Method to display the values
    public void displayMoney() {
        System.out.println(rupee + " Rupee, " + paisa + " Paisa");
    }

    // Method to add two Money objects
    public Money addMoney(Money otherMoney) {
        Money result = new Money();
        result.rupee = this.rupee + otherMoney.rupee;
        result.paisa = this.paisa + otherMoney.paisa;

        // Adjust for overflow in paisa
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

        // Initialize money1 and money2 using setMoney()
        money1.setMoney(5, 75);
        money2.setMoney(7, 30);

        // Add money1 and money2
        Money result = money1.addMoney(money2);
        System.out.println("Lab No: 2");
        System.out.println("Name: Nikhil Rana");
        System.out.println("ID: 191810");

        // Display the values using displayMoney()
        System.out.print("\nResult of addition: ");
        money1.displayMoney();
        System.out.print(" + ");
        money2.displayMoney();
        System.out.print(" = ");
        result.displayMoney();
    }
}