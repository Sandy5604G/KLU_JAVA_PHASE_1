// ============================================
// Module: 13-OOP-ClassesObjects
// Program: Student
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Student class
// ============================================
class Student {
    int rollNo;
    String name;
    double marks;
    
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    
    void display() {
        System.out.println("Roll: " + rollNo + " | Name: " + name + " | Marks: " + marks);
    }
}

public class Student {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 95);
        Student s2 = new Student(102, "Bob", 85);
        
        s1.display();
        s2.display();
    }
}
