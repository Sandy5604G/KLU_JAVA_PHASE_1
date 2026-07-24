// ============================================
// Module: 05-ProblemSolving-NumberTheory
// Program: PerfectNumber
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Check perfect number
// ============================================
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) sum += i;
        }
        System.out.println(n + (sum == n ? " is PERFECT ✅" : " is NOT PERFECT ❌"));
        scanner.close();
    }
}
