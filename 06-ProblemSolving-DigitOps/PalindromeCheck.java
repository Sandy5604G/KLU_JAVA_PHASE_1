// ============================================
// Module: 06-ProblemSolving-DigitOps
// Program: PalindromeCheck
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Check palindrome
// ============================================
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println(n + (n == rev ? " is PALINDROME ✅" : " is NOT PALINDROME ❌"));
        scanner.close();
    }
}
