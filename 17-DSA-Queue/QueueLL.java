// ============================================
// Module: 17-DSA-Queue
// Program: QueueLL
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Queue using linked list
// ============================================
class QNode {
    int data;
    QNode next;
    QNode(int data) { this.data = data; this.next = null; }
}

class Queue {
    QNode front, rear;
    
    void enqueue(int data) {
        QNode newNode = new QNode(data);
        if (rear == null) { front = rear = newNode; return; }
        rear.next = newNode;
        rear = newNode;
        System.out.println("Enqueued: " + data);
    }
    
    int dequeue() {
        if (front == null) { System.out.println("Empty"); return -1; }
        int data = front.data;
        front = front.next;
        if (front == null) rear = null;
        return data;
    }
    
    void display() {
        QNode temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class QueueLL {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println("Dequeued: " + q.dequeue());
        q.display();
    }
}
