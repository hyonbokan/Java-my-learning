package org.example.data_struct;

//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}

public class LinkedListStack {
    private Node top;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
    }

    public int pop() {
        if (top == null) throw new RuntimeException("Stack underflow");
        int popped = top.data;
        top = top.next;
        return popped;
    }

    public int peek() {
        if (top == null) throw new RuntimeException("Stack is empty");
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
