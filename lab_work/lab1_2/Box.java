/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

/**
 *
 * @author Nikhil_Rana
 */
    public class Box {
    private double length;
    private double breadth;
    private double height;

    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void printDimensions() {
        System.out.println("Length: " + length + " units");
        System.out.println("Breadth: " + breadth + " units");
        System.out.println("Height: " + height + " units");
    }

    public void calculateVolume() {
        double volume = length * breadth * height;
        System.out.println(volume + " cubic units");
    }

    public static void main(String[] args) {
        // Create an instance of the Box class
        Box myBox1 = new Box(5, 2, 1);
        Box myBox2 = new Box(1, 2, 3);
        System.out.println("Lab No: 1");
        System.out.println("Name: Nikhil Rana");
        System.out.println("ID: 191810");

        // Print the dimensions of the box1 and box2
        System.out.println("\nThe dimensions of first box are:");
        myBox1.printDimensions();
        System.out.println("\nThe dimensions of second box are:");
        myBox2.printDimensions();

        // Calculate and print the volume of the box1 and box2
        System.out.print("\nThe volume of first box:");
        myBox1.calculateVolume();
        System.out.print("The volume of second box:");
        myBox2.calculateVolume();


    }
}