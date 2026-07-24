// ============================================
// Module: 11-DSA-StringProblems
// Program: FirstNonRepeated
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: First non-repeated character
// ============================================
public class FirstNonRepeated {
    public static void main(String[] args) {
        String str = "aabbcdeeff";
        
        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println("First non-repeated: " + c);
                return;
            }
        }
        System.out.println("No non-repeated character");
    }
}
