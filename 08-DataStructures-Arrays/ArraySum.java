// ============================================
// Module: 08-DataStructures-Arrays
// Program: ArraySum
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Sum of array elements
// ============================================
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        int sum = 0;
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (double)sum/n);
        scanner.close();
    }
}
