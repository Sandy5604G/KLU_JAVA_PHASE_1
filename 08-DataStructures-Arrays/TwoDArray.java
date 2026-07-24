// ============================================
// Module: 08-DataStructures-Arrays
// Program: TwoDArray
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: 2D array operations
// ============================================
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter columns: ");
        int cols = scanner.nextInt();
        
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
