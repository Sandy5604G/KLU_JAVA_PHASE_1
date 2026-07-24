// ============================================
// Module: 01-Foundation-JavaBasics
// Program: Calculator
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Basic arithmetic
// ============================================
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number: ");
        int a = scanner.nextInt();
        System.out.print("Second number: ");
        int b = scanner.nextInt();
        
        System.out.println("\n┌──────────────────────────────────────┐");
        System.out.println("│         CALCULATOR RESULTS          │");
        System.out.println("├──────────────────────────────────────┤");
        System.out.println("│  Addition:       " + (a + b) + "           │");
        System.out.println("│  Subtraction:    " + (a - b) + "           │");
        System.out.println("│  Multiplication: " + (a * b) + "           │");
        System.out.println("│  Division:       " + (double)a/b + "        │");
        System.out.println("└──────────────────────────────────────┘");
        scanner.close();
    }
}
