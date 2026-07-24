// ============================================
// Module: 07-ProblemSolving-Methods
// Program: MethodOverloadDemo
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Method overloading
// ============================================
public class MethodOverloadDemo {
    
    static int add(int a, int b) { return a + b; }
    static int add(int a, int b, int c) { return a + b + c; }
    static double add(double a, double b) { return a + b; }
    
    public static void main(String[] args) {
        System.out.println("Sum (2 ints): " + add(5, 10));
        System.out.println("Sum (3 ints): " + add(5, 10, 15));
        System.out.println("Sum (2 doubles): " + add(5.5, 10.5));
    }
}
