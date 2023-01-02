package com.company.LinkListTopics;

public class ListNode<T> {
       public ListNode(T x) {
         value = x;
       }
       T value;
       ListNode<T> next;

    public T getValue() {
        return value;
    }
}
