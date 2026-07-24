// ============================================
// Module: 05-ProblemSolving-NumberTheory
// Program: AutomorphicNumber
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Check Automorphic number
// ============================================
import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int square = n * n;
        int temp = n;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        
        int divisor = (int) Math.pow(10, count);
        if (square % divisor == n) {
            System.out.println(n + " is an AUTOMORPHIC number ✅");
        } else {
            System.out.println(n + " is NOT an AUTOMORPHIC number ❌");
        }
        scanner.close();
    }
}
