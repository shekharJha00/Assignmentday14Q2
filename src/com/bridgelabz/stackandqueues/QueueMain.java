package com.bridgelabz.stackandqueues;

public class QueueMain {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.print_frontRear();
        queue.dequeue();
        queue.print_frontRear();
    }
}
