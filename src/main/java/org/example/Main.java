package org.example;

import org.example.ecommerce.*;

public class Main {
    public static void main(String[] args) {

    }

}

class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
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

    public int peak() {
        return arr[top];
    }

}