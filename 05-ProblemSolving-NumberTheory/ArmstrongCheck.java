// ============================================
// Module: 05-ProblemSolving-NumberTheory
// Program: ArmstrongCheck
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Check Armstrong number
// ============================================
import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int temp = n, sum = 0, digits = String.valueOf(n).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        System.out.println(n + (sum == n ? " is ARMSTRONG ✅" : " is NOT ARMSTRONG ❌"));
        scanner.close();
    }
}
