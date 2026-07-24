// ============================================
// Module: 06-ProblemSolving-DigitOps
// Program: CountDigits
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Count digits
// ============================================
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int count = 0, temp = n;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        System.out.println("Number of digits in " + n + " = " + count);
        scanner.close();
    }
}
