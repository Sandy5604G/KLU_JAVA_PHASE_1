// ============================================
// Module: 05-ProblemSolving-NumberTheory
// Program: HarshadNumber
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Check Harshad number
// ============================================
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        if (n % sum == 0) {
            System.out.println(n + " is a HARSHAD number ✅");
        } else {
            System.out.println(n + " is NOT a HARSHAD number ❌");
        }
        scanner.close();
    }
}
