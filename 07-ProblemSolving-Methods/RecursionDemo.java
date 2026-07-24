// ============================================
// Module: 07-ProblemSolving-Methods
// Program: RecursionDemo
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Recursion example
// ============================================
import java.util.Scanner;

public class RecursionDemo {
    
    static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n-1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Factorial of " + n + " = " + factorial(n));
        scanner.close();
    }
}
