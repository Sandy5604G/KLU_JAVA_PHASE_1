// ============================================
// Module: 10-DataStructures-Strings
// Program: PalindromeString
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Check palindrome
// ============================================
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        System.out.println(str + (str.equals(reversed) ? " is PALINDROME ✅" : " is NOT PALINDROME ❌"));
        scanner.close();
    }
}
