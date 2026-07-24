// ============================================
// Module: 10-DataStructures-Strings
// Program: StringDemo
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: String methods
// ============================================
public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        System.out.println("Original: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Contains 'World': " + str.contains("World"));
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Substring: " + str.substring(0, 5));
    }
}
