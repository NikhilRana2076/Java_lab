/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labq3;

/**
 *
 * @author Nikhil_Rana
 */
public class JaggedArrayDemo {
    public static void main(String[] args) {
        // Create a jagged array
        int[][] jaggedArray = new int[3][];

        // Initialize sub-arrays with different lengths
        jaggedArray[0] = new int[]{1, 2, 3};
        jaggedArray[1] = new int[]{4, 5, 6, 7};
        jaggedArray[2] = new int[]{8, 9, 10, 11, 12};

        // Access and display elements of the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        
        }
        System.out.println("\nLab No.: 3.c");
        System.out.println("Name: Nikhil Rana");
        System.out.println("ID: 191810");
    }
}