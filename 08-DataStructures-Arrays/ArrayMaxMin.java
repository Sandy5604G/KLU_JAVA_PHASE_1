// ============================================
// Module: 08-DataStructures-Arrays
// Program: ArrayMaxMin
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Find max and min
// ============================================
import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        scanner.close();
    }
}
