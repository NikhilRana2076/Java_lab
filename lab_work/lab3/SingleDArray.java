/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labq3;

/**
 *
 * @author Nikhil_Rana
 */
public class SingleDArray {
public static void main(String[] args) {
        // Create a single-dimensional array to store first 15 natural numbers
        int[] naturalNumbers = new int[15];

        // Populate the array with first 15 natural numbers
        for (int i = 0; i < 15; i++) {
            naturalNumbers[i] = i + 1;
        }

        // Calculate the sum of 3rd and last element
        int thirdElement = naturalNumbers[2];
        int lastElement = naturalNumbers[naturalNumbers.length - 1];
        int sum = thirdElement + lastElement;

        // Display the sum
        System.out.println("Lab3(a)");
        System.out.println("Nikhil Rana(191810)");
        System.out.println("3rd element: "+ thirdElement);
        System.out.println("last element: " +lastElement);
        System.out.println("Sum of 3rd and last element: " + sum);
    }
}
