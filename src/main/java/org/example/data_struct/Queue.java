package org.example.data_struct;

public class Queue {
    private int[] arr;
    private int size, front, rear, capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = size = 0;
        rear = -1;
    }

}
