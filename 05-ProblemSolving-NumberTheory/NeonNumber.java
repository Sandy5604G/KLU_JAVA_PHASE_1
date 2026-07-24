// ============================================
// Module: 05-ProblemSolving-NumberTheory
// Program: NeonNumber
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Check Neon number
// ============================================
import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        
        if (sum == n) {
            System.out.println(n + " is a NEON number ✅");
        } else {
            System.out.println(n + " is NOT a NEON number ❌");
        }
        scanner.close();
    }
}
