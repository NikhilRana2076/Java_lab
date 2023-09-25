/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firsthello;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        
        int number = reader.nextInt();
        
        System.out.println("You entered: " + number);
    }
            
}
