// ============================================
// Module: 16-DSA-Stack
// Program: StackLL
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Stack using linked list
// ============================================
class StackNode {
    int data;
    StackNode next;
    StackNode(int data) { this.data = data; this.next = null; }
}

class Stack {
    StackNode top;
    
    void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + data);
    }
    
    int pop() {
        if (top == null) { System.out.println("Underflow"); return -1; }
        int data = top.data;
        top = top.next;
        return data;
    }
    
    void display() {
        StackNode temp = top;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class StackLL {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Popped: " + s.pop());
        s.display();
    }
}
