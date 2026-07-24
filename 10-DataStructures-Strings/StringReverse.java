// ============================================
// Module: 10-DataStructures-Strings
// Program: StringReverse
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Reverse string
// ============================================
public class StringReverse {
    public static void main(String[] args) {
        String str = "Java Programming";
        
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
