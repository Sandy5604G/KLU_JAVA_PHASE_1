// ============================================
// Module: 05-ProblemSolving-NumberTheory
// Program: AdamNumber
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Check Adam number
// ============================================
import java.util.Scanner;

public class AdamNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int square = n * n;
        int reversed = reverse(n);
        int reversedSquare = reversed * reversed;
        int reverseReversedSquare = reverse(reversedSquare);
        
        if (square == reverseReversedSquare) {
            System.out.println(n + " is an ADAM number ✅");
        } else {
            System.out.println(n + " is NOT an ADAM number ❌");
        }
        scanner.close();
    }
    
    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}
