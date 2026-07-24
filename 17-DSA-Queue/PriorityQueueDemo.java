// ============================================
// Module: 17-DSA-Queue
// Program: PriorityQueueDemo
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Priority queue
// ============================================
import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);
        
        System.out.println("Priority Queue: " + pq);
        System.out.println("Peek: " + pq.peek());
        System.out.println("Poll: " + pq.poll());
        System.out.println("After poll: " + pq);
    }
}
