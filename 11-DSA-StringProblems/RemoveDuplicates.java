// ============================================
// Module: 11-DSA-StringProblems
// Program: RemoveDuplicates
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Remove duplicates
// ============================================
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        
        String result = "";
        for (char c : str.toCharArray()) {
            if (!result.contains(String.valueOf(c))) {
                result += c;
            }
        }
        
        System.out.println("Original: " + str);
        System.out.println("Without duplicates: " + result);
    }
}
