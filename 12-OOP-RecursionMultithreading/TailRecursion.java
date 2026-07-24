// ============================================
// Module: 12-OOP-RecursionMultithreading
// Program: TailRecursion
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Tail recursion
// ============================================
import java.util.Scanner;

public class TailRecursion {
    
    static void printNumbers(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            printNumbers(n - 1);
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
