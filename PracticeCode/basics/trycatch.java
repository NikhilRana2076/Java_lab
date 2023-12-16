 package basics;

import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        
        while(true){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        
        try {
            int age = scanner.nextInt();
            System.out.println("The number is "+ age);
            break;
        }

        catch(Exception e){
           // e.printStackTrace();
           System.out.println("The number only");
        }
        }

    }
}
