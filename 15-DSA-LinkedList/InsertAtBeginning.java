// ============================================
// Module: 15-DSA-LinkedList
// Program: InsertAtBeginning
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Insert at beginning
// ============================================
class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

class LinkedList {
    Node head;
    
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; return; }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }
    
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class InsertAtBeginning {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtBeginning(10);
        list.display();
    }
}
