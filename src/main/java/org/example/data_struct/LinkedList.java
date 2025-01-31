package org.example.data_struct;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void insertAfter(int dataAfter, int data) {
        if (isEmpty()) {
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != dataAfter) {
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

}