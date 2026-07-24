// ============================================
// Module: 07-ProblemSolving-Methods
// Program: GCDCalculator
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Find GCD using recursion
// ============================================
import java.util.Scanner;

public class GCDCalculator {
    
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("GCD of " + a + " and " + b + " = " + gcd(a, b));
        scanner.close();
    }
}
