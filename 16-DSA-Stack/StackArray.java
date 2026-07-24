// ============================================
// Module: 16-DSA-Stack
// Program: StackArray
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Stack using array
// ============================================
class Stack {
    int[] arr;
    int top;
    int capacity;
    
    Stack(int size) {
        capacity = size;
        arr = new int[size];
        top = -1;
    }
    
    void push(int data) {
        if (top == capacity - 1) { System.out.println("Overflow"); return; }
        arr[++top] = data;
        System.out.println("Pushed: " + data);
    }
    
    int pop() {
        if (top == -1) { System.out.println("Underflow"); return -1; }
        return arr[top--];
    }
    
    void display() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
}

public class StackArray {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Popped: " + s.pop());
        s.display();
    }
}
