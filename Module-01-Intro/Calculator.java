//============================================
// Module: Intro
// Author: Sandeep Abhilash
// Date: 24-07-2026
// Purpose: Basic arithmetic operations
//============================================

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("=== Simple Calculator ===");
        System.out.print("First number: ");
        int value = reader.nextInt();
        System.out.print("Second number: ");
        int output = reader.nextInt();
        
        System.out.println("\n--- Results ---");
        System.out.println("Addition: " + (value + output));
        System.out.println("Subtraction: " + (value - output));
        System.out.println("Multiplication: " + (value * output));
        System.out.println("Division: " + (double) value / output);
        reader.close();
    }
}
