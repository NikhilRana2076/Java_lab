package com.mycompany.labq3;


import java.util.Scanner;

public class MatrixDiagonalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a 3x3 matrix
        int[][] matrix = new int[3][3];

        // Input elements for the matrix from the user
        System.out.println("Enter the elements of the 3x3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the matrix and its diagonal elements
        System.out.println("Matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Diagonal Elements:");

        for (int i = 0; i < 3; i++) {
            System.out.println(matrix[i][i]);
        }
        scanner.close();
        System.out.println("\nLab No.: 3.b");
        System.out.println("Name: Nikhil Rana");
        System.out.println("ID: 191810");
    }
}