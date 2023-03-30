package com.company.LinkListTopics;

public class RearrangeLastN {
    public ListNode<Integer> head;
    public ListNode<Integer> solution(ListNode<Integer> l, int n) {

        if (l == null || l.next == null || n <= 0) {
            return l;
        }

        ListNode<Integer> tail = l;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        tail.next = l;

        int breakPoint = length - n % length;
        ListNode<Integer> newHead = l;
        for (int i = 1; i < breakPoint; i++) {
            newHead = newHead.next;
        }

        ListNode<Integer> newTail = newHead;
        newHead = newHead.next;
        newTail.next = null;

        return newHead;
    }
    public int getCountRec(ListNode<Integer> node)
    {
        // Base case
        if (node == null)
            return 0;

        // Count is this node plus rest of the list
        return 1 + getCountRec(node.next);
    }
    public void insertNode(Integer item) {
        ListNode<Integer> node = new ListNode<>(null);
        node.value = item;
        ListNode<Integer> current = this.head;

        if (this.head == null) {
            this.head = node;
            this.head.next = null;
            System.out.println(this.head.toString());
        } else {

            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            node.next = null;
        }
    }
}
