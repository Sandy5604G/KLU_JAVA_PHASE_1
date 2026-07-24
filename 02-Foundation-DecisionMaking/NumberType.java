// ============================================
// Module: 02-Foundation-DecisionMaking
// Program: NumberType
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Check positive/negative/zero
// ============================================
import java.util.Scanner;

public class NumberType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (num > 0) {
            System.out.println(num + " is POSITIVE");
        } else if (num < 0) {
            System.out.println(num + " is NEGATIVE");
        } else {
            System.out.println("Number is ZERO");
        }
        scanner.close();
    }
}
