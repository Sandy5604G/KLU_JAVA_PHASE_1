// ============================================
// Module: 06-ProblemSolving-DigitOps
// Program: ArmstrongNumber
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Check Armstrong number
// ============================================
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int temp = n;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        
        temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        if (sum == n) {
            System.out.println(n + " is an ARMSTRONG number ✅");
        } else {
            System.out.println(n + " is NOT an ARMSTRONG number ❌");
        }
        scanner.close();
    }
}
