// ============================================
// Module: 02-Foundation-DecisionMaking
// Program: GradeCalculator
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Calculate grade
// ============================================
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        
        char grade;
        if (marks >= 90) grade = 'A';
        else if (marks >= 80) grade = 'B';
        else if (marks >= 70) grade = 'C';
        else if (marks >= 60) grade = 'D';
        else if (marks >= 50) grade = 'E';
        else grade = 'F';
        
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
