// ============================================
// Module: 05-ProblemSolving-NumberTheory
// Program: SpyNumber
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Check Spy number
// ============================================
import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int sum = 0, product = 1;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        
        if (sum == product) {
            System.out.println(n + " is a SPY number ✅");
        } else {
            System.out.println(n + " is NOT a SPY number ❌");
        }
        scanner.close();
    }
}
