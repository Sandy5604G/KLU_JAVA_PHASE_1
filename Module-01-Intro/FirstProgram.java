//============================================
// Module: Intro
// Author: Sandeep Abhilash
// Date: 24-07-2026
// Purpose: Getting started with Java
//============================================

import java.io.*;

public class FirstProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String text = reader.readLine();
        System.out.println("Welcome " + text + " to Java Learning!");
    }
}
