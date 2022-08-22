package com.bridgelabz.stackandqueues;

import static java.lang.System.exit;

class StackUsingLinkedList {
    private class Node {

        int data;
        Node link;
    }
    Node top;
     StackUsingLinkedList()
    {
        this.top = null;
    }


    public void push(int x)
    {

        Node temp = new Node();



        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }


        temp.data = x;


        temp.link = top;

        top = temp;
    }


    public boolean isEmpty() {
        return top == null;
    }
    public void display()
    {

        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {


                System.out.printf("%d->", temp.data);


                temp = temp.link;
            }
        }}
}