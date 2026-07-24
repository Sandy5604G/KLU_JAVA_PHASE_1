//============================================
// Module: Intro
// Author: Sandeep Abhilash
// Date: 24-07-2026
// Purpose: Understanding data storage
//============================================

import java.util.Scanner;

public class DataStorage {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("=== Data Types Demo ===");
        System.out.print("Enter a whole number: ");
        int value = reader.nextInt();
        System.out.print("Enter a decimal number: ");
        double output = reader.nextDouble();
        System.out.print("Enter a single character: ");
        char text = reader.next().charAt(0);
        
        System.out.println("\n--- Stored Values ---");
        System.out.println("Integer: " + value);
        System.out.println("Double: " + output);
        System.out.println("Character: " + text);
        reader.close();
    }
}
