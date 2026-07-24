// ============================================
// Module: 09-DataStructures-ArrayAdvanced
// Program: LinearSearch
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Linear search
// ============================================
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter element to search: ");
        int target = scanner.nextInt();
        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Not found");
        scanner.close();
    }
}
