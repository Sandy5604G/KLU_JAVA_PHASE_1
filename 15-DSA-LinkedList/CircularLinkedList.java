// ============================================
// Module: 15-DSA-LinkedList
// Program: CircularLinkedList
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Circular linked list
// ============================================
class CNode {
    int data;
    CNode next;
    CNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularList {
    CNode head;
    
    void insert(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        CNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }
    
    void display() {
        if (head == null) return;
        CNode temp = head;
        System.out.print("Circular List: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
    }
}
