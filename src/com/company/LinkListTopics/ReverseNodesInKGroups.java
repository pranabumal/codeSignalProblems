package com.company.LinkListTopics;

public class ReverseNodesInKGroups {
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
    public ListNode<Integer> solution(ListNode<Integer> l, int k) {

        if(k==1){
            return l;
        }
        int length=getCountRec(l);
        int loop=length/k;
        ListNode<Integer> current = l;
        ListNode<Integer> prev = null;
        ListNode<Integer> next;
        int r=1;
        int b=1;
        int f=k;
        while(current != null) {
            if(loop>=b){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }else {
                break;
            }
            if(r==f){
                while(prev != null) {
                    insertNode(prev.value);
                    prev=prev.next;
                }
                f=f+k;
                b++;
            }
            r++;
        }
        while(current != null) {
            insertNode(current.value);
            current=current.next;
        }
        return head;
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
    public ListNode<Integer> reversSinglyLinkList(ListNode<Integer> l) {

        ListNode<Integer> prev = null;
        ListNode<Integer> current = l;

        while(current != null) {
            ListNode<Integer> next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;

    }
    public ListNode<Integer> reversSinglyLinkList2(ListNode<Integer> l) {

        ListNode<Integer> current = l;
        ListNode<Integer> prev = null;
        ListNode<Integer> next;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        l=prev;

        return l;
    }
}
