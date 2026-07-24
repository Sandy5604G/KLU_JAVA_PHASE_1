// ============================================
// Module: 01-Foundation-JavaBasics
// Program: UserInputDemo
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Taking user input
// ============================================
import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.println("\n┌──────────────────────────────────────┐");
        System.out.println("│         USER PROFILE                │");
        System.out.println("├──────────────────────────────────────┤");
        System.out.println("│  Name: " + name + "                     │");
        System.out.println("│  Age:  " + age + "                      │");
        System.out.println("└──────────────────────────────────────┘");
        scanner.close();
    }
}
