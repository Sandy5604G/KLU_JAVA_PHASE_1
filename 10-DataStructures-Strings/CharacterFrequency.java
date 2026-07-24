// ============================================
// Module: 10-DataStructures-Strings
// Program: CharacterFrequency
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Character frequency
// ============================================
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        int[] freq = new int[256];
        for (char c : str.toCharArray()) {
            freq[c]++;
        }
        
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " -> " + freq[i]);
            }
        }
        scanner.close();
    }
}
