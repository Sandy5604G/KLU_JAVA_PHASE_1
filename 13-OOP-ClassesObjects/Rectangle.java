// ============================================
// Module: 13-OOP-ClassesObjects
// Program: Rectangle
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Rectangle class
// ============================================
class Rectangle {
    double length;
    double width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    double area() { return length * width; }
    double perimeter() { return 2 * (length + width); }
}

public class Rectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 4);
        System.out.println("Length: " + r.length);
        System.out.println("Width: " + r.width);
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
