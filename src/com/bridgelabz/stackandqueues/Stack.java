package com.bridgelabz.stackandqueues;

public class Stack {
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.println(" new stack is :");
        stack.display();
        System.out.printf("\nTop element is %d\n", stack.peek());
        stack.pop();
        stack.display();
        System.out.printf("\nTop element is %d\n", stack.peek());
        stack.pop();
        stack.display();
        System.out.printf("\nTop element is %d\n", stack.peek());
        stack.pop();
        System.out.printf("\nTop element is %d\n", stack.peek());
    }

    }

