package com.company.LinkListTopics;

public class LinkedList extends Node<Integer> {
    public int size;
    public Node<Integer> head;

    public LinkedList() {
        this.size = 0;
        this.head = null;
    }
    /**
     * Inserting new node at the end of the linked list
     *
     * @param item - represent the node item to be added to the linked list
     */
    public void insertNode(Integer item) {
        Node<Integer> node = new Node<>();
        node.value = item;
        Node<Integer> current = this.head;

        if (this.head == null) {
            this.head = node;
            this.head.next = null;
            this.size = 1;
            System.out.println(this.head.toString());
        } else {

            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            node.next = null;
            this.size += 1;
        }
    }
}
