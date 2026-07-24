// ============================================
// Module: 11-DSA-StringProblems
// Program: AnagramCheck
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Check anagrams
// ============================================
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        System.out.println(str1 + " and " + str2 + 
            (Arrays.equals(arr1, arr2) ? " are ANAGRAMS ✅" : " are NOT ANAGRAMS ❌"));
    }
}
