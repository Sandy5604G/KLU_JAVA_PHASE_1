// ============================================
// Module: 05-ProblemSolving-NumberTheory
// Program: TechNumber
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Check Tech number
// ============================================
import java.util.Scanner;

public class TechNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        String str = String.valueOf(n);
        int len = str.length();
        
        if (len % 2 != 0) {
            System.out.println(n + " is NOT a TECH number ❌");
            scanner.close();
            return;
        }
        
        int half = len / 2;
        int firstHalf = Integer.parseInt(str.substring(0, half));
        int secondHalf = Integer.parseInt(str.substring(half));
        
        int sum = firstHalf + secondHalf;
        int square = sum * sum;
        
        if (square == n) {
            System.out.println(n + " is a TECH number ✅");
        } else {
            System.out.println(n + " is NOT a TECH number ❌");
        }
        scanner.close();
    }
}
