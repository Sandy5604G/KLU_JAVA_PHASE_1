// ============================================
// Module: 14-OOP-EncapsulationAbstract
// Program: ExceptionHandling
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Exception handling
// ============================================
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();
            System.out.println("Result: " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
            scanner.close();
        }
    }
}
