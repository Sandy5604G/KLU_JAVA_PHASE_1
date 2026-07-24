// ============================================
// Module: 14-OOP-EncapsulationAbstract
// Program: AbstractDemo
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Abstract class
// ============================================
abstract class Animal {
    abstract void sound();
    void eat() { System.out.println("Eating..."); }
}

class Dog extends Animal {
    void sound() { System.out.println("Bark!"); }
}

class Cat extends Animal {
    void sound() { System.out.println("Meow!"); }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        
        d.sound();
        d.eat();
        c.sound();
        c.eat();
    }
}
