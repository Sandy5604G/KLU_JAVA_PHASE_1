// ============================================
// Module: 16-DSA-Stack
// Program: StackReverse
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Reverse using stack
// ============================================
import java.util.*;

public class StackReverse {
    public static void main(String[] args) {
        String str = "Hello";
        Stack<Character> stack = new Stack<>();
        
        for (char c : str.toCharArray()) stack.push(c);
        
        System.out.print("Original: " + str);
        System.out.print("\nReversed: ");
        while (!stack.isEmpty()) System.out.print(stack.pop());
        System.out.println();
    }
}
