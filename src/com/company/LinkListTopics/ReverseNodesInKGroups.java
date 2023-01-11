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
        ListNode<Integer> node = null;
        ListNode<Integer> current=l;
        while (current!=null){
                node=current.next;
                current.next=node;
                current=node;
               l=node;
        }
//        ListNode<Integer> prev = null;
//        ListNode<Integer> current = l;
//
//        while(current != null) {
//            ListNode<Integer> next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
        return l;
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
