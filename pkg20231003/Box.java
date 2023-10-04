/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20231003;

import java.util.Scanner;

public class Box {
    int length;
    int breadth;
    int height;
    int volume;
    
    void getDimensions(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    int calculateVolume() {
        volume = length * breadth * height;
        return volume;
    }

    void displayVolume() {
        System.out.println("Volume is " + volume);
    }

    public static void main(String[] args) {
        Box box = new Box();
        int length, breadth, height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length");
        length = scanner.nextInt();
        
        System.out.println("Enter breadth");
        breadth = scanner.nextInt();
        
        System.out.println("Enter height");
        height = scanner.nextInt();

        box.getDimensions(length, breadth, height);
        int boxVolume = box.calculateVolume();
        box.displayVolume();

        scanner.close();
    }
}

