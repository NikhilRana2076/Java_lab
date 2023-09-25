/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firsthello;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class oddoreven {
     public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = reader.nextInt();
        
        if(number%2 == 0)
        System.out.println("The number is even");
        else 
        System.out.println("The number is odd");
            
    }
            
}
