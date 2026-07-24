// ============================================
// Module: 17-DSA-Queue
// Program: QueueArray
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Queue using array
// ============================================
class Queue {
    int[] arr;
    int front, rear, capacity;
    
    Queue(int size) {
        capacity = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }
    
    void enqueue(int data) {
        if (rear == capacity - 1) { System.out.println("Full"); return; }
        arr[++rear] = data;
        System.out.println("Enqueued: " + data);
    }
    
    int dequeue() {
        if (front > rear) { System.out.println("Empty"); return -1; }
        return arr[front++];
    }
    
    void display() {
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
}

public class QueueArray {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println("Dequeued: " + q.dequeue());
        q.display();
    }
}
