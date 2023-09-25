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
public class digit_reverse {
     public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a two digit number: ");
        int number = reader.nextInt();
        int reverse = 0; 
while(number != 0)   
{  
int remainder = number % 10;  
 reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
    }
           
}
