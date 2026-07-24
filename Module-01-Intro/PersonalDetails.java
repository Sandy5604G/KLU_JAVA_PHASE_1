//============================================
// Module: Intro
// Author: Sandeep Abhilash
// Date: 24-07-2026
// Purpose: Personal information display
//============================================

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("=== Personal Details ===");
        System.out.print("Full Name: ");
        String text = reader.nextLine();
        System.out.print("Age: ");
        int value = reader.nextInt();
        System.out.print("Height (in cm): ");
        double output = reader.nextDouble();
        
        System.out.println("\n--- Your Profile ---");
        System.out.println("Name: " + text);
        System.out.println("Age: " + value + " years");
        System.out.println("Height: " + output + " cm");
        reader.close();
    }
}
