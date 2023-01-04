package com.company.LinkListTopics;


public class IsListPalindrome {
    public boolean solution(ListNode<Integer> l) {

        ListNode<Integer> prev = null;
        ListNode<Integer> current = l;

        while(current != null) {
            ListNode<Integer> next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return true;

    }

}
