// ============================================
// Module: 15-DSA-LinkedList
// Program: FindMiddle
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Find middle element
// ============================================
class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

class LinkedList {
    Node head;
    
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; return; }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }
    
    int findMiddle() {
        if (head == null) return -1;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}

public class FindMiddle {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        System.out.println("Middle: " + list.findMiddle());
    }
}
