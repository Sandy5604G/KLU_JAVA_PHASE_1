// ============================================
// Module: 12-OOP-RecursionMultithreading
// Program: RunnableDemo
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Runnable interface
// ============================================
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        
        t1.start();
        t2.start();
    }
}
