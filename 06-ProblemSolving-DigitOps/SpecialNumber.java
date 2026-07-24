// ============================================
// Module: 06-ProblemSolving-DigitOps
// Program: SpecialNumber
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Check Special number
// ============================================
import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        
        if (sum == n) {
            System.out.println(n + " is a SPECIAL number ✅");
        } else {
            System.out.println(n + " is NOT a SPECIAL number ❌");
        }
        scanner.close();
    }
    
    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
