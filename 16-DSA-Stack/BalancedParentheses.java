// ============================================
// Module: 16-DSA-Stack
// Program: BalancedParentheses
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Check balanced parentheses
// ============================================
import java.util.*;

public class BalancedParentheses {
    public static void main(String[] args) {
        String str = "({[]})";
        Stack<Character> stack = new Stack<>();
        
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) { System.out.println("Not Balanced"); return; }
                char top = stack.pop();
                if (!((c == ')' && top == '(') || 
                      (c == '}' && top == '{') || 
                      (c == ']' && top == '['))) {
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }
        System.out.println(stack.isEmpty() ? "Balanced ✅" : "Not Balanced ❌");
    }
}
