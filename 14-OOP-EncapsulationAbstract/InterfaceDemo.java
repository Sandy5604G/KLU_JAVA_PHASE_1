// ============================================
// Module: 14-OOP-EncapsulationAbstract
// Program: InterfaceDemo
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Interface
// ============================================
interface Drawable {
    void draw();
}

interface Colorable {
    void color();
}

class Circle implements Drawable, Colorable {
    public void draw() { System.out.println("Drawing Circle"); }
    public void color() { System.out.println("Coloring Red"); }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.color();
    }
}
