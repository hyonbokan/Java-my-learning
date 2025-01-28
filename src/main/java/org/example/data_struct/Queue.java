package org.example.data_struct;

public class Queue {
    private int[] arr;
    private int capacity, front, rear, size;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = this.size = 0;
        this.rear = -1;
    }

    public void enqueue(int x) {
        if (size == capacity) {
            throw new RuntimeException("Queue Overflow");
        }

        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            throw new RuntimeException("Queue underflow");
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int peek() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }

        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
