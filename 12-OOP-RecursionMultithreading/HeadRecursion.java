// ============================================
// Module: 12-OOP-RecursionMultithreading
// Program: HeadRecursion
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Head recursion
// ============================================
import java.util.Scanner;

public class HeadRecursion {
    
    static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        printNumbers(n);
        scanner.close();
    }
}
