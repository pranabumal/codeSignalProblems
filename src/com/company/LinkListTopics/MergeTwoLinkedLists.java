package com.company.LinkListTopics;

public class MergeTwoLinkedLists {
    // Singly-linked lists are already defined with this interface:
    // class ListNode<T> {
    //   ListNode(T x) {
    //     value = x;
    //   }
    //   T value;
    //   ListNode<T> next;
    // }
    //
    public ListNode<Integer> head;

    public ListNode<Integer> solution(ListNode<Integer> l1, ListNode<Integer> l2) {

        while (l1!=null){

        }

        return l1;
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
