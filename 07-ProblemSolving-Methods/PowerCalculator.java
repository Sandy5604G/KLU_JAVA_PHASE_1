// ============================================
// Module: 07-ProblemSolving-Methods
// Program: PowerCalculator
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Calculate power
// ============================================
import java.util.Scanner;

public class PowerCalculator {
    
    static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp-1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int exp = scanner.nextInt();
        System.out.println(base + "^" + exp + " = " + power(base, exp));
        scanner.close();
    }
}
