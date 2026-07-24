// ============================================
// Module: 02-Foundation-DecisionMaking
// Program: EvenOddChecker
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Check even or odd
// ============================================
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " is EVEN ✅");
        } else {
            System.out.println(num + " is ODD ❌");
        }
        scanner.close();
    }
}
