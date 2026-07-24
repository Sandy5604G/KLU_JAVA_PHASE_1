// ============================================
// Module: 11-DSA-StringProblems
// Program: CountWords
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Count words
// ============================================
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = scanner.nextLine();
        
        String[] words = str.trim().split("\\s+");
        System.out.println("Words: " + words.length);
        scanner.close();
    }
}
