package org.example.data_struct;

public class ArrayStack {
    private int[] arr;
    private int top;
    private int capacity;

    public ArrayStack(int size) {
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack overflow");
        }
        arr[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack underflow");
        }

        return arr[top--];
    }

    public int peek() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty.");
        }
        return top;
    }
    public boolean isEmpty() {
        return top == -1;
    }
}
