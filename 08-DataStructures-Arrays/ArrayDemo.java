// ============================================
// Module: 08-DataStructures-Arrays
// Program: ArrayDemo
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Basic array operations
// ============================================
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("\nArray elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}
