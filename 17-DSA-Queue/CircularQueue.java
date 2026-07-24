// ============================================
// Module: 17-DSA-Queue
// Program: CircularQueue
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Circular queue
// ============================================
class CircularQueue {
    int[] arr;
    int front, rear, size;
    
    CircularQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    
    void enqueue(int data) {
        if ((front == 0 && rear == size - 1) || (rear == front - 1)) {
            System.out.println("Full"); return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % size;
        arr[rear] = data;
        System.out.println("Enqueued: " + data);
    }
    
    int dequeue() {
        if (front == -1) { System.out.println("Empty"); return -1; }
        int data = arr[front];
        if (front == rear) { front = rear = -1; }
        else { front = (front + 1) % size; }
        return data;
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Dequeued: " + q.dequeue());
        q.enqueue(40);
        q.enqueue(50);
    }
}
