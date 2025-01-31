package org.example;

import org.example.ecommerce.*;

public class Main {
    public static void main(String[] args) {
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }
}