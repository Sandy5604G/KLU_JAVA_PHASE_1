// ============================================
// Module: 09-DataStructures-ArrayAdvanced
// Program: ReverseArray
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Reverse array
// ============================================
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.print("Original: ");
        printArray(arr);
        
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
        System.out.print("Reversed: ");
        printArray(arr);
    }
    
    static void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
