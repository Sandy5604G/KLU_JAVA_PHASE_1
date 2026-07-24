// ============================================
// Module: 15-DSA-LinkedList
// Program: DoublyLinkedList
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Doubly linked list
// ============================================
class DNode {
    int data;
    DNode prev, next;
    DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyList {
    DNode head;
    
    void insert(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    
    void display() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyList list = new DoublyList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.print("Doubly Linked List: ");
        list.display();
    }
}
