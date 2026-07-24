// ============================================
// Module: 08-DataStructures-Arrays
// Program: BinarySearch
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Binary search
// ============================================
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter element to search: ");
        int target = scanner.nextInt();
        
        int left = 0, right = n - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if (result != -1) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Not found");
        }
        scanner.close();
    }
}
