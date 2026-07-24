// ============================================
// Module: 13-OOP-ClassesObjects
// Program: Employee
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Employee class
// ============================================
class Employee {
    int id;
    String name;
    double salary;
    
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Salary: $" + salary);
    }
}

public class Employee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001, "John", 50000);
        Employee e2 = new Employee(1002, "Jane", 60000);
        
        e1.display();
        e2.display();
    }
}
