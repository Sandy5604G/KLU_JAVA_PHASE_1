// ============================================
// Module: 14-OOP-EncapsulationAbstract
// Program: EncapsulationDemo
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Encapsulation
// ============================================
class BankAccount {
    private double balance;
    
    BankAccount(double initial) { this.balance = initial; }
    
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { 
        if (amount <= balance) balance -= amount; 
        else System.out.println("Insufficient balance");
    }
    public double getBalance() { return balance; }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        System.out.println("Balance: $" + acc.getBalance());
        acc.deposit(500);
        System.out.println("After deposit: $" + acc.getBalance());
        acc.withdraw(300);
        System.out.println("After withdraw: $" + acc.getBalance());
    }
}
